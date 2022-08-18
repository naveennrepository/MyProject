package pomPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazon;

public class PomSearchSortFilterPagination extends BaseAmazon {
	@FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span")  WebElement Accountlists;
	@FindBy(id = "ap_email")  WebElement email;
	@FindBy(id = "continue") WebElement Continue;
	@FindBy(id = "ap_password") WebElement password;
	@FindBy(id = "signInSubmit") WebElement Signinbtn;
	@FindBy (id="twotabsearchtextbox") WebElement Search;
	@FindBy(id ="nav-search-submit-button") WebElement searchicon;
	@FindBy (xpath ="//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[3]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/h2[1]/a[1]/span[1]") WebElement shoe;
	@FindBy(id ="acrCustomerReviewText") WebElement reviews;

	public PomSearchSortFilterPagination() {
		PageFactory.initElements(driver, this);	}
	public void clickaccounts() {
		Accountlists.click();	}
	public void typetheemail(String Email) {
		email.sendKeys(Email);	}
	public void clickoncontinue() {
		Continue.click();	}
	public void typethepassword(String Password) {
		password.sendKeys(Password);		}
	public void clickonsigninbtn() {
		Signinbtn.click();	}
	public void searchtheproduct(String product)	{
		Search.sendKeys(product);	}
	public void icon()	{
		searchicon.click();		}
	public void clickshoe()	{
		shoe.click();	}
	public void clickreviews()	{
		reviews.click();
	}	}
