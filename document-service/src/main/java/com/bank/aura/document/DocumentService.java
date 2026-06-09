package com.bank.aura.document;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;

// Marks this project module as a runnable Spring Boot web application
@SpringBootApplication
@EnableAsync // Globally turns on Spring's ability to run methods inside background threads via @Async
@EnableDiscoveryClient
public class DocumentService{

    public static void main(String[] args) {
        // Runs the underlying system components framework configuration loop
        SpringApplication.run(DocumentService.class, args);
    }
}