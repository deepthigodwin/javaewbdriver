package junit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.*;
import org.junit.*;

public class Xdemo {
	ChromeDriver driver;
	@Test
	public void startup()
	{
		driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles",Keys.ENTER);
	driver.findElement(By.xpath("//div[@id=\"nav-xshop\"]/a[4]")).click();
	driver.findElement(By.xpath("//div[@id=\"nav-cart-text-container\"]//span[2]")).click();
	driver.findElement(By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]")).click();
	driver.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys("deeibjhdugd",Keys.ENTER);
	driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
	driver.findElement(By.xpath("//a[@id=\"nav-hamburger-menu\"]/i[1]")).click();
	}

}




 


