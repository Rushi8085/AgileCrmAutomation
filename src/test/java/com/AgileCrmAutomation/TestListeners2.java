package com.AgileCrmAutomation;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestListeners2 extends BaseClass implements ITestListener, ISuiteListener {
	
	ExtentReports extentReport;
	ExtentSparkReporter sparkReport;

	// Onstart method of ISuiteListener Interface
	public void onStart(ISuite suite)
	{
		LocalDateTime dateTime = LocalDateTime.now();
		String timeStamp = dateTime.format(DateTimeFormatter.ofPattern("dd_MM_yyyy_hh_mm"));
		String folderName = "Report_"+ timeStamp;
		System.out.println(folderName);
		
		String reportpath = System.getProperty("user.dir")+"//ExecutionResult//"+folderName;
		
		File file = new File(reportpath);
		if(!file.exists())
		{
			file.mkdir();
		}
		
		setExtentReportDetails();	
		
	}
	// Onfinish method of ISuiteListener Interface
	public void onFinish(ISuite suite) {
		System.out.println("This is onFinish Method of Suite");
		driver.quit();
		extentReport.flush();
	}
	public void onStart(ITestContext context) {
		System.out.println("This is onStart method of Test");
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("This is onFinish method of Test");
	}

	public void onTestStart(ITestResult result) {
//		String methodName=result.getMethod().getMethodName();
		String methodName=result.getName();
		Logger=extentReport.createTest(methodName);
		
		System.out.println("This is onTestStart method");
	  }

	public void onTestSuccess(ITestResult result) {
		//add success information into extent report using logger variable 
		Logger.pass("Successfully executed the test:"+result.getName());
		System.out.println("This is onTestSuccess method");
	  }
	
	public void onTestFailure(ITestResult result) {
		System.out.println("This is onTestFailure method");
		
		TakesScreenshot takeSc=(TakesScreenshot)driver;
		File screenShotfile=takeSc.getScreenshotAs(OutputType.FILE);
		
		String fileName=result.getName();
						//get project folder path
		String outputPath="reportPath"+"//Screenshot//"+fileName+"RK1.png";
		
		File ouputFile=new File(outputPath);
			
		try {
			FileUtils.copyFile(screenShotfile, ouputFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Logger.fail("The test execution is failed due to : "+ result.getThrowable());
		Logger.addScreenCaptureFromPath(outputPath);
	  }
	
	public void onTestSkipped(ITestResult result) {
		Logger.skip("The test is skipped due to the :" + result.getSkipCausedBy());
		System.out.println("This is onTestSkipped method");
	  }
	public void onTestFailedWithTimeout(ITestResult result) {
	    System.out.println("This is onTestFailedWithTimeout method");
		onTestFailure(result);
	  }
	public void setExtentReportDetails()
	{
		 System.out.println("This is report  method");
	}
}
	
	