package com.example.k8s_consumer.api

import com.example.k8s_consumer.config.ApplicationProperties
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@EnableConfigurationProperties(ApplicationProperties::class)
@RestController
@RequestMapping("/probes")
class ProbesController(
    private val applicationProperties: ApplicationProperties
) {

    private val  logger: Logger = LoggerFactory.getLogger(ProbesController::class.java)

    @GetMapping("/startup")
    fun startup() {
        logger.info("Startup probe is positive for ${applicationProperties.podName} on ${applicationProperties.namespace} environment")
    }

    @GetMapping("/readiness")
    fun readiness() {
        logger.info("Readiness probe is positive for ${applicationProperties.podName} on ${applicationProperties.namespace} environment")
    }

    @GetMapping("/liveness")
    fun liveness() {
        logger.info("Liveness probe is positive for ${applicationProperties.podName} on ${applicationProperties.namespace} environment")
    }
}