package com.setpdefination;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	WebDriver driver;


	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(3000);
	}

	@When("given (.*) and (.*)$")
	public void given_username_and_password(String user, String pasword) throws InterruptedException {

		driver.findElement(By.id("txtUsername")).sendKeys(user);
		Thread.sleep(3000);
		driver.findElement(By.id("txtPassword")).sendKeys(pasword);
		Thread.sleep(3000);

	}

	@And("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("landed on homepage")
	public void landed_on_homepage() {
		System.out.println("In homepage");

	}

}
