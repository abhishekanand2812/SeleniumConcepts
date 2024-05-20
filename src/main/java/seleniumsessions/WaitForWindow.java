package seleniumsessions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWindow {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		ElementUtil elUtil=new ElementUtil(driver);
		

		By twitterLink=By.xpath("//a[contains(@href,'twitter')]");
		elUtil.clickElementWhenReady(twitterLink, 20);

		
		if(waitForTotalWindows(2,10)) {
			Set<String> handle=driver.getWindowHandles();
			System.out.println(handle.size());
		}
		
		

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		if (wait.until(ExpectedConditions.numberOfWindowsToBe(2))) {
//			driver.getWindowHandles();
		}



	public static Boolean waitForTotalWindows(int totalWindowsToBe, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.numberOfWindowsToBe(totalWindowsToBe));
		

	}

}
