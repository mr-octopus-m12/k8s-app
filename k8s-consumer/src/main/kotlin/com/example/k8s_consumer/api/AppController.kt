package com.example.k8s_consumer.api

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/consumer")
class AppController(
    private val  logger: Logger = LoggerFactory.getLogger(AppController::class.java)
) {

    @GetMapping("/test")
    fun test() {
        logger.info("CONSUMER app is working")
    }
}