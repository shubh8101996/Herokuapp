package com.PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Page {
	
	
	static WebDriver driver;
	

	@FindBy(id="dropdown")
	public WebElement DropDown_Handle;
	
	
	
	public Dropdown_Page(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
 public void Drop_Down() {
	 
	 DropDown_Handle.click();
	 Select s=new Select(DropDown_Handle);
	 s.selectByValue("2");
	 
 }
 
 
	
	
	
	
		
}
