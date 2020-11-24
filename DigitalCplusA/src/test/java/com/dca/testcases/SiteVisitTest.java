package com.dca.testcases;

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
import com.dca.pages.SiteVisitPage;
import com.dca.utility.Log;

public class SiteVisitTest extends BaseClass {
	PropertyActionsPage projectpage;
	SiteVisitPage sitevisit;
	ActionDriver ac=new ActionDriver();
	@Test(dataProvider = "SiteVisits", dataProviderClass = DataProviders.class)
	public void sitevisittest(String selproject1,String stages,String types,String staffs,String vdate,String des,String eddate ) throws InterruptedException {
		Log.startTestCase("sitevisit");
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
		WebElement selectproject=	getDriver().findElement(By.xpath("//select[@id='ProjectID']"));
		ac.selByVisibleText(selectproject, selproject1);
		Thread.sleep(5000);
		sitevisit=projectpage.dropsitevisits();
		sitevisit.siteVisit(selproject1, stages, types, staffs, vdate, des, eddate);
		Log.endTestCase("sitevisit");
		
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
