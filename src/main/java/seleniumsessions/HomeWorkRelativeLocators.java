package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;


public class HomeWorkRelativeLocators {
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//Click to the left of No button
		WebElement noRadioBt=driver.findElement(By.xpath("//label[@class='radio-inline']/input[@value='0']"));
		WebElement yesRadioBtn=driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(noRadioBt));
		yesRadioBtn.click();
		
		//Click on the right checkbox of privacy policy:-
		WebElement privacyPolicy=driver.findElement(By.xpath("//b[text()='Privacy Policy']"));
		WebElement chckBox=driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(privacyPolicy));
		chckBox.click();
		
		
		
	}
}