package com.dca.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.LoginPage;
import com.dca.pages.PropertyActionsPage;

import com.dca.pages.ProjectTimelines1page;

public class ProjectTimelines1Test extends BaseClass {
	PropertyActionsPage projectpage;
	ProjectTimelines1page projecttimelinepages;
	@Test(dataProvider = "Projecttimeline", dataProviderClass = DataProviders.class)
	public void protimeline(String selproject1, String selstage, String procheck, String selsdate, String coff, String enddate
,
			String comm ) throws InterruptedException {
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
		projecttimelinepages=	projectpage.droptimeline();
		projecttimelinepages.projecttimeline(selproject1,selstage,procheck, selsdate, coff, enddate, comm);
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
