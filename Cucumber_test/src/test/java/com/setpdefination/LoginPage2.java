package com.setpdefination;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage2 {
	WebDriver driver;


	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		
		System.out.println("access login page");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(3000);
	}

//	@When("given (.*) and (.*)$")
//	public void given_username_and_password(String user, String pasword) throws InterruptedException {
//
//		driver.findElement(By.id("txtUsername")).sendKeys(user);
//		Thread.sleep(3000);
//		driver.findElement(By.id("txtPassword")).sendKeys(pasword);
//		Thread.sleep(3000);
//
//	}
//	
	
	@When("user enters below credentials from Datatable")
	public void user_enters_below_credentials_from_datatable(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> data = dataTable.asMaps();
		for (Map<String, String> list : data) {			
				driver.findElement(By.id("txtUsername")).sendKeys(list.get("username"));				
				driver.findElement(By.id("txtPassword")).sendKeys(list.get("password"));			
				driver.findElement(By.id("btnLogin")).click();				
				driver.findElement(By.id("welcome")).click();
				Thread.sleep(2000);				
				driver.findElement(By.linkText("Logout")).click();	
		
		}
	
			
		}
		
		
	    
	//}




	@And("click on login button")
	public void click_on_login_button() {
		//driver.findElement(By.id("btnLogin")).click();
	}

	@Then("landed on homepage")
	public void landed_on_homepage() {
		driver.quit();

	}

}
