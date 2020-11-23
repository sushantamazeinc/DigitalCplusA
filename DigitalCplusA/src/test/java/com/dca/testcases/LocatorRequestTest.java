package com.dca.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.LocatorRequestPage;
import com.dca.pages.LoginPage;
import com.dca.pages.PropertyActionsPage;
import com.dca.utility.Log;

public class LocatorRequestTest extends BaseClass {
	PropertyActionsPage projectpage;
	LocatorRequestPage locatorrequestpage;
	ActionDriver ac=new ActionDriver();
	@Test(dataProvider = "LocatorRequest", dataProviderClass = DataProviders.class)
	public void locator_test(String selproject1,String date1,String destini,String purpo,String timedept,String timeretun ) throws InterruptedException {
		Log.startTestCase("LocatorRequest");
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
	WebElement selectproject=	getDriver().findElement(By.xpath("//select[@id='ProjectID']"));
	ac.selByVisibleText(selectproject, selproject1);
	Thread.sleep(5000);
		locatorrequestpage=	projectpage.drop_LocatorRequest();
		locatorrequestpage.locatorrequest(selproject1, date1, destini, purpo, timedept, timeretun);
		Log.endTestCase("LocatorRequest ");
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
