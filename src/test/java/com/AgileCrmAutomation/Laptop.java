package com.AgileCrmAutomation;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Laptop extends BaseClass
{
	public static void main(String[]args)
	{
		launchBrowser("chrome");
		
		driver.navigate().to("https://www.amazon.in/");
		
		Select select = new Select(driver.findElement(By.id("searchDropdownBox")));
		select.selectByVisibleText("Electronics");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> Prices = driver.findElements(By.className("a-price-whole"));
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='sg-row']/div[2]//h2//span"));
		
		for(int i=0; i<Prices.size();i++)
		{
			String price = Prices.get(i).getText();
			
			String name = names.get(i).getText();
			String SR = price.replaceAll(",", "");
			String SR2 = SR.replaceAll(" ","");
			
			Integer ii=Integer.parseInt(SR2);
			
			if(ii>=30000)
			{
			
			System.out.println(name+"Price:"+price);
		}
		}
	}
}
