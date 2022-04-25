package Test.TechveritoProduct;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMDesign.DeleteProduct;
import POMDesign.addEditProduct;
import Resources.base;

public class deleteProduct extends base {
	public WebDriver driver;
	addEditProduct productAction;
	DeleteProduct productAction2;
	public excelutility file;
	ArrayList<String> data;
	

	@BeforeMethod
	public void initialize() throws IOException {
		driver = initializeBrowser();
		driver.get(seturl);
		loginUtility lgn = new loginUtility(driver);
		lgn.loginToApp();
		productAction = new addEditProduct(driver);
		productAction2 = new DeleteProduct(driver);
		productAction.productTab();

	}

	@Test
	public void delProduct() throws InterruptedException {
		
		productAction2.deleteProd().click();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);

	}
	
	@AfterMethod
	public void endTest() {
		driver.close();
	}

}
