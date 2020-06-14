package com.FinanceBackEnd.PriceTarget;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


// This is the RestController for getting PriceTarget information
// It maps to "/pricetarget/{Ticker of company you want price target information from}"
// Returns an instance of PriceTarget.class



@RestController
@RequestMapping(value = "/pricetarget", headers = "Accept=application/json")
public class PriceTargetController {

    @Autowired
    private PriceTargetService pts = new PriceTargetService();

    @RequestMapping(path = "/{stockSymbol}", method = RequestMethod.GET)
    public PriceTarget getpriceTarget(@PathVariable("stockSymbol") String stockSymbol, String APIkey) throws Exception {
        try {
            return pts.getPriceTarget(stockSymbol, APIkey);
        } catch (Exception e) {
            throw new Exception(e);
        }

    }
}
