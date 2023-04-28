package TestNgPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestNg 
{
	@Test
	public static void  TestGoogle()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/maps");
		driver.close();
		
	}

}
