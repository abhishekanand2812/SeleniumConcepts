package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeWorkAmazonFooterPanelLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserUtil br=new BrowserUtil();
		WebDriver driver=br.initDriver("chrome");
		br.launchURL("https://www.google.com");
		ElementUtil el=new ElementUtil(driver);
		
		By googleFooter=By.xpath("//div[@jscontroller=\"NzU6V\"]/div/a");
		List<String> googleFooterText=el.getElementsTextList(googleFooter);
		System.out.println(googleFooterText);
		el.clickElementFromPageSection(googleFooter, "Business");
//		
//		br.launchURL("https://www.orangehrm.com/");
//		
//		By orangeHrmFooterLeftPanel=By.xpath("(//div[@class='footer-main'])[1]//a");
//		List<String> orangeHrmFooterLeftPanelText=el.getElementsTextList(orangeHrmFooterLeftPanel);
//		System.out.println(orangeHrmFooterLeftPanelText);
//		
//		el.clickElementFromPageSection(orangeHrmFooterLeftPanel, "Careers");
		
	
		
		
		
		

	}}
	
	
