package ExtentReport;

import static org.testng.Assert.assertEquals;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Repport1 
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		
		ExtentReports report=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("D:\\TestNg practise\\TestNg\\src\\test\\java\\ExtentReport\\myextent.html");
		report.setSystemInfo("host", "localhost");
		report.setSystemInfo("OS","Windows");
		report.setSystemInfo("Broswer","chrome");
		report.attachReporter(spark);
		ExtentTest test=report.createTest("test1");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		 String s=driver.getTitle();
		 assertEquals(s,"Facebook – log in or sign up");
		 report.flush();
		
	}

}
