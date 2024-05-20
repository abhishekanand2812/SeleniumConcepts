package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElementWithInterval {
	static WebDriver driver;


	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		By forgotPassword=By.linkText("Forgot password111");

		//Polling/interval time:
		//Just add one extra parameter for polling time
		//in every 1 second internal, the total iteration will be 20/1=20;
		//default interval time= 500 milliseconds from selenium
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20),Duration.ofSeconds(1));
		wait.until(ExpectedConditions.visibilityOfElementLocated(forgotPassword)).click();
		


	}

}
