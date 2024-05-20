package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameMethodsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/");
		
		
		//What are the different methods of supplying parameters for switching to frame?
		//1.By passing index value of frameNo
		//2.By passing nameOrId of frame
		//3.By creating webelement of frame HTML tag using Xpath
		
		//driver.switchTo().frame(2);// We are passing 2 because in java index starts from 0 and while we pass 2, it indicates that 3rd frame is passed
		//driver.switchTo().frame("main");// we can pass nameOrId also. Ignore index as there might be other frames added in future.
		
		WebElement frameElement=driver.findElement(By.xpath("//frame[@src='top.html']"));
		driver.switchTo().frame(frameElement);
		
		String headerName=driver.findElement(By.tagName("h2")).getText();
		System.out.println(headerName);
		
		//InterviewQuestion2
		//How many frames available in page?
		List<WebElement> frameList=driver.findElements(By.xpath("//frame"));
		int frameSize=frameList.size();
		System.out.println(frameSize);
		

	}

}
