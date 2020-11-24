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
import com.dca.pages.ProjectActivitiesPage;
import com.dca.pages.PropertyActionsPage;
import com.dca.utility.Log;

public class ProjectActivitiesTest extends BaseClass {
	PropertyActionsPage projectpage;
	ProjectActivitiesPage projectactivity;
	ActionDriver ac=new ActionDriver();
	@Test(dataProvider = "ProjectActivities", dataProviderClass = DataProviders.class)
	public void projectactivitytest(String selproject1,String stages,String stafftypes,String staffs,String sdate,String edate,String des,String eddate) throws InterruptedException {
		Log.startTestCase("projectactivity");
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
		WebElement selectproject=	getDriver().findElement(By.xpath("//select[@id='ProjectID']"));
		ac.selByVisibleText(selectproject, selproject1);
		Thread.sleep(5000);
		projectactivity=projectpage.dropproactivities();
		projectactivity.projectTeam1(selproject1,stages, stafftypes, staffs, sdate, edate, des, eddate);
		Log.endTestCase("projectactivity");
		
		
		
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
