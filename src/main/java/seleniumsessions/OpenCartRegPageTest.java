package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartRegPageTest {
	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		br.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String pageTitle = br.getPageTitle();
		System.out.println("Page title is:" + pageTitle);

		ElementUtil el = new ElementUtil(driver);
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By emailId = By.id("input-email");
		By telephoneNum = By.id("input-telephone");
		By password = By.id("input-password");
		By cnfPassword = By.id("input-confirm");
		By chckbox = By.xpath("//input[@type='checkbox']");
		By submitBtn = By.xpath("//input[@type='submit']");
		By regPageSuccessMsg = By.tagName("h1");

		el.doSendKeys(firstName, "Abhishek");
		el.doSendKeys(lastName, "Anand");
		el.doSendKeys(emailId, "abhivitmech@gmail.com");
		el.doSendKeys(telephoneNum, "8787909090");
		el.doSendKeys(password, "Chocopie@12");
		el.doSendKeys(cnfPassword, "Chocopie@12");
		el.doClick(chckbox);
		el.doClick(submitBtn);
		String actSuccessMsg = el.doGetElementText(regPageSuccessMsg);

		if (actSuccessMsg.equals("Your Account Has Been Created!")) {
			System.out.println("TC PASS");
		}
		else
		{
			System.out.println("TC fail");

		}

	}

}
