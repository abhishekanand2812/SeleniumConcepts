package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkMultipleWindowHandleUsingList {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		// parent window
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentWindowId = driver.getWindowHandle();
		Thread.sleep(15000);

		// child window
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();

		// total windows=5, including the main page

		Set<String> handles = driver.getWindowHandles();
		List<String> handleList = new ArrayList<String>(handles);

		for (String e : handleList) {

			driver.switchTo().window(e);
			System.out.println("child window " + driver.getCurrentUrl());

			if (!e.equals(parentWindowId)) {
				driver.close();

			}
			

		}
		
		System.out.println("child window " + driver.getCurrentUrl());

		
		

	}

}
