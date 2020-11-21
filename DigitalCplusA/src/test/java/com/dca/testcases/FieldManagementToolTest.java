package com.dca.testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.FieldManagementToolPage;
import com.dca.pages.LoginPage;
import com.dca.pages.PropertyActionsPage;
import com.dca.utility.Log;

public class FieldManagementToolTest extends BaseClass {
	PropertyActionsPage projectpage;
	FieldManagementToolPage fmtp;
	@Test(dataProvider = "FieldManagementTool", dataProviderClass = DataProviders.class)
	public void fieldmanagetool(String selproject1,String floor1,String punchlist1,String staff1,String sdate,
			String edate,String punchlista,String fieldn,String stat,String upstat) throws InterruptedException, AWTException {
		
		LoginPage loginpage=new LoginPage();
		projectpage=	loginpage.login();
		fmtp=projectpage.dropfieldmanagementtool();
		fmtp.fieldmanage(selproject1, floor1, punchlist1, staff1, sdate, edate,
				punchlista, fieldn, stat, upstat);
		
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
