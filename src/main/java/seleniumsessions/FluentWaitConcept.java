package seleniumsessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		ElementUtil elUtil = new ElementUtil(driver);

		By twitterLink = By.xpath("//a[contains(@href,'twitter')]");

		// topcasting with Wait(I) to FluentWait(c)

		// the below line tells that where you want to apply fluent wait in ():
		// Also, on which non primitive datatype , i.e., WebDriver, pass it in generics:

		// wait is being defined here

//		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
//													.withTimeout(Duration.ofSeconds(20))
//													.ignoring(NoSuchElementException.class)
//													.ignoring(ElementNotInteractableException.class)
//													.ignoring(StaleElementReferenceException.class)
//													.pollingEvery(Duration.ofSeconds(1))
//													.withMessage("timeout done--- No element found");
//													
//		//wait is being used here:
//													
//		wait.until(ExpectedConditions.elementToBeClickable(twitterLink)).click();

		// same thing can be done with WebDriverWait
		// WebDriverWait will also behave like FluentWait because it is child of
		// FluentWait

		// we can call all the features of FluentWait like
		// pollingEvery,ignoring,withMessagecan be done by WebDriverWait below:
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		wait.ignoring(NoSuchElementException.class).pollingEvery(Duration.ofSeconds(1))
//				.withMessage("timeout done--- No element found")
//				// as usual then using until method
//				.until(ExpectedConditions.elementToBeClickable(twitterLink)).click();

		// Interview question1:
		// Is there any difference btw WebDriverWait & FluentWait?
		// no difference, since all methods of FluentWait class can be accessed by
		// WebDriverWait class
		// also, WebDriverWait doesn't have individual methods except one
		// method,timeOutException() which
		// is overridden and protected

		// Interview question2:
		// Is there any difference btw WebDriverWait & FluentWait? If not, then why
		// architecture is defined like that?
		// Since selenium is open source library, any new tool in the market like
		// WebDriverIO can access and override methods of FluentWait
		// and create a wrapper on top of selenium library

		// WDWait with FluentWait Features
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.ignoring(NoSuchElementException.class).pollingEvery(Duration.ofSeconds(1))
//				.withMessage("------time out is done...element is not found.....")
//				.until(ExpectedConditions.elementToBeClickable(twitterLink)).click();
		
		waitForElementVisibleWithFluentWait(twitterLink,20,1).click();

	}

	public static WebElement waitForElementVisibleWithFluentWait(By locator, int timeOut, int pollingTime) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(timeOut))
				.ignoring(NoSuchElementException.class).ignoring(ElementNotInteractableException.class)
				.ignoring(StaleElementReferenceException.class).pollingEvery(Duration.ofSeconds(pollingTime))
				.withMessage("---timeout done--- No element found");

		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

}
