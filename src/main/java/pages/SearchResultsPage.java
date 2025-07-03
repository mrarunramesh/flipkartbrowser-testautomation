package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage {
	WebDriver driver;
	
	public SearchResultsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By mobileNames = By.xpath("//div[@class='KzDlHZ']");
    By mobilePrices = By.xpath("//div[@class='Nx9bqj _4b5DiR']");
    
   public void printProductDetails() {
	   List<WebElement> names = driver.findElements(mobileNames);
       List<WebElement> prices = driver.findElements(mobilePrices);

       for (int i = 0; i < names.size(); i++) {
           System.out.println(names.get(i).getText() + " - " + prices.get(i).getText());
   }
	
   }
}
