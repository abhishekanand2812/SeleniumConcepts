package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScrpitAlertsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// JS pop ups Alerts:
		
		//Interview question1:-
		//how to identify js alert? We can't inspect anything on JS alert

		// 1.alert
		// click on console>> and write alert(' alert abhishek anand')

		// 2.confirm
		// click on console>> and write confirm('Are you sure')
		// click on ok

		// 3.prompt:- popup with a text field
		// click on console>> and write prompt('enter user id')
		// enter 12345

		WebDriver driver;

		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// 1.Alert
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Thread.sleep(4000);
//		Alert alert1 = driver.switchTo().alert();
//		String text1 = alert.getText();
//		System.out.println(text1);
//		// alert.accept();
//		alert1.dismiss();

		// 2.Confirm alert:
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Thread.sleep(4000);
//		Alert alert2 = driver.switchTo().alert();
//		String text2 = alert2.getText();
//		System.out.println(text2);
//		alert2.accept();
//		// alert2.dismiss();

		// 3.Prompt alert:
		//Interview question2:- Can we get 2 prompt alert at same time?--Not possible
		//We cannot have such situation at a time. One alert at a time only.
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(4000);
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("HI this is abhishek");
		String text3 = alert3.getText();
		System.out.println(text3);

		alert3.accept();
		// alert3.dismiss();
		
		//Interview question3:- What type of exception will selenium throw if there's no such alert present and if we
		//use switchTo().alert()? NoAlertPresentException: no such present

	}

}
