package MiniProjectOnSauceDemo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemo 
{
	WebDriver driver;
	ExtentReports reports;
	ExtentSparkReporter spark;
	ExtentTest test;
	@org.testng.annotations.BeforeTest
	public void BeforeTest()
	{
		reports=new ExtentReports();
		spark=new ExtentSparkReporter("D:\\TestNg practise\\TestNg\\src\\test\\java\\MiniProjectOnSauceDemo\\Mini.html");
		reports.attachReporter(spark);
		reports.setSystemInfo("tester","rajesh");
		reports.setSystemInfo("OS", "windows");
		reports.setSystemInfo("Broswer","Chrome");
		reports.setSystemInfo("Host", "LocalHost");
	}
	@Test
	public void Login()
	{
		test=reports.createTest("Login");
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
	@Test
	public void AddToCart()
	{
		test=reports.createTest("Add to Cart");
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();
		driver.findElement(By.xpath("(//button[text()='Add to cart'])[2]")).click();;
	}
	@Test
	public void goToShop()
	{
		test=reports.createTest("Go to Shop");
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();
		driver.findElement(By.xpath("(//button[text()='Add to cart'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		
	}
	@Test
	public void Checkout()
	{
		test=reports.createTest("CheckOut");
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();
		driver.findElement(By.xpath("(//button[text()='Add to cart'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
	}
	@Test
	public void YourInfo()
	{
		test=reports.createTest("Your Info");
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();
		driver.findElement(By.xpath("(//button[text()='Add to cart'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("rajesh");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("bandi");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("516421");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	@Test
	public void OrderConf()
	{
		test=reports.createTest("OrdeConf");
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();
		driver.findElement(By.xpath("(//button[text()='Add to cart'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("rajesh");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("bandi");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("516421");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String s=  driver.findElement(By.xpath("//h2[@class='complete-header']")).getText();
		assertEquals(s, "Thank you for your order!");
		
	}
	@AfterMethod
	public void getTestResult(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL,"test is filure"+result.getName());
			test.log(Status.FAIL,"test is filure"+result.getThrowable());
		}
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS,"test is Pass"+result.getName());
		}
		if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "Test is Skipped"+result.getName());
		}
	}
	@AfterTest
	public void flush()
	{
		reports.flush();
	}
	

}
