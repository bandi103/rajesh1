package MySauceTestingListeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceListeners1
{
	WebDriver driver;
	@Test
	public void Login()
	{
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.saucedemo.com/");
    	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
    	driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	 
	@Test
	public void AddtoCart()
	{
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.saucedemo.com/");
    	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
    	driver.findElement(By.xpath("//input[@type='submit']")).click();
    	driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();
	}


}
