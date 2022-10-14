package com.AgileCrmAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown
{

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver","D:\\ChromeLaunch\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.navigate().to("https://demogo.com");
			
			driver.manage().window().maximize();
			
			Select select = new Select(driver.findElement(By.id("old select menu")));

	}

}
