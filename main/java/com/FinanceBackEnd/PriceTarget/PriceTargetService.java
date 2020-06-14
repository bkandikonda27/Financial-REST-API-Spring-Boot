package com.FinanceBackEnd.PriceTarget;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URL;


// This is the Service class for getting and wrapping the data around an instance of thw PriceTarget.class


@Service
public class PriceTargetService {

    @Autowired
    private ObjectMapper objectMapper;

    public PriceTarget getPriceTarget(String stockSymbol, String APIKey) throws Exception {
        try {
            URL url = new URL("https://finnhub.io/api/v1/stock/price-target?symbol="+stockSymbol+"&token="+APIKey);
            PriceTarget comp = objectMapper.readValue(url, PriceTarget.class);
            return comp;
        } catch (Exception e ) {
            throw new Exception("Sorry, please try again in a few minutes due to a limited number of API calls!");
        }


    }
}
