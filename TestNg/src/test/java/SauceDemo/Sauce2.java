package SauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sauce2 
{   @Test
	public void Login()
	{
        WebDriverManager.chromedriver().setup();
		ExtentReports report=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("D:\\TestNg practise\\TestNg\\src\\test\\java\\ExtentReport\\rajesh1.html");
		report.setSystemInfo("host", "localhost");
		report.setSystemInfo("OS","Windows");
		report.setSystemInfo("Broswer","chrome");
		report.attachReporter(spark);
		ExtentTest test=report.createTest("test1");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
    	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
    	driver.findElement(By.xpath("//input[@type='submit']")).click();
		 report.flush();
	}

}
