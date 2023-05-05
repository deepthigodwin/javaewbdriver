package pkg;
import org.openqa.selenium.chrome.*;

public class pagesrc {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
		

	}

}
