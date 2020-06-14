package com.FinanceBackEnd.CompanyFinancials;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// This is the RestController class for Company's Financial Data
// It maps to "/financials/{Ticker of public Company}/{APIKey for Finnhub}"
// The return data will contain a list of company's
// BalanceSheet's, IncomeStatement's, and CashFlowStatement's
// from past -------10Q's----------------


@RestController
@RequestMapping(value = "/financials",headers = "Accept=application/json" )
public class CompanyFinancialsController {

    @Autowired
    public CompanyFinancialsService cfs = new CompanyFinancialsService();

    @RequestMapping(path = "/{stockSymbol}", method = RequestMethod.GET)
    public Reports getCompanyFinancials(@PathVariable("stockSymbol") String stockSymbol, String APIKey) throws Exception {
        try {
            return cfs.getCompanyFinancials(stockSymbol, APIKey);
        } catch (Exception e) {
            throw new Exception(e);
        }

    }
}
