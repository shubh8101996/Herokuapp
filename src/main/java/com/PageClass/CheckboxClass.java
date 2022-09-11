package com.PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxClass {
static WebDriver driver;
	@FindBy (xpath = "//input[@type = \"checkbox\"][1]" )
	private WebElement checkbox1;
	
	@FindBy (xpath = "//input[@type = \"checkbox\"][2]" )
	private WebElement checkbox2;
	
	
	public CheckboxClass(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public void checkboxoperation() {
		checkbox1.click();
		
	}
	
	
}