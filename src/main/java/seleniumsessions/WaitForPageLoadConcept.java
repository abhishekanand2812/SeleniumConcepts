package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForPageLoadConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/");

		// Interview question1:-
		// What are the 3 types of loading?
		// 1.loading
		// The document is still loading.

		// 2.interactive
		// The document has finished loading and the document has been parsed but
		// sub-resources such as scripts, images, stylesheets and frames are still
		// loading. The state indicates that the DOMContentLoaded event is about to
		// fire.

		// 3.complete
		// The document and all sub-resources have finished loading. The state indicates
		// that the load event is about to fire.

		// Interview question2:-
		// What is the javascript to check loading state of a page?
		// document.readyState

		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		// waitForPageLoad(20);
		if (isPageLoaded()) {
			System.out.println("page is loaded...");
		}

	}

	public static void waitForPageLoad(int timeOut) {

		long endTime = System.currentTimeMillis() + timeOut;

		while (endTime < endTime) {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			String pageState = js.executeScript("return document.readyState").toString();
			if (pageState.equals("complete")) {
				System.out.println("page dom is loaded");
				break;
			} else {
				System.out.println("page dom is not loaded..." + pageState);

			}
		}

	}

	public static Boolean isPageLoaded() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String flag = wait.until(ExpectedConditions.jsReturnsValue("return document.readyState == \'complete\'"))
				.toString(); // "true"
		return Boolean.parseBoolean(flag);// true
	}

}
