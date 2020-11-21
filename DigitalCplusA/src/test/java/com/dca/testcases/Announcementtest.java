package com.dca.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.AnnouncementPage;
import com.dca.pages.LoginPage;
import com.dca.pages.PropertyActionsPage;
import com.dca.utility.Log;

public class Announcementtest extends BaseClass {
	PropertyActionsPage projectpage;
	AnnouncementPage announcementpage;
	@Test(dataProvider = "Announcements", dataProviderClass = DataProviders.class)
	
	public void announcements(String announcements,String descriptions,String dates,String times,String details,String venus,String edate  ) throws InterruptedException {
		Log.startTestCase("Announcement");
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
		announcementpage=projectpage.dropannouncement();
		announcementpage.announcement(announcements, descriptions, dates, times, details, venus,edate);
		Log.endTestCase("Announcement");
		
		
		
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
