package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paramdemo {
	WebDriver driver;
	@BeforeTest
	public void start()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod(alwaysRun = true)
	public void test()
	{
		driver.get("http://www.google.com");
	}
	@Parameters("searchvalue")
	@Test
	public void run(String s)
	{
		driver.findElement(By.name("q")).sendKeys(s,Keys.ENTER);
	}
	

}
