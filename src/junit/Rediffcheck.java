package junit;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffcheck {
ChromeDriver driver;

@Test
public void start()
{
	driver=new ChromeDriver();
	driver.get("https://www.rediff.com/");
	driver.findElement(By.xpath("//p[@id=\"signin_info\"]/a[2]")).click();
	Boolean img=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img[1]")).isDisplayed();
	if(img)
	{
		System.out.println("presrent");
	}
	else
	{
		System.out.println("not presrent");	
	}
WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
	Select s=new Select(day);
	s.selectByVisibleText("01");
	List<WebElement>listcount=s.getOptions();
	
	
	  System.out.println("total count in day........."+listcount.size());
	 WebElement month=driver.findElement(By.xpath( "//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]")); 
	 Select ss=new Select(month);
	  
	 ss.selectByValue("04");
	 List<WebElement>listcountmonth=ss.getOptions();
		
		
	  System.out.println("total count in month........."+listcountmonth.size());
	WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
	Select sss=new Select(year);
	sss.selectByVisibleText("2020");
	List<WebElement>listcountyear=sss.getOptions();
	
	
	  System.out.println("total count in day........."+listcountyear.size());
	}
}