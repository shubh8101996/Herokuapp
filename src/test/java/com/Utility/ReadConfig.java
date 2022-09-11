package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;
	String path=System.getProperty("user.dir")+"\\ConfigFiles\\config.properties";

	
	public ReadConfig() {
		
		try {
		 prop=new Properties();
		FileInputStream input=new FileInputStream(path);
		prop.load(input);
		}catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		
	}

	public String getUrl() {
		
		String getUrl=prop.getProperty("url");
		
		return getUrl;
		
	}
	

}
