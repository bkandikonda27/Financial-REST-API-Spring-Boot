package com.FinanceBackEnd.CompanyFinancials;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


// Model for the Cash Flow Statement of the company
// We will be getting and wrapping the variable information below into the CashFlowStatement class

@JsonIgnoreProperties(ignoreUnknown = true)
public class CashFlowStatement {

    @JsonProperty("NetIncomeLoss")
    private long netIncome;
    @JsonProperty("InterestPaid")
    private long interest;
    @JsonProperty("IncomeTaxesPaidNet")
    private long taxes;
    private long EBIT;


    public CashFlowStatement() {
    }

    public CashFlowStatement(long netIncome, long interest, long taxes, long EBIT) {
        this.netIncome = netIncome;
        this.interest = interest;
        this.taxes = taxes;
        this.EBIT = netIncome + interest + taxes;
    }

    public long getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(long netIncome) {
        this.netIncome = netIncome;
    }

    public long getInterest() {
        return interest;
    }

    public void setInterest(long interest) {
        this.interest = interest;
    }

    public long getTaxes() {
        return taxes;
    }

    public void setTaxes(long taxes) {
        this.taxes = taxes;
    }

    public long getEBIT() {
        return EBIT;
    }

    public void setEBIT(long EBIT) {
        this.EBIT = netIncome + taxes + interest;
    }

    @Override
    public String toString() {
        return "CashFlowStatement{" +
                "netIncome=" + netIncome +
                ", interest=" + interest +
                ", taxes=" + taxes +
                ", EBIT=" + EBIT +
                '}';
    }
}

