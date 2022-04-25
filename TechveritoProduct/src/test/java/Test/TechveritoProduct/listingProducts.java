package Test.TechveritoProduct;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMDesign.addEditProduct;
import POMDesign.listingProduct;
import Resources.base;

public class listingProducts extends base {
	public WebDriver driver;
	listingProduct productActionfilter;
	addEditProduct productAction;
	public excelutility file;
	ArrayList<String> data;

	@BeforeMethod
	public void setup() throws IOException {
		driver = initializeBrowser();
		driver.get(seturl);
		loginUtility lgn = new loginUtility(driver);
		lgn.loginToApp();
		productActionfilter = new listingProduct(driver);
		productAction = new addEditProduct(driver);
		productAction.productTab();
		file = new excelutility();
		data = file.getData("FilterData", "Product");
	}

	@Test
	public void filterProductByTitle() throws InterruptedException {
		// Select Title filter and enter text
		WebElement sel = productActionfilter.selTitleFilter();
		Select select = new Select(sel);
		select.selectByVisibleText("Starts with");
		productActionfilter.enterTitleInFilter().sendKeys(data.get(1));

		// Select sku filter and enter text
		WebElement sel1 = productActionfilter.selSkuFilter();
		Select select1 = new Select(sel1);
		select1.selectByVisibleText("Equals");
		productActionfilter.enterSkuInFilter().sendKeys(data.get(2));

		// Select created date in calendar(From date and To Date)
		productActionfilter.openFromCalendar();
		productActionfilter.SelectcreatedFromDate();
		productActionfilter.openToCalendar();
		productActionfilter.SelectcreateTodDate();

		// Apply Filter
		productActionfilter.clickFilter();
		Thread.sleep(2000);

	}

	@AfterTest
	public void endTest() {
		driver.close();
	}
}
