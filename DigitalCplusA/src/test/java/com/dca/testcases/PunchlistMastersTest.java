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
import com.dca.pages.PunchlistMastersPage;
import com.dca.utility.Log;

public class PunchlistMastersTest extends BaseClass {
	
	PropertyActionsPage projectpage;
	PunchlistMastersPage punchlistmasterpage;
	ActionDriver ac=new ActionDriver();
	@Test(dataProvider = "Punchlistmaster", dataProviderClass = DataProviders.class)
	public void punchlistmaster(String selproject1,String names,String locations,String descriptions,String reviewtypes,String ename ) throws InterruptedException {
		Log.startTestCase("punchlistmaster");
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
		WebElement selectproject=	getDriver().findElement(By.xpath("//select[@id='ProjectID']"));
		ac.selByVisibleText(selectproject, selproject1);
		Thread.sleep(5000);
		punchlistmasterpage=projectpage.droppunchlistmastert();
		punchlistmasterpage.punchlistmaster(selproject1,names, locations, descriptions, reviewtypes,ename);
		
		Log.endTestCase("punchlistmaster");
		
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
