package com.AgileCrmAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EdgeLaunch extends BaseClass
{

	public static void main(String[] args) 
	{
		launchBrowser("chrome");
		
		driver.navigate().to("https://www.redbus.in/");
		
        driver.findElement(By.id("src")).sendKeys("pune");
        
        driver.findElement(By.xpath("//li[@class='selected']")).click();
        
        
		driver.findElement(By.id("dest")).sendKeys("Kolhapur");
		
	   driver.findElement(By.xpath("//li[@class='selected']")).click();
	        
		driver.findElement(By.xpath("//span[contains(@class,'fl icon-calendar')]")).click();
		
		driver.findElement(By.xpath("//td[text()='12']")).click();
		
		driver.findElement(By.id("search_btn")).click();
		

	}

}
