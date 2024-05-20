package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkWebtableSpecificColumnPrint {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<String> firstColData=getColumnValues("1");
		System.out.println("First col data:"+firstColData);
		
		List<String> secondColData=getColumnValues("2");
		System.out.println("Second col data:"+secondColData);
		
		List<String> thirdColData=getColumnValues("3");
		System.out.println("Third col data:"+thirdColData);
		
		

	}

	public static List<String> getColumnValues(String columnNumber) {
		List<WebElement> ColumnValList = driver.findElements(By.xpath("//table[@id='customers']//tr//td["+columnNumber+"]"));
		List<String> columnData=new ArrayList<String>();
		for(WebElement e:ColumnValList)
		{
			String text=e.getText();
			columnData.add(text);
		}
		return columnData;
	}

}
