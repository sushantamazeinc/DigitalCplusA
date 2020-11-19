package com.dca.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.LabourExpencepPage;
import com.dca.pages.LoginPage;
import com.dca.pages.ProjectPage;

public class LabourExpencetest extends BaseClass {
	ProjectPage projectpage;
	LabourExpencepPage lep;
	@Test(dataProvider = "LabourExpences", dataProviderClass = DataProviders.class)
	public void labour_expence(String selpro,String expencetype2,String date2,String stafftype2,String staff2,
			String noumberhr,String remak,String amount12 ) {
		LoginPage lp=new LoginPage();
		projectpage=lp.login();
		lep=projectpage.labourexpence();
		lep.labourexpence(selpro, expencetype2, date2, stafftype2, staff2, noumberhr, remak, amount12);
		
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
