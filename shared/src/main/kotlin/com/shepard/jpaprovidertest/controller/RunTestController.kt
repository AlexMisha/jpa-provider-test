package com.shepard.jpaprovidertest.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RunTestController {
    @Autowired
    lateinit var testRunner: TestRunner

    @RequestMapping("tests")
    fun runTests() = testRunner.run()
}

interface TestRunner {
    fun run()
}