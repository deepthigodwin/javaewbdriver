package testngpkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadautoit {
	WebDriver driver;
	@BeforeTest
	public void start()
	{
		driver=new ChromeDriver();
		
		}
	@Test
	public void test() throws IOException

	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		String titles=driver.getTitle();
		System.out.println(titles);
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		Runtime.getRuntime().exec("C:\\Users\\Jicks\\Downloads\\T2.exe");
		}

}
