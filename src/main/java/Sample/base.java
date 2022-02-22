package Sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	public WebDriver driver;
	Properties prop;
	FileInputStream fiss;
	
	public WebDriver initdriver() throws IOException	
	{
		fiss = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\Sample\\data.properties");
		prop = new Properties();
		prop.load(fiss);
		prop.getProperty("browser");
		String BrowserName = prop.getProperty("browser");
		if(BrowserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\rohit\\Documents\\SeleniumJava\\EtoEProject\\src\\main\\java\\Sample\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(BrowserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\rohit\\Documents\\SeleniumJava\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
		return driver;
		
		
		
		
	}

}