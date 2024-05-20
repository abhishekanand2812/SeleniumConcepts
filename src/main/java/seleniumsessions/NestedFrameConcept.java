package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameConcept {

	public static void main(String[] args) {
		
		//Frames inside frame is called nested frame
		
		//Browser
			     //Page contains webelements
			            //Frame 1 contain webelements
        	             	 //Frame 2 contain webelements
        	                     //Frame 3 contain webelements
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		//Coming from default context to frame1
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("SANJANA");
		
		//Coming from frame1 to frame2
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("MADHURI");

		
		//Coming from frame2 to frame3
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("RASHI");
		
		//Coming from frame3 to parent frame2
		driver.switchTo().parentFrame();
		driver.findElement(By.id("jex")).sendKeys("JANVI");
		
		//Coming from frame2 to parent frame1
		driver.switchTo().parentFrame();
		driver.findElement(By.id("inp_val")).sendKeys("SWATI");
		
		//Coming from frame1 to parent default context
		driver.switchTo().defaultContent();
		String text=driver.findElement(By.cssSelector("h1.elementor-heading-title.elementor-size-default")).getText();
		System.out.println(text);
		
		//INTERVIEW QUESTION1:
		//Combinations of frames allowed/not allowed?
		

		//page to frame
		//f1 to f2
		//f2 to f3
		//f3 to f2
		//f2 to f1
		//f1 to f3 -- NOOO
		//f1 to f2  to f3 -- yes
		//f3 to default content ---> page
		//page --> f1 -> f2
		//f2 to main page --> yes with default content
		//page --> f3 -- NOOO
		//Page --> f2 --> NOOO
		//Page --> f1 --> f2 --> f3 ---> yes
		
		
		
	}

}
