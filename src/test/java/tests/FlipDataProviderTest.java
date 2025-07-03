package tests;

import org.testng.annotations.DataProvider;

import utils.ExcelUtils;

public class FlipDataProviderTest {
	@DataProvider(name = "productData")
	public Object[][] getExcelData() {
	    String filePath = "src/test/resources/TestData.xlsx";
	    return ExcelUtils.readExcelData(filePath, "Sheet1");
	}

}
