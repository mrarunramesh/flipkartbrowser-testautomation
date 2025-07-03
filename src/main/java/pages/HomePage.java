package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {  //Consrtuctor
		this.driver=driver;
	}
	
	//Locators
	By searchBox=By.xpath("//input[@name='q']");
	
	//Actions
	
	public void searchProduct(String product) {
		driver.findElement(searchBox).sendKeys(product + Keys.ENTER);
		
	}
}
