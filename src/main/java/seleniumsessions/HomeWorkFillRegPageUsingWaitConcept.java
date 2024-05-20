package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkFillRegPageUsingWaitConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		ElementUtil elUtil=new ElementUtil(driver);
		
		
		By firstName=By.id("input-firstname");
		By lastName=By.id("input-lastname");
		By emailId=By.id("input-email");
		By telephone=By.id("input-telephone");
		By pass=By.id("input-password");
		By cnfPass=By.id("input-confirm");
		
		By subsRadio=By.xpath("(//input[@type='radio' and @value='1'])[last()]");
		By agreeChkBox=By.xpath("//input[@type='checkbox' and @name='agree']");
		By continueBtn=By.xpath("//input[@type='submit' and @value='Continue']");
		
		elUtil.getElement(firstName, 25).sendKeys("abhishek");
		elUtil.getElement(lastName).sendKeys("anand");
		elUtil.getElement(emailId).sendKeys("abhishek2812@gmail.com");
		elUtil.getElement(telephone).sendKeys("7898765654");
		elUtil.getElement(pass).sendKeys("abhis@123");
		elUtil.getElement(cnfPass).sendKeys("abhis@123");
		
		elUtil.checkElementClickable(subsRadio, 10);
		elUtil.getElement(agreeChkBox,10).click();
		elUtil.doClick(continueBtn, 10);




	}

}
