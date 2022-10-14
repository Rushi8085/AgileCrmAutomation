package com.AgileCrmAutomation;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.AgileCrmAutomation.BaseClass;

public class LinkVarification extends BaseClass
{
	@Test()
	
	public static void ConsolLink()
	{
		launchBrowser("chrome");
		driver.navigate().to("https://www.amazon.in/");
		List<WebElement> element = driver.findElements(By.tagName("a"));
		for( WebElement e : element)
		{
			String link = e.getAttribute("href");
			if (link!=null && link.startsWith("httf"))
{
	URL url;
	try { url= new URL(link);
	URLConnection urlConnection = url.openConnection();
	HttpsURLConnection connection = (HttpsURLConnection) urlConnection;
	connection.connect();
	int statusCode = connection.getResponseCode();
	if(statusCode!=200) 
	{
		System.out.print(statusCode+" url :" +link);
	}
	connection.disconnect();
	}
	catch (IOException e2)
	{
		e2.printStackTrace();
		
	}		
	}
		
    }
					
	}
		
	}


