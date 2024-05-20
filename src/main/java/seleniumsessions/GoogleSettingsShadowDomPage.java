package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSettingsShadowDomPage {

	public static void main(String[] args) throws InterruptedException {

		

		WebDriver driver=new ChromeDriver();
		driver.get("chrome://settings/");
		Thread.sleep(3000);
		
		String js_path="return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement searchBar=(WebElement)js.executeScript(js_path);
		searchBar.sendKeys("Notifications");
		
	}

}
