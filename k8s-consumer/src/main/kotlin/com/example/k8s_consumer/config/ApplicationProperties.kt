package com.example.k8s_consumer.config

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.Configuration

@ConditionalOnProperty(prefix = "app-properties")
data class ApplicationProperties(
    val consumerVariable: String,
    val consumerSecretVariable: String
) {
}