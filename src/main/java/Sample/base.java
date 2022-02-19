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
	
	public WebDriver initdriver() throws IOException	
	{
		Properties prop = new Properties();
		FileInputStream fiss = new FileInputStream("C:\\Users\\rohit\\Documents\\SeleniumJava\\EtoEProject\\src\\main\\java\\Sample\\data.properties");
		prop.load(fiss);
		prop.getProperty("browser");
		String BrowserName = prop.getProperty("browser");
		if(BrowserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C://Users//rohit//Documents//SeleniumJava//Selenium//chromedriver_win32//chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(BrowserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\rohit\\Documents\\SeleniumJava\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		return driver;
		
		
	}

}
