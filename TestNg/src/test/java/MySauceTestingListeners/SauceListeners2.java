package MySauceTestingListeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public abstract class SauceListeners2 extends TestListenerAdapter
{
	ExtentReports reports;
	ExtentSparkReporter spark;
	ExtentTest test;
	public void congif()
	{
		reports=new ExtentReports();
		spark=new ExtentSparkReporter("D:\\TestNg practise\\TestNg\\src\\test\\java\\MySauceTestingListeners\\mysauce.html");
		reports.setSystemInfo("OS", "Windows");
		reports.setSystemInfo("host", "Localhost");
		reports.setSystemInfo("Rajesh", "QA");
		
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
		reports.attachReporter(spark);
		
	}
	public void onTestFailure(ITestResult tr)
	{
		System.out.println(tr.getName());
		test=reports.createTest(tr.getName());
		test.log(Status.FAIL, "test is failed"+tr.getName());
		test.log(Status.FAIL, "Test is failed"+tr.getThrowable());
		reports.attachReporter(spark);
	}
	public void onTestSkipped(ITestResult tr)
	{
		System.out.println(tr.getName());
		test=reports.createTest(tr.getName());
		test.log(Status.SKIP,"test is skipped"+tr.getName());
		reports.attachReporter(spark);
	}
	public void onFinish(ITestResult tr)
	{   
		System.out.println("finished");
		reports.flush();
	}

}
