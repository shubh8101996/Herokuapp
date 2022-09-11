package com.TestClass;

import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.PageClass.Dropdown_Page;
import com.PageClass.HomePageClass;

public class TestCaseNo2 extends BaseClass {
	
	@Test
	public void dropdown() {
		
		HomePageClass dp=new HomePageClass(driver);
		dp.DropDown_Click();
		
	}
	
	

}
