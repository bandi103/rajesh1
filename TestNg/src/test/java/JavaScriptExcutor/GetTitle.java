package JavaScriptExcutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitle 
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.twoplugs.com/");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        String tite=js.executeScript("return document.title;").toString();
        System.out.println(tite);
	}

}
