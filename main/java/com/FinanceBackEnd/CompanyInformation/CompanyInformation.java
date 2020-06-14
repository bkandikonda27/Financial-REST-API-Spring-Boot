package com.FinanceBackEnd.CompanyInformation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


// This is the relevant company information that we will be getting and wrapping into this class



@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyInformation {

    @JsonProperty("exchange")
    private String exchange;

    @JsonProperty("name")
    private String name;
    @JsonProperty("finnhubIndustry")
    private String industry;

    public CompanyInformation() {
    }

    public CompanyInformation(String exchange, String name, String industry) {
        this.exchange = exchange;
        this.name = name;
        this.industry = industry;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @Override
    public String toString() {
        return "CompanyInformation{" +
                "exchange='" + exchange + '\'' +
                ", name='" + name + '\'' +
                ", industry='" + industry + '\'' +
                '}';
    }

}
