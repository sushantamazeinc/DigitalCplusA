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
import com.dca.pages.FieldManagementToolPage;
import com.dca.pages.LoginPage;
import com.dca.pages.PropertyActionsPage;
import com.dca.utility.Log;

public class FieldManagementToolTest extends BaseClass {
	PropertyActionsPage projectpage;
	FieldManagementToolPage fmtp;
	ActionDriver ac=new ActionDriver();
	@Test(dataProvider = "FieldManagementTool", dataProviderClass = DataProviders.class)
	public void fieldmanagetool(String selproject1,String floor1,String punchlist1,String staff1,String sdate,
			String edate,String punchlista,String fieldn,String stat,String upstat) throws InterruptedException, AWTException {
		
		LoginPage loginpage=new LoginPage();
		projectpage=	loginpage.login();
		WebElement selectproject=	getDriver().findElement(By.xpath("//select[@id='ProjectID']"));
		ac.selByVisibleText(selectproject, selproject1);
		Thread.sleep(5000);
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
	getDriver().quit();
	}

}
