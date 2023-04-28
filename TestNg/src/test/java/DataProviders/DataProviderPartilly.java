package DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPartilly 
{
	@Test(dataProvider = "test1")
	public void test(String s)
	{
		System.out.println(s);
	}
	@DataProvider(indices = {1,2})
	public String[] test1()
	{
		String[] data=new String[] {"rajesh","mahesh","ajay","suresh"
	};
		return data;

    }
}
