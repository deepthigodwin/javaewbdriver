package junit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

import org.junit.*;

public class Screenshrtexample {
	ChromeDriver driver;
	@Test
	public void startu() throws IOException

	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Jicks/OneDrive/Desktop/alert_example.html");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("D://error.png"));
		WebElement button=driver.findElement(By.xpath("/html/body/input[1]"));
		File sc=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(sc, new File("./screenshrt/erroru.png"));
	}
}
