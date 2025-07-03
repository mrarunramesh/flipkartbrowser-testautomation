package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class FlipkartDataProviderTest extends BaseTest{
	
	@DataProvider(name="mobileNames")
	public Object[][]getMobileNames(){
		return new Object[][] {
			{"Samsung"},
			{"iPhone"},
			{"Realme"} };
		}
	
	@Test(dataProvider="mobileNames")
	public void searchMobileTest(String mobileName) throws InterruptedException{
		HomePage home=new HomePage(driver);
		home.searchProduct(mobileName);
		Thread.sleep(1000);
		
		String actualTitle=driver.getTitle();
		System.out.println("Page Title : " +actualTitle);	
		
		Assert.assertTrue(actualTitle.toLowerCase().contains(mobileName.toLowerCase()),
				"Title does not contain searched keyword : " +mobileName);
		
		
	}
}
