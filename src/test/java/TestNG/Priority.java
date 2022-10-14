package TestNG;

import org.testng.annotations.Test;

public class Priority 

{

	@Test(priority=1)
public void login()
{
		System.out.print("This is login method");		
}
	
	@Test(priority=2)
	public void addCompany()
	{
		System.out.print("This is addcompany method");	
	}
	

	@Test(priority=3)
	public void addContact()
	{
		System.out.print("This is addcontct method");	
	}
}
