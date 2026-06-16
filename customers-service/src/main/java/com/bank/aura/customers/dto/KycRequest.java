package com.bank.aura.customers.dto;

// Immutable input parameters passed from the AI agent to verify corporate standing
public record KycRequest(String companyName, String registrationId) {}