package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Forgotpasswrd {
	WebDriver driver;
	By link=By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a");
	By email=By.id("identify_email");

	public Forgotpasswrd(WebDriver driver)
	{
		this.driver=driver;
	}
	public void linkclick()
	{
		driver.findElement(link).click();
	}
	public void mail(String mail)
	{
		driver.findElement(email).sendKeys(mail);
	}
	

}
