package com.PageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageClass {

	static WebDriver driver;

	@FindBy(xpath = "//a[text()='Basic Auth']")
	public WebElement BasicAuth;

	@FindBy(xpath = "//a[text()='Dropdown']")
	public WebElement Dropdown;

	@FindBy(xpath = "//a[text() =  'Checkboxes']")
	public WebElement checkbox;

	public HomePageClass(WebDriver driver) {
		this.driver=driver;

		PageFactory.initElements(driver, this);

	}

	public void ElementClick(WebElement element) {
		if (element.isDisplayed()) {
			element.click();
		} else {

			throw new RuntimeException("Element not Found");
		}
		
	}

}
