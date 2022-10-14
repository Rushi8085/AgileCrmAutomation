package TestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.AgileCrmAutomation.BaseClass;
import com.beust.jcommander.Parameters;

public class AmazonAppliances extends BaseClass {
	
	@Test 
	public void amazonApplinces() throws AWTException, InterruptedException  
	{
		launchBrowser("edge");
		driver.navigate().to("https://www.amazon.in/");
		WebElement customerService = driver.findElement(By.xpath("//div[@id='nav-xshop']/a[text()='Customer Service']"));
		
		Actions action = new Actions(driver);
		// right click on customer service
		action.contextClick(customerService).build().perform();
		// select first option in right click pannel
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		// get parent window id
		
	String parentWindowId = driver.getWindowHandle();
	System.out.print("Parent window Id :" + parentWindowId);
		
	// get all window id
		Set<String> allWindowIds = driver.getWindowHandles();
		System.out.print("all window id :" + allWindowIds);
		
		for(String windowId : allWindowIds)
		{
			// if window id is not parent then go inside if condition
			if(!windowId.equals("parentWindowId"))
			{
				System.out.print("child window id :" + windowId);
				// switch to another window
				driver.switchTo().window(windowId);
				// print the title of page
				System.out.print(driver.getTitle());
			}
			
		}
		
		// switch back control to parent window
		driver.switchTo().window(parentWindowId);
		// driver.switchTo().defaultContent();
		
		//print the title of parent window
		System.out.print(driver.getTitle());
	}
}
