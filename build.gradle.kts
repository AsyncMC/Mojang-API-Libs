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
    val apis = projectDir
        .listFiles { _, name -> name.startsWith("mojang-") && name.endsWith(".yaml") }!!
        .map { it.name.removeSurrounding("mojang-", ".yaml") }
        .asSequence()
    file("language-list.txt")
        .readLines().asSequence()
        .flatMap { lang -> apis.map { api-> lang to api } }
        .forEach { (lang, api) ->
            register(lang + "Mojang" + api.capitalize()) {
                setInputFile(file("mojang-$api.yaml"))
                code.apply {
                    language = lang
                    outputDir = file("generated-sources/$language/mojang-$api")
                }
            }
        }
}
