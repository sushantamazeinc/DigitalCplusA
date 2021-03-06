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
import com.dca.pages.ProjectTeam;

public class ProjectTeamTest extends BaseClass {
	PropertyActionsPage projectpage;
	ProjectTeam projectteam;
	ActionDriver ac=new ActionDriver();
	@Test(dataProvider = "ProjectTeam", dataProviderClass = DataProviders.class)
	public void projectteamtest(String selproject1, String type1,String stafftype1,String staff1,String des,String msg,String email,String staff2,String chat1 ) throws InterruptedException {
		Log.startTestCase("projectteam");
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
		Thread.sleep(5000);
		WebElement selectproject=	getDriver().findElement(By.xpath("//select[@id='ProjectID']"));
		ac.selByVisibleText(selectproject, selproject1);
		Thread.sleep(5000);
		projectteam=projectpage.dropproteam();
		projectteam.projectTeam(selproject1,type1, stafftype1, staff1, des,msg,email,staff2,chat1);
		Log.endTestCase("projectteam ");
		
		
		
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
