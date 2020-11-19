package com.dca.testcases;

import org.testng.annotations.Test;

import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.LoginPage;
import com.dca.pages.ProjectFilesPages;
import com.dca.pages.ProjectPage;

public class ProjectFilesTest extends BaseClass {
	ProjectPage projectpage;
	ProjectFilesPages projectfilespages;
	@Test(dataProvider = "Projectfile", dataProviderClass = DataProviders.class)
	public void projectFTest(String foldname1,String planname1,String description11,String version11,String updatedver1) throws InterruptedException {
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
		projectfilespages=projectpage.droprojectfile();
		projectfilespages.projectfile(foldname1, planname1, description11, version11, updatedver1);
	}
	

}
