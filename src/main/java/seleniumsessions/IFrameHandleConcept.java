package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandleConcept {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		//first click on the image link
		driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click();
		
		//Create a frameElement and passs it to frame()
		
		WebElement frameEle=driver.findElement(By.xpath("//iframe[contains(id,frame-one)]"));
		driver.switchTo().frame(frameEle);
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Abhishek proposal form");
		
		
		
		
		

	}

}
