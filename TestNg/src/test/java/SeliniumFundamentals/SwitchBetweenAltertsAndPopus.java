package SeliniumFundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchBetweenAltertsAndPopus 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		driver.switchTo().alert().sendKeys("rajesh");
		driver.switchTo().alert().accept();
		
		

	}

}
