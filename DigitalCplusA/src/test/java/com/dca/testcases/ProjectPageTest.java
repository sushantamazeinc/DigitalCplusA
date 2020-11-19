package com.dca.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.dca.base.BaseClass;
import com.dca.pages.LoginPage;
import com.dca.pages.ProjectPage;

public class ProjectPageTest extends BaseClass{
	ProjectPage projectpage;
	@Test()
	public void adnew() {
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
		projectpage.add();
		
	}
	
	

}
