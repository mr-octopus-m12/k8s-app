package com.example.k8s_producer.config

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty

@ConditionalOnProperty(prefix = "app-properties")
data class ApplicationProperties(
    val producerVariable: String,
    val producerSecretVariable: String
) {
}