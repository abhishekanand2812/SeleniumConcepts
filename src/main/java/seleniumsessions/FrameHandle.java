package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Interview Question1:-
		//What is the heirarchy of frame?
		//Browser-->Page-->Frame-->Frame-->Frame
		//In order to interact with elements inside a frame, we will be switching to frame and then interact
		
		//Interview Question2:-
		//What is a nested frame?
		//Frames inside frames is called nested frame
		
		//Interview Question2:-
		//What is need of frames?
		//To secure the data security of the webelements in the pplication.
		//If any hacker is trying to hack, he has to cross the hierarchy. First he will be on the page and then he has to cross the frame boundary and then he can interact with webelements
		//In order to refrain from XSS, SQL injection attacks
		//Mostly in banking application
		
		//frame
		//almost deprecated. Only old application were using
		
		//iframe
		//mostly in modern applications.
		

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		driver.findElement(By.name("username")).sendKeys("naveenautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		
		
		

		

		



	}

}
