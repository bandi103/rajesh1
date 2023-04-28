package SeliniumFundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownLoadFiles 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("fytghwdjkas");
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		driver.findElement(By.xpath("//a[@id='link-to-download']")).click();

	}

}
