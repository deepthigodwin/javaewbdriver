package junit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.junit.*;

public class Tagdemo {
	ChromeDriver driver;
	@Test
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		List <WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("output is"+li.size());
		for(WebElement element:li)
		{
			String links=element.getAttribute("href");
			String text=element.getText();
			String k=element.getTagName();
			
			System.out.println(k);
		}
	}
	@After
	public void ebdi()
	{
		driver.quit();
	}
	
	
	

}
