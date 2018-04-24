package com.shepard.jpaprovidertest.config

import net.bull.javamelody.JpaPersistence
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean
import java.util.*
import javax.sql.DataSource

@Configuration
@EntityScan(basePackages = ["com.shepard.jpaprovidertest.entity"])
class Configuration {
    @Bean
    fun entityManagerFactory(dataSource: DataSource, properties: Properties) =
            LocalContainerEntityManagerFactoryBean().apply {
                setPackagesToScan("com.shepard.jpaprovidertest.entity")
                setJpaProperties(properties)
                persistenceProvider = JpaPersistence()
                this.dataSource = dataSource
            }
}