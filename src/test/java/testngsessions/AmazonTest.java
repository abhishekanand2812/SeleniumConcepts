package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest {

	WebDriver driver;

	@BeforeTest
	// @BeforeMethod
	// If we use @BeforeMethod and @AfterMethod, then 3 pairs will be made with 3
	// testcases

	// Interview Question1:
	// How do you rate test coverage in terms of Before test and Before method
	// approach?
	// In BeforeTest, suppose there are 100 TCs. and at 6th testcase , there is some
	// server issue/browser is cached issue, then rest 95 testcases will be skipped.
	// TC coverage = 5% and session id will be throughout same as 123.
	// Good for sanity check with less navigations

	// In BeforeMethod, suppose there are 100 TCs. and at 6th testcase , there is
	// some server issue/browser is cached issue, then it will fail the TC and then
	// again global pre and post condition will be applied. TC coverage = 99%
	// session id will change 100 times
	// good for new application where it isnt stable
	// Good for regression cycles

	public void setup() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

	}

	@Test(priority = 1)
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("page title:" + title);
		Assert.assertEquals(title,
				"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in11");
	}

	@Test(priority = 2)
	public void searchExistTest() {
		boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(false);
	}

	@Test(priority = 3)
	public void isHelpExistTest() {
		boolean flag = driver.findElement(By.linkText("Help")).isDisplayed();
		Assert.assertTrue(false);
	}

	@AfterTest
	// @AfterMethod

	public void tearDown() {
		driver.quit();
	}

}
