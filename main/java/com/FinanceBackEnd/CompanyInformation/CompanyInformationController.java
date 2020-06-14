package com.FinanceBackEnd.CompanyInformation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// This is the Rest Controller for Company Information
// This class maps to "/info/{Ticker of company information you need}"
// It returns an instance of CompanyInformation.class

@RestController
@RequestMapping(value = "/info", headers = "Accept=application/json")
public class CompanyInformationController {

    @Autowired
    public CompanyInformationService CIS = new CompanyInformationService();

    @RequestMapping(path = "/{stockSymbol}", method = RequestMethod.GET)
    public CompanyInformation getCompanyInfo(@PathVariable("stockSymbol") String stockSymbol, String APIKey) throws Exception {
        try {
            return CIS.getCompanyInformation(stockSymbol, APIKey);
        } catch (Exception e) {
            throw new Exception(e);
        }

    }

}
