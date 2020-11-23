package com.dca.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;

import com.dca.pages.LoginPage;
import com.dca.pages.MyTaskPage;
import com.dca.pages.PropertyActionsPage;

public class MyTaskTest extends BaseClass {
	PropertyActionsPage projectpage;
	MyTaskPage mytaskpage;
	
	@Test(dataProvider = "MyVisit", dataProviderClass = DataProviders.class)
	public void mytasktest(String selproject1, String sdate,String edate,String task,String des,String eddate ) throws InterruptedException {
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
		mytaskpage=projectpage.dropmytasks();
		mytaskpage.myTask(selproject1,sdate, edate, task, des, eddate);
		
		
		
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
