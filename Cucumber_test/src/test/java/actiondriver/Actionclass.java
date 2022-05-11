package actiondriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.pageObjects.BaseClass;

public class Actionclass {
	
	public void click(WebDriver driver, WebElement ele) {
		Actions action = new Actions(driver);
		action.moveToElement(ele).click().build().perform();
	}
	
	public void sendkeys( WebElement ele, String text) {
		ele.sendKeys(text);
		
	}

}
