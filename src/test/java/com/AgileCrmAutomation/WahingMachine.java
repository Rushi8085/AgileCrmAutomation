package com.AgileCrmAutomation;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WahingMachine extends BaseClass
{
	public static void main(String[]args)
	{
		launchBrowser("chrome");
		
		driver.navigate().to("https://www.amazon.in/");
		
		Select select = new Select(driver.findElement(By.id("searchDropdownBox")));
		select.selectByVisibleText("Electronics");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("WashingMachine");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> Prices = driver.findElements(By.className("a-price-whole"));
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='sg-row']/div[2]//h2//span"));
		
		for(int i=0; i<names.size();i++)
		{
			String name = names.get(i).getText();
			
			String price = Prices.get(i).getText();
			
			
			System.out.println(name+":"+price);
		}
		}
	}

