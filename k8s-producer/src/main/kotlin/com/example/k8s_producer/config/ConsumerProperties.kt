package com.example.k8s_producer.config

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty

@ConditionalOnProperty(prefix = "consumer-properties")
class ConsumerProperties(
    val consumerUrl: String,
) {
}