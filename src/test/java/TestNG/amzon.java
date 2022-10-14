package TestNG;

import org.testng.annotations.Test;

import com.AgileCrmAutomation.BaseClass;

public class amzon
{

	@Test
	public  void main()
	{
		
		BaseClass bc = new BaseClass();
		bc.launchBrowser("chrome");
		BaseClass.driver.navigate().to("https://www.amazon.in/");
	
	}
}
