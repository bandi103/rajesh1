package SeliniumFundamentals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectMethods 
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://elementalselenium.com/");
		WebElement element=driver.findElement(By.xpath("//select[@class='language']"));
		Select select=new Select(element);
		//select methods
		//selecyByIndex(),selectByVisibleText(),selectByValue()
		
		//select.selectByIndex(1);
		//select.selectByVisibleText("Java");
		//options getOptions(),getAllSelectedOptions(),getFirstSelectedOptions()
		List<WebElement> list=select.getOptions();
		for(WebElement e:list)
		{
			System.out.println(e.getText());
		}
		//select.deselectByVisibleText("Java");
		//select.deslectByvalue();
		//select.deselectByIndex();
		
	}

}
