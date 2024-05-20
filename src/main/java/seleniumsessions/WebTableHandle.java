package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// WebTable:
		// It consists of rows and columns

		// URL:- https://selectorshub.com/xpath-practice-page/

		// INTERVIEW QUESTION1:-
		// Write xpath starting from Joe.Root and traverse to preceding checkbox
		// SOL:- Traverse from a>>parent td>>preceding td>>direct input tag
		// a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']

		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		// driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		//selectUser("Joe.Root");
		//selectUser("John.Smith");
		
		List<String> joeInfo=getUserInfo("Joe.Root");
		System.out.println(joeInfo);
		
		List<String> johnInfo=getUserInfo("John.Smith");
		System.out.println(johnInfo);
		
		
		

	}


	public static void selectUser(String userName) {
		driver.findElement(
				By.xpath("//a[text()='" + userName + "']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
				.click();

	}
	/*
	 * This method is used to get user info list by supplying parameter as userName
	 */

	public static List<String> getUserInfo(String userName) {

		List<WebElement> userInfoList = driver
				.findElements(By.xpath("//a[text()='" + userName + "']/parent::td/following-sibling::td"));
		List<String> userInfoValues = new ArrayList<String>();
		for (WebElement e : userInfoList) {
			String text=e.getText();
			userInfoValues.add(text);

		}
		return userInfoValues;

	}

}
