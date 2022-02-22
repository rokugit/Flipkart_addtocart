package Sample;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Sample.Tasks;
import Sample.base;

public class HomePage extends base{
	
	public WebDriver driver;
	
	@Test
	public void flipkartapp() throws IOException, InterruptedException
	{	
		driver=initdriver();
		driver.get(prop.getProperty("url"));
		Tasks fl = new Tasks(driver);
		fl.delpopup().click();
		fl.cllogin().click();
		fl.fusername().sendKeys(prop.getProperty("username"));
		fl.fpassword().sendKeys(prop.getProperty("password"));
		Thread.sleep(1000);
		fl.fsubmit().click();
		Thread.sleep(2000);
		fl.box().sendKeys("macbook",Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> allOps = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		allOps.get(1).click();
		Thread.sleep(3000);
		ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
		Thread.sleep(1000);
		System.out.println("tab switched to " + driver.getTitle());
		Thread.sleep(1000);
		List<WebElement> ada = driver.findElements(By.cssSelector("button[class*='_2KpZ6l']"));
		ada.get(0).click();
		Thread.sleep(2000);
		System.out.println("the title of the current tab " + driver.getTitle());
		fl.placeorder().click();
		Thread.sleep(1000);
		fl.next().click();
		Thread.sleep(2000);
		System.out.println("the title of the current tab " + driver.getTitle());
		
	}
			
		
		
		
}