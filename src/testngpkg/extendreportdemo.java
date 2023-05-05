package testngpkg;


import java.io.IOException;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;




public class extendreportdemo {
	
	WebDriver driver;
	ExtentHtmlReporter reporter;
	ExtentTest test;

	ExtentReports extent;
	@BeforeTest
	public void beftest()
	{
		driver = new FirefoxDriver();
		reporter=new ExtentHtmlReporter("./report/myreport.html");
		reporter.config().setDocumentTitle("automationreport");
		reporter.config().setReportName("functional test");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("os", "windows11");
		extent.setSystemInfo("tester name", "deepthi");
		extent.setSystemInfo("browser name", "firefox");
		
		
		
		
	}
	@BeforeMethod
	public void setup()
	{
		driver.get("https://www.facebook.com/");
	}
	
	
	@Test
	public void fbtitleverification()throws IOException
	{
	test=extent.createTest("fbtitleverification");
	String exp="Facebook – log in or sign up";
	String actul=driver.getTitle();
	Assert.assertEquals(exp, actul);


	}
	@Test
public void fbbuttontest()throws IOException

{
	test=extent.createTest("fbbuttontest");
	String exp=driver.findElement(By.name("login")).getText();
	Assert.assertEquals(exp, "register"); 
		}
	@AfterTest
	public void teardown()
	{
	extent.flush();	
	}
	@AfterMethod
	public void browserclose(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "test case failed is"+result.getName());
			test.log(Status.FAIL, "test case failed is"+result.getThrowable());
			String screenshortpath=extendreportdemo.screenshotMethod(driver, result.getName());
			test.addScreenCaptureFromPath(screenshortpath);
			
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "test case passes is"+result.getName());
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "test case skipped is"+result.getName());
		}
		
	}	
	public static String screenshotMethod(WebDriver driver,String screenshotname)throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Destination="./screenshrt/"+screenshotname+".jpeg";
		FileHandler.copy(src,new File( Destination));
		return Destination;
	}
	
}

