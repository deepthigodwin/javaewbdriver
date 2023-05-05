package junit;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multipletab {
	WebDriver driver;
	@BeforeTest
	public void start()
	{
		driver=new ChromeDriver();
	}
@Test
public void test()
{
	driver.get("https://demo.guru99.com/popup.php");
	
	String currentHandle= driver.getWindowHandle();
	driver.findElement(By.xpath("/html/body/p/a")).click(); 
	 Set<String> bighandles=driver.getWindowHandles();
	 for(String handle: bighandles)
	 {
		 if(!handle.equalsIgnoreCase(currentHandle))
		 {
		 driver.switchTo().window(handle);
		 driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("deepthy@gmail.com");
		 driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
		//driver.close();
		 }
		driver.switchTo().window(currentHandle);
		 
	 }
	

	}
}
