package SeliniumFundamentals;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks 
{
	public static void main(String[] args) throws IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
	    List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			WebElement element=links.get(i);
			String url=element.getAttribute("href");
			URL link=new URL(url);
			HttpURLConnection con=(HttpURLConnection) link.openConnection();
			con.connect();
			int rescode=con.getResponseCode();
			if(rescode>400)
			{
				System.out.println(url+"broken");
			}
			else
			{
				System.out.println(url+"unbroken");
			}
		}
	}

}
