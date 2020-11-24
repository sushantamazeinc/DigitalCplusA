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
import com.dca.pages.ActionItemPage;
import com.dca.pages.LoginPage;

import com.dca.pages.PropertyActionsPage;

public class ActionItemTest extends BaseClass {
	PropertyActionsPage projectpage;
	ActionItemPage actionitem;
	ActionDriver ac=new ActionDriver();
	@Test(dataProvider = "ActionItem", dataProviderClass = DataProviders.class)
	public void actionitem(String selproject1,String item,String task,String priorities ,String assign,String date,String des,String status1,String chat1  ) throws InterruptedException, IOException {
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
		WebElement selectproject=	getDriver().findElement(By.xpath("//select[@id='ProjectID']"));
		ac.selByVisibleText(selectproject, selproject1);
		Thread.sleep(5000);
		actionitem=projectpage.dropactionitem();
		actionitem.actionItem(selproject1,item, task, priorities, assign, date, des, status1,chat1);
		
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
