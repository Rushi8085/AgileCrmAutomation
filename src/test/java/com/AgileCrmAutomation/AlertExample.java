package com.AgileCrmAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;

public class AlertExample extends BaseClass {

	public static void main(String[] args)
	{   
		launchBrowser("chrome");
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('this is alert!');");
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("This is a sample text ...");
		alert.accept();
		String alerttext =alert.getText();
		System.out.print(alerttext);

	}

}
