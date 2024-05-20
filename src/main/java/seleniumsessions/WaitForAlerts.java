package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlerts {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		System.out.println(alert.getText());
//		alert.accept();
		
		System.out.println(alertJSGetText(10));
		alertAccept(10);
		

	}

	public static Alert waitForAlertJsPopup(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public static String alertJSGetText(int timeOut) {
		return waitForAlertJsPopup(timeOut).getText();
	}

	public static void alertAccept(int timeOut) {
		waitForAlertJsPopup(timeOut).accept();
	}

	public static void dismissAlert(int timeOut) {
		waitForAlertJsPopup(timeOut).dismiss();
	}

	public static void enterAlertValue(int timeOut, String value) {
		waitForAlertJsPopup(timeOut).sendKeys(value);
	}

}
