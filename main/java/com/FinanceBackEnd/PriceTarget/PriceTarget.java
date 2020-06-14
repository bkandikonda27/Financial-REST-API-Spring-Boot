package com.FinanceBackEnd.PriceTarget;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

// This class will map to the JSON file received from the PriceTarget API Call


@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceTarget {

    @JsonProperty("symbol")
    private String ticker;
    private int targetHigh;
    private int targetLow;
    private int targetMean;
    private int targetMedian;

    public PriceTarget() {
    }

    public PriceTarget(String ticker, int targetHigh, int targetLow, int targetMean, int targetMedian) {
        this.ticker = ticker;
        this.targetHigh = targetHigh;
        this.targetLow = targetLow;
        this.targetMean = targetMean;
        this.targetMedian = targetMedian;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public int getTargetHigh() {
        return targetHigh;
    }

    public void setTargetHigh(int targetHigh) {
        this.targetHigh = targetHigh;
    }

    public int getTargetLow() {
        return targetLow;
    }

    public void setTargetLow(int targetLow) {
        this.targetLow = targetLow;
    }

    public int getTargetMean() {
        return targetMean;
    }

    public void setTargetMean(int targetMean) {
        this.targetMean = targetMean;
    }

    public int getTargetMedian() {
        return targetMedian;
    }

    public void setTargetMedian(int targetMedian) {
        this.targetMedian = targetMedian;
    }

    @Override
    public String toString() {
        return "PriceTarget{" +
                "ticker='" + ticker + '\'' +
                ", targetHigh=" + targetHigh +
                ", targetLow=" + targetLow +
                ", targetMean=" + targetMean +
                ", targetMedian=" + targetMedian +
                '}';
    }
}
