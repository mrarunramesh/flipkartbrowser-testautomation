package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.SearchResultsPage;

public class FlipkartSearchTest extends BaseTest {

    @Test(priority = 1)
    public void searchAndVerifyMobiles() throws InterruptedException {
        HomePage home = new HomePage(driver);  
        home.searchProduct("Samsung");

        Thread.sleep(2000);

        SearchResultsPage results = new SearchResultsPage(driver);
        results.printProductDetails();
    }

    @Test(priority = 2)
    public void sampleAssertionCheck() {
        Assert.assertEquals("Flipkart", "Flipkart");
    }

    @Test(dataProvider = "productData", dataProviderClass = FlipDataProviderTest.class, priority = 3)
    public void searchProductTest(String productName) {
        HomePage home = new HomePage(driver);
        home.searchProduct(productName);
    }
}
