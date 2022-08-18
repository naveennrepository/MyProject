package basePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import utility.TimeUtilis;

public class BaseAmazon {
	public static Properties prop=new Properties();
	public static WebDriver driver;
	
	public BaseAmazon() {
		try {
			FileInputStream file= new FileInputStream("C:\\Users\\kumar\\AmazonMain\\src\\test\\java\\environmentalVariables\\Config.Properties");
			prop.load(file);	}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();		}
			catch(IOException a)
			{ 
				a.printStackTrace();
			}	} 
		public static void initiate() 	{		
			String browserName= prop.getProperty("browser");	

			if(browserName.equals("Microsoft Edge")) {
				System.setProperty("webdriver.edge.driver","msedgedriver.exe");
				driver=new EdgeDriver();
			}
			else if(browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				driver= new ChromeDriver();	}
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(TimeUtilis.timepage, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			}
}
