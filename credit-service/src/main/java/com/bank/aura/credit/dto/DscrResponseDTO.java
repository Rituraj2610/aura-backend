package com.bank.aura.credit.dto;

public record DscrResponseDTO(
        double dscr,
        String riskTier,
        boolean manualReviewRequired
) {
}
