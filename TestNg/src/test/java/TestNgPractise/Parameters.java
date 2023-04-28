package TestNgPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameters 
{  
	
	
	WebDriver driver;
    @org.testng.annotations.Parameters("broswer")
	@Test
	public void sauceDemo( String broswer) throws InterruptedException
	{
    	switch(broswer)
    	{
    	case "edge":
    	 
    		WebDriverManager.edgedriver().setup();
    	    driver=new EdgeDriver();
    		break; 
    	case "chrome":
    		WebDriverManager.chromedriver().setup();
    		driver=new ChromeDriver();
    		break;
    	default:
    		System.err.println("Broswer inavalid");
    		
    	}
	
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);	
	}
	
	@Test
	public void check() throws InterruptedException
	{
	    driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();
		driver.findElement(By.xpath("(//button[text()='Add to cart'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.xpath("//button[text()='Checkout']")).click();
		Thread.sleep(5000);
	}
	@Test
	public void address() throws InterruptedException
	{
		driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();
		driver.findElement(By.xpath("(//button[text()='Add to cart'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.xpath("//button[text()='Checkout']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("rajesh");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("bandi");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("516421");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//button[text()='Finish']")).click();
		Thread.sleep(5000);
	}
	
	
	
	

}
