package com.dca.testcases;

import org.testng.annotations.Test;

import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.LoginPage;
import com.dca.pages.ProjectEmailsPage;
import com.dca.pages.ProjectPage;

public class ProjectEmailsTest extends BaseClass {
	ProjectPage projectpage;
	ProjectEmailsPage projectemailspage;
	@Test(dataProvider = "ProjectEmails", dataProviderClass = DataProviders.class)
	public void emailTest(String selpro,String recipiet,String sub,String date1 ) throws InterruptedException {
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
		projectemailspage=	projectpage.project_emails();
		projectemailspage.projectemail(selpro, recipiet, sub, date1);
	}

}
