package POMDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	public WebDriver driver;

	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "admin_user_email")
	private WebElement Email;

	@FindBy(id = "admin_user_password")
	private WebElement password;
	
	@FindBy(id="admin_user_submit_action")
	private WebElement login;
	
	public WebElement enteremail() {
		return Email;
	}
	
	public WebElement enterpassword()
	{
		return password;
	}
	
	public void clickLogin() {
		login.click();
	}

}
