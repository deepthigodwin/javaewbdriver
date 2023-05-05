package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rightdoubleclick {
	WebDriver driver;
	@BeforeTest
	public void start()
	{
	 driver=new ChromeDriver();	
	}
	@Test
	public void test()

	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	@Test
	public void test2()
	{
		WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));

		WebElement dd=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Actions act=new Actions(driver);
		act.contextClick(rightclick).perform();
	
	
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
		Alert a=driver.switchTo().alert();
		
		a.accept();
		

		act.doubleClick(dd).perform();
		
		
		  Alert d=driver.switchTo().alert();
		 
		  String compare=d.getText();
		  //String stringcomp="You double clicked me.. Thank You..";//
			
			
			  if(compare.equals("You double clicked me.. Thank You..")) {
			  System.out.println("pass"); } else { System.out.println("failed"); }
			 
		 
		  d.accept();
	}

}
