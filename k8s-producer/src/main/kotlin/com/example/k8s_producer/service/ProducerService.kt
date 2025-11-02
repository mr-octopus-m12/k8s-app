package com.example.k8s_producer.service

import com.example.k8s_producer.config.ConsumerClient
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class ProducerService(
    private val  logger: Logger = LoggerFactory.getLogger(ProducerService::class.java),
    private val consumerClient: ConsumerClient
) {

    fun sendToConsumer(data: Map<String, String>) {
        consumerClient.sendRequestToConsumer(data)
    }
}