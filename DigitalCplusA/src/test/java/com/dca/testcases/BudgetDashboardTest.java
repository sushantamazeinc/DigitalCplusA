package com.dca.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.BudgetDashboard;
import com.dca.pages.LoginPage;
import com.dca.pages.PropertyActionsPage;
import com.dca.utility.Log;

public class BudgetDashboardTest extends BaseClass {
	PropertyActionsPage projectpage;
	BudgetDashboard budgetdashboard;
	@Test(dataProvider = "BudgetDashboard", dataProviderClass = DataProviders.class)
	public void budgetDTest(String stage1,String hour,String des,String edithrs1) throws InterruptedException {
		Log.startTestCase("budgetdashboard");
		
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
		Log.info("login is successful");
		budgetdashboard=projectpage.dropbupage();
		budgetdashboard.budgetDashboard(stage1, hour, des, edithrs1);
		Log.endTestCase("budget db ");
		
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
