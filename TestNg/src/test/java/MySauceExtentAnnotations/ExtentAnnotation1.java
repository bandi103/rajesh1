package MySauceExtentAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentAnnotation1 
{
	ExtentReports reports;
	ExtentSparkReporter spark;
	ExtentTest test;
	@BeforeTest
	public void test1()
	{
	    reports=new ExtentReports();
	    spark=new ExtentSparkReporter("D:\\TestNg practise\\TestNg\\src\\test\\java\\MySauceExtentAnnotations\\MyAn.html"); 
	    reports.attachReporter(spark);
	    reports.setSystemInfo("tester", "rajesh");
	    reports.setSystemInfo("host","localhost");
	    reports.setSystemInfo("OS","Windows");
	    reports.setSystemInfo("Broswer","Chrome");
	}
	@Test
	public void SauceDemo()
	{
		test=reports.createTest("Saucdemo Launch");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
	}
	@Test
	public void Facebook()
	{
		test=reports.createTest("Facebook Launch");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	@AfterMethod
	public void getTestResult(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL,"test is fail"+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "test is passed"+result.getName());
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP,"test is Skipped"+result.getName());
		}
	}
	@AfterTest
	public void flush()
	{
		reports.flush();
	}

}
