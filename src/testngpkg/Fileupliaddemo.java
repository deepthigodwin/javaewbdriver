package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupliaddemo {
WebDriver driver;
@BeforeTest
public void start()
{
	driver=new ChromeDriver();
	
	}
@Test
public void test()

{
	driver.get("https://demo.guru99.com/test/upload/");
	driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\Jicks\\Downloads\\call sheet template 01.docx");
	driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	}
}
