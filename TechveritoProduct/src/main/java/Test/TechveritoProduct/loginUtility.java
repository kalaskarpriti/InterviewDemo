package Test.TechveritoProduct;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import POMDesign.loginPage;
import Resources.base;

public class loginUtility extends base {

	public WebDriver driver;
	
	public loginUtility(WebDriver driver) {
		this.driver=driver;
	}

	public void loginToApp() throws IOException {
		excelutility file = new excelutility();
		ArrayList<String> data = file.getData("User", "Login");
		loginPage login = new loginPage(driver);
		login.enteremail().sendKeys(data.get(1));
		login.enterpassword().sendKeys(data.get(2));
		login.clickLogin();
	}
}