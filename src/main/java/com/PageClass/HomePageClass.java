package com.PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageClass {
	
	static WebDriver driver;
	
	@FindBy (xpath="//a[text()='Basic Auth']")
	private WebElement BasicAuth;
	
	
	public HomePageClass(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void Click() {
		
		BasicAuth.click();
	}
	
	
	
	
	
	

}
