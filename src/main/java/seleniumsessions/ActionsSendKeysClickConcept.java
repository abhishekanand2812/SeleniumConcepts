package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysClickConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		WebElement emailId = driver.findElement(By.id("input-email"));
		WebElement password = driver.findElement(By.id("input-password"));
		WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));

		Actions action = new Actions(driver);

//		action.sendKeys(emailId, "abhi.innvi@gmail.com").build().perform();// first click on element and then send-keys
//		action.sendKeys(password, "Chocopie@12").build().perform();
//		action.click(loginBtn).build().perform();

		// Actions class sendKeys();
		// internally move to the element
		// click on the element -- middle of the element
		// then do sendKeys();

		// Actions class click();
		// internally move to the element
		// click on the element -- middle of the element
		// then do click();

		// INTERVIEW QUESTION1
		// Which will give more guarantee? .Action class sendKeys vs normal sendKeys()?
		// Always actions class
		//Because it will moveToElement, clickOnTheMiddleElement and then sendKeys
		By email=By.id("input-email");
		By pwd=By.id("input-password");
		By loginBtn1=By.xpath("//input[@value='Login']");

		doActionsSendKeys(email,"test@gmail.com");
		doActionsSendKeys(pwd,"test@123");
		doActionsClick(loginBtn1);

		

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static void doActionsSendKeys(By locator, String value) {
		Actions action = new Actions(driver);
		action.sendKeys(getElement(locator), value).build().perform();

	}
	
	public static void doActionsClick(By locator) {
		Actions action = new Actions(driver);
		action.click(getElement(locator)).build().perform();
	}
	
}
