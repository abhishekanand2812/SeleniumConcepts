package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopupHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver;

		driver = new ChromeDriver();
		//Interview question1:-
		//How to handle auth popup scenario@
		//Just pass username:pass? after https:// and before domain name
		
		//Interview question2:-
		//What are the limitations in auth popup in selenium?
		//We can't pass '@' in id and password because it will treat like after '@', the whole string will be considered as a domain name
		
		String userName="admin";
		String pwd="admin";

		driver.get("https://"+userName+":"+pwd+"@the-internet.herokuapp.com/basic_auth");
		
		//Interview question3:-
		//For banking app, if auth pop up doesn't come, what will you do?
		//I will talk to SRE team for enabling the auth popup in order to start automation



	}

}
