package com.TestClass;

import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.PageClass.Dropdown_Page;
import com.PageClass.HomePageClass;

public class TestCaseNo2 extends BaseClass {
	
	@Test
	public void dropdown() {
		
		HomePageClass dp=new HomePageClass(driver);
        dp.ElementClick(dp.Dropdown);		
		Dropdown_Page dp1=new Dropdown_Page(driver);
		dp1.Drop_Down();
		
	}
	
	

}
