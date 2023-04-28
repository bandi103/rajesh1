package SauceTestingListeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Log;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public abstract class Listeners2 implements ITestResult
{
	
	ExtentReports reports;
	ExtentSparkReporter spark;
	ExtentTest test;
	public void congif()
	{
		reports=new ExtentReports();
		spark=new ExtentSparkReporter("D:\\TestNg practise\\TestNg\\src\\main\\java\\SauceTestingListeners\\listerners.html");
		reports.setSystemInfo("OS", "Windows");
		reports.setSystemInfo("host", "Localhost");
		reports.setSystemInfo("Rajesh", "QA");
		reports.attachReporter(spark);
	}
	public void onTestStart(ITestResult tr)
	{
		congif();
		System.out.println("Test started");
	}
	public void onTestSucess(ITestResult tr)
	{
		System.out.println("Name of the test method"+tr.getName());
		test=reports.createTest(tr.getName());
		test.log(Status.PASS, "Test is passed"+tr.getName());
		
	}
	public void onTestFailure(ITestResult tr)
	{
		System.out.println(tr.getName());
		test=reports.createTest(tr.getName());
		test.log(Status.FAIL, "test is failed"+tr.getName());
		test.log(Status.FAIL, "Test is failed"+tr.getThrowable());
	}
	public void onTestSkipped(ITestResult tr)
	{
		System.out.println(tr.getName());
		test=reports.createTest(tr.getName());
		test.log(Status.SKIP,"test is skipped"+tr.getName());
	}
	public void onFinish(ITestResult tr)
	{   
		System.out.println("finished");
		reports.flush();
	}
}
