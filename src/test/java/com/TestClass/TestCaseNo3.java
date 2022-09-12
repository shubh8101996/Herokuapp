package com.TestClass;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.PageClass.CheckboxClass;
import com.PageClass.HomePageClass;

public class TestCaseNo3 extends BaseClass{

	@Test 
	public void check() {
		HomePageClass H = new HomePageClass(driver);
        H.ElementClick(H.checkbox);		
		CheckboxClass C = new CheckboxClass(driver);
		C.checkboxoperation();
		
	}
	
	
	
}
