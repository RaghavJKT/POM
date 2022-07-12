package com.jktech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver ldriver;
	
	public HomePage(WebDriver rdriver) {
		ldriver = rdriver;
	}
	
	
	By addTocart = By.id("add-to-cart-sauce-labs-backpack");
	
	

}
