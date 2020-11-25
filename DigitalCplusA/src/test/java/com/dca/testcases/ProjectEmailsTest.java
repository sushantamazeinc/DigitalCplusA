package com.dca.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.LoginPage;
import com.dca.pages.ProjectEmailsPage;
import com.dca.pages.PropertyActionsPage;
import com.dca.utility.Log;

public class ProjectEmailsTest extends BaseClass {
	PropertyActionsPage projectpage;
	ProjectEmailsPage projectemailspage;
	ActionDriver ac=new ActionDriver();
	@Test(dataProvider = "ProjectEmails", dataProviderClass = DataProviders.class)
	public void emailTest(String selpro,String recipiet,String sub,String date1 ) throws InterruptedException, IOException {
		Log.startTestCase("project emails");
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
		WebElement selectproject=	getDriver().findElement(By.xpath("//select[@id='ProjectID']"));
		ac.selByVisibleText(selectproject, selpro);
		Thread.sleep(5000);
		projectemailspage=	projectpage.project_emails();
		projectemailspage.projectemail(selpro, recipiet, sub, date1);
		Log.endTestCase("project emails");
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
