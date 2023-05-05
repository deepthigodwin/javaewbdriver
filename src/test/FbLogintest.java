package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Fbloginpage;
import pages.Forgotpasswrd;

public class FbLogintest {
	WebDriver driver;
	@BeforeTest
	public void start() {

		driver = new FirefoxDriver();

	}

	@BeforeMethod
	public void url() 
	{
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test()
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setvalues("fetdy@gmail.com", "ggfgh");
		ob.login();
	}
	@Test
	public void test1()
	{
		Forgotpasswrd fb=new Forgotpasswrd(driver);
		fb.linkclick();
		fb.mail("fdhh@gamil.com");
		
	}

}
