package com.FinanceBackEnd.CompanyFinancials;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


// Model for the Balance Sheet of the company
// We will be getting and wrapping the variable information below into the BalanceSheet class

@JsonIgnoreProperties(ignoreUnknown = true)
public class BalanceSheet {

    @JsonProperty("AssetsCurrent")
    private long currentAssets;
    @JsonProperty("LiabilitiesCurrent")
    private long currentLiabilities;
    @JsonProperty("StockholdersEquity")
    private long stockholdersEquity;
    @JsonProperty("LongTermDebtCurrent")
    private long currentLTDebt;
    @JsonProperty("LongTermDebtNoncurrent")
    private long noncurrentLTDebt;
    @JsonProperty("AccountsReceivableNetCurrent")
    private long netAR;
    @JsonProperty("InventoryNet")
    private long netInventory;
    @JsonProperty("Assets")
    private long totalAssets;
    @JsonProperty("Liabilities")
    private long totalLiabilities;

    private long totalLTDebt;

    public BalanceSheet() {
    }

    public BalanceSheet(long currentAssets, long currentLiabilities, long stockholdersEquity, long currentLTDebt, long noncurrentLTDebt, long netAR, long netInventory, long totalAssets, long totalLiabilities, long totalLTDebt) {
        this.currentAssets = currentAssets;
        this.currentLiabilities = currentLiabilities;
        this.stockholdersEquity = stockholdersEquity;
        this.currentLTDebt = currentLTDebt;
        this.noncurrentLTDebt = noncurrentLTDebt;
        this.netAR = netAR;
        this.netInventory = netInventory;
        this.totalAssets = totalAssets;
        this.totalLiabilities = totalLiabilities;
        this.totalLTDebt = this.currentLTDebt + this.noncurrentLTDebt;
    }

    public long getCurrentAssets() {
        return currentAssets;
    }

    public void setCurrentAssets(long currentAssets) {
        this.currentAssets = currentAssets;
    }

    public long getCurrentLiabilities() {
        return currentLiabilities;
    }

    public void setCurrentLiabilities(long currentLiabilities) {
        this.currentLiabilities = currentLiabilities;
    }

    public long getStockholdersEquity() {
        return stockholdersEquity;
    }

    public void setStockholdersEquity(long stockholdersEquity) {
        this.stockholdersEquity = stockholdersEquity;
    }

    public long getCurrentLTDebt() {
        return currentLTDebt;
    }

    public void setCurrentLTDebt(long currentLTDebt) {
        this.currentLTDebt = currentLTDebt;
    }

    public long getNoncurrentLTDebt() {
        return noncurrentLTDebt;
    }

    public void setNoncurrentLTDebt(long noncurrentLTDebt) {
        this.noncurrentLTDebt = noncurrentLTDebt;
    }

    public long getNetAR() {
        return netAR;
    }

    public void setNetAR(long netAR) {
        this.netAR = netAR;
    }

    public long getNetInventory() {
        return netInventory;
    }

    public void setNetInventory(long netInventory) {
        this.netInventory = netInventory;
    }

    public long getTotalAssets() {
        return totalAssets;
    }

    public void setTotalAssets(long totalAssets) {
        this.totalAssets = totalAssets;
    }

    public long getTotalLiabilities() {
        return totalLiabilities;
    }

    public void setTotalLiabilities(long totalLiabilities) {
        this.totalLiabilities = totalLiabilities;
    }

    public long getTotalLTDebt() {
        return totalLTDebt;
    }

    public void setTotalLTDebt(long totalLTDebt) {
        this.totalLTDebt = this.currentLTDebt + this.noncurrentLTDebt;
    }

    @Override
    public String toString() {
        return "BalanceSheet{" +
                "currentAssets=" + currentAssets +
                ", currentLiabilities=" + currentLiabilities +
                ", stockholdersEquity=" + stockholdersEquity +
                ", currentLTDebt=" + currentLTDebt +
                ", noncurrentLTDebt=" + noncurrentLTDebt +
                ", netAR=" + netAR +
                ", netInventory=" + netInventory +
                ", totalAssets=" + totalAssets +
                ", totalLiabilities=" + totalLiabilities +
                ", totalLTDebt=" + totalLTDebt +
                '}';
    }
}
