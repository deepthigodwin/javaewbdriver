package testngpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Robotfileuploadddemo {
WebDriver driver;
@BeforeTest
public void start()
{
	driver=new ChromeDriver();
	
	
	}
	
	  @Test public void test() throws AWTException {
	  driver.get("https://www.ilovepdf.com/word_to_pdf");
	  driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
	  fileupload("C:\\\\Users\\\\Jicks\\\\Downloads\\\\call sheet template 01.docx");
	  }
	 public void fileupload(String p) throws AWTException
	 {
		 StringSelection StrSelection=new StringSelection(p);
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(StrSelection, null);
		 Robot robot=new Robot();
		 
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 robot.keyPress(KeyEvent.VK_V);
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
		 
		 
	 }
}
