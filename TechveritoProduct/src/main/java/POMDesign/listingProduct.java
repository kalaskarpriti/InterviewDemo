package POMDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class listingProduct {
	public WebDriver driver;

	public listingProduct(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='q_title_input']//select")
	private WebElement selectTitle;

	@FindBy(id = "q_title")
	private WebElement entertitlevalue;

	@FindBy(xpath = "//div[@id='q_sku_input']//select")
	private WebElement selectSku;

	@FindBy(id = "q_sku")
	private WebElement enterskuvalue;

	@FindBy(id = "q_created_at_gteq_datetime")
	private WebElement openfromcalendar;

	@FindBy(id = "q_created_at_lteq_datetime")
	private WebElement opentocalendar;

	@FindBy(xpath = "//a[normalize-space()='11']")
	private WebElement selectfromdate;

	@FindBy(xpath = "//a[normalize-space()='13']")
	private WebElement selectTodate;

	@FindBy(xpath = "//input[@name='commit']")
	private WebElement filterButton;

	public WebElement selTitleFilter() {
		return selectTitle;
	}

	public WebElement selSkuFilter() {
		return selectSku;
	}

	public WebElement enterTitleInFilter() {
		return entertitlevalue;
	}

	public WebElement enterSkuInFilter() {
		return enterskuvalue;
	}

	public void openFromCalendar() {
		openfromcalendar.click();
	}

	public void SelectcreatedFromDate() {
		selectfromdate.click();
	}

	public void openToCalendar() {
		opentocalendar.click();
	}

	public void SelectcreateTodDate() {
		selectTodate.click();
	}

	public void clickFilter() {
		filterButton.click();
	}

}
