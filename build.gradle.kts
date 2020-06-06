plugins {
    id("org.hidetake.swagger.generator") version "2.18.2"
}

repositories {
    jcenter()
}

dependencies {
    swaggerCodegen("org.openapitools:openapi-generator-cli:3.3.4")
}

swaggerSources {
    val contractsDir = file("openapi-contracts")
    val contracts = contractsDir.listFiles { _, name -> name.startsWith("mojang-") && name.endsWith(".yaml") }
    if (!contractsDir.isDirectory || contracts?.isNotEmpty() != true) {
        throw java.io.FileNotFoundException("The openapi-contracts directory is empty or does not exists! Please run \"git submodule update --init --recursive\" to fix this issue")
    }
    val apis = contracts
        .map { it.name.removeSurrounding("mojang-", ".yaml") }
        .asSequence()
    file("language-list.txt")
        .readLines().asSequence()
        .filter { it.isNotBlank() }
        .flatMap { lang -> apis.map { api-> lang to api } }
        .forEach { (lang, api) ->
            register(lang.split('-').asSequence().map { it.capitalize() }.joinToString("").decapitalize() + "Mojang" + api.capitalize()) {
                setInputFile(File(contractsDir, "mojang-$api.yaml"))
                code.apply {
                    language = lang
                    outputDir = file("generated-sources/$language/mojang-$api")
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
            }
        }
}
