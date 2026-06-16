package com.bank.aura.customers.dto;

// Structured payload containing the verified status results sent back to the AI layer
public record KycResponse(String companyName, String status, String riskTier, String notes) {}