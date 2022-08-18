package pomPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazon;

public class PomCreateaccount extends BaseAmazon {
	
	@FindBy (xpath = "//*[@id=\"nav-flyout-ya-newCust\"]/a") WebElement starthere;
	
	
	@FindBy (id = "ap_customer_name") WebElement Yourname;
	
	@FindBy (id = "ap_phone_number") WebElement phonenumber;
	
	@FindBy(id = "ap_password") WebElement password;
	
	@FindBy (id = "continue") WebElement Continue;
	
	@FindBy (id="twotabsearchtextbox") WebElement Search;
	
	@FindBy(id ="nav-search-submit-button") WebElement searchicon;
	public PomCreateaccount() 
	{
		PageFactory.initElements(driver, this);
				}
	public void clickstarthere() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"))).build().perform();
		starthere.click();
	}
	
	public void typeName(String yourname) {
		Yourname.sendKeys(yourname);
	}
	public void typePhonenumber(String mobilenumber) {
		phonenumber.sendKeys(mobilenumber);
	}
	public void typePassword(String Password) {
		password.sendKeys(Password);
	}
	public void clickContinue() {
		Continue.click();
	}
	// guest account can navigate all products
	public void searchtheproduct(String product)	{
		Search.sendKeys(product);
	}
	public void icon()	{
		searchicon.click();
	}
}