package com.dca.testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.LoginPage;
import com.dca.pages.ProjectPage;
import com.dca.pages.StaffLeavePage;

public class StaffLeaveTest extends BaseClass{
	ProjectPage projectpage;
	StaffLeavePage staffleavepage;
	@Test(dataProvider = "StaffLeave", dataProviderClass = DataProviders.class)
	public void staff_leave(String selproject1,String staffname1,String leavetype1,String sdate1,String edate1,
			String coveringstaff,String reason1,String status,String resonforcancel1 ) throws InterruptedException, AWTException {
		LoginPage lp=new LoginPage();
		projectpage=	lp.login();
		staffleavepage=	projectpage.staffleave();
		staffleavepage.staffleave(selproject1, staffname1, leavetype1,
				sdate1, edate1, coveringstaff, reason1, status,resonforcancel1);
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
