package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/Naresh/Selenium/Cucumber_test/Feature", glue = {"com.setpdefination"}, monochrome = true

		)
public class loginRunner {

	
}
