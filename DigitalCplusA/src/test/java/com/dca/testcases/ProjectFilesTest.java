package com.dca.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.LoginPage;
import com.dca.pages.ProjectFilesPages;
import com.dca.pages.PropertyActionsPage;

public class ProjectFilesTest extends BaseClass {
	PropertyActionsPage projectpage;
	ProjectFilesPages projectfilespages;
	@Test(dataProvider = "Projectfile", dataProviderClass = DataProviders.class)
	public void projectFTest(String foldname1,String planname1,String description11,String version11,String updatedver1) throws InterruptedException {
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
		projectfilespages=projectpage.droprojectfile();
		projectfilespages.projectfile(foldname1, planname1, description11, version11, updatedver1);
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
