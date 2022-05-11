package com;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.runner.RunWith;

import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
        // features=".//Feature/login.feature",
		//features=".//Feature/searchCustomer.feature",
		features=".//Feature/",
		glue="com.step",
		dryRun = false,
		monochrome=true,
		plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		//plugin= {"pretty","html:target/cucumber-html-reports.html","json:target/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		//tags= "@sanity"
		
		)

public class TestRunner {
		
}


