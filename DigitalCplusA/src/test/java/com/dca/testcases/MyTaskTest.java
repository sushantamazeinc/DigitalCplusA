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
import com.dca.pages.MyTaskPage;
import com.dca.pages.PropertyActionsPage;

public class MyTaskTest extends BaseClass {
	PropertyActionsPage projectpage;
	MyTaskPage mytaskpage;
	ActionDriver ac=new ActionDriver();
	@Test(dataProvider = "MyVisit", dataProviderClass = DataProviders.class)
	public void mytasktest(String selproject1, String sdate,String edate,String task,String des,String eddate ) throws InterruptedException {
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
		WebElement selectproject=	getDriver().findElement(By.xpath("//select[@id='ProjectID']"));
		ac.selByVisibleText(selectproject, selproject1);
		Thread.sleep(5000);
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
