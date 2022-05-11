package com.step;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.pageObjects.AddCustomerPage;
import com.pageObjects.BaseClass;
import com.pageObjects.HomePage;
import com.pageObjects.LoginPage;
import com.pageObjects.SearchCustomer;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;


public class LoginStep extends BaseClass {
	
	
	@Before
	public void setup(Scenario s) {
		this.senar=s;
				
	}
	
	@After
	public void quite_the_browser(Scenario s) throws InterruptedException {	
//		if(senar.isFailed()) {
//			TakesScreenshot scr = (TakesScreenshot)driver;
//			byte[] data =scr.getScreenshotAs(OutputType.BYTES);
//			senar.attach(data, "image/png", "image");
//			senar.log("test is failed");
//		}
		driver.quit();
	}
	
	@AfterStep	
	public void screenshotsetup() {	
		TakesScreenshot scr = (TakesScreenshot)driver;
		byte[] data =scr.getScreenshotAs(OutputType.BYTES);
		senar.attach(data, "image/png", "image");
		senar.log("test is failed");
		
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		logger=Logger.getLogger("Cucumber Project");
		PropertyConfigurator.configure("log4j.properties");
		loginpage=new LoginPage();
		loginpage.login();
		logger.info("Application is logged in");
	}

	@When("provided the input parameters username {string} and password {string}")
	public void provided_the_input_parameters_username_and_password(String string, String string2) {
		loginpage=new LoginPage();
		System.out.println("enter into credentilas");		
		loginpage.enterCredetials(string, string2);
		logger.info("Entered the credentials");
	}

	@When("click on login buttonn")
		public void click_on_login_buttonn() throws InterruptedException {
		loginpage=new LoginPage();		
		homePage = loginpage.clickonSignin();	
		logger.info("clicked on Login button");
		
	}

	
	@And("verified the homepage")
	public void verified_the_homepage() throws InterruptedException {		
		homePage.verifyLoginStatus();
		
	}

	@Then("clicked on logout button")
	public void clicked_on_logout_button() throws InterruptedException {
		homePage = new HomePage();
		homePage.logOut();
		
	}
	
	
	
//	----------------------------------------------------------------
	

	@And("click on customer menu")
	public void click_on_customer_menu() throws InterruptedException {
		homePage = new HomePage();
		homePage.clickCustomerBtn();
	   
	}
	@And("click on customer sub menu")
	public void click_on_customer_sub_menu() {		
		homePage.clickCustomerSubBtn();
	}
	
	@When("click on Add new button")
	public void click_on_add_new_button() {
		addCustomerPage = new AddCustomerPage();
		addCustomerPage.addCustomerBtn();
	}
	@When("user can see create cutomer form")
	public void user_can_see_create_cutomer_form() {
		String header = addCustomerPage.headerofCreationPage();
		System.out.println(header);
	}
	@When("user fill the form")
	public void user_fill_the_form() {
		String emails=randomString()+"@gmail.com";
		System.out.println(emails);
		addCustomerPage.fillCustomerForm(emails);
	}
	@When("click on save button")
	public void click_on_save_button() {
		addCustomerPage.saveForm();
	}
	@When("verify the customer registration")
	public void verify_the_customer_registration() {
		String message =addCustomerPage.verifytheSave();
		System.out.println(message);
	}
	
	//---------------------------------------------------------------------------------------------------------
	

	@And("user enters emaild {string}")
	public void user_enters_emaild(String string) {
		searchcustomer=new SearchCustomer();
		searchcustomer.enterEmail(string);
		logger.info("user entered emil address in the search box");
	}
	
	
	@And("user clicked on search button")
	public void user_clicked_on_search_button() {
		searchcustomer.clickonSearch();
		logger.info("user clicked on the search button");
	    
	}
	@And("verifying the emailid in the results set")
	public void verifying_the_emailid_in_the_results_set() {
		Boolean  result = searchcustomer.verifytheresults("victoria_victoria@nopCommerce.com");
		if(result.equals(true)) {
			System.out.println("Records found in the results");
		}else {
			System.out.println("No results found");
			
		}
		
		
	}





}
