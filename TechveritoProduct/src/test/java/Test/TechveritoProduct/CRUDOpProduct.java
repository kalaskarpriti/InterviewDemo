package Test.TechveritoProduct;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POMDesign.CRUDOperationProduct;
import Resources.base;

public class CRUDOpProduct extends base {
	public static WebDriver driver;
	CRUDOperationProduct productAction;
	public excelutility file;
	ArrayList<String> data;

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeBrowser();
		driver.get(seturl);
		loginUtility lgn = new loginUtility(driver);
		lgn.loginToApp();
		productAction = new CRUDOperationProduct(driver);
		productAction.productTab();
		file = new excelutility();
	}

	@Test(priority=1)
	public void addProduct() throws IOException {
		data = file.getData("CreateProduct", "Product");
		productAction.newProduct().click();
		productAction.enterTitle().sendKeys(data.get(1));
		productAction.enterSku().sendKeys(data.get(2));
		productAction.enterDescription().sendKeys(data.get(3));
		productAction.createProduct().click();

	}
	
	@Test(priority=2)
	public void editProduct() throws IOException {
		data = file.getData("EditProduct", "Product");
		productAction.clickeditProduct().click();
		productAction.enterTitle().clear();
		productAction.enterTitle().sendKeys(data.get(1));
		productAction.enterSku().clear();
		productAction.enterSku().sendKeys(data.get(2));
		productAction.enterDescription().clear();
		productAction.enterDescription().sendKeys(data.get(3));
		productAction.updateProduct().click();

	}
	
	@Test(priority=3)
	public void delProduct() throws InterruptedException {
		
		productAction.deleteProd().click();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);

	}
	
	@AfterTest
	public void endTest() {
		driver.close();
	}

}
