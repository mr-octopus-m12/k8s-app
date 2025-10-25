package com.example.k8s_producer.api

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/producer")
class AppController(
    private val  logger: org.slf4j.Logger = LoggerFactory.getLogger(AppController::class.java)
) {

    @GetMapping("/test")
    fun test() {
        logger.info("PRODUCER app is working")
    }

    @GetMapping("/ping")
    fun ping(@RequestParam name: String) {
        logger.info("PRODUCER is called by {}", name)
    }
}