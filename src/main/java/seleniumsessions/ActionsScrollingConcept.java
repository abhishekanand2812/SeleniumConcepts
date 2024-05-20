package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrollingConcept {

	public static void main(String[] args) {
//
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//		
//		Actions action=new Actions(driver);
//		action.sendKeys(Keys.PAGE_DOWN);
//		action.sendKeys(Keys.PAGE_DOWN);
//		action.sendKeys(Keys.PAGE_DOWN);
//		action.sendKeys(Keys.PAGE_DOWN);
//
//		action.sendKeys(Keys.PAGE_UP);
//		
		
		
		//How to directly go top of page?
		//command+up arrow
//		action.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).build().perform();
//
//		
//		//How to directly go bottom of page?
//		//command+down arrow
//		action.sendKeys(Keys.COMMAND).sendKeys(Keys.END).build().perform();
//		
//		//refresh the page
//		action.keyDown(Keys.COMMAND).sendKeys(Keys.F5).keyUp(Keys.COMMAND).build().perform();
//		
		//Interview Question1 VVI
		//What parameter does a normal sendKeys() accept?
		//Its a character sequence...
		//That mean char sequence is an interface implemented by String, StringBuilder and StringBuffer class in java
		//We can give any of the above dataType
		
		String s1="Abhishek";
		String s2="Anand";
		StringBuilder s3=new StringBuilder("Automation");
		StringBuffer s4=new StringBuffer("Labs");
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.id("input-email"))
									.sendKeys(s1+" "+s2+" "+s3+" "+s4);

		//Interview Question2 VVI
		//What if we pass null in sendKeys()?
		//It will throw IllegalArguementException: Keys to send should not be a null char sequence
		

		//Interview Question3 VVI
		//Can i pass .sendKeys() instead of click() in buttons?
		//No exception will be thrown
		
		//Interview Question4 VVI
		//Can we click on the text field?
		//yes we can and in the UI it will just click. No exception will be thrown
		
		//Interview Question5 VVI
		//What is the difference between Actions and Action?
		//Actions is the class where methods form a builder pattern, all actions method as well as build method
		//and returns current class object
		//build() return type is Action interface- only one method is there , perform() implemented by CompositeAction class
		//In selenium 4.xx , there is no relationship btw Action and Actions class
		
		


		


		



	}

}
