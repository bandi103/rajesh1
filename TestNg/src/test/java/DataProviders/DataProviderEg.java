package DataProviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.ObjectArrays;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderEg 
{
	@Test(dataProvider = "login")
	public void Register(String username,String password) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
	}
	@DataProvider()
	public Object[][] login()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="standard_user";
		data[0][1]="secret_sauce";
		data[1][0]="admin";
		data[1][1]="admin123";
		
		
		return data;
		
	}
	
	
}
