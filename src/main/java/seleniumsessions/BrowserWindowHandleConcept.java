package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Whenever you click a third party link like twitter,fb,gmail in a web page It
 * will be opened in a new window or a new tab Such scenarios handling is called
 * BrowserWindiowHandles
 * 
 * @author abhishekanand
 *
 */

public class BrowserWindowHandleConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(15000);

		// Interview question1:
		// Where will be your driver present if you click on 3rd party link like twitter
		// and it launches twitter?
		// Driver will always be present on the page we are testing and not on twitter
		// Always on parent and not on child window

		// Interview question2:
		// What testing scenario are you concerned after opening twitter from page?
		// Only URL and page title testing as we are tester of our application and not
		// twitter

		// Interview question3:
		// What is cross origin policy?
		// when we switch from one domain to another in a webpage, it is called as cross
		// origin policy, or CORS

		// VVI Interview question4:
		// What parameter and value should be there to handle BrowserWindow scenario?
		// The link with html tag 'a' should have target="_blank" as parameter
		// target="_blank" as parameter is responsible to open a new page/window/tab
		// target="_blank" as parameter attribute if it's not present, then it will open
		// in same page as a normal link with 'a' tag

		WebElement twitterLink = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		twitterLink.click();

		// Now two window will open:
		// 1- parent window-orangeHrm.com(driver is present here)
		// 2-child window-twitter.com

		// Now you have to switch your driver from orangeHrm to twitter

		// SCENRIO to perform
		// first switch your driver to child window
		// then capture the link and page title
		// then close the child window
		// then move your driver back to parent window

		// every browser contain window handle or ID
		// we have to pass that id/handle to the below method to perform switch

		// SET does not maintain any order
		// it is non-order based collection
		// it does not maintain indexing
		// it does not have duplicate value

		// This iteration ref 'it' will point just above the Set<String> ref'handles'
		// inside the memory
		// Suppose at the top the memory address is '999', then iterator will point to
		// '998'
		// In that case we should move the iterator to +1 to point to the most above
		// element in the Set<String> ref'handles'
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		String parentWindowId = it.next();
		String childWindowId = it.next();

		System.out.println(parentWindowId);
		System.out.println(childWindowId);

		driver.switchTo().window(childWindowId);
		String twitterTitle = driver.getTitle();
		String twitterURL = driver.getCurrentUrl();

		System.out.println(twitterTitle);
		System.out.println(twitterURL);

		if (twitterTitle.contains("twitter")) {
			System.out.println("TC Pass-Title");

		} else {
			System.out.println("TC FAIL-Title");

		}

		if (twitterURL.contains("twitter")) {
			System.out.println("TC Pass-url");

		} else {
			System.out.println("TC FAIL-Title");

		}
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());


	}

}
