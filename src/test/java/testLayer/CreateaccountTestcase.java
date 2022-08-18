package testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazon;
import pomPackage.PomCreateaccount;

public class CreateaccountTestcase extends BaseAmazon	 {
	
	PomCreateaccount account = new PomCreateaccount();
	
		public CreateaccountTestcase() {
		super();
		}
	@BeforeMethod
	public void initsetup() {
	initiate();
	account = new PomCreateaccount();
		}
	@Test
	public void createnew() throws InterruptedException {
		
		account.clickstarthere();
		Thread.sleep(2000);
		account.typeName(prop.getProperty("yourname"));
		Thread.sleep(2000);
		account.typePhonenumber(prop.getProperty("mobilenumber"));
		Thread.sleep(2000);
		account.typePassword(prop.getProperty("Password"));
		Thread.sleep(2000);
		account.clickContinue();
		Thread.sleep(2000);
	}
	@Test
	public void searchthe() throws InterruptedException	{
		account.searchtheproduct(prop.getProperty("product"));
		Thread.sleep(2000);
		account.icon();
		Thread.sleep(5000);
	}
	@AfterMethod
	public void close() {
		driver.close();
	}
}

