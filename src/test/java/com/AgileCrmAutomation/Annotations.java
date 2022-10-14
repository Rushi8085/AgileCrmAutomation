package com.AgileCrmAutomation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations extends BaseClass
{
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("This is beforesuite method");
	}
	
	 @BeforeTest
     
	public void beforeTest()
	{
		System.out.println("This is beforetest method");
	}
	     
	     
	 @BeforeClass
	  public void beforeclass()
	  {
	    System.out.println("This is beforeclass method"); 
	  }
	     
	 @BeforeMethod
	  public void beforeMethod()
	  {
	    System.out.println("This is before method"); 
     }
	
	@Test
	 public void test1()
	 {
		System.out.println("This is test1 method");
	 }
	
	@Test
	
	public void test2()
	{
		System.out.println("This is test2 method");
		
	}
	
	 @AfterMethod
     public void afterMethod()
     {
    	 System.out.println("This is aftermethod"); 
     }
     
     
     @AfterClass
     public void afterclass()
     {
    	 System.out.println("This is afterclass method"); 
     }
     
     @AfterTest
 	public void afterTest()
 	{
 		System.out.println("This is aftertest method");
 	}
	
     @AfterSuite
  	public void aftersuite()
  	{
  		System.out.println("This is aftersuite method");
  	}

}
