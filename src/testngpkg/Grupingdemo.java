package testngpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Grupingdemo {
	
	WebDriver driver;
	@BeforeTest(alwaysRun = true)
	public void startup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod(alwaysRun = true)
	public void urlloading()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test(groups={"smoke","sanity"})
	public void test()
	{
		String title=driver.getTitle();
		
		System.out.println(title);
	}
	
	  @Test(groups= {"sanity"}) 
	  public void urlget() 
	  
	  { 
		  String u=driver.getCurrentUrl();
	  System.out.println(u);
	  }
	  @Test(groups={"smoke"})
	  public void test3()
	  {
		  String h=driver.getPageSource();
		  System.out.println(h);
	  }
	  @Test(groups={"regression"})
	  public void test4()
	  {
		
		  System.out.println("heloo");
	  }
	  @Test(groups={"sanity"})
	  public void test5()
	  {
		
		  System.out.println("haiiiiiii");
	  }
	 

}
