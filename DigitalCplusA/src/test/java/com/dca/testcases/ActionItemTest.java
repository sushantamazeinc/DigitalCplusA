package com.dca.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.ActionItemPage;
import com.dca.pages.LoginPage;

import com.dca.pages.PropertyActionsPage;

public class ActionItemTest extends BaseClass {
	PropertyActionsPage projectpage;
	ActionItemPage actionitem;
	@Test(dataProvider = "ActionItem", dataProviderClass = DataProviders.class)
	public void actionitem(String item,String task,String priorities ,String assign,String date,String des,String status1,String chat1  ) throws InterruptedException {
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
		actionitem=projectpage.dropactionitem();
		actionitem.actionItem(item, task, priorities, assign, date, des, status1,chat1);
		
		
		
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
