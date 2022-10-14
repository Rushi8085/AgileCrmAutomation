package com.AgileCrmAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class DealsPages extends BaseClass
{
	public static void main(String[]args) 
	{
	 
		driver.findElement(By.xpath("//li[@id='dealsmenu']/a")).click();
		driver.findElement(By.xpath("//div[@id='deals-action']/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//form[@id='opportunityForm']/descendant::input[@id='name']")).sendKeys("map deal");
		driver.findElement(By.xpath("//input [@class='required  number_with_trim form-control']")).sendKeys("400");
		driver.findElement(By.id("//input[@id='probability']")).sendKeys("30");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		visibilityOfElement(driver.findElement(By.id("Prospect")));
		Select select = new Select(driver.findElement(By.xpath("//select[@id='pipeline_milestone']/descendant::option[@value='6022689021558784_Prospect']")));
		select.selectByIndex(2);
		driver.findElement(By.xpath("//div[@id='addDescriptionInfo']/following::a[@id='opportunity_validate']")).click();
		}
}
