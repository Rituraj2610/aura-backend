package com.bank.aura.credit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CreditService {
    public static void main(String[] args) {
        SpringApplication.run(CreditService.class, args);
    }
}