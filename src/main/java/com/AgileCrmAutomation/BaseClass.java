package com.AgileCrmAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.google.common.base.Function;

public class BaseClass
{   public static ExtentTest Logger;
	public static WebDriver driver=null;
	
	public static void launchBrowser(String browser)
	{
		switch (browser)
		{
		case ("edge"):
		System.setProperty("webdriver.edge.driver","D:\\EdgeLaunch\\edgedriver_win64 (3)\\msedgedriver.exe" );
		 driver = new EdgeDriver();
		 break;
		 
		case ("chrome"):
		System.setProperty("webdriver.chrome.driver","D:\\ChromeLaunch\\chromedriver_win32\\chromedriver.exe" );
		 driver = new ChromeDriver();
		 break;
		 
		
		default:
		System.setProperty("webdriver.edge.driver","C:\\edgedriver_win64\\msedgedriver.exe" );
		 driver = new EdgeDriver();
		 break;
		 
		}
				
	}
	public static  void click(By by, String msg) 
	{
	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(by));
		driver.findElement(by).click();
		System.out.print(msg);
	}
	public static void visibilityOfElement(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public static void waitForElementToBeClickable(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		wait.until(ExpectedConditions.alertIsPresent());
		
	}
	public static void fluentWait(final By by)
	{
		Wait<WebDriver> wwt = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(Exception.class);
		wwt.until(new Function < WebDriver, WebElement>()
				{
			public WebElement apply(WebDriver driver)
			{
				return driver.findElement(by);
			}
				});	
	}		

}
