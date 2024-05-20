package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * 
 * @author abhishekanand
 *
 */
public class WebDriverBasics {

	public static void main(String args[]) {
		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}
}
