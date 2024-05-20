package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {

	static WebDriver driver;

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);

	}

	public static WebElement retryingElement(By locator, int timeOut, int pollingTime) {

		WebElement ele = null;
		int attempts = 0;

		while (attempts < timeOut) {
			try {
				ele = getElement(locator);
				System.out.println("element is found..." + locator + " after attempt: " + attempts);
				break;

			} catch (NoSuchElementException e) {
				System.out.println("Element is not found" + locator + " after attempt: " + attempts);
				try {
					Thread.sleep(pollingTime);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			attempts++;

		}
		if (ele == null) {
			System.out.println("Element is not found... tried for timeout: " + timeOut + " with interval of 500 ms"
					+ " after attempt: " + attempts);
		}
		return ele;

	}

	public static WebElement retryingElement(By locator, int timeOut) {

		WebElement ele = null;
		int attempts = 0;

		while (attempts < timeOut) {
			try {
				ele = getElement(locator);
				System.out.println("element is found..." + locator + " after attempt: " + attempts);
				break;

			} catch (NoSuchElementException e) {
				System.out.println("Element is not found" + locator + " after attempt: " + attempts);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			attempts++;

		}
		if (ele == null) {
			System.out.println("Element is not found... tried for timeout: " + timeOut + " with interval of 500 ms"
					+ " after attempt: " + attempts);
		}
		return ele;

	}

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		ElementUtil elUtil = new ElementUtil(driver);

		By twitterLink = By.xpath("//a[contains(@href,'twitter111')]");

		retryingElement(twitterLink, 20, 1000).click();

		// Using Thread.sleep as a static wait, convert it to dynamic wait

	}

}
