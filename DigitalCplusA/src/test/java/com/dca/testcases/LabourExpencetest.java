package com.dca.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.LabourExpencepPage;
import com.dca.pages.LoginPage;
import com.dca.pages.PropertyActionsPage;
import com.dca.utility.Log;

public class LabourExpencetest extends BaseClass {
	PropertyActionsPage projectpage;
	LabourExpencepPage lep;
	ActionDriver ac=new ActionDriver();
	@Test(dataProvider = "LabourExpences", dataProviderClass = DataProviders.class)
	public void labour_expence(String selpro,String expencetype2,String date2,String stafftype2,String staff2,
			String noumberhr,String remak,String amount12 ) throws InterruptedException {
		Log.startTestCase("labour expence");
		LoginPage lp=new LoginPage();
		projectpage=lp.login();
		WebElement selectproject=	getDriver().findElement(By.xpath("//select[@id='ProjectID']"));
		ac.selByIndex(selectproject, 1);
		Thread.sleep(5000);
		lep=projectpage.labourexpence();
		lep.labourexpence(selpro, expencetype2, date2, stafftype2, staff2, noumberhr, remak, amount12);
		Log.endTestCase("labour expence ");
		
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
