package com.example.k8s_producer.api

import com.example.k8s_producer.config.ApplicationProperties
import com.example.k8s_producer.service.ProducerService
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/producer")
class AppController(
    private val producerService: ProducerService,
    private val applicationProperties: ApplicationProperties
) {

    private val  logger: org.slf4j.Logger = LoggerFactory.getLogger(AppController::class.java)

    @GetMapping("/test")
    fun test() {
        logger.info("PRODUCER app is working")
    }

    @GetMapping("/config")
    fun config() {
        logger.info("""
            Config variables:
            producer-variable: ${applicationProperties.producerVariable}
            producer-secret-variable: ${applicationProperties.producerSecretVariable}
            od-name: ${applicationProperties.podName}
            namespace: ${applicationProperties.namespace}
            """.trimIndent()
        )
    }

    @PostMapping("/load")
    fun load(@RequestBody data: Map<String, String>) {
        producerService.sendToConsumer(data)
    }
}