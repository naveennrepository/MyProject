package pomPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazon;

public class PomYourAccount extends BaseAmazon	 {
	Actions action = new Actions(driver);

	@FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span")  WebElement Accountlists;
	@FindBy(id = "ap_email")  WebElement email;
	@FindBy(id = "continue") WebElement Continue;
	@FindBy(id = "ap_password") WebElement password;
	@FindBy(id = "signInSubmit") WebElement Signinbtn;
	@FindBy(css = "#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2") 
	WebElement Yourorders;
	
//	@FindBy (className ="a-link-normal") WebElement Buyagain;
	@FindBy (xpath = "//*[@id=\"orderTypeMenuContainer\"]/ul/li[4]/span/a") WebElement Notyetshipped;
	@FindBy (xpath = "//*[@id=\"orderTypeMenuContainer\"]/ul/li[5]/span/a") WebElement Cancelledorders;
	
	public PomYourAccount()	{
		PageFactory.initElements(driver, this);
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
	public void orderpage()	{
		Yourorders.click();	}
	public void buyagain() 	{
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"a-page\"]/section/div/div[3]/ul/li[2]/a"))).build().perform();
		driver.findElement(By.cssSelector("#a-page > section > div > div.a-section.a-spacing-medium.page-tabs > ul > li:nth-child(2) > a")).click();
		}
	public void notyetship() 	{
		action.moveToElement(Notyetshipped).build().perform();
		driver.findElement(By.className("a-link-normal")).click(); 	}
	public void cancelorders()	{
		Cancelledorders.click();	}
}
