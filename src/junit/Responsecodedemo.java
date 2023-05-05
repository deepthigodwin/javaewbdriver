package junit;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class Responsecodedemo {
	WebDriver driver;
	@Test
	public void start()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("total number of links are..............."+li.size());
		for(WebElement link :li)
		{
			String linkdetails=link.getAttribute("href");
			verify(linkdetails);
		}
	}
	public void verify(String linkdetails)
	{
	try
	{
	URL u=new URL(linkdetails);
	HttpURLConnection con=(HttpURLConnection)u.openConnection();
	
	con.connect();
	if(con.getResponseCode()==200)
	{
		System.out.println("valid 200 ............."+linkdetails);
		}
	else if(con.getResponseCode()==404)
	{
		System.out.println("valid 404 ............."+linkdetails);
		
	}
	else
	{
		System.out.println("other status code ............."+linkdetails);
		}
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
	
		
	}
	
}
