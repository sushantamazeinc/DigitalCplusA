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
import com.dca.utility.Log;
import com.dca.pages.ProjectTimelines1page;

public class ProjectTimelines1Test extends BaseClass {
	PropertyActionsPage projectpage;
	ProjectTimelines1page projecttimelinepages;
	ActionDriver ac=new ActionDriver();
	@Test(dataProvider = "Projecttimeline", dataProviderClass = DataProviders.class)
	public void protimeline(String selproject1, String selstage, String procheck, String selsdate, String coff, String enddate
,
			String comm ) throws InterruptedException {
		LoginPage loginpage=new LoginPage();
		Log.startTestCase("project timeline");
		projectpage=loginpage.login();
		WebElement selectproject=	getDriver().findElement(By.xpath("//select[@id='ProjectID']"));
		ac.selByVisibleText(selectproject, selproject1);
		Thread.sleep(5000);
		projecttimelinepages=	projectpage.droptimeline();
		projecttimelinepages.projecttimeline(selproject1,selstage,procheck, selsdate, coff, enddate, comm);
		Log.endTestCase("project timeline");
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
