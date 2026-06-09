package com.bank.aura.credit.mcp;

import com.bank.aura.credit.dto.DscrRequestDTO;
import com.bank.aura.credit.dto.DscrResponseDTO;
import org.springaicommunity.mcp.annotation.McpTool;
import org.springframework.stereotype.Service;

@Service
public class CreditMcpTools {

    @McpTool(description = "Calculate the Debt Service Coverage Ratio (DSCR) to establish corporate loan creditworthiness.")
    public DscrResponseDTO calculateDscr(DscrRequestDTO request){
        if(request.annualDebtService()<0){
            return new DscrResponseDTO(0.0, "CRITICAL_ERROR", true);
        }

        double dscr = request.annualNetIncome() / request.annualDebtService();

        // Financial rule: standard banks look for a ratio of 1.25 or higher
        String tier = dscr >= 1.25 ? "LOW_RISK_QUALIFIED" : "HIGH_RISK_REJECT";
        boolean reviewRequired = dscr < 1.25;

        return new DscrResponseDTO(dscr, tier, reviewRequired);
    }
}
