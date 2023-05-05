package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ldemo {
ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		}
	@Test
	public void test1()
	{
		
		driver.findElement(By.name("email")).sendKeys("deepthi");
		driver.findElement(By.id("pass")).sendKeys("deepthi");
		driver.findElement(By.name("login")).click();
	}

}
