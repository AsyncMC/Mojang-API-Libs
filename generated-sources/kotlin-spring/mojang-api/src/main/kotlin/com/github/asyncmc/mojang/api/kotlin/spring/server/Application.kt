package com.github.asyncmc.mojang.api.kotlin.spring.server

import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
@ComponentScan(basePackages = ["com.github.asyncmc.mojang.api.kotlin.spring.server", "com.github.asyncmc.mojang.api.kotlin.spring.api", "com.github.asyncmc.mojang.api.kotlin.spring.model"])
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
