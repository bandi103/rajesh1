package DataProviders;

import org.testng.annotations.DataProvider;

public class DataClassProvider1 
{  
	@DataProvider(indices = {0,1,2})
	public String[] mahesh()
	{
		String[] data=new String[] {"rajesh","mahesh","ajay","suresh"
	};
		return data;

    }

}
