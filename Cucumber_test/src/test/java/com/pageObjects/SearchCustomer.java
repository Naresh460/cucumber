/**
 * 
 */
package com.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actiondriver.Actionclass;

/**
 * @author nbusireddy
 *
 */
public class SearchCustomer extends BaseClass {
	
	Actionclass action = new Actionclass();

	@FindBy(id="SearchEmail")
	WebElement email;

	@FindBy(id="SearchFirstName")
	WebElement searchFastName;

	@FindBy(id="SearchLastName")
	WebElement searchLastName;
	
	@FindBy(id="search-customers")
	WebElement searchBtn;
	
	@FindBy(id="customers-grid")
	WebElement table;
	
	
	@FindBy(xpath="//table[@id=\"customers-grid\"]/tbody/tr")
	List<WebElement> tableRow;
	
	@FindBy(xpath="//table[@id=\"customers-grid\"]/tbody/tr/td")
	List<WebElement> tableColumn;
	
	
	

	public SearchCustomer() {
		PageFactory.initElements(driver, this);
	}

public void enterEmail(String emailid) {
	action.sendkeys(email, emailid);
	
}

public void enterfirstName(String fname) {
	action.sendkeys(email, fname);
	
}

public void enterLirstName(String lname) {
	action.sendkeys(email, lname);
	
}

public void clickonSearch() {
	action.click(driver, searchBtn);
}

public int noOfRows() {	
	
	return tableRow.size();
}

public int noOfColumns() {	
	
	return tableColumn.size();
}

public Boolean verifytheresults(String emails) {	
	Boolean flag=false;
	
	for(int i=1;i<=noOfRows(); i++) {
		
		for(int j=1; j<noOfColumns();j++) {
			WebElement  element = table.findElement(By.xpath("//table[@id=\'customers-grid\']/tbody/tr["+i+"]/td["+j+"]"));
			String resultcell=element.getText();
			
			if(resultcell.equals(emails)) {
				System.out.println("Email id found-->" +resultcell);
				flag=true;
			}
			
		}
		
	}
	return flag;
	
}


}
