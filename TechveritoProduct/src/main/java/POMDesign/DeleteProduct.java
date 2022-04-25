package POMDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteProduct {
	public WebDriver driver;

	public DeleteProduct(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="(//a[@title='Delete'])[1]")
	private WebElement delete;
	
	public WebElement deleteProd() {
		return delete;
	}
	
	
	
}
