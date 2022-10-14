package com.AgileCrmAutomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners extends BaseClass implements ITestListener, ISuiteListener
{
	public void onStart(ISuite suit)
	{
		System.out.println("This is onStart Method of Suite");
	}
	
	public void onFinish(ISuite suit)
	{
		System.out.println("This is onFinish Method of Suite");
		driver.quit();
	}
	
	public void onStart(ITestContext context)
	{
		System.out.println("This is onStart Method of Test");
	}
	
	public void onFinish(ITestContext context)
	{
		System.out.println("This is onFinish Method of Test");
	}
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("This is onTestStart Method");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("This is onTestSuccess Method");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("This is onTestFailure Method");
       // System.out.println("This is onTestFailure method");
		
		TakesScreenshot takeSc=(TakesScreenshot)driver;
		File screenShotfile=takeSc.getScreenshotAs(OutputType.FILE);
		
		String fileName=result.getName();
						//get project folder path
		String outputPath=System.getProperty("user.dir")+"//ExecutionResult//Screenshot//"+fileName+"Rushi.png";
		
		File ouputFile=new File(outputPath);
			
		try {
			FileUtils.copyFile(screenShotfile, ouputFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void onTestSkippes(ITestResult result)
	{
		System.out.println("This is onTestSkipped Method");
	}
	
	public void onTestFailedWithTimeout(ITestResult result)
	{
		System.out.println("This is ontestfailurewithtimeout method");
		
		onTestFailure(result);
	}
	
}
