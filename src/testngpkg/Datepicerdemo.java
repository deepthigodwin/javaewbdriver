package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicerdemo {
	WebDriver driver;

	@BeforeTest
	public void test() {
		// ChromeOptions options = new ChromeOptions();
		// options.addArguments("--remote-allow-origins=*");
		driver = new FirefoxDriver();
		// driver=new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test
	public void test1()
	{
		driver.get("https://www.expedia.com/");
		driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
		
		  while(true)
		  {
		  
		  WebElement month=driver.findElement(By.xpath("//*[@class='uitk-date-picker-menu-months-container']/div/h2"));
		  String month1=month.getText(); 
		  if(month1.equals("September 2023"))
		  {
		  System.out.println(month1);
		  break; 
		  }
		  else
		  {
			  driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]")).click();
			  } }
		  List<WebElement>alldates=driver.findElements(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr/td/button"));
	
		  for (WebElement dateelement:alldates)
		  {
			  String date=dateelement.getAttribute("data-day");
			 // System.out.println("date");
			  if(date.equals("15"))
			  {
				  dateelement.click();
				  System.out.println("date selected");
			  }
		  }
		  }
		 

	
}


