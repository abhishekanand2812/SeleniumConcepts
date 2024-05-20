package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysWithPause {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		Actions action = new Actions(driver);

		// Conditions and limitations:-
		// Script only works with element where id is present
		// script:
		// document.getElementById('input-email').value='abhishekanand@gmail.com';

		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		// just send idName in parameter and value
		//jsUtil.sendKeysUsingWithId("input-email", "abhishek.anand@tcs.com");

		// seperate all the characters and store in char array
		WebElement emailId = driver.findElement(By.id("input-email"));
		String emailValue = "abhishek.anand@tcs.com";

		// We will break string value to characters
		char ch[] = emailValue.toCharArray();
		Actions ac = new Actions(driver);
		for (char e : ch) {
			// writing string.valueOf(e) because parameter should be character sequence 
			//like string and we know character is not a character sequence
			ac.sendKeys(emailId, String.valueOf(e)).pause(500).build().perform();

		}

	}

}
