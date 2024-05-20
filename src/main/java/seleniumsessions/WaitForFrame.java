package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFrame {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		ElementUtil elUtil=new ElementUtil(driver);
	
		By usrName=By.xpath("//input[@name='username']");
		
		elUtil.getElement(usrName, 20).sendKeys("newautomation");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("mainpanel"));
		
		driver.findElement(By.linkText("CONTACTCS")).click();


	}

}
