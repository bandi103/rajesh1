package TestNgPractise;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions 
{
	@Test
	public void Facebook()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rajesh");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("rajesh");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		SoftAssert soft=new SoftAssert();
		
		//title insertion
		String expected="";
		String actual=driver.getTitle();
		soft.assertNotEquals(actual, expected,"title is mismatched");
		//url assertion
		String expectedurl="https://en-gb.facebook.com/";
		String actualurtl=driver.getCurrentUrl();
		soft.assertNotEquals(actualurtl,expectedurl,"url mismatched");
		driver.close();
		soft.assertAll();
		
		
	}

}
