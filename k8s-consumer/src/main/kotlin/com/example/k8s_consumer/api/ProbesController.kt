package com.example.k8s_consumer.api

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/probes")
class ProbesController {

    private val  logger: Logger = LoggerFactory.getLogger(ProbesController::class.java)

    @GetMapping("/startup")
    fun startup() {
        logger.info("Startup probe positive")
    }

    @GetMapping("/readiness")
    fun readiness() {
        logger.info("Readiness probe positive")
    }

    @GetMapping("/liveness")
    fun liveness() {
        logger.info("Liveness probe positive")
    }
}