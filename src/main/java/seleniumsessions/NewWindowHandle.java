package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Newly added feature in selenium 4
 * can open a new tab and window using newWindow()
 * just need to add arguements as WindowType.TAB or WindowType.WINDOW
 * 
 * @author abhishekanand
 *
 */
public class NewWindowHandle {
	
	
	

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		// parent window
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentWindowId=driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);//open a new BLANK tab
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl());
		
		//Interview question1:
		//what is the usecase?
		//very useful in testing 3rd party URL
		//No need to go back and forward in webpage
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);//open a new window
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl());
		
		//Can you handle windows in cypress()?
		//No the team has't comeup with solution from 4 yrs because architecture is different


		
		


	}

}
