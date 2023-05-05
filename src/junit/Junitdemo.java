package junit;
import org.openqa.selenium.chrome.*;
import org.junit.After;
import org.junit.Test;
import org.junit.Before;
public class Junitdemo {
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
		String title=driver.getTitle();
		System.out.println(title);
	
	}
	//@After
	//public void end()
	//{
	//	driver.quit();
	//}

}
