package com.dca.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.BudgetDashboard;
import com.dca.pages.LoginPage;
import com.dca.pages.PropertyActionsPage;
import com.dca.utility.Log;

public class BudgetDashboardTest extends BaseClass {
	PropertyActionsPage projectpage;
	BudgetDashboard budgetdashboard;
	ActionDriver ac=new ActionDriver();
	@Test(dataProvider = "BudgetDashboard", dataProviderClass = DataProviders.class)
	public void budgetDTest(String selproject1,String stage1,String hour,String des,String edithrs1) throws InterruptedException {
		Log.startTestCase("budgetdashboard");
		
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
		Log.info("login is successful");
		WebElement selectproject=	getDriver().findElement(By.xpath("//select[@id='ProjectID']"));
		ac.selByVisibleText(selectproject, selproject1);
		Thread.sleep(5000);
		budgetdashboard=projectpage.dropbupage();
		budgetdashboard.budgetDashboard1(selproject1,stage1, hour, des, edithrs1);
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
