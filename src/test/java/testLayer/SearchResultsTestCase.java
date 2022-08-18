package testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseAmazon;
import pomPackage.PomSearchSortFilterPagination;

public class SearchResultsTestCase extends BaseAmazon	{
	
	PomSearchSortFilterPagination results = new PomSearchSortFilterPagination();

	public SearchResultsTestCase()	{
		super();
	}
	
	@BeforeMethod
	public void initsetup() {
	initiate();
	results = new PomSearchSortFilterPagination();	}
	
	@Test
	public void productsearch() throws InterruptedException	{
		results.clickaccounts();
		Thread.sleep(2000);
		results.typetheemail(prop.getProperty("Email"));
		results.clickoncontinue();
		results.typethepassword(prop.getProperty("Password"));
		results.clickonsigninbtn();
		Thread.sleep(5000);
		results.searchtheproduct(prop.getProperty("product"));
		results.icon();
		Thread.sleep(5000);
		results.clickshoe();
		Thread.sleep(5000);
		results.clickreviews();
		Thread.sleep(5000);
	}
	@AfterMethod
	public void close() {
		driver.close();
	}	
}

