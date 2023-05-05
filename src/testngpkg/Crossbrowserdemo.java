package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class Crossbrowserdemo {
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void start(String browsers)
	{
		if(browsers.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browsers.equalsIgnoreCase("FirefoxTest"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			driver=new EdgeDriver();
		}
	}
	@BeforeMethod(alwaysRun = true)
	public void test()
	{
		driver.get("http://www.google.com");
	}
	@Test
	public void run()
	{
		driver.findElement(By.name("q")).sendKeys("car",Keys.ENTER);
	}

}
