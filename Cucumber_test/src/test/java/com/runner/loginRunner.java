package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\nbusireddy\\Selenium\\CucumberDemo\\cucumber\\Cucumber_test\\Feature\\second.feature", glue = {"com.setpdefination"}, 
monochrome = true,
dryRun = false,
tags = "@P2"
		)
public class loginRunner {
	

	
}
