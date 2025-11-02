package com.example.k8s_consumer.api

import com.example.k8s_consumer.config.ApplicationProperties
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/consumer")
class AppController(
    private val  applicationProperties: ApplicationProperties
) {

    private val  logger: Logger = LoggerFactory.getLogger(AppController::class.java)

    @GetMapping("/test")
    fun test() {
        logger.info("CONSUMER app is working")
    }

    @GetMapping("/config")
    fun config() {
        logger.info("""
            Config variables:
            consumer-variable: ${applicationProperties.consumerVariable}
            consumer-secret-variable: ${applicationProperties.consumerSecretVariable}
            pod-name: ${applicationProperties.podName}
            namespace: ${applicationProperties.namespace}
            """.trimIndent()
        )
    }

    @PostMapping("/load")
    fun load(@RequestBody data: Map<String, String>) {
        logger.info("Received data from PRODUCER: $data")
    }
}