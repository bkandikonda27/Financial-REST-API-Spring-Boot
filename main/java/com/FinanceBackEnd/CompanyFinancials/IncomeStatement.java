package com.FinanceBackEnd.CompanyFinancials;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


// Model for the Income Statement of the company
// We will be getting and wrapping the variable information below into the IncomeStatement class


@JsonIgnoreProperties(ignoreUnknown = true)
public class IncomeStatement {

    @JsonProperty("GrossProfit")
    private long grossProfit;
    @JsonProperty("NetIncomeLoss")
    private long netIncome;
    @JsonProperty("SalesRevenueNet")
    private long salesRevenue;
    @JsonProperty("OperatingExpenses")
    private long operatingExpenses;
    @JsonProperty("CostOfGoodsAndServicesSold")
    private long COGS;

    public IncomeStatement() {
    }

    public IncomeStatement(long grossProfit, long netIncome, long salesRevenue, long operatingExpenses, long COGS) {
        this.grossProfit = grossProfit;
        this.netIncome = netIncome;
        this.salesRevenue = salesRevenue;
        this.operatingExpenses = operatingExpenses;
        this.COGS = COGS;
    }

    public long getGrossProfit() {
        return grossProfit;
    }

    public void setGrossProfit(long grossProfit) {
        this.grossProfit = grossProfit;
    }

    public long getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(long netIncome) {
        this.netIncome = netIncome;
    }

    public long getSalesRevenue() {
        return salesRevenue;
    }

    public void setSalesRevenue(long salesRevenue) {
        this.salesRevenue = salesRevenue;
    }

    public long getOperatingExpenses() {
        return operatingExpenses;
    }

    public void setOperatingExpenses(long operatingExpenses) {
        this.operatingExpenses = operatingExpenses;
    }

    public long getCOGS() {
        return COGS;
    }

    public void setCOGS(long COGS) {
        this.COGS = COGS;
    }

    @Override
    public String toString() {
        return "IncomeStatement{" +
                "grossProfit=" + grossProfit +
                ", netIncome=" + netIncome +
                ", salesRevenue=" + salesRevenue +
                ", operatingExpenses=" + operatingExpenses +
                ", COGS=" + COGS +
                '}';
    }
}
