package com.TestClass;

import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.PageClass.CheckboxClass;
import com.PageClass.HomePageClass;

public class TestCaseNo3 extends BaseClass{

	@Test 
	public void check() {
		HomePageClass H = new HomePageClass(driver);
		H.Checkbox_click();
		
		CheckboxClass C = new CheckboxClass(driver);
		C.checkboxoperation();
		
	}
	
	
	
}
