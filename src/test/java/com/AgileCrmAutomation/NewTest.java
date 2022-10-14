package com.AgileCrmAutomation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest 
{
	
 @Test
  public void test1()
  {
	  System.out.println(" test 1 method");
  }
  
  @Test
  
  public void test2()
  {
	  System.out.println(" test 2 method");
  }
  
  @BeforeMethod
  
  public void beforemethod()
  {
	  System.out.println("beforemethod");
  }
  
 @AfterMethod
  
  public void Aftermethod()
  {
	  System.out.println("Aftermethod");
  }
 
 NewTest()
 {
	  System.out.println("constructor");
 }
 
 
 @BeforeTest
 
 public void beforetest()
 {
	  System.out.println("before test");
	 
 }
 
 @AfterTest
 
 public void aftertest()
 {
	  System.out.println("after test");
	 
 }
  
 }

 

