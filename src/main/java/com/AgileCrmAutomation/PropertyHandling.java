package com.AgileCrmAutomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyHandling  
{
	 Properties properties;
	public PropertyHandling()
	{
		String configFilePath =System.getProperty("user.dir")+"//config.properties";
		
		try {
			FileInputStream input = new FileInputStream(configFilePath);
			
			Properties properties = new Properties();
			
			properties.load(input);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public String getValue(String key)
	{
		return properties.getProperty(key);
	}

}
