package DataProviders;

import org.testng.annotations.Test;

public class DataClassProvider
{
	@Test(dataProvider = "mahesh",dataProviderClass =DataClassProvider1.class )
	public void rajesh(String s)
	{
		System.out.println(s);
	}

}
