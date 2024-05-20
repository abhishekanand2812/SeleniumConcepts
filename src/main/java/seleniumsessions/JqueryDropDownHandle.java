package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDownHandle {
	// jQuery is a web dev library to develop components like drop down
	public static void main(String arg) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(3000);

		By options = By.xpath("(//div[@class='comboTreeDropDownContainer'])[1]//li[@class='ComboTreeItemChlid']/span");
		WebElement optionList = driver.findElement(options);
		System.out.println(optionList.getSize());

	}
}
