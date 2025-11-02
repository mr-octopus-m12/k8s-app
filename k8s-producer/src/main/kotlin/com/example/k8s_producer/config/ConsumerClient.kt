package com.example.k8s_producer.config

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
class ConsumerClient(
    private val  logger: Logger = LoggerFactory.getLogger(ConsumerClient::class.java),
    private val consumerRestTemplate: RestTemplate
) {

    fun sendRequestToConsumer(data: Map<String, String>) {
        try {
            consumerRestTemplate.postForLocation("/consumer/load", data)
            logger.info("Request with data: $data sent to consumer")
        } catch (e: Exception) {
            logger.error("Error occurred during request to consumer: {}", e.message)
        }
    }
}