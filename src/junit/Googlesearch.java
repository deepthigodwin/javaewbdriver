package junit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
	ChromeDriver driver;
	@Test
	public void start()
	{
	
	driver= new ChromeDriver()	;
	driver.get("http://www.google.com");
	driver.findElement(By.name("q")).sendKeys("book",Keys.ENTER);
	//driver.findElement(By.name("btnK")).click();
	}
	

}
