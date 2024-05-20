package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class SeleniumManagerConcept {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
		//SeleniumManager.getInstance().getDriverPath(null,
		
		
		
	}

}
