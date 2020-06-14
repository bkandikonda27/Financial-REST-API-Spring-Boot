# Financial-REST-API-Spring-Boot

This is a REST API developed in Spring Boot to pull Financial Data using the Finnhub API.

There are three mapping's available:

ST = Stock Ticker of a publicly traded company

get Company Financial information from 10-Q's - endpoint ("/financials/{st}) - i.e ("/financials/AAPL") - get Apple's Financial Statements


get Company Information - endpoint ("/info/{st}) - i.e ("/info/MSFT") - Get Microsoft's company information


get Company Price Target - endpoint ("/pricetarget/{st}) - i.e ("/pricetarget/SGMO") - Get Sangamo's Analyst price targets


The mappings return a Java Object with relevant company information.

