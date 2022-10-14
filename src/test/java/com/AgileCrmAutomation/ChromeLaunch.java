package com.AgileCrmAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch extends BaseClass {

	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver","D:\\ChromeLaunch\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.redbus.in/");
		
		WebElement from = driver.findElement(By.id("src"));
		
		from.sendKeys("pune");
		
		WebElement to = driver.findElement(By.id("dest"));
		
		to.sendKeys("Kolhapur");
		
	    //click(By.xpath("//span[contains(@class,'fl icon-calendar')]"), "click on calender");
		
		driver.findElement(By.xpath("//span[contains(@class,'fl icon-calendar')]")).click();
		
		driver.findElement(By.xpath("//td[text()='12']")).click();
		
		driver.findElement(By.id("search_btn")).click();
		
	}

}
