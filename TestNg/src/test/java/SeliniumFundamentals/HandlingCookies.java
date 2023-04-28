package SeliniumFundamentals;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCookies
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=9723770542505157853&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062039&hvtargid=kwd-10573980&hydadcr=14453_2316415");
	    Cookie ce=new Cookie("rajeh", "1234");
	    driver.manage().addCookie(ce);
	    driver.manage().deleteCookie(ce);
	    Set<Cookie>cookies=driver.manage().getCookies();
	    System.out.println(cookies.size());
	    for(Cookie e:cookies)
	    {
	    	System.out.println(e.getName()+" "+e.getValue());
	    }
	    
	}
	

}
