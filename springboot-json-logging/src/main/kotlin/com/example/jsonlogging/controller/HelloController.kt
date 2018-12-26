package com.example.jsonlogging.controller

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    private val log: Logger = LoggerFactory.getLogger(this.javaClass)

    @GetMapping("/hello")
    fun hello(): String {
        log.info("""
            Multiple test
            First line

            Second line
        """.trimIndent())
        return "hello world"
    }
}