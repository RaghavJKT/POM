package com.jktech.TestCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePageTest {
	
	SoftAssert myassert;
	
	@Test
	public void sampleTest() {
		myassert = new SoftAssert();
		myassert.assertEquals(false, true);
		myassert.assertAll();
		
		
	}

}
