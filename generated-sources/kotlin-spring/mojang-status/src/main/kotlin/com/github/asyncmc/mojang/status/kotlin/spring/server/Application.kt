package com.github.asyncmc.mojang.status.kotlin.spring.server

import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
@ComponentScan(basePackages = ["com.github.asyncmc.mojang.status.kotlin.spring.server", "com.github.asyncmc.mojang.status.kotlin.spring.api", "com.github.asyncmc.mojang.status.kotlin.spring.model"])
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
