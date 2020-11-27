package com.dca.testcases;

import java.awt.AWTException;
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
import com.dca.pages.ProjectFilesPages;
import com.dca.pages.PropertyActionsPage;

public class ProjectFilesTest extends BaseClass {
	PropertyActionsPage projectpage;
	ProjectFilesPages projectfilespages;
	ActionDriver ac=new ActionDriver();
	@Test(dataProvider = "Projectfile", dataProviderClass = DataProviders.class)
	public void projectFTest(String selproject1,String foldname1,String planname1,String description11,String version11,String updatedver1) throws InterruptedException, IOException, AWTException {
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
		WebElement selectproject=	getDriver().findElement(By.xpath("//select[@id='ProjectID']"));
		ac.selByVisibleText(selectproject, selproject1);
		Thread.sleep(5000);
		projectfilespages=projectpage.droprojectfile();
		projectfilespages.projectfile(selproject1,foldname1, planname1, description11, version11, updatedver1);
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
