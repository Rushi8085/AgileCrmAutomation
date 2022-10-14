package com.AgileCrmAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ContactPage extends BaseClass
{
	public static void main(String[]args) 
{
		
	PropertyHandling prop = new PropertyHandling();
	String browser =prop.getValue("browser");
	String url = prop.getValue("url");
	String username = prop.getValue("username");
	String password = prop.getValue("password");
	launchBrowser(browser);
	driver.navigate().to(url);
	driver.findElement(By.name("email")).sendKeys(username);
    driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	click(By.id("contactsmenu"),"Clicked On Contact Menu");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//driver.findElement(By.xpath("//div[@id='view-list']/button[1]")).click();
	click(By.xpath("//button[contains(text(),'Add Contact')]"),"click on add contact button");
	driver.findElement(By.id("fname")).sendKeys("Rushi");
	driver.findElement(By.id("lname")).sendKeys("Kumbhar");
    driver.findElement(By.id("email")).sendKeys("rushik8085@gmail.com");
    driver.findElement(By.id("person_validate")).click();
    
	
	
}
}