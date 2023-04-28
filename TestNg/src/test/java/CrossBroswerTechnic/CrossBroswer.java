package CrossBroswerTechnic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBroswer 
{
	WebDriver driver;
	@Parameters("broswerName")
	@BeforeTest
	public void crossBroswing(String broswerName)
	{
		if(broswerName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromiumdriver().setup();
			driver=new ChromeDriver();
		}
		else if(broswerName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
	}
	@Test
	public void openSauceDemo1()
	{
		
		driver.get("saucedemo.com");
	}
	@Test
	public void openFacebook()
	{
		
		driver.get("https://en-gb.facebook.com/");
		
	}
	@Test
	public void openInsta()
	{
		driver.get("https://www.instagram.com/accounts/login/");
	}
	@Test
	public void openSauceDemo2()
	{
		
		driver.get("https://www.saucedemo.com/");
	}

}
