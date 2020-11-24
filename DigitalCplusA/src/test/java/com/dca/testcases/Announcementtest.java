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
import com.dca.pages.AnnouncementPage;
import com.dca.pages.LoginPage;
import com.dca.pages.PropertyActionsPage;
import com.dca.utility.Log;

public class Announcementtest extends BaseClass {
	PropertyActionsPage projectpage;
	AnnouncementPage announcementpage;
	ActionDriver ac=new ActionDriver();
	@Test(dataProvider = "Announcements", dataProviderClass = DataProviders.class)
	
	public void announcements(String selproject1,String announcements,String descriptions,String dates,String times,String details,String venus,String edate  ) throws InterruptedException, IOException, AWTException {
		Log.startTestCase("Announcement");
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
		WebElement selectproject=	getDriver().findElement(By.xpath("//select[@id='ProjectID']"));
		ac.selByVisibleText(selectproject, selproject1);
		Thread.sleep(5000);
		announcementpage=projectpage.dropannouncement();
		announcementpage.announcement(selproject1,announcements, descriptions, dates, times, details, venus,edate);
		Log.endTestCase("Announcement");
		
		
		
	}
	@BeforeMethod()
	public void setup() {
	launchApp();
	}

	@AfterMethod()
	public void tearDown() {
	//getDriver().quit();
	}
	
//check

}
