package junit;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;

public class Examplehtml {
	ChromeDriver driver;
	@Test
	public void start()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Jicks/OneDrive/Desktop/alert_example.html");
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		String k="hello iam alert box";
		if(k.equals(alerttext))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
		a.accept();
		driver.findElement(By.name("firstname")).sendKeys("deepthi");
		driver.findElement(By.name("lastname")).sendKeys("ullas");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
		
	}
	

}
