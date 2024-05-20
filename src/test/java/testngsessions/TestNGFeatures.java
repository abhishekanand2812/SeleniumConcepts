package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGFeatures {

	// global pre conditions
	// pre conditions
	// test steps -> act vs exp results -- PASS/FAIL
	// post steps
	// Global post steps

//	BS -- db connection
//	BT -- createUser
//	BC -- openBrowser

	// BM -- loginToApp
	// test - addToCart test
	// AM -- logout

	// BM -- loginToApp
	// test - payment test
	// AM -- logout

	// BM -- loginToApp
	// test - search test
	// AM -- logout

//	AC -- close browser
//	AT -- deleteUser
//	AS -- closeDBConnection

	// 1: Before Suite means we are applying global pre-condition that make sure all
	// db connections are established
	
	//1
	@BeforeSuite
	public void DBConnection() {
		System.out.println("BS -- db connection");
	}

	//2
	@BeforeTest
	public void createUser() {
		System.out.println("BT -- Create user");

	}

	//3
	@BeforeClass
	public void openBrowser() {
		System.out.println("BC -- OPEN browser");

	}

	//4 //7 //10
	//This will be running xxx times number of testcases
	//here we have 3 testcases, so before executing every testcase this beforeMethod will execute
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM -- loginToApp");

	}

	//Alphabetically which method is coming first will be executed first in test annotation
	//addToCartTest 2.paymentTest 3.searchTest
	
	//11
	@Test(priority=-1)
	public void searchTest() {
		System.out.println("TEST -- searchTest");

	}

	//5
	@Test(priority=2)
	public void addToCartTest() {
		System.out.println("TEST -- addToCartTest");

	}

	//8
	@Test(priority=0)
	public void paymentTest() {
		System.out.println("TEST -- paymentTest");

	}
	
	//6 //9 //12
	@AfterMethod
	public void logout() {
		System.out.println("AM -- logout");
	}
	
	
	//13
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC -- closeBrowser");
	}
	
	
	//14
	@AfterTest
	public void deleteUser() {
		System.out.println("AT -- deleteUser");
	}
	
	//15
	@AfterSuite
	public void closeDBConnection() {
		System.out.println("AS -- closeDBConnection");
	}
	
	//VVI Interview questions:
	//Interview question1:
	//The testng import package options come due to dependency added in pom.xml file
	//The TestNG test from Run as >TestNG test comes due to testNG plugin
	
	//Interview question2:
	//compiled by a more recent java version issue? how to resolve?
	//Sol:- best to use testNG 7.0.0 in pom.xml


}
