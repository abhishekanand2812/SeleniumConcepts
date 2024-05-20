package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleWithList {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		
		Set<String> handle=driver.getWindowHandles();
		
		//Set<String> does not maintain any order. It's not an order based collection
		//So we can convert it to List<String>
		//Just need to supply Set<String> handle reference in the generics below
		
		List<String> handleList=new ArrayList<String>(handle);
		String parentWindowId=handleList.get(0);
		String childWindowId=handleList.get(1);
		
		//switching work: -
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getCurrentUrl());
		driver.close();//close child window
		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl());
		//driver.quit();//close child window

		


	}

}
