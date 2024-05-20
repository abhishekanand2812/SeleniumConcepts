package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptClickAndSendKeys {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//Question is:
		//You have to uncheck on the 'Stay signed in' webelement
		
		WebElement staySignedInChkbox=driver.findElement(By.id("persistent"));
		//First way: normal click();
		//staySignedInChkbox.click();//we will get ElementNotInteractableException: element not interactable
		
		//Second way:  click with actions class
		//try with actions class
//		Actions act=new Actions(driver);
//		act.click(staySignedInChkbox).build().perform();//we wont get exception but not unchecking checkbox
//		
		
		//Third way:  click with jsExecutor
		//try with jsExecutor
		JavaScriptUtil jsUtil=new JavaScriptUtil(driver);
		jsUtil.clickElementByJS(staySignedInChkbox);
		
		//Write sendKeys equivalent method using javascript?
		//Limitation: only with ID it will work
		jsUtil.sendKeysUsingWithId("login-username", "abhishek.anand@yahoo.com");
		
		

	
	}
		
}
