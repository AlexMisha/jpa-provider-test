package com.shepard.jpaprovidertest.config

import com.shepard.jpaprovidertest.driver.jdbcDriverOf
import net.bull.javamelody.JpaPersistence
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.core.env.Environment
import org.springframework.jdbc.datasource.SimpleDriverDataSource
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean
import java.util.*
import javax.sql.DataSource

@Configuration
@EntityScan(basePackages = ["com.shepard.jpaprovidertest.entity"])
@ComponentScan(basePackages = ["com.shepard.jpaprovidertest.controller", "com.shepard.jpaprovidertest.runner",
    "com.shepard.jpaprovidertest.tests", "com.shepard.jpaprovidertest.driver"])
class Configuration {
    @Autowired
    lateinit var applicationContext: ApplicationContext

    @Autowired
    lateinit var environment: Environment

    @Bean
    fun dataSource(): DataSource = SimpleDriverDataSource().apply {
        url = environment.getProperty("spring.datasource.url")
        username = environment.getProperty("spring.datasource.username")
        password = environment.getProperty("spring.datasource.password")
        driver = jdbcDriverOf(applicationContext)
    }

    @Bean
    fun entityManagerFactory(dataSource: DataSource, properties: Properties) =
            LocalContainerEntityManagerFactoryBean().apply {
                setPackagesToScan("com.shepard.jpaprovidertest.entity")
                setJpaProperties(properties)
                persistenceProvider = JpaPersistence()
                this.dataSource = dataSource
            }
}