package com.bank.aura.customers.mcp;

import com.bank.aura.customers.dto.KycRequest;
import com.bank.aura.customers.dto.KycResponse;
import org.springaicommunity.mcp.annotation.McpTool;
import org.springframework.stereotype.Service;

@Service
public class CustomerMcpTools {

    @McpTool(description = "Verify corporate identity, background registry records, and regulatory compliance checks.")
    public KycResponse verifyKyc(KycRequest request) {
        // Enforce a strict mock rule to demonstrate conditional routing behavior in our AI
        if (request.companyName().toLowerCase().contains("risk") || request.registrationId().equals("9999")) {
            // Returns a flagged response if a risk parameter keyword is captured
            return new KycResponse(
                    request.companyName(),
                    "FAILED_SANCTION_CHECK",
                    "CRITICAL",
                    "Entity matches entries on international regulatory exclusion watchlists."
            );
        }

        // Returns a safe clearance response for standard corporate applicants
        return new KycResponse(
                request.companyName(),
                "PASSED_CLEAN",
                "LOW",
                "Identity verified via active commercial registry records lookup."
        );
    }
}