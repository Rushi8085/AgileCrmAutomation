
package com.AgileCrmAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CompnyPage extends BaseClass 
{

	 public static void main(String[]args)
	{ 
	    launchBrowser("chrome");
		driver.navigate().to("https://cst47.agilecrm.com/");
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("cst47@yopmail.com");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Test1234");
		WebElement SignIn = driver.findElement(By.xpath("//input[@type='submit']"));
		SignIn.click();
		click(By.id("companiesmenu"),"Clicked On Company Menu");
		driver.findElement(By.xpath("//div[@id='view-list']/button[1]")).click(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("company_name")).sendKeys("adobe");
		driver.findElement(By.id("continue-company")).click();
		//driver.findElement(By.xpath("//div[contains(@class,'second')]/descendant::input[@id='email']")).sendKeys("yes@yopmail.com");
		driver.findElement(By.xpath("//div[contains(@class,'second')]/div/div/input")).sendKeys("yes@yopmail.com");
		Select select = new Select(driver.findElement(By.xpath("//div[contains(@class,'second')]/div//div[2]/select")));
		select.selectByIndex(2);
		visibilityOfElement(driver.findElement(By.id("country")));
		Select select1 = new Select(driver.findElement(By.id("country")));
		select1.selectByIndex(20);
		driver.findElement(By.id("company-update")).click();

	}
}
