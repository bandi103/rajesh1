package JavaScriptExcutor;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlashingOfanElement
{

	public static void flash(WebElement element,WebDriver driver)
	{
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		    String bgcolor=element.getCssValue("background");
		 	for(int i=0;i<500;i++)
		 	{
		 		 changeColor("#00000",driver,element);
		 		 changeColor(bgcolor,driver,element);
		 		
		 	}
		
		
	}
	public static void changeColor(String color,WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].style.backgroundColor= '"+color+ element);
	}
	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.twoplugs.com/");
        WebElement element=driver.findElement(By.xpath("(//span[@class='help'])[2]"));
        flash(element,driver);
        
	}
	

}
