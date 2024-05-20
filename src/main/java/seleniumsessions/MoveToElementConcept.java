package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");

		By parentContactMenu = By.cssSelector("a.menulink");
		By childContactMenu = By.linkText("COURSES");
		String childMenu = "COURSES";
		
		//overload the methods with different params
		handleTwoLevelMenu(parentContactMenu, childContactMenu);
		handleTwoLevelMenu(parentContactMenu,childMenu);

	}

	public static void handleTwoLevelMenu(By parentMenu, By childMenu) {

		WebElement contactMenu = driver.findElement(parentMenu);

		Actions action = new Actions(driver);
		// mouse-over on contact menu
		action.moveToElement(contactMenu).build().perform();

		WebElement articleMenu = driver.findElement(childMenu);
		// click on article menu
		articleMenu.click();

	}

	public static void handleTwoLevelMenu(By parentMenu, String childMenuText) {

		WebElement contactMenu = driver.findElement(parentMenu);

		Actions action = new Actions(driver);
		// mouse-over on contact menu
		action.moveToElement(contactMenu).build().perform();

		WebElement articleMenu = driver.findElement(By.linkText(childMenuText));
		// click on article menu
		articleMenu.click();
	}
	
}


