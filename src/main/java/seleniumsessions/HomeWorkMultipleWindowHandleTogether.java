package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkMultipleWindowHandleTogether {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Question is
		// Visit orange hrm application and perform this scenario:
		// click on twitter
		// capture url
		// close the window
		// come back to parent window
		// perform this for multiple links, i.e., fb, youtube etc

		driver = new ChromeDriver();
		// parent window
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(10000);

//		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
//		Set<String> handles = driver.getWindowHandles();
//		Iterator<String> it = handles.iterator();
//		String parentWindowId = it.next();
//		String childWindowId = it.next();
//		driver.switchTo().window(childWindowId);
//		System.out.println(driver.getCurrentUrl());
//		driver.close();
//		driver.switchTo().window(parentWindowId);
		
		handleMultipleWindowsWithLinkName("linkedin");
		handleMultipleWindowsWithLinkName("facebook");
		handleMultipleWindowsWithLinkName("twitter");
		handleMultipleWindowsWithLinkName("youtube");
		
		System.out.println(driver.getCurrentUrl());
		

	}

	public static void handleMultipleWindowsWithLinkName(String thirdPartyLinkText) {
		
		driver.findElement(By.xpath("//a[contains(@href,'"+thirdPartyLinkText+"')]")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowId = it.next();
		String childWindowId = it.next();
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentWindowId);

	}

}
