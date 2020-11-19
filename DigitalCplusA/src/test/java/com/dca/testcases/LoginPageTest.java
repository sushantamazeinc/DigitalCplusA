package com.dca.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dca.base.BaseClass;
import com.dca.pages.LoginPage;

public class LoginPageTest extends BaseClass {
	
	
	@Test()
	public void loginTest() {
		LoginPage loginpage=new LoginPage();
		loginpage.login();
	}
	@BeforeMethod()
	public void setup() {
		launchApp(); 
	}

	@AfterMethod()
	public void tearDown() {
		//getDriver().quit();
	}
	

}
