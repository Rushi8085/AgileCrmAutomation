package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1
{
  
     @BeforeTest
	public void beforeTest()
	{
		System.out.print("This is beforetest method");
	}
     
     
     @BeforeClass
     public void beforeclass()
     {
    	 System.out.print("This is beforetest method"); 
     }
     
     @BeforeMethod
    	 public void beforeMethod()
    	 {
    	 System.out.print("This is beforetest method"); 
    	 }
   
     
     @Test
     public void Test1() 
     {
   	  System.out.print("Test Method 1");
     }
     
     @AfterMethod
     public void afterMethod()
     {
    	 System.out.print("This is aftermethod"); 
     }
     
     
     @AfterClass
     public void afterclass()
     {
    	 System.out.print("This is afterclass method"); 
     }
     
     @AfterTest
 	public void afterTest()
 	{
 		System.out.print("This is aftertest method");
 	}
     
}
     
     
     
    	
     