/**
 * 
 */
package com.pageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actiondriver.Actionclass;

/**
 * @author nbusireddy
 *
 */
public class AddCustomerPage extends BaseClass{
	
	Actionclass action = new Actionclass();
	
	@FindBy(id="Email")
	WebElement email;

	@FindBy(xpath="/html/body/div[3]/div[1]/form[1]/div/div/a")
	WebElement addCustomerBtn;

	@FindBy(id="Password")
	WebElement password;

	@FindBy(id="FirstName")
	WebElement firstName;

	@FindBy(id="LastName")
	WebElement lastName;

	@FindBy(id="Gender_Male")
	WebElement genderMale;

	@FindBy(id="DateOfBirth")
	WebElement dateOfBirth;

	@FindBy(id="Company")
	WebElement company;

	@FindBy(id="IsTaxExempt")
	WebElement isTaxExempt;
	
	@FindBy(name="save")
	WebElement saveBtn;
	
	@FindBy(xpath="//div[@class=\"card-title\"]")
	WebElement headeraccountcreation;
	
	@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissable\"]")
	WebElement successfullSaved;
	
	


	public AddCustomerPage() {

		PageFactory.initElements(driver, this);
	}
	
	
	public void addCustomerBtn() {
		action.click(driver, addCustomerBtn);
	}
	
	
	
	public void fillCustomerForm(String emaill) {
		action.sendkeys(email,emaill );
		action.sendkeys(password, "123654789");
		action.sendkeys(firstName, "naresh");
		action.sendkeys(lastName, "naresh");
		action.click(driver, genderMale);
		action.sendkeys(dateOfBirth, "1/1/2022");
		action.sendkeys(company, "naresh");
		action.click(driver, isTaxExempt);
		
		
	}
	
	
	 
	public void saveForm() {
		action.click(driver, saveBtn);
	}
	
	public String headerofCreationPage() {
		
		return headeraccountcreation.getText();
	}
	
	public String verifytheSave() {
		return successfullSaved.getText();
	}

}
