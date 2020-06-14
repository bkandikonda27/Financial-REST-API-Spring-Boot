package com.FinanceBackEnd.CompanyFinancials;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URL;

// This is a Service class used to get an individual Company's financial data
//  Wrap the data into the Reports.class
// and then return that instance of Reports.class/
// The return data will contain a list of company's
// BalanceSheet's, IncomeStatement's, and CashFlowStatement's
// from past -------10Q's----------------


@Service
public class CompanyFinancialsService {

    @Autowired
    private ObjectMapper objectMapper;

    public Reports getCompanyFinancials (String stockSymbol, String ApiKey) throws Exception {
        try{
            URL url = new URL("https://finnhub.io/api/v1/stock/financials-reported?symbol="+stockSymbol+"&token="+ApiKey);
            Reports cf = objectMapper.readValue(url, Reports.class);
            return cf;
        } catch (Exception e) {
            throw new Exception("Sorry, please try again in a few minutes due to a limited number of API calls!");
        }
    }
}
