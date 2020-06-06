plugins {
    id("org.hidetake.swagger.generator") version "2.18.2"
}

repositories {
    jcenter()
}

dependencies {
    swaggerCodegen("org.openapitools:openapi-generator-cli:3.3.4")
    swaggerUI("org.webjars:swagger-ui:3.10.0")
}

val contractsDir = file("openapi-contracts")
val contracts = contractsDir.listFiles { _, name -> name.startsWith("mojang-") && name.endsWith(".yaml") }
if (!contractsDir.isDirectory || contracts?.isNotEmpty() != true) {
    throw java.io.FileNotFoundException("The openapi-contracts directory is empty or does not exists! Please run \"git submodule update --init --recursive\" to fix this issue")
}
val apis = contracts
    .map { it.name.removeSurrounding("mojang-", ".yaml") }
    .asSequence()

val languages = file("language-list.txt")
    .readLines()
    .asSequence()
    .filter { it.isNotBlank() }

val docLanguages = setOf("html", "html2")

swaggerSources {
    val generateDocumentation by tasks.creating
    generateDocumentation.group = "documentation"
    
    apis.forEach { api ->
        register(api) {
            setInputFile(File(contractsDir, "mojang-$api.yaml"))
            ui.apply {
                outputDir = file("docs/mojang-$api/swagger-ui")
            }
            reDoc.apply {
                outputDir = file("docs/$api/re-doc")
                
                // Not working well yet: https://github.com/int128/gradle-swagger-generator-plugin/issues/86
                enabled = false
            }
            code.apply {
                enabled = false
            }
        }
        afterEvaluate {
            generateDocumentation.dependsOn("generateReDoc${api.capitalize()}", "generateSwaggerUI${api.capitalize()}")
        }
    }
    
    languages
        .flatMap { lang -> apis.map { api-> lang to api } }
        .forEach { (lang, api) ->
            register(lang.split('-').asSequence().map { it.capitalize() }.joinToString("").decapitalize() + "Mojang" + api.capitalize()) {
                setInputFile(File(contractsDir, "mojang-$api.yaml"))
                code.apply {
                    language = lang
                    outputDir = if (lang in docLanguages) {
                        generateDocumentation.dependsOn(name)
                        file("docs/mojang-$api/$lang")
                    } else {
                        file("generated-sources/$lang/mojang-$api")
                    }
                    val basePackage = "com.github.asyncmc.mojang.$api.${lang.replace('-', '.')}"
                    rawOptions = listOf(
                        "--api-package", "$basePackage.api", 
                        "--model-package", "$basePackage.model",
                        "--invoker-package", "$basePackage.server",
                        "--group-id", "com.github.asyncmc",
                        "--artifact-id", "mojang-$api-$lang",
                        "--enable-post-process-file",
                        "--git-user-id", "AsyncMC",
                        "--git-repo-id", "Mojang-API-Libs"
                    )
                    additionalProperties = mapOf(
                        "enumPropertyNaming" to "UPPERCASE"
                    )
                }

                ui.apply {
                    enabled = false
                }
                
                reDoc.apply { 
                    enabled = false
                }
            }
        }
}

tasks.create("updateDocsIndex") {
    group = "documentation"
    val docIndexFile = file("docs/index.md")
    inputs.file(docIndexFile)
    inputs.files(*contracts)
    inputs.file("language-list.txt")
    outputs.files(docIndexFile)
    doLast {
        val docIndex = docIndexFile.readLines().let { lines ->
            lines.indexOfFirst { it.trim().equals("<!-- GENERATED SOURCE MARKER -->", ignoreCase = true) }.takeIf { it >= 0 }?.let { line ->
                lines.subList(0, line + 1).toMutableList()
            } ?: lines.toMutableList()
        }

        docIndex += "| Language      | " + apis.joinToString(" | ")
        docIndex += "|---------------" + "|-----".repeat(apis.count())

        languages.forEach { lang ->
            docIndex += buildString {
                append("| [$lang](https://github.com/AsyncMC/Mojang-API-Libs/tree/master/generated-sources/$lang) ")
                apis.forEach { api ->
                    append("| [minecraft-$api](https://github.com/AsyncMC/Mojang-API-Libs/tree/master/generated-sources/$lang/$api)")
                }
            }
        }

        docIndex += ""

        docIndexFile.writeText(docIndex.joinToString(System.lineSeparator()))
    }
}

tasks.create("generateEverything") {
    group = "build"
    dependsOn("generateDocumentation", "generateSwaggerCode")
}

tasks.create("build") {
    group = "build"
    dependsOn("generateEverything")
}

tasks.create<Delete>("cleanDocs") {
    group = "documentation"
    file("docs").listFiles { dir, _ -> dir.isDirectory }?.forEach { doc ->
        delete(doc)
    }
}

tasks.create<Delete>("cleanGeneratedSources") {
    group = "build"
    delete(buildDir)
    delete("generated-sources")
    file("docs").listFiles { dir, _ -> dir.isDirectory }?.forEach { doc ->
        delete(doc)
    }
}

tasks.create<Delete>("clean") {
    group = "build"
    dependsOn("cleanGeneratedSources", "cleanDocs")
    delete(buildDir)
}
