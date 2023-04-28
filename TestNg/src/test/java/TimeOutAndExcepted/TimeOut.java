package TimeOutAndExcepted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TimeOut 
{
	//actually the the time will take 5s to start but we give the timeout 2s so it becomes failue
	@Test(timeOut = 2000)
	public void register() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.quit();

}
}
