package com.TestClass;

import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.PageClass.Dropdown_Page;

public class TestCaseNo2 extends BaseClass {
	
	@Test
	public void dropdown() {
		
		Dropdown_Page dp=new Dropdown_Page(driver);
		dp.click();
		
	}
	
	

}
