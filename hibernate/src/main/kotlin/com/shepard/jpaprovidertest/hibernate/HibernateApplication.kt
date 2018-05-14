package com.shepard.jpaprovidertest.hibernate

import com.shepard.jpaprovidertest.driver.ProviderType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.core.env.Environment
import java.util.*

@SpringBootApplication(scanBasePackages = ["com.shepard.jpaprovidertest.config"])
class HibernateApplication {
    @Bean
    fun properties(environment: Environment) = Properties().apply {
        setProperty("hibernate.dialect", environment.getProperty("spring.jpa.properties.hibernate.dialect"))
        setProperty("hibernate.connection.pool_size", "1")
        setProperty("hibernate.show_sql", "true")
        setProperty("hibernate.format_sql", "true")
        setProperty("hibernate.temp.use_jdbc_metadata_defaults", "false")
        setProperty("hibernate.statement_cache.size", "0")
    }

    @Bean
    fun providerType() = ProviderType.HIBERNATE
}

fun main(args: Array<String>) {
    runApplication<HibernateApplication>(*args)
}