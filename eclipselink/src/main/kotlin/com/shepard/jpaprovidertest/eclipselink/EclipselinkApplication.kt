package com.shepard.jpaprovidertest.eclipselink

import com.shepard.jpaprovidertest.driver.ProviderType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.instrument.classloading.InstrumentationLoadTimeWeaver

@SpringBootApplication(scanBasePackages = ["com.shepard.jpaprovidertest.config"])
class EclipselinkApplication {
    @Bean
    fun loadTimeWeaver() = InstrumentationLoadTimeWeaver()

    @Bean
    fun providerType() = ProviderType.ECLIPSE_LINK
}

fun main(args: Array<String>) {
    runApplication<EclipselinkApplication>(*args)
}
