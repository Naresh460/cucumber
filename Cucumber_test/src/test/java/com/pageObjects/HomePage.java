package com.pageObjects;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import actiondriver.Actionclass;

public class HomePage extends BaseClass {
	
	Actionclass action = new Actionclass();
		
	@FindBy(xpath="//div[@id=\"navbarText\"]/ul/li[3]/a")
	WebElement logout;
	
	@FindBy(xpath="//ul[@class=\"nav nav-pills nav-sidebar flex-column nav-legacy\"]/li[4]")
	WebElement customerBtn;
	
	@FindBy(xpath="//ul[@class=\"nav nav-pills nav-sidebar flex-column nav-legacy\"]/li[4]/ul/li")
	WebElement subCustomerBtn;

	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickCustomerBtn() throws InterruptedException {
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300), Duration.ofMillis(500));
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='ajaxBusy'][contains(@style, 'display: none')]")));
		Thread.sleep(3000);
		customerBtn.click();
		//action.click(driver, customerBtn);
	}
	
public void clickCustomerSubBtn() {
	subCustomerBtn.click();
		//action.click(driver, subCustomerBtn);
	}
	
	public void logOut() {
		System.out.println("enter into logout");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300), Duration.ofMillis(500));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='ajaxBusy'][contains(@style, 'display: none')]")));

		logout.click();
	}
	
	public void verifyLoginStatus() {
		String ExpectedTitle="Dashboard / nopCommerce administration";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(ExpectedTitle, actualTitle);
		
	}

}
