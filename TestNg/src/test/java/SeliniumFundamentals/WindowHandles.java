package SeliniumFundamentals;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		String s=driver.getWindowHandle();
		//System.out.println(s);
		Set<String> set=driver.getWindowHandles();
		for(String e:set)
		{
			if(!s.equals(set))
			{
				driver.switchTo().window(e);
				System.out.println(driver.switchTo().window(e).getTitle());
			}
		}
		
		
		

	}

}
