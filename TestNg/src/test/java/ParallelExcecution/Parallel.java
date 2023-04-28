package ParallelExcecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel
{
	@Test(dataProvider = "getdata")
	public void register(String username,String password)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		   
	}
	@DataProvider(name="getdata",parallel = true)
	public String[][] getdata()
	{
		String[][] data=new String[13][2];
		data[0][0]="rajesh";
		data[0][1]="rajesh@103";
		data[1][0]="mahesh";
		data[1][1]="mahesh@103";
		data[2][0]="mahesh@103";
		data[2][1]="mahesh@103";
		data[3][0]="mahesh@103";
		data[3][1]="mahesh@103";
		data[4][0]="mahesh@103";
		data[4][1]="mahesh@103";
		data[5][0]="mahesh@103";
		data[5][1]="mahesh@103";
		data[6][0]="mahesh@103";
		data[6][1]="mahesh@103";
		data[7][0]="mahesh@103";
		data[7][1]="mahesh@103";
		data[8][0]="mahesh@103";
		data[8][1]="mahesh@103";
		data[9][0]="mahesh@103";
		data[9][1]="mahesh@103";
		data[10][0]="mahesh@103";
		data[10][1]="mahesh@103";
		data[11][0]="mahesh@103";
		data[11][1]="mahesh@103";
		data[12][0]="mahesh@103";
		data[12][1]="mahesh@103";
		
		return data;
	}
	

}
