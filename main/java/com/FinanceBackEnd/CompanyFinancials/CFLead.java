package com.FinanceBackEnd.CompanyFinancials;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

// I had to create the CFLead class due to the format of the JSON information from the rest API
// Has one instance variable and it's the CompanyFinancials class
// This class, also contains all of the Financial Statements of a company


@JsonIgnoreProperties(ignoreUnknown = true)
public class CFLead {

    @JsonProperty("report")
    private CompanyFinancials companyFinancials;

    public CFLead() {
    }

    public CFLead(CompanyFinancials companyFinancials) {
        this.companyFinancials = companyFinancials;
    }

    public CompanyFinancials getCompanyFinancials() {
        return companyFinancials;
    }

    public void setCompanyFinancials(CompanyFinancials companyFinancials) {
        this.companyFinancials = companyFinancials;
    }

    @Override
    public String toString() {
        return "CFLead{" +
                "companyFinancials=" + companyFinancials +
                '}';
    }
}
