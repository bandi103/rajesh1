package SeliniumFundamentals;

import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		WebElement element=driver.findElement(By.xpath("//input[@type='text']"));
		Actions action = new Actions();
		
		
		

	}

}
