package com.dca.testcases;

import org.testng.annotations.Test;

import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.LocatorRequestPage;
import com.dca.pages.LoginPage;
import com.dca.pages.ProjectPage;

public class LocatorRequestTest extends BaseClass {
	ProjectPage projectpage;
	LocatorRequestPage locatorrequestpage;
	@Test(dataProvider = "LocatorRequest", dataProviderClass = DataProviders.class)
	public void locator_test(String selproject1,String date1,String destini,String purpo,String timedept,String timeretun ) throws InterruptedException {
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
		locatorrequestpage=	projectpage.drop_LocatorRequest();
		locatorrequestpage.locatorrequest(selproject1, date1, destini, purpo, timedept, timeretun);
	}

}
