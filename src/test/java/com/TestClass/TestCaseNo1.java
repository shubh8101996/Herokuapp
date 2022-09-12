package com.TestClass;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.BaseClass.BaseClass;
import com.PageClass.HomePageClass;
import com.Utility.ExtendReport;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

@Listeners(ExtendReport.class)
public class TestCaseNo1 extends BaseClass {
	
	@Test
	public void BasicAuth() {
		
		HomePageClass h=new HomePageClass(driver);
         h.ElementClick(h.BasicAuth);
	}
	

}
