package pkg;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firststep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.google.com");
String title=driver.getTitle();
String exp="google";
if(title.equals(exp))
{
	System.out.println("pass");
	}
else
{
	System.out.println("fail");
	}
	}

}
