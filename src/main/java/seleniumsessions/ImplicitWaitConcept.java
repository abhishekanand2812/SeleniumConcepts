package seleniumsessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		//Interview question1 VVI:
		//What is the syntax chnge in selenium 3.x and 4.x?
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// sel 3.x.x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));// sel 4.x.x
		
		//Implicity wait
		//Also called as global wait
		//Applicable for all the webelements available on the page
		//Not applied/applicable to specific element on the page
		//can't be applied on the non web elements, like , title of the page, url, alerts
		//As soon as you write driver.findElement, then  ImplicitWait will be applied to every webelement
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("MacBook Air");//ImplicitWait will be applied for 10 seconds
		String label=driver.findElement(By.id("nav-logo-sprites")).getAttribute("aria-label");//ImplicitWait will be applied for 10 seconds
		System.out.println(label);
		
		//e3 - 10 -- all dropdown
		//e4 -- search icon
		//e5
		//e6 - 10
		
		//product page: 20 secs:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//20
		//e7 e8 e9 --> 20 secs
		
		//home page: 20 secs --> 10 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//10
		
		//register page; //10 -- 5
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//10
		
		//product page: 20 secs:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//20
		//ele -- 20 secs --> 5 secs --> 15 secs X
		
		//we never use imp wait in framework
		
		//page --> no wait --0 secs: --nullify of imp wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));//20

		//e1 to 100 --> imp = 20 secs ---> FE--> imp wait(0,1,5,10,20)  -- perform action

		//can not be used to non web elements: title, url, alerts
		
		
		//page -- eles -- 60 secs --> imp wait
		
		//Limitations of Implicity wait:-
		//1.If we apply implicity wait, then all the element where driver.findElement() is there,
		//they have to undergo implicity wait() or logic.
		//Suppose 500 driver.findElement() is there, then for every element, it has to undergo implicity wait() or logic
		//2.Continuously override the wait in seconds if the page more/less time to load the elements.
		//3.If element found in 0 seconds, then also it has to undergo implicity wait() or logic
		//4.Can't be applied on the non web elements, like , title of the page, url, alerts
		//5. If the locator is wrong, then it will not immediately throw exception., it will wait implicity for the duration mentioned
		//6.we never use imp wait in framework as it impacts the performance
		
		
	}

}
