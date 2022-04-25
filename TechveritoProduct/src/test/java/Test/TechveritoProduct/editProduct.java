package Test.TechveritoProduct;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMDesign.addEditProduct;
import Resources.base;

public class editProduct extends base {
	
	public WebDriver driver;
	addEditProduct productAction;
	public excelutility file;
	ArrayList<String> data;

	@BeforeMethod
	public void initialize() throws IOException {
		driver = initializeBrowser();
		driver.get(seturl);
		loginUtility lgn = new loginUtility(driver);
		lgn.loginToApp();
		productAction = new addEditProduct(driver);
		productAction.productTab();
		file = new excelutility();
		data = file.getData("EditProduct", "Product");

	}

	@Test
	public void addProduct() {
		productAction.clickeditProduct().click();
		productAction.enterTitle().clear();
		productAction.enterTitle().sendKeys(data.get(1));
		productAction.enterSku().clear();
		productAction.enterSku().sendKeys(data.get(2));
		productAction.enterDescription().clear();
		productAction.enterDescription().sendKeys(data.get(3));
		productAction.updateProduct().click();

	}
	
	@AfterMethod
	public void endTest() {
		driver.close();
	}

}