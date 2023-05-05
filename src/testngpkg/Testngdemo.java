package testngpkg;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	WebDriver driver;
	@BeforeTest
	public void startup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test(priority=3)
	public void test()
	{
		String title=driver.getTitle();
		
		System.out.println(title);
	}
	
	  @Test(priority=1,invocationCount=4) 
	  public void urlget() 
	  
	  { 
		  String u=driver.getCurrentUrl();
	  System.out.println(u);
	  }
	  @Test(priority=2,enabled=false)
	  public void test3()
	  {
		  String h=driver.getPageSource();
		  System.out.println(h);
	  }
	 

}
