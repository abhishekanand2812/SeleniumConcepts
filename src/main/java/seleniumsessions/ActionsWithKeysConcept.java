package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsWithKeysConcept {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//By firstName=By.id("input-firstname");
		
		Actions action=new Actions(driver);
		
		//Just enter first name and then use Keys.TAB and then pass the arguement in sendKeys()
		//Use keys class and tab method
		
//		action.sendKeys(driver.findElement(firstName), "abhishek")
//									.sendKeys(Keys.TAB)
//									.sendKeys("anand")
//									.sendKeys(Keys.TAB)
//									.sendKeys("abhi@gmail.com")
//									.sendKeys(Keys.TAB)
//									.sendKeys("7878787656")
//									.sendKeys(Keys.TAB)
//									.sendKeys("205820")
//									.sendKeys(Keys.TAB)
//									.sendKeys("abhi@123")
//									.sendKeys(Keys.TAB)
//									.sendKeys("abhi@123")
//									
//									.sendKeys(Keys.TAB)
//									.sendKeys(Keys.TAB)
//									
//									.sendKeys(Keys.TAB)
//									.click()
//									.sendKeys(Keys.TAB)
//									.click()
//									.build().perform();
		
		//InterviewQuestion1
		//Just maintain one single by locator and using tab feature , fill the registration page?
		//Cite them the avove code
		
		
		driver.get("https://www.amazon.in/");
		action.sendKeys(Keys.TAB)
								.sendKeys(Keys.TAB)
								.sendKeys(Keys.TAB)
								.sendKeys(Keys.TAB)
								.sendKeys(Keys.TAB)
								.sendKeys("MacBook")
								.sendKeys(Keys.ENTER).build().perform();
							

									

	}

}
