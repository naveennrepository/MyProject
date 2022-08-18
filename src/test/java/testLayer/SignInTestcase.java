package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazon;
import pomPackage.PomSignIn;
import pomPackage.PomYourAccount;

public class SignInTestcase extends BaseAmazon 	 {
	PomSignIn log= new PomSignIn();
	PomYourAccount orders = new PomYourAccount();
	public SignInTestcase() {
		super();
	}
	@BeforeMethod
	public void initialsetup() {
	initiate();
	log=new PomSignIn();
	orders = new PomYourAccount();
	}
	@Test(priority=1)
	public void Title() {
		String actual= log.verify();
		Assert.assertEquals(actual, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		System.out.println(driver.getTitle());	}
	@Test(priority=3)
	public void Current() {
		String actual= log.Page();
		Assert.assertEquals(actual, "https://www.amazon.in/");
		System.out.println(actual);
	}
	@Test(priority=2)
	public void click() throws InterruptedException {
		log.clickaccounts();
		Thread.sleep(2000);
		log.typetheemail(prop.getProperty("Email"));
		Thread.sleep(2000);
		log.clickoncontinue();
		Thread.sleep(2000);
		log.typethepassword(prop.getProperty("Password"));
		Thread.sleep(2000);
		log.clickonsigninbtn();
		Thread.sleep(2000);
		log.clickaccounts();
		Thread.sleep(2000);
		orders.orderpage();
		Thread.sleep(2000);
		//log.checkname();
		//orders.buyagain();
		Thread.sleep(2000);
		orders.notyetship();
		Thread.sleep(2000);
		}
	@AfterMethod
	public void close() {
		driver.close();
	}	}

