package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElementConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		By usrName = By.name("username");
		By signUp = By.xpath("//a[text()='Sign Up']");

		// Interview queestion1:
		// What does presenceOfElementLocated() mean and what is the limitation?
		// An expectation for checking that an element is present on the DOM of a page.
		// This does not necessarily mean that the element is visible on the page.
		// limitation is we are bothered about element present on page and not on the
		// DOM.
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));// selenium 4.x.x
//		WebElement usrNameEle = wait.until(ExpectedConditions.presenceOfElementLocated(usrName));
//		usrNameEle.sendKeys("abhishek.anand@gmail.com");
//		
//		waitForElementPresence(usrName, 10).sendKeys("abhishekanand20@gmail.com");
//		waitForElementPresence(signUp, 10).click();
		
//		waitForElementVisible(usrName, 10).sendKeys("abhishekanand20@gmail.com");
//		waitForElementVisible(signUp, 10).click();
		
		ElementUtil elUtil=new ElementUtil(driver);
		
		elUtil.getElement(usrName, 10).sendKeys("abhishek@tcs.com" ); //for username applying dynamic wait for 10 seconds
		elUtil.getElement(signUp).click();// for sign using normal getElement because i dont want to wait now
		


	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page.
	 * This does not necessarily mean that the element is visible on the page.
	 * limitation is we are bothered about element present on page and not on the
	 * page
	 * 
	 * @param locator
	 * @param timeout
	 * @return
	 */

	public static WebElement waitForElementPresence(By locator, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));// selenium 4.x.x
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page
	 * and visible. Visibility means that the element is not only displayed but also
	 * has a height and width that is greater than 0.
	 * We can't maintain WebDriverWait wait at class level , then in constructor also, we have to supply timeout value
	 * That's why every time if we create object of elementUtil , we have  to supply timeout value
	 * Also, if we want to change timeout value as per the page, we can't do that
	 * Will help me in parallel execution also
	 * 
	 * @param locator
	 * @param timeout
	 * @return
	 */

	public static WebElement waitForElementVisible(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));// selenium 4.x.x
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

}
