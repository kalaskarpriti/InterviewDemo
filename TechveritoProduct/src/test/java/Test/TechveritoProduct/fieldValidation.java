package Test.TechveritoProduct;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POMDesign.CRUDOperationProduct;
import Resources.base;

public class fieldValidation extends base {
	public WebDriver driver;
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

	// Enter empty Title and valid data in all other fields and check error message

	@Test(priority = 1)
	public void emptyTitle() throws IOException {
		data = file.getData("EmptyTitle", "Product");
		productAction.newProduct().click();
		productAction.enterTitle().sendKeys(" ");
		productAction.enterSku().sendKeys(data.get(1));
		productAction.enterDescription().sendKeys(data.get(2));
		productAction.createProduct().click();
		String validationMessage = productAction.ErrorText();
		assertEquals(validationMessage, data.get(3));
		productAction.cancelButton().click();

	}

	// Enter empty Sku and valid data in all other fields and check error message

	@Test(priority = 2)
	public void emptySku() throws IOException {
		data = file.getData("Emptysku", "Product");
		productAction.newProduct().click();
		productAction.enterTitle().sendKeys(data.get(1));
		productAction.enterSku().sendKeys(" ");
		productAction.enterDescription().sendKeys(data.get(2));
		productAction.createProduct().click();
		String validationMessage = productAction.ErrorText();
		assertEquals(validationMessage, data.get(3));
		productAction.cancelButton().click();

	}
	// Enter empty description and valid data in all other fields and check error
	// message

	@Test(priority = 3)
	public void emptyDescription() throws IOException {
		data = file.getData("EmptyDescription", "Product");
		productAction.newProduct().click();
		productAction.enterTitle().sendKeys(data.get(1));
		productAction.enterSku().sendKeys(data.get(2));
		productAction.enterDescription().sendKeys(" ");
		productAction.createProduct().click();
		String validationMessage = productAction.ErrorText();
		assertEquals(validationMessage, data.get(3));
		productAction.cancelButton().click();

	}

	// Check unique Title validation
	@Test(priority = 4)
	public void uniqueTitle() throws IOException {
		data = file.getData("UniqueTitle", "Product");
		productAction.newProduct().click();
		productAction.enterTitle().sendKeys(data.get(1));
		productAction.enterSku().sendKeys(data.get(2));
		productAction.enterDescription().sendKeys(data.get(3));
		productAction.createProduct().click();
		String validationMessage = productAction.ErrorText();
		assertEquals(validationMessage, data.get(4));
		productAction.cancelButton().click();

	}

	// Check unique Sku validation
	@Test(priority = 5)
	public void uniqueSku() throws IOException {
		data = file.getData("UniqueSku", "Product");
		productAction.newProduct().click();
		productAction.enterTitle().sendKeys(data.get(1));
		productAction.enterSku().sendKeys(data.get(2));
		productAction.enterDescription().sendKeys(data.get(3));
		productAction.createProduct().click();
		String validationMessage = productAction.ErrorText();
		assertEquals(validationMessage, data.get(4));
		productAction.cancelButton().click();

	}

	// Check title length validation
	@Test(priority = 6)
	public void titleLenghtValidation() throws IOException {
		data = file.getData("TitleLenghtValidation", "Product");
		productAction.newProduct().click();
		productAction.enterTitle().sendKeys(data.get(1));
		productAction.enterSku().sendKeys(data.get(2));
		productAction.enterDescription().sendKeys(data.get(3));
		productAction.createProduct().click();
		driver.navigate().back();
		driver.navigate().back();
		

	}

	// Check Sku length validation
	@Test(priority = 7)
	public void skuLenghtValidation() throws IOException {
		data = file.getData("SkuLenghtValidation", "Product");
		productAction.newProduct().click();
		productAction.enterTitle().sendKeys(data.get(1));
		productAction.enterSku().sendKeys(data.get(2));
		productAction.enterDescription().sendKeys(data.get(3));
		productAction.createProduct().click();
		driver.navigate().back();
		driver.navigate().back();
		
	}

	@AfterTest
	public void endTest() {
		driver.close();
	}

}
