package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		// right click
		// also called context click-->context menu

		WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));

		Actions action = new Actions(driver);
		action.contextClick(rightClickBtn).build().perform();

		// Get the menu list and print all in the console
		List<WebElement> rightClickMenuList = driver
				.findElements(By.cssSelector("ul.context-menu-list.context-menu-root span"));
		for (WebElement e : rightClickMenuList) {

			String text = e.getText();
			System.out.println(text);
			
			//ASAP click on copy menu

			if (text.equals("Copy")) {
				e.click();
				break;
			}

		}

	}

}
