package testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazon;
import pomPackage.PomYourAddress;

public class YourAddressTestcase extends BaseAmazon	{
	PomYourAddress address = new PomYourAddress();
	public YourAddressTestcase()	{
		super();	}
		@BeforeMethod
	public void initsetup() {
	initiate();
	address = new PomYourAddress();		}
		@Test
	public void addressadd() throws InterruptedException {
		address.clickaccountlist();
		address.typetheemail(prop.getProperty("Email"));
		address.clickoncontinue();
		address.typethepassword(prop.getProperty("Password"));
		address.clickonsigninbtn();
		address.clickaccountlist();
		address.addresspage();
		Thread.sleep(3000);
		address.addtheaddress();
		Thread.sleep(3000);
		address.enterfullname(prop.getProperty("Fullname"));
		Thread.sleep(3000);
		address.entermobile(prop.getProperty("mobilenumber"));
		address.enterpin(prop.getProperty("pincode"));
		Thread.sleep(3000);
		address.enterapart(prop.getProperty("Apartment"));
		Thread.sleep(3000);
		address.enterarea(prop.getProperty("area"));
		Thread.sleep(3000);
		address.enterlandmark(prop.getProperty("Landmark"));
		Thread.sleep(3000);
		/*address.entercity(prop.getProperty("City"));
		Thread.sleep(3000);
		address.selectstate(prop.getProperty("State"));
		Thread.sleep(3000);
		address.selectaddresstype(prop.getProperty("Addresstype"));
		*/Thread.sleep(3000);
		address.addaddress();
		Thread.sleep(3000);
		}
	@AfterMethod
	public void close() {
		driver.close();
	}	}


