package com.dca.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.LabourPage;
import com.dca.pages.LoginPage;
import com.dca.pages.ProjectPage;

public class LabourTest extends BaseClass {
	ProjectPage projectpage;
	LabourPage labourpage;
	@Test(dataProvider = "Labour", dataProviderClass = DataProviders.class)
	public void labour_test(String selproject1,String selstafftype1,String selectstaff1 ) throws InterruptedException {
		LoginPage loginpage=new LoginPage();
		projectpage=	loginpage.login();
		labourpage=projectpage.labour();
		labourpage.labour(selproject1, selstafftype1, selectstaff1);
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
