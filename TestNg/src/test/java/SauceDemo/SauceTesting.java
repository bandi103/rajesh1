package SauceDemo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceTesting 
{
	
	    ExtentReports extentreports;
	    ExtentSparkReporter spark;
	    ExtentTest test;
	    @BeforeSuite
		public void ExtentReport()
		{
			new ExtentReports();
			new ExtentSparkReporter("D:\\TestNg practise\\TestNg\\src\\test\\java\\SauceDemo\\mysauce.html");
			extentreports.attachReporter(spark);
			extentreports.setSystemInfo("host", "localhost");
			extentreports.setSystemInfo("OS","Windows");
			extentreports.setSystemInfo("Broswer","Chrome");		
		}
	    @Test
	    public void Login() throws Exception
	    {
	    	ExtentReport();
	    	test=extentreports.createTest("Login");
	    	WebDriverManager.chromedriver().setup();
	    	WebDriver driver=new ChromeDriver();
	    	driver.get("https://www.saucedemo.com/");
	    	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	    	driver.findElement(By.xpath("//input[@type='submit']")).click();
	    	extentreports.flush();
	    	
	    
	    }
	   
	    @AfterMethod
	    public void tearDown(ITestResult result)
	    {
	    	if(result.getStatus()==ITestResult.FAILURE)
	    	{
	    		test.log(Status.FAIL,"Test is failure"+result.getName());
	    		test.log(Status.FAIL,"Test is Failue"+result.getThrowable());	
	    	}
	    	else if(result.getStatus()==ITestResult.SKIP)
	    	{
	    		test.log(Status.SKIP,"Test is Skipped"+result.getName());
	    	}
	    	else if(result.getStatus()==ITestResult.SUCCESS)
	    	{
	    		test.log(Status.PASS,"Test is Passed"+result.getName());
	    	}
	    }
	   
	    
	    
	    

}
