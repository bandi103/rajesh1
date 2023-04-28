package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report 
{
   public static void main(String[] args)
   {
	   ExtentReports exetendreports=new ExtentReports();
	   ExtentSparkReporter spark=new ExtentSparkReporter("D:\\TestNg practise\\TestNg\\src\\test\\java\\Listeners\\myreport.html");
	   exetendreports.attachReporter(spark);
	   ExtentTest test1= exetendreports.createTest("test1");
	   test1.pass("this is passes");
	   ExtentTest test2= exetendreports.createTest("test2");
	   test2.pass("this is passeed");
	   ExtentTest test3= exetendreports.createTest("test3");
	   test3.fail("this is fail"); 
	   exetendreports.flush();
	   
	   
   }

}
