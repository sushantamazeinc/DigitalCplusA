package com.dca.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.LoginPage;
import com.dca.pages.PropertyActionsPage;
import com.dca.pages.TechsupportPage;

public class TechsupportTest extends BaseClass {
	PropertyActionsPage projectpage;
	TechsupportPage techsupportpage;
	@Test(dataProvider = "Techsupport", dataProviderClass = DataProviders.class)
	public void techsupport(String selproject1,String dates,String issues,String descriptions  ) throws InterruptedException {
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
		techsupportpage=projectpage.droptechsupport();
		
		techsupportpage.techsupport(selproject1,dates, issues, descriptions);
		
		
		
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
