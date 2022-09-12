package com.Utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReport implements ITestListener {
	
	
	ExtentSparkReporter  htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	ReadConfig read;
	
	
	public void configureReport() {
		
		String timestamp = new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
		String reportName = "Herokuapp Project-" + timestamp + ".html";
		htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "//Reports//" + reportName);
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		read=new ReadConfig();
		reports.setSystemInfo("Machine:", "testpc1");
		reports.setSystemInfo("OS", "windows 10");
		reports.setSystemInfo("browser:", read.getBrowser());
		reports.setSystemInfo("user name:", "All The Tester");
		
		//configuration to change look and feel of report
		htmlReporter.config().setDocumentTitle("HerokuApp Project Reports");
		htmlReporter.config().setReportName("Report");
		htmlReporter.config().setTheme(Theme.DARK);
	}


	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Name of test method started:" + result.getName() );  		
	
	}


	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Name of test method sucessfully executed:" + result.getName() );  		
		test = reports.createTest(result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("Name of the passed test case is: " + result.getName() ,ExtentColor.GREEN));
	}


	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Name of test method failed:" + result.getName() );  		
		test = reports.createTest(result.getName());//create entry in html report
		test.log(Status.FAIL, MarkupHelper.createLabel("Name of the failed test case is: " + result.getName() ,ExtentColor.RED));
	
	String screenShotPath = System.getProperty("user.dir") + "\\ScreenShots\\" + result.getName() + ".png";
	
	File screenShotFile = new File(screenShotPath);
	
	if(screenShotFile.exists())
	{
		test.fail("Captured Screenshot is below:" + test.addScreenCaptureFromPath(screenShotPath));
		
	}		
	}		
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Name of test method skipped:" + result.getName() );  		

		test = reports.createTest(result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("Name of the skip test case is: " + result.getName() ,ExtentColor.YELLOW));
		
	}


	@Override
	public void onStart(ITestContext context) {
		
		configureReport();
		System.out.println("On Start method invoked....");  
	}


	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("On Finished method invoked....");  	
		reports.flush();//it is mandatory to call flush method to ensure information is written to the started reporter.
		
	}
	
	

}
