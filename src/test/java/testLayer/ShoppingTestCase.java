package testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazon;
import pomPackage.PomShoppingcart;

public class ShoppingTestCase extends BaseAmazon{
	
	PomShoppingcart shopping = new PomShoppingcart();
	
	public ShoppingTestCase()	{
		super();
	}
	@BeforeMethod
	public void initsetup() {
	initiate();
	shopping = new PomShoppingcart();	}
	
	@Test
	public void shop() throws InterruptedException {
		shopping.clickaccounts();
		Thread.sleep(2000);
		shopping.typetheemail(prop.getProperty("Email"));
		shopping.clickoncontinue();
		shopping.typethepassword(prop.getProperty("Password"));
		shopping.clickonsigninbtn();
		Thread.sleep(5000);
		shopping.searchtheproduct(prop.getProperty("product"));
		shopping.icon();
		Thread.sleep(5000);
		shopping.clickshirt();
		Thread.sleep(5000);
		shopping.selectsize();
		Thread.sleep(5000);
		shopping.selectquantity();
		Thread.sleep(5000);
		shopping.buy();
		Thread.sleep(3000);
		shopping.proceed();
		Thread.sleep(5000);		}
	@Test
	public void deleteproduct() throws InterruptedException	{
		shopping.clickaccounts();
		Thread.sleep(2000);
		shopping.typetheemail(prop.getProperty("Email"));
		shopping.clickoncontinue();
		shopping.typethepassword(prop.getProperty("Password"));
		shopping.clickonsigninbtn();
		Thread.sleep(5000);
		shopping.gotocart();
		Thread.sleep(5000);
		shopping.removeproduct();
		Thread.sleep(3000);
		shopping.gotocart();
		Thread.sleep(3000);

	}
	@AfterMethod
	public void close() {
		driver.close();
	}	}

