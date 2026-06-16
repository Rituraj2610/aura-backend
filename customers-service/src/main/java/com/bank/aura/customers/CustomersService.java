package com.bank.aura.customers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class CustomersService{

    public static void main(String[] args) {
        // Runs the underlying system components framework configuration loop
        SpringApplication.run(CustomersService.class, args);
    }
}