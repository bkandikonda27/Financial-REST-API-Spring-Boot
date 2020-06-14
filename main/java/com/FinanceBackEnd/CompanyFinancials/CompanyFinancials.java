package com.FinanceBackEnd.CompanyFinancials;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

// The CompanyFinancials class is meant to hold all the  financial statements of a single company


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("")
public class CompanyFinancials {

    @JsonProperty("bs")
    private BalanceSheet balanceSheet;
    @JsonProperty("cf")
    private CashFlowStatement cashFlowStatement;
    @JsonProperty("ic")
    private IncomeStatement incomeStatement;

    public CompanyFinancials() {
    }

    public CompanyFinancials(BalanceSheet balanceSheet, CashFlowStatement cashFlowStatement, IncomeStatement incomeStatement) {
        this.balanceSheet = balanceSheet;
        this.cashFlowStatement = cashFlowStatement;
        this.incomeStatement = incomeStatement;
    }

    public BalanceSheet getBalanceSheet() {
        return balanceSheet;
    }

    public void setBalanceSheet(BalanceSheet balanceSheet) {
        this.balanceSheet = balanceSheet;
    }

    public CashFlowStatement getCashFlowStatement() {
        return cashFlowStatement;
    }

    public void setCashFlowStatement(CashFlowStatement cashFlowStatement) {
        this.cashFlowStatement = cashFlowStatement;
    }

    public IncomeStatement getIncomeStatement() {
        return incomeStatement;
    }

    public void setIncomeStatement(IncomeStatement incomeStatement) {
        this.incomeStatement = incomeStatement;
    }

    @Override
    public String toString() {
        return "CompanyFinancials{" +
                "balanceSheet=" + balanceSheet +
                ", cashFlowStatement=" + cashFlowStatement +
                ", incomeStatement=" + incomeStatement +
                '}';
    }
}
