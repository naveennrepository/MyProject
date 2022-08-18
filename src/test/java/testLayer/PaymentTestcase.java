package testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazon;
import pomPackage.PomPayment;

public class PaymentTestcase extends BaseAmazon {
	PomPayment payment = new PomPayment();
	public PaymentTestcase()	{
	super();	}
	@BeforeMethod
	public void initsetup() {
	initiate();
	payment = new PomPayment();	}
	@Test
	public void paymentdetails() throws InterruptedException	{
		
		payment.mouseaccount();
		
		payment.typetheemail(prop.getProperty("Email"));
	
		payment.clickoncontinue();
	
		payment.typethepassword(prop.getProperty("Password"));
		
		payment.clickonsigninbtn();
		
		payment.mouseaccount();
		Thread.sleep(5000);
		payment.clickonpayment();
		Thread.sleep(5000);
		payment.carddetails();
		Thread.sleep(5000);
		payment.entercardnumber(prop.getProperty("Cardnumber"));
		Thread.sleep(5000);
		payment.enternameoncard(prop.getProperty("Nameoncard"));
		Thread.sleep(5000);
		payment.enterdate(prop.getProperty("Date"));
		
		payment.enteryear(prop.getProperty("Year"));
		
		payment.addyourcardinfo();	
	}
	@AfterMethod
	public void close() {
		driver.close();
	}	}

