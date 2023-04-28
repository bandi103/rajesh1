package SeliniumFundamentals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.lowagie.text.pdf.codec.Base64;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EncodeAndDecode
{

	public static void main(String[] args) 
	
	{
		String str="renuka";
		byte[] byt=Base64.decode(str);
		System.out.println(byt);
		String b=Base64.encodeBytes(byt);
		System.out.println(b);
	    WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9885659961");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("[B@2c6a3f77");		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		

	}

}
