package com.bank.aura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AuraDiscoveryClient {
    public static void main(String[] args) {
        SpringApplication.run(AuraDiscoveryClient.class, args);
    }
}