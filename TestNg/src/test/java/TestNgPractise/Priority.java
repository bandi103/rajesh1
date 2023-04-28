package TestNgPractise;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Priority
{
    @Test(priority = 1)
    public void signin()
    {
    	System.out.println("sign in");	
    }
    @Test(priority = 2)
    public void booking()
    {
    	System.out.println("booking");
    }
    
    @Test(priority = 3)
    public void singout()
    {
    	System.out.println("sign out");
    }
    @Test(priority = 4)
    public void logout()
    {
    	System.out.println("log out");
    }
    @Test(priority = 5)
    public void cancel()
    {
    	System.out.println("cancel");
    }
  }


