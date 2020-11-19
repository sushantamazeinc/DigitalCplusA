package com.dca.testcases;

import org.testng.annotations.Test;

import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.Communication;
import com.dca.pages.LoginPage;
import com.dca.pages.ProjectPage;

public class CommunicationTest extends BaseClass {
	ProjectPage projectpage;
	Communication comm;
	@Test(dataProvider = "Communication", dataProviderClass = DataProviders.class)
	public void commtest(String project,String subject1,String from1,String to1,String datesend,String desc,String remark,String updatesub,String clientcon,String messageby) throws InterruptedException {
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
		comm=projectpage.communic();
		comm.communicate(project, subject1, from1, to1, datesend, desc, remark, updatesub, 
				clientcon, messageby);
	}

}
