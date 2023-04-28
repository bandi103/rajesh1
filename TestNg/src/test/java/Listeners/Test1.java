package Listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Test1 extends TestListenerAdapter
{
	public void onTestStart(ITestResult tr)
	{
		System.out.println("Test started");
	}
	public void onTestSucess(ITestResult tr)
	{
		System.out.println("Test Passeed");
	}
	public void onTestFailure(ITestResult tr)
	{
		System.out.println("Test Failure");
	}
	public void onTestSkipped(ITestResult tr)
	{
		System.out.println("skipped");
	}

}
