package com.jktech.TestCases;


import org.testng.annotations.Test;

import com.jktech.BaseClass.BaseClass;
import com.jktech.pages.LoginPage;

public class LoginTest extends BaseClass{
	
	LoginPage login;
	

	@Test(priority=0)
	public void validLoginTest() throws Exception {
		login = new LoginPage(driver);
		login.setUserName("standard_user");
		login.setPassword("secret_sauce");
		login.clickLogin();
		captureScreenShot(driver, "validLoginTest");
	}
	
	
	//@Test(priority=1)
	public void invalidLoginTest() {
		login = new LoginPage(driver);
		login.setUserName("locked_out_user");
		login.setPassword("secret_sauce");
		login.clickLogin();
		
		
	}

}
