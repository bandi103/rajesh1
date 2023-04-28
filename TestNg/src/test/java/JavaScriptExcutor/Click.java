package JavaScriptExcutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Click {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.twoplugs.com/");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement element=driver.findElement(By.xpath("(//span[@class='help'])[1]"));
        js.executeScript("arguments[0].click();", element);

	}

}
