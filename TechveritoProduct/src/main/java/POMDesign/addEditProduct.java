package POMDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addEditProduct {
	public WebDriver driver;

	public addEditProduct(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Find Webelement for all 3 fields
	@FindBy(id = "products")
	private WebElement productTab;

	@FindBy(xpath = "//span[@class='action_item']")
	private WebElement newProduct;

	@FindBy(id = "product_title")
	private WebElement title;

	@FindBy(id = "product_sku")
	private WebElement sku;

	@FindBy(id = "product_description")
	private WebElement description;

	@FindBy(id = "product_submit_action")
	private WebElement createProd;

	@FindBy(xpath = "//a[@title='Edit']")
	private WebElement editProd;

	// Find WebElement for error messages
	
	@FindBy(xpath="//p[@class='inline-errors']")
	private WebElement errMessage;

	// Method Implemenation for fields
	public void productTab() {
		productTab.click();
		;
	}

	public WebElement newProduct() {
		return newProduct;
	}

	public WebElement enterTitle() {
		return title;
	}

	public WebElement enterSku() {
		return sku;
	}

	public WebElement enterDescription() {
		return description;
	}

	public WebElement createProduct() {
		return createProd;
	}

	public WebElement clickeditProduct() {
		return editProd;
	}

	public WebElement updateProduct() {
		return createProd;
	}
	
	// Method Implemenation for Error messages
	
	public String ErrorText() {
		return errMessage.getText();
	}
}
