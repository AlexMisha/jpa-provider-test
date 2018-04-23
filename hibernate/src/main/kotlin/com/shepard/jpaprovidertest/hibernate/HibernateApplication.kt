package com.shepard.jpaprovidertest.hibernate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.shepard.jpaprovidertest.config",
    "com.shepard.jpaprovidertest.hibernate.controller"])
class HibernateApplication

fun main(args: Array<String>) {
    runApplication<HibernateApplication>(*args)
}
