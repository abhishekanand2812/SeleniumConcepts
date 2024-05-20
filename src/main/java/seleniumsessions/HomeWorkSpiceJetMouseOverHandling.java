package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeWorkSpiceJetMouseOverHandling {

	public static void main(String[] args) throws InterruptedException {
		//open spicejet url and mouse-over on adds on and then collect all the elements

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(60000);
		
		WebElement addOns=driver.findElement(By.xpath("//div[text()='Add-ons']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(addOns).build().perform();
		
		List<WebElement> addOnlist=driver.findElements
		(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj r-e65kyq r-1t2hasf']//div[@class='css-1dbjc4n r-18u37iz']/a"));
		
		for(WebElement e:addOnlist)
		{
			String text=e.getText();
			System.out.println(text);
		}
		

	}

}
