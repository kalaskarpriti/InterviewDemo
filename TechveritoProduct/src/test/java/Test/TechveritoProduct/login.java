package Test.TechveritoProduct;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Resources.base;

public class login extends base {
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() throws IOException {
		driver = initializeBrowser();
		driver.get(seturl);
	}

	@Test
	public void loginToApp() throws IOException {
		loginUtility lgn = new loginUtility(driver);
		lgn.loginToApp();
	}
	
	@AfterMethod
	public void endTest() {
		driver.close();
	}

}
