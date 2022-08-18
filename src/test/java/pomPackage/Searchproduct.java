package pomPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchproduct {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone13");
		driver.findElement(By.id("nav-search-submit-button")).click();
	driver.findElement(By.xpath("//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]")).click();
		Thread.sleep(3000);
		
		// To handle multiple windows we use driver.getWindowHandles() method which returns a set of string to open multiple windows.
	Set<String>	windowhandles= driver.getWindowHandles();
		System.out.println(windowhandles);
		
		// iterator is utilized to returns over the elements in the set of strings. 
		Iterator<String> iterator=windowhandles.iterator();
		String parentwindow=	iterator.next();
		System.out.println(parentwindow);
		String childwindow=	iterator.next();
		System.out.println(childwindow);
		driver.switchTo().window(childwindow);
		// 1. To search for the product and look for reviews in another window.
		driver.findElement(By.id("acrCustomerReviewText")).click();
		Thread.sleep(2000);
		driver.switchTo().window(parentwindow);
		// 2. Should be able to click on the next page
		driver.findElement(By.xpath("//a[contains(text(),'2')]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.close();
		}


}
