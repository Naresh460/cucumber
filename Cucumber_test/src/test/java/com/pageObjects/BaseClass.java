package com.pageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BaseClass {
    public static  WebDriver driver;
	public LoginPage loginpage;
	public HomePage homePage;
	public AddCustomerPage addCustomerPage;
	public SearchCustomer searchcustomer;
	public Logger logger;
	public Scenario senar;
	
	public static String randomString() {
		String emailstring = RandomStringUtils.randomAlphabetic(7);
		return emailstring;
	}
	
}
