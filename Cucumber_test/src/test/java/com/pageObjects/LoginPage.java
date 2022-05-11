/**
 * 
 */
package com.pageObjects;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import io.github.bonigarcia.wdm.WebDriverManager;




/**
 * @author nbusireddy
 *
 */
public class LoginPage extends BaseClass{


	//public static WebDriver driver;

	//	@FindBy(xpath="//div[@id=\"navbarText\"]/ul/li[3]/a")
	//	WebElement logout;

	@FindBy(id="Email")
	WebElement username;

	@FindBy(id="Password")
	WebElement password;

	@FindBy(xpath="//button[@class=\"button-1 login-button\"]")
	WebElement signBTN;


	public LoginPage() {	

		PageFactory.initElements(driver, this);
	}

	public void login() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/");
		System.out.println("site open passed");
	}

	public void enterCredetials(String uname, String pword) {
		username.clear();
		password.clear();
		username.sendKeys(uname);
		password.sendKeys(pword);
		System.out.println("credentials");

	}

	public HomePage clickonSignin() {		
		signBTN.click();
		return new HomePage();

	}

	


	

}




