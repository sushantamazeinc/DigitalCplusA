package com.dca.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.Communication_meetingpage;
import com.dca.pages.LoginPage;
import com.dca.pages.PropertyActionsPage;
import com.dca.utility.Log;

public class Communication_meetingtest extends BaseClass {
	PropertyActionsPage projectpage;
	Communication_meetingpage cm;
	@Test(dataProvider = "Communicationmeet", dataProviderClass = DataProviders.class)
	public void comm_meeting(String selproject1,String meettype,String link,
			String pswd,String meetcate,String meetdate,
			String clientattend,String meettime,String meetname,String meetloc,String selmeettype ) throws InterruptedException {
		Log.startTestCase("meeting");
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
		cm=projectpage.communication_meeting();
		cm.comm_meeting(selproject1, meettype, link, pswd, meetcate, meetdate, 
				clientattend, meettime, meetname, meetloc, selmeettype);
		Log.endTestCase("meeting");
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
