package com.dca.testcases;

import org.testng.annotations.Test;

import com.dca.base.BaseClass;
import com.dca.pages.LoginPage;
import com.dca.pages.ProjectPage;

public class ProjectPageAction extends BaseClass{
	ProjectPage projectpage;
	@Test
	public void propageAction() throws InterruptedException {
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
		projectpage.paction();
		
	}

}
