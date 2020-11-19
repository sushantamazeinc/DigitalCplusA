package com.dca.testcases;

import org.testng.annotations.Test;

import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.FieldManagementToolPage;
import com.dca.pages.LoginPage;
import com.dca.pages.ProjectPage;

public class FieldManagementToolTest extends BaseClass {
	ProjectPage projectpage;
	FieldManagementToolPage fmtp;
	@Test(dataProvider = "FieldManagementTool", dataProviderClass = DataProviders.class)
	public void fieldmanagetool(String selproject1,String floor1,String punchlist1,String staff1,String sdate,
			String edate,String punchlista,String fieldn,String stat,String upstat) throws InterruptedException {
		LoginPage loginpage=new LoginPage();
		projectpage=	loginpage.login();
		fmtp=projectpage.dropfieldmanagementtool();
		fmtp.fieldmanage(selproject1, floor1, punchlist1, staff1, sdate, edate,
				punchlista, fieldn, stat, upstat);
	}

}
