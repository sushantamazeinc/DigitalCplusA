package com.dca.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.pages.LoginPage;
import com.dca.pages.PropertyActionsPage;
import com.dca.utility.Log;

public class PropertyactionsTest extends BaseClass{
	PropertyActionsPage projectpage;
	ActionDriver ac=new ActionDriver();
	@Test()
	public void propertyActions() throws InterruptedException, IOException {
		Log.startTestCase("propertyactions");
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
		WebElement selectproject=	getDriver().findElement(By.xpath("//select[@id='ProjectID']"));
		ac.selByIndex(selectproject, 1);
		projectpage.paction();
		Log.endTestCase("propertyactions");
	}
	@BeforeMethod()
	public void setup() {
	launchApp();
	}

	@AfterMethod()
	public void tearDown() {
	getDriver().quit();
	
	
	}
	
	
	

}
