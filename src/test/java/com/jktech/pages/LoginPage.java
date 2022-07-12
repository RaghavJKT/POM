package com.jktech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		rdriver = ldriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(id="user-name")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(how=How.ID, using="login-button")
	WebElement loginButton;
	
	
	public void setUserName(String name) {
		userName.sendKeys(name);
	}
	
	public void setPassword(String PWname) {
		password.sendKeys(PWname);
	}
	
	public void clickLogin() {
		loginButton.click();
	}
	

}
