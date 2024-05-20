package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleUrl {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		By signUpLink = By.xpath("//a[text()='Sign Up']");

		ElementUtil elUtil = new ElementUtil(driver);
		// elUtil.clickElementWhenReady(signUpLink, 20);
		// System.out.println(waitForTitleIsAndCapture("Free CRM", 10));

		// for URL:
		elUtil.clickElementWhenReady(signUpLink, 20);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		if (wait.until(ExpectedConditions.urlContains("register"))) {

			String url = driver.getCurrentUrl();
			System.out.println(url);

		}

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		if (wait.until(ExpectedConditions.titleContains("register"))) {
//			System.out.println(driver.getTitle());
//		}

	}

	public static String waitForURLContainsAndCapture(String urlFraction, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if (wait.until(ExpectedConditions.urlContains(urlFraction))) {
			String url = driver.getCurrentUrl();
			return url;
		} else {
			System.out.println("URL is not present within the given timeout:" + timeOut);
			return null;
		}
	}

	public static String waitForURLAndCapture(String urlValue, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if (wait.until(ExpectedConditions.urlToBe(urlValue))) {
			String url = driver.getCurrentUrl();
			return url;
		} else {
			System.out.println("URL is not present within the given timeout:" + timeOut);
			return null;
		}
	}

	public static String waitForTitleIsAndCapture(String titleFraction, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
			String title = driver.getTitle();
			return title;
		} else {
			System.out.println("Title is not present within the given timeout:" + timeOut);
			return null;
		}
	}

	public static String waitForFullTitleAndCapture(String titleVal, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if (wait.until(ExpectedConditions.titleIs(titleVal))) {
			String title = driver.getTitle();
			return title;
		} else {
			System.out.println("Title is not present within the given timeout:" + timeOut);
			return null;
		}
	}

}
