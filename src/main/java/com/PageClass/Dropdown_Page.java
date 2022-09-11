package com.PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dropdown_Page {
	
	
	static WebDriver driver;
	
	@FindBy (xpath = "//a[text()='Dropdown']")
     private WebElement Dropdown;
	
	
	
	public Dropdown_Page(WebDriver driver ){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void click() {
		
		Dropdown.click();
	}
	
}
