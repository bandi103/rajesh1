package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register 
{
	WebDriver driver;
	@FindBy(xpath = "//input[@id='user-name']")
	WebElement username;
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement login;
	 
	Register(WebDriver d)
	{
	driver=d;
	PageFactory.initElements(d,this);
	}
	public void USername(String uname)
	{
		username.sendKeys(uname);
	}
	public void Password(String pass)
	{
		password.sendKeys(pass);
	}
	public void Login()
	{
		login.click();
	}
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Register rg=new Register(driver);
		driver.get("https://www.saucedemo.com/");
		rg.USername("standard_user");
		rg.Password("secret_sauce");
		rg.Login();
		
		
	}
	

}
