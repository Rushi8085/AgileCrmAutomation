package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.AgileCrmAutomation.BaseClass;

public class LoginAgileCrmTestcase extends BaseClass
    {
@Test
	public void main()
	{
		

		launchBrowser ("edge");
		driver.navigate().to("https://learnautomation.agilecrm.com/login");
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("cst20@yopmail.com");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Test1234");
		WebElement SignIn = driver.findElement(By.xpath("//input[@type='submit']"));
		SignIn.click();
				
		
	}
}
