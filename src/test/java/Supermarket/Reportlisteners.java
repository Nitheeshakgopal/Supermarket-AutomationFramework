package Supermarket;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Utils.ExtentReporterUtil;
import Utils.PageActions;

public class Reportlisteners implements  ITestListener  {
	//here we call method getReporter using the class name.methodname(classname=ExtentReporterUtil,methodname=getReporter()
	//making connection with ExtentReporterUtil class using above mentioned manner//
	ExtentReports extent = ExtentReporterUtil. getReporter();
	ExtentTest test;
	//making browser thread safe for parallel execution//
	
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
	
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());	
		extentTest.set(test);
	}
	
	public void onTestSuccess(ITestResult result) {
		extentTest.get().log(Status.PASS, "I am passed");
	}

	public void onTestFailure(ITestResult result) {
		
		extentTest.get().fail(result.getThrowable());
			try {
				extentTest.get().addScreenCaptureFromPath(PageActions.getScreenshot(),result.getMethod().getMethodName());
			} 
			catch (Exception e) {
				e.printStackTrace();
			}	
	}
	

	public void onFinish(ITestContext context) {
		extent.flush();
	}

}
