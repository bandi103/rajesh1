package IntegrationOfXcelWithDataProvider;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 
{
	@Test(dataProvider = "getdata",dataProviderClass =Test1.class )
	public void register(String username,String password)
	{
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.saucedemo.com/");
	   driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys(username);
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	   driver.findElement(By.xpath("//input[@type='submit']")).click();
	   
	   
	   
	}

}
