package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

public class Rediff {
	WebDriver driver;

	@BeforeTest
	public void start() {
		

		driver = new ChromeDriver();

	}

	@Test()
	public void test() {
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}

	@Test
	public void test1() {
		Boolean b = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		if (b) {
			System.out.println("logo prsent");

		} else {
			System.out.println("not present");
		}
	}
	
	  @Test 
	  public void test2()
	  {
	  driver.findElement(By.xpath("//body/center/form/div/table[2]/tbody/tr[3]/td[3]/input")).sendKeys(
	  "deepthi");
	
	  
	  }

	/*
	 * @Test public void test2() {
	 * 
	 * driver.findElement(By.xpath("//p[@id=\"signin_info\"]/a[2]")).click();
	 * 
	 * }
	 */
	  
	  

	  @Test
	  public void test3()
	  {
		  String button =driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).getAttribute("value");
		  if(button.equals("Check availability"))
		  {
			  System.out.println("currect");
		  }
		  else
		  {
			  System.out.println(" not currect");  
		  }
	  }
	  

	 

}
