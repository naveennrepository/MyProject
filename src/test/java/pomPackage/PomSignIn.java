package pomPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazon;

public class PomSignIn extends BaseAmazon	 {
	
	@FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span")  WebElement Accountlists;
		
	@FindBy(id = "ap_email")  WebElement email;
	
	@FindBy(id = "continue") WebElement Continue;
	
	@FindBy(id = "ap_password") WebElement password;

	@FindBy(id = "signInSubmit") WebElement Signinbtn;
	
	@FindBy (id = "nav-link-accountList-nav-line-1") WebElement Customername;

		public PomSignIn() {
	PageFactory.initElements(driver, this);
			}
		public void clickaccounts() {
			Accountlists.click();
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
		public void checkname() {
			Actions action1= new Actions(driver);
			action1.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"))).build().perform();
			boolean result = driver.findElement(By.id("nav-link-accountList-nav-line-1")).isDisplayed();
			System.out.println(result);
		}
		
		public String verify() {
			return driver.getTitle(); 
				}
		public String Page() {
			return driver.getCurrentUrl();
		}
}
