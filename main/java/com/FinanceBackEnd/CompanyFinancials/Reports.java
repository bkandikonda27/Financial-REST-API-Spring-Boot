package com.FinanceBackEnd.CompanyFinancials;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

// This class will gather an ArrayList of CFLead instances
// Each CFLead instance is a company's
// ------ 10Q ------
// which contains a BalanceSheet, a CashFlowStatement, and an IncomeStatement

@JsonIgnoreProperties(ignoreUnknown = true)
public class Reports {

    @JsonProperty("data")
    private ArrayList<CFLead> cfLead;

    public Reports() {
        cfLead = new ArrayList<CFLead>();
    }

    public void addCompFin(CFLead cf2) {
        cfLead.add(cf2);
    }

    public ArrayList<CFLead> getCompanyFinancials() {
        return cfLead;
    }

    @Override
    public String toString() {
        return "Reports{" +
                "companyFinancials=" + cfLead +
                '}';
    }
}
