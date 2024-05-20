package seleniumsessions;

public class WaitConcept {

	public static void main(String[] args) {
		
		//Types of waits:
		//1.static wait: Thread.sleep(5000)-- wait for 5 seconds
		//What is problem with Thread.sleep(10000)?
		//If the element is visible within 2 seconds, then unnecessary code has to wait for next 8 seconds also.
		//If the element is not visible within 10 seconds also, then selenium will throw NoSuchElementException
		
		
		//2.dynamic wait:
		//If we have timeOut of 10 seconds, and if the element is visible within 2 seconds, then it will ignore 8 seconds.
		//If the element is not visible within 10 seconds also, then selenium will throw NoSuchElementException.
		
		//2.a. Implicitly wait
		//2.b. Explicitly wait
				//<i> WebDriver wait
				//<ii>Fluent wait
		
		//Architecture:
		//WebDriverWait(c) -extends-->       FluentWait (c)  ---implements--> Wait(I) => until();
				//no public methods			            //until(){}
				//+inherit fluentwait class	methods	    //+ other methods()
		
		//WebDriver wait is a class and is extending to Fluent wait
		//Fluent wait class is implementing Wait interface
		//In Wait interface, we have a method called as until();
		
		//WebDriver BiDirectional- api connecting client to server and vice versa
		//fastest APIs if we interact with webelements
		//webdriver BiDi -- web socket 
		//webdriver bidi protocol -- w3c standard --
		//cypress, PW, selenium WD ---> webdriver bidi protocol -- browser -- sel conference
		
		//Direct interaction with browser using webdriver bidi protocol
		
		


	}

}
