package Listeners1;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener1 implements ITestListener
{

	
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("test is passed"+result.getName());
		
	}

	public void onTestFailure(ITestResult result) 
	{
		System.out.println("test is faile"+result.getName()+result.getThrowable());
		
	  
	}

	public void onTestSkipped(ITestResult result)
	{
		System.out.println("test is skipped"+result.getName());
		
	}

}
