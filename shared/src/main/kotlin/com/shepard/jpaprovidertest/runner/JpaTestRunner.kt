package com.shepard.jpaprovidertest.runner

import com.shepard.jpaprovidertest.tests.JpaTest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

interface TestRunner {
    var currentTest: JpaTest
    fun run()
}

@Component
class JpaTestRunner : TestRunner {
    override lateinit var currentTest: JpaTest

    @Autowired(required = false)
    lateinit var tests: List<JpaTest>

    override fun run() = tests.forEach {
        currentTest = it
        it.run()
    }
}
