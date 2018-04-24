package com.shepard.jpaprovidertest.eclipselink

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.instrument.classloading.InstrumentationLoadTimeWeaver

@SpringBootApplication(scanBasePackages = ["com.shepard.jpaprovidertest.config",
    "com.shepard.jpaprovidertest.eclipselink.runner"])
class EclipselinkApplication {
    @Bean
    fun loadTimeWeaver() = InstrumentationLoadTimeWeaver()
}

fun main(args: Array<String>) {
    runApplication<EclipselinkApplication>(*args)
}
