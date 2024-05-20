package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomHandle {

	public static void main(String[] args) {
		
		//Broswer
			      //Page
			            //shadow-root(open)
				           //elements
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		
		//right click on the  shadow root element and click on JsPath
		//goto console and paste the jspath, it will return HTML element
		
		//Step 1:- copy the JS path and return as a string
		String jsPath="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		
		//Step2:-Create JSexecutor reference so that driver will be converted to js executor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//Step3:- convert the js to webelement so that we can create the webelement
		WebElement pizza=(WebElement)js.executeScript(jsPath);
		
		//Step4:- Send keys or perform action on the webelement
		pizza.sendKeys("Double cheese burst pizza");
		
		

	}

}
