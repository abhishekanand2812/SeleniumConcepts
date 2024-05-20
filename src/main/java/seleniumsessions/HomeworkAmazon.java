package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkAmazon {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> images = driver.findElements(By.tagName("img"));
		int imagesCount = images.size();
		System.out.println("Total images on page is: " + imagesCount);

		// Using for loop, get attribute value of alt

//		for (int i = 0; i < imagesCount; i++) {
//			String imagesText = images.get(i).getAttribute("alt");
//			System.out.println("index is: " + i + " and image text is: " + imagesText);
//
//		}

		// Using for each loop ,get attribute value of alt

		int count = 0;

		for (WebElement e : images) {
			String imagesText = e.getAttribute("alt");
			System.out.println("index is: " + count + " and image text is: " + imagesText);
			count++;
		}

		// find all the links in the page and fetch href values
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int linksCount = images.size();
		System.out.println("Total links on page is: " + linksCount);

		for (int j = 0; j < linksCount; j++) {
			String linksHrefValues = images.get(j).getAttribute("href");
			System.out.println("index is: " + j + " and links href value text is: " + linksHrefValues);

		}
	}
	// Creating generic methods

	/**
	 * Method used to return elements list
	 * @param locator
	 * @return
	 */
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	/**
	 * Method used to return attr value List
	 * 
	 * @param locator
	 * @param attrName
	 * @return List<String>
	 */

	public static List<String> getElemenetsAttributeValue(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleAttrValList = new ArrayList<String>();

		for (WebElement e : eleList) {
			String attrValue = e.getAttribute(attrName);
			// System.out.println(attrValue);
			eleAttrValList.add(attrValue);
		}
		return eleAttrValList;
	}

	/**
	 * Method used to return size of the list of webelements
	 * 
	 * @param locator
	 * @return
	 */

	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
}
