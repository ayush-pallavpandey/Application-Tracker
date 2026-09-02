package com.aistudyplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

/**
 * AI Study Platform - Main Application Entry Point
 * 
 * Enterprise-grade AI Study Assistant with RAG (Retrieval Augmented Generation)
 * and Vector Search capabilities.
 * 
 * Features:
 * - JWT Authentication & Authorization
 * - RAG-based Q&A System
 * - Vector Search with Embeddings
 * - Study Material Management
 * - Progress Tracking
 * - Analytics & Metrics
 * 
 * @author AI Study Platform Team
 * @version 1.0.0
 */
@SpringBootApplication
@EnableCaching
@EnableAsync
@EnableJpaAuditing
@EnableMethodSecurity(securedEnabled = true, prePostEnabled = true)
@ComponentScan(basePackages = "com.aistudyplatform")
public class AiStudyPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiStudyPlatformApplication.class, args);
    }
}
