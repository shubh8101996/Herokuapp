package com.BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.Utility.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	
	ReadConfig read=new ReadConfig();
	
	String mainUrl=read.getUrl();
	@Parameters({"browser"})
	@BeforeTest
	public void BrowserOpen(@Optional("chrome")String browser) {
		
      if(browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("firefox")) {
			
			
			WebDriverManager.firefoxdriver().setup();
			
			driver=new FirefoxDriver();

		} else if(browser.equalsIgnoreCase("edge")) {
			
			WebDriverManager.edgedriver().setup();
			
			driver=new EdgeDriver();
		} else {
			
			System.out.println("Browser not correct");
			
		}
      
      	driver.manage().window().maximize();
      	driver.get(mainUrl);
      	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	
	
	@AfterTest
	public void BrowserClosed() {
		
//		driver.quit();
		
		
	}

}
