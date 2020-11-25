package com.dca.testcases;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.LoginPage;
import com.dca.pages.PropertyActionsPage;
import com.dca.pages.StaffLeavePage;
import com.dca.utility.Log;

public class StaffLeaveTest extends BaseClass{
	PropertyActionsPage projectpage;
	StaffLeavePage staffleavepage;
	ActionDriver ac=new ActionDriver();
	@Test(dataProvider = "StaffLeave", dataProviderClass = DataProviders.class)
	public void staff_leave(String selproject1,String staffname1,String leavetype1,String sdate1,String edate1,
			String coveringstaff,String reason1,String status,String resonforcancel1 ) throws InterruptedException, AWTException {
		Log.startTestCase("staffleaves");
		LoginPage lp=new LoginPage();
		projectpage=	lp.login();
		WebElement selectproject=	getDriver().findElement(By.xpath("//select[@id='ProjectID']"));
		ac.selByVisibleText(selectproject, selproject1);
		Thread.sleep(5000);
		staffleavepage=	projectpage.staffleave();
		staffleavepage.staffleave(selproject1, staffname1, leavetype1,
				sdate1, edate1, coveringstaff, reason1, status,resonforcancel1);
		Log.endTestCase("staffleaves");
		
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
