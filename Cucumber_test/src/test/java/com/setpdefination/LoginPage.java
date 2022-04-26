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

public class LoginPage {
	WebDriver driver;


	@Given("user is on login pages")
	public void user_is_on_login_pages() throws InterruptedException {
		
		System.out.println("access login page");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(3000);
	}

	@When("givenn (.*) and (.*)$")
	public void given_username_and_password(String user, String pasword) throws InterruptedException {

		driver.findElement(By.id("txtUsername")).sendKeys(user);
		
		driver.findElement(By.id("txtPassword")).sendKeys(pasword);
		

	}
	
	
	@And("click on login buttonn")
	public void click_on_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("landed on homepagee")
	public void landed_on_homepage() {
		driver.quit();

	}

}
