package SeliniumFundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.api.Screen;
import org.sikuli.api.SikuliRuntimeException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadUsingSikuli 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		Actions sc=new Actions(driver);
		sc.click(driver.findElement(By.xpath("//*[@id='imagesrc']"))).build().perform();
		

	}

}
