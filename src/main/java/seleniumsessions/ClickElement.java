package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickElement {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");
//		driver.findElement(By.id("username"));
//		driver.findElement(By.id("password"));
//		driver.findElement(By.id("loginBtn"));

		By usrName = By.id("username");
		By pwd = By.id("password");
		By lgnBtn = By.id("loginBtn");

		doSendKeys(usrName, null);
		doSendKeys(pwd, "Chocopie@2812");
		clickElement(lgnBtn);

//		doClear(usrName);
		doSendKeys(usrName, "abhi.innvi@gmail.com");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {
		if (value == null) {
			throw new MySeleniumException("VALUESCANNOTBENULL");
		}
		doClear(locator);
		getElement(locator).sendKeys(value);

	}

	public static void clickElement(By locator) {
		getElement(locator).click();
	}

	public static void doClear(By locator) {
		getElement(locator).clear();

	}

}
