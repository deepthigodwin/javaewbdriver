package testngpkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebbyexample {
	WebDriver driver;
	@BeforeTest
	public void start()
	{
		 driver=new ChromeDriver();
		
	}
	@Test
	public void test()
	{
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.ebay.com/");
	WebElement ele = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));

	//Creating object of an Actions class
	Actions action = new Actions(driver);

	//Performing the mouse hover action on the target element.
	action.moveToElement(ele).perform();
	WebElement second=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"));
	//action.moveToElement(second).click();
	second.click();	//action.perform();
	
	}
	
	

}
