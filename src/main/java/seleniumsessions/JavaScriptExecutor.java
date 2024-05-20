package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * JSExecutor is an interface which helps in executing Javascript commands
 *Interaction with the webelement from the browser backdoor by javascripts from console window
 *Helpful because selenium doesn't have all direct feature/scripts available
 *So if we know some javascripts, then we can execute using JavascriptExecutor in selenium
 * @author abhishekanand
 *
 */

public class JavaScriptExecutor {
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		Thread.sleep(10000);
		
		//Type-caste our driver to jsExecutor
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		String title=js.executeScript("return document.title;").toString();
//		System.out.println(title);
		
		//Use JSutil by creating object of JsUtil
		//So constructor will be called with driver as a parameter
		//so that same session id will be maintained 
		//and initialization of driver and also JS reference will be taken care
		
		JavaScriptUtil jsUtil=new JavaScriptUtil(driver);
		
		//1.Get title of webpage using JsExecutor
		String title=jsUtil.getTitleByJS();
		System.out.println(title);
		
		//2.Generate custom alert
		//jsUtil.generateAlert("Hi this is abhishek's js alert");
		
		//Interview question1:
		//For content testing use case, we will use below script
		String innrPageText=jsUtil.getPageInnerText();
		
		System.out.println(innrPageText);
		//Usecase: Check if the text contains for verification point
		System.out.println(innrPageText.contains("Import & Export"));
		System.out.println(innrPageText.contains("Documents"));
		
		//Interview question2:
		//How will you refresh, go back, go forward in a page using JavaScript?
		//There's a history object and a go object
		//inside that if we pass the below value in parameter, then
		//-1 for go back to the page // history.go.(-1)
		//0 for refreshing the page // history.go.(0)
		//1 for going forward to the page // history.go.(1)
		
		//Interview question2:
		//How will you zoom in and out using JavaScript?
		//For chrome and edge:
		//document.body.style.zoom=400%
		
		//For firefox browser
		//document.body.style.MozTransform= 'scale(2)'-- for 200 percentage zoom in
		//document.body.style.MozTransform= 'scale(0.5)'-- for 50 percentage zoom out
		
		//Interview question3: What is the usecase for zoom level?
		//For responsive testing
		//where zoom level for iPhone/4k tv has different zoom levels
		
		//jsUtil.zoomChromeEdge("200");
		
		//Interview question3: How will you draw a border for a webelement for highlighting a bug?
		//Javascript in console: "arguments[0].style.border='3px solid red'", element
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		//jsUtil.drawBorder(username);
		
		//Interview question4: How will you flash/highlighting a webelement?
		//Usecase:- VVI usecase
		//1.Before entering/clicking webelement, we can highlight where exactly is our webdriver working. Best when giving demo to client/customer
		//Important webelements in the page can be highlighting
		jsUtil.flash(username);
		
		
		//Interview question5: How will you scroll down/up/to a specific webelement?
		jsUtil.scrollPageDown();
		jsUtil.scrollPageUp();
		jsUtil.scrollPageDown("500");
		
		WebElement scollToElement=driver.findElement(By.xpath("//h3[text()='Companies & Contacts']"));
		jsUtil.scrollIntoView(scollToElement);
		
		
		//Interview question6: How will you do horizontal scrolling using scrollBY()?
		jsUtil.horizontalScrollBy("-100", "-300");

	

		


		
		

		

		
		
		

		
		
		
		
		
		
		

	}

}
