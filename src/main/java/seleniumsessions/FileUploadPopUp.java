package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Interview Question1:-
		//Can we automate the desktop path after clicking on File upload button?
		//Selenium can't handle desktop app automation.
		
		//Interview Question2:-
		//Which are the worst solutions for file upload?
		//1-AutoIT- never use it- Only works for Windows. Won't work for Mac/Linux/Remote machine/Docker/cloud
		//2-Robot class- never use it- Only works for Windows. Won't work for Mac/Linux/Remote machine/Docker/cloud
		//3.Sikuli Library: Almost deprecated, it's an image based library, it will identify c://, d:// and then will uploa file accordingly.
		//it has limitation  because UI for all the screenshot might/not be different
		
		//Interview Question3:-
		//Which is the  best solution for file upload?
		//use sendKeys("File upload path")
		

		

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.findElement(By.xpath("//input[@name='upfile']")).sendKeys("/Users/abhishekanand/Desktop/nightwatch_complete_frecoplay.png");
		
		//Interview Question4:-
		//What are the limitations of using sendKeys("File-path")?
		//1. //input type='file' attribute should always be there. If not then we should talk to dev team for adding.
		//2. We can't upload multiple files at a time. But in playwright, its possible.

		


	}

}
