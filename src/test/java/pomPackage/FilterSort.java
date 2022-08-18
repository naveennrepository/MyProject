package pomPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FilterSort {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes for men");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		// 1. filtering brands functionality	
		/*driver.findElement(By.xpath("//*[@id=\"p_89/Max\"]/span/a/div/label/i")).click();
		boolean option = driver.findElement(By.xpath("//*[@id=\"p_89/Max\"]/span/a/div/label/i")).isSelected();
		System.out.println(option);
				// choosing the pattern
		driver.findElement(By.xpath("//*[@id=\"p_n_feature_ten_browse-bin/1974980031\"]/span/a/div/label/i")).click();
		Thread.sleep(5000);
				// adding the discount
		driver.findElement(By.xpath("//*[@id=\"p_n_pct-off-with-tax/2665402031\"]/span/a/span")).click();
		Thread.sleep(5000);*/
	
		//	2. Sorting the product
		/*	Select low = new Select(driver.findElement(By.id("s-result-sort-select")));
			low.selectByValue("price-asc-rank");
			Thread.sleep(4000);
			driver.navigate().back();
			Select high = new Select(driver.findElement(By.id("s-result-sort-select")));
			high.selectByValue("price-desc-rank");
			Thread.sleep(4000);
			driver.navigate().back();
			Select review = new Select(driver.findElement(By.id("s-result-sort-select")));
			review.selectByValue("review-rank");
			Thread.sleep(4000);
			driver.close();*/
			
		// 3. Filtering and sorting
			driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/span[1]/div[1]/div[1]/div[1]/div[4]/ul[1]/li[1]/span[1]/a[1]/div[1]/label[1]/i[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[contains(text(),'₹500 - ₹1,000')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"p_n_pct-off-with-tax/2665400031\"]/span/a/span")).click();
			Select low = new Select(driver.findElement(By.id("s-result-sort-select")));
			low.selectByValue("price-asc-rank");
			Thread.sleep(4000);
			driver.navigate().back();
			Select high = new Select(driver.findElement(By.id("s-result-sort-select")));
			high.selectByValue("price-desc-rank");
			Thread.sleep(4000);
			driver.navigate().back();
			Select review = new Select(driver.findElement(By.id("s-result-sort-select")));
			review.selectByValue("review-rank");
			Thread.sleep(4000);
			driver.close();
			
		}

}
