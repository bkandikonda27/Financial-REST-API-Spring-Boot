package com.FinanceBackEnd.CompanyInformation;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.net.URL;


// This is the Service class used to get Company Information from Rest API and wrap the information into
// an instance of the CompanyInformation.class

@Service
public class CompanyInformationService {


    @Autowired
    public ObjectMapper objectMapper;

    public CompanyInformation getCompanyInformation(String stockSymbol, String APIKey) throws Exception {
        try {
            URL url = new URL("https://finnhub.io/api/v1/stock/profile2?symbol="+stockSymbol+"&token="+APIKey);
            CompanyInformation comp = objectMapper.readValue(url, CompanyInformation.class);
            return comp;
        } catch (Exception e ) {
            throw new Exception("Sorry, please try again in a few minutes due to a limited number of API calls!");
        }


    }
}
