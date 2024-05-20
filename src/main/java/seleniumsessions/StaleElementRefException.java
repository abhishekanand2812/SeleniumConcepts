package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class StaleElementRefException {

	@FindBy(id = "input-email")
	static WebElement userId;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		WebElement usrName = driver.findElement(By.id("input-email"));
		usrName.sendKeys("abhishek");

		Thread.sleep(6000);

		driver.navigate().refresh();
		// when you refresh:
		// dom and page gets refreshed
		//version of dom gets updated and id is different for the webelement
		// IN order to solve the problem , include:
		// usrName=driver.findElement(By.id("input-email")); again in script
		//By locator strategy best stragey

		usrName = driver.findElement(By.id("input-email"));
		usrName.sendKeys("anand");// stale element reference: stale element not found

		// Page Factory -- class
		//Worst strategy becuase in advance you are creating webelement
		//still might give StaleElementReferenceException

		// userId.sendKeys(test);
		
		//Interview question2:
		//When can we get stale element ref exception?
		//when we refresh/backbutton/forwardbutton

	}

}
