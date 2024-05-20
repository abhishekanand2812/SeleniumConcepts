package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomXpathAxes {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");

		// TODO Auto-generated method stub

		// parent to child
		// direct:--> using single slash /
		// use url as https://app.hubspot.com/login
		// form[@id='hs-login']/div----> 8 elements
		// form[@id='hs-login']/child::div

		// parent/child
		// indirect:--> using double slash //
		// it will give direct+indirect child elements
		// parent//child
		// form[@id='hs-login']/div----> 24 elements
		// form[@id='hs-login']//child::div----> 24 elements

		// form[@id='hs-login']//input----> 3 elements

		// different types of xpath approach in finding the element for username in
		// app.hubspot.com/login
		// 1st type:- //form[@id='hs-login']//input[@id='username']
		// 2nd type:- //form[@id='hs-login']//child::input[@id='username']

		// child to parent[also called as backward traversing]
		// traverse backward from username to immediate div
		// 1st way:- //input[@id='username']/parent::div
		// 2nd way:- //input[@id='username']/.. -->> appended .. after the child element

		// INTERVIEW QUESTION1:- write an xpath which will backward traverse from
		// username field to the top HTML node
		//// input[@id='username']/../../../../../../../../../..

		// INTERVIEW QUESTION2:- write an xpath which will backward traverse from
		// username field to all ancestors(parent, grand parent etc)
		// input[@id='username']/ancestor::div

		// ------------------------------------------*****************---------------------------------//
		// SIBLING CONCEPT

		// 1.Preceding sibling
		// INTERVIEW QUESTION3:- write an xpath which will find the preceding div from
		// one div)
		// (//div[@class='private-form__input-wrapper'])[1]/preceding-sibling::div

		// INTERVIEW QUESTION4:- write an xpath which will find the preceding label from
		// one input tag in username field)
		// URL:https://naveenautomationlabs.com/opencart/index.php?route=account/login
		// Usecase:- Verify if the labels are correct/not to the corresponding input
		// field
		// input[@name='email']/preceding-sibling::label

		// 2.Following sibling
		// INTERVIEW QUESTION5:- write an xpath which will find the following username
		// field from label field)
		// label[@for='input-email']/following-sibling::input

		// INTERVIEW QUESTION6:- write an xpath from amazon.com which will collect all
		// the links from specific footer:-"Get to Know us"
		// div[text()='Get to Know Us']/following-sibling::ul//a

		// INTERVIEW QUESTION7:- write an xpath from amazon.com which will collect all
		// the links from specific footer:-"Make Money with Us"
		// div[text()='Make Money with Us']/following-sibling::ul//a
		getColumnValues("Get to Know us");
		

	}
	//print the column values from specific column name/footers

	public static void getColumnValues(String columnName) {
		List<WebElement> columnValues=driver.findElements(By.xpath("//div[text()='"+columnName+"']/following-sibling::ul//a"));
		for(WebElement e:columnValues)
		{
			String text=e.getText();
			System.out.println(text);
		}
		

	}

}
