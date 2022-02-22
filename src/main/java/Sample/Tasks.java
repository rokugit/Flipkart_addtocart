package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tasks{
	
	public WebDriver driver;
	
	
	
	By crosssymbol = By.xpath("//button[contains(text(),'✕')]");
	By clicklogin = By.cssSelector("a[href*='account']");
	By username = By.cssSelector("input[class*='_2IX_2- VJZDxU']");
	By password = By.cssSelector("input[type*='password']");
	By submit = By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']");
	By searchbox = By.xpath("//input[@name='q']");
	By continueed = By.cssSelector("button[class*='_2KpZ6l']");
	By placingorder = By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']");
	

	
	
	
	
	public Tasks(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement delpopup()
	{
		return driver.findElement(crosssymbol);
	}
	
	public WebElement cllogin()
	{
		return driver.findElement(clicklogin);
	}
	
	public WebElement fusername()
	{
		return driver.findElement(username);
	}
	
	public WebElement fpassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement fsubmit()
	{
		return driver.findElement(submit);
	}
	public WebElement box()
	{
		return driver.findElement(searchbox);
	}
	
	
	public WebElement next()
	{
		return driver.findElement(continueed);
	}
	
	public WebElement placeorder()
	{
		return driver.findElement(placingorder);
	}
	
	

}