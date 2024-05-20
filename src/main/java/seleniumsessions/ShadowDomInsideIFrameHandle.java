package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomInsideIFrameHandle {

	public static void main(String[] args) throws InterruptedException {
		
		//Browser
		//page -- elements
			//iframe -- elements
					//shadow DOM (open)
							//elements
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		Thread.sleep(30000);
		
		driver.switchTo().frame("pact");
		
		String tea_jsPath = "return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")";
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement tea=(WebElement)js.executeScript(tea_jsPath);
		tea.sendKeys("Masala chai");
		
	}

}
