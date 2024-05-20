package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleTogether {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		// parent window
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentWindowId=driver.getWindowHandle();
		Thread.sleep(15000);

		// child window
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();

		// total windows=5, including the main page

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
			
			while (it.hasNext()) {
			String windowid=it.next();
			driver.switchTo().window(windowid);
			String currentUrl=driver.getCurrentUrl();
			System.out.println(currentUrl);
			Thread.sleep(2000);
			
			if(!windowid.equals(parentWindowId)) {
				driver.close();

			}
		}
			
			driver.switchTo().window(parentWindowId);
			System.out.println(driver.getCurrentUrl());

			
	}

}
