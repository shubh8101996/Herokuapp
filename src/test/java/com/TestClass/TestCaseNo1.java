package com.TestClass;

import org.testng.annotations.Test;
import com.BaseClass.BaseClass;
import com.PageClass.HomePageClass;

public class TestCaseNo1 extends BaseClass {
	
	
	
	@Test
	public void BasicAuth() {
		
		HomePageClass h=new HomePageClass(driver);
         h.ElementClick(h.BasicAuth);		
		
	}
	

}
