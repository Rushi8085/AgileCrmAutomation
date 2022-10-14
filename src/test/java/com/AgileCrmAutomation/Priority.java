package com.AgileCrmAutomation;

import org.testng.annotations.Test;

public class Priority 

{

	@Test(priority=1)
public void login() throws Exception
{
	System.out.println("This is login method");	
		
	throw new Exception("fail to login in appilcation");
}
	
	@Test(priority=2 , dependsOnMethods = {"login"})
	public void addCompany()
	{
		System.out.println("This is addcompany method");	
	}
	

	@Test(priority=3, dependsOnMethods= {"login",})
	public void addContact()
	{
		System.out.println("This is addcontct method");	
	}
}
