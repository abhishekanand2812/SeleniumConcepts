package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.findElement(By.id("datepicker")).click();

		selectFutureDate("December 2024", 28);

	}

	public static void selectDate(int day) {

		driver.findElement(By.xpath("//a[text()='" + day + "']")).click();

	}

	public static void selectFutureDate(String expMonYear, int day) {

		if (expMonYear.contains("February") && day > 28) {
			System.out.println("wrong date/day passed for feb " + day);
			return;

////			if (day > 31) {
////				System.out.println("wrong date passed " + day);
////				return;
////
////			}
//			if (day <= 0) {
//				System.out.println("wrong date passed " + day);
//				return;
////
////			}
//
//			actMonYear = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
//			System.out.println(actMonYear);
//
//			while (!actMonYear.equalsIgnoreCase(expMonYear)) {
//
//				driver.findElement(By.xpath("//span[text()='Next']")).click();
//				actMonYear = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
//
//			}
//			selectDate(day);
//		}
	}
}
}

