package pomPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazon;

public class PomPayment extends BaseAmazon {
	@FindBy(xpath = "//*[@id=\"nav-link-accountList-nav-line-1\"]")  WebElement Accountlists;
	
	@FindBy(id = "ap_email")  WebElement email;
	
	@FindBy(id = "continue") WebElement Continue;
	
	@FindBy(id = "ap_password") WebElement password;

	@FindBy(id = "signInSubmit") WebElement Signinbtn;
	
	@FindBy(css ="#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(2) > a > div > div > div > div.a-column.a-span9.a-span-last > h2") WebElement payment;
	
	@FindBy(className="a-button-input") WebElement addcard;
	@FindBy(id = "pp-2c9SZl-15") WebElement cardnumber;
	@FindBy(id = "pp-2c9SZl-17") WebElement nameoncard;
	@FindBy(xpath = "//*[@id=\"pp-2c9SZl-21\"]/span/span") WebElement date;
	@FindBy(xpath = "//*[@id=\"pp-2c9SZl-22\"]/span/span") WebElement year;
	@FindBy(xpath = "//*[@id=\"pp-2c9SZl-25\"]/span/input") WebElement addyourcard;

	
	public PomPayment()	{
		PageFactory.initElements(driver, this);
	}
	
	public void mouseaccount()	{
		Actions action = new Actions(driver);
		action.moveToElement(Accountlists).build().perform();
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	}
	public void clickonpayment()	{
		payment.click();
	}
	public void typetheemail(String Email) {
		email.sendKeys(Email);
		}
	public void clickoncontinue() {
		Continue.click();
	}
	public void typethepassword(String Password) {
		password.sendKeys(Password);
	}
	public void clickonsigninbtn() {
		Signinbtn.click();
	}
	public void carddetails()	{
		addcard.click();
	}
	public void entercardnumber(String Cardnumber)	{
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("pp-LzIgRX-15"))).build().perform();
		driver.findElement(By.xpath("//*[@id=\"pp-LzIgRX-15\"]")).sendKeys(Cardnumber);	
		}
	public void enternameoncard(String Nameoncard)	{
		nameoncard.sendKeys(Nameoncard);
	}
	public void enterdate(String Date)	{
		date.sendKeys(Date);
	}
	public void enteryear(String Year)	{
		year.sendKeys(Year);
	}
	public void addyourcardinfo()	{
		addyourcard.click();
	}
	
}

