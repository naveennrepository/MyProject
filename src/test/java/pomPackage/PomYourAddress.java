package pomPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazon;

public class PomYourAddress extends BaseAmazon {
	@FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span")  WebElement Accountlists;
	@FindBy(id = "ap_email")  WebElement email;
	@FindBy(id = "continue") WebElement Continue;
	@FindBy(id = "ap_password") WebElement password;
	@FindBy(id = "signInSubmit") WebElement Signinbtn;
	@FindBy(xpath = "//*[@id=\"a-page\"]/div[2]/div/div[3]/div[1]/a/div/div/div/div[2]/h2") WebElement YourAddress;
	@FindBy(id = "ya-myab-plus-address-icon") WebElement Addaddress;
	@FindBy(id = "address-ui-widgets-enterAddressFullName") WebElement fullname;
	@FindBy (id = "address-ui-widgets-enterAddressPhoneNumber") WebElement phonenumber;
	@FindBy(id = "address-ui-widgets-enterAddressPostalCode") WebElement pin;
	@FindBy(id = "address-ui-widgets-enterAddressLine1") WebElement apartment;
	@FindBy(id = "address-ui-widgets-enterAddressLine2") WebElement Area;
	@FindBy(id = "address-ui-widgets-landmark") WebElement landmark;
	@FindBy (id = "address-ui-widgets-enterAddressCity") WebElement city;
	@FindBy (id = "address-ui-widgets-enterAddressStateOrRegion") WebElement state;
	@FindBy (xpath = "//*[@id=\"address-ui-widgets-addr-details-address-type-and-business-hours\"]/span/span") WebElement addresstype;	
	@FindBy(xpath = "//*[@id=\"address-ui-widgets-form-submit-button\"]/span/input") WebElement add;
	public PomYourAddress()	{
		PageFactory.initElements(driver, this);
	}
	public void clickaccountlist()	{
		Accountlists.click();
	}
	public void typetheemail(String Email) {
		email.sendKeys(Email);
		}
	public void clickoncontinue() {
		Continue.click();	}
	
	public void typethepassword(String Password) {
		password.sendKeys(Password);	}
	
	public void clickonsigninbtn() {
		Signinbtn.click();	}
	public void addresspage()	{
		YourAddress.click();	}
	public void addtheaddress()	{
		Addaddress.click();
	}
	public void enterfullname(String Fullname)	{
		fullname.sendKeys(Fullname);
	}
	public void entermobile(String mobilenumber)	{
		phonenumber.sendKeys(mobilenumber);
	}
	public void enterpin(String pincode)	{
		pin.sendKeys(pincode);
	}
	public void enterapart(String Apartment)	{
		apartment.sendKeys(Apartment);
	}
	public void enterarea(String area) {
		Area.sendKeys(area);
	}
	public void enterlandmark(String Landmark)	{
		landmark.sendKeys(Landmark);
	}
	public void entercity(String City)	{
		city.sendKeys(City);
	}
	public void selectstate(String State)	{
		state.sendKeys(State);	}
	public void selectaddresstype(String Addresstype)	{
		addresstype.sendKeys(Addresstype);	}
	public void addaddress()	{
		add.click();
	}
}
