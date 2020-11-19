package com.dca.testcases;

import org.testng.annotations.Test;

import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.LoginPage;
import com.dca.pages.ProjectPage;
import com.dca.pages.ProjectTimelinePages;

public class ProjectTimelineTest extends BaseClass {
	ProjectPage projectpage;
	ProjectTimelinePages projecttimelinepages;
	@Test(dataProvider = "Projecttimeline", dataProviderClass = DataProviders.class)
	public void protimeline(String selstage,String procheck,String selsdate,String seledate,String coff,String comm,String  ucareoff ) throws InterruptedException {
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
		projecttimelinepages=	projectpage.droptimeline();
		projecttimelinepages.projecttimeline(selstage, procheck, selsdate,coff, seledate, comm, ucareoff);
	}

}
