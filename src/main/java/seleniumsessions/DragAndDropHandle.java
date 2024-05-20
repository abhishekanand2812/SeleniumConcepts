package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//We can use actions class for element to element drag and drop
		//element to element drag and drop only possible

		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
		
		//build method will build all the methods like dragAndDrop etc and perform method will perform action
		//1st way
		//action.dragAndDrop(source, target).build().perform();
		
		//2nd way:- click and hold the source and then release to the target
		action.clickAndHold(source).
			  	               moveToElement(target). 
			  	               	                      release().	 
			  	               	                      	        build().perform();
		


	}

}
