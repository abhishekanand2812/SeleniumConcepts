package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePaginationHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(20000);

		while (true) {

			// 1st scenario:
			// if element is present immediately on the first page

			// We have used find elements method because it will return empty list instead
			// of throwing exception
			if (driver.findElements(By.xpath("//td[text()='Phillip']")).size() > 0) {
				selectCountry("Phillip");
				break;
			} else {
				// pagination logic:
				// click on next button

				WebElement next = driver.findElement(By.cssSelector("a.paginate_button.next"));

				// if we are on last page, then next button should be disabled
				if (next.getAttribute("class").contains("disabled")) {
					System.out.println("Pagination is over-- No country found");
					break;

				}
				next.click();
			}

		}

	}

	public static void selectCountry(String countryName) {

		driver.findElement(By.xpath("//td[text()='" + countryName + "']/preceding-sibling::td/input[@type='checkbox']"))
				.click();

	}
}
