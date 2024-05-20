package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeworkFreshworks {

	public static void main(String[] args) {
		BrowserUtil br=new BrowserUtil();
		WebDriver driver=br.initDriver("chrome");
		ElementUtil el=new ElementUtil(driver);
		
		br.launchURL("https://www.freshworks.com/");
		
		By linksList=By.xpath("//footer//a");
		
		el.clickElementFromPageSection(linksList, "Services");
		
		
	}

}
