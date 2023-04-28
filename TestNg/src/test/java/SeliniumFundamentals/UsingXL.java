package SeliniumFundamentals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingXL {

	@DataProvider(name="getdata")
	public String[][] getdata() throws IOException
	{
		File file=new File("D:\\TestNg practise\\TestNg\\src\\test\\resources\\brr.xlsx");
		System.err.println(file.exists());
		FileInputStream input=new 	FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(input);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int noofrows=sheet.getPhysicalNumberOfRows();
		int noofcolumns=sheet.getRow(0).getLastCellNum();
		System.out.println(noofrows);
		System.out.println(noofcolumns);
		String[][] data=new String[noofrows-1][noofcolumns];
		for(int i=0;i<noofrows-1;i++)
		{
			for(int j=0;j<noofcolumns;j++)
			{
				DataFormatter matter=new DataFormatter();
		        data[i][j]=matter.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		
		}
		return data;
		  
	}
	@Test(dataProvider = "getdata")
	public void login(String username,String password)
	{
		WebDriverManager.chromedriver().setup();
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.saucedemo.com/");
		   driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys(username);
		   driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		   driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	

}
