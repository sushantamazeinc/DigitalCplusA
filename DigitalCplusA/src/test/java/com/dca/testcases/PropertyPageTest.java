package com.dca.testcases;

import org.testng.annotations.Test;

import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.LoginPage;
import com.dca.pages.ProjectPage;
import com.dca.pages.PropertPage;


public class PropertyPageTest extends BaseClass{
	ProjectPage projectpage;
	PropertPage propertypage;
	@Test(dataProvider = "credentials", dataProviderClass = DataProviders.class)
	public void propertyreg(String proname1,String proadd1,String phone1,String conname1,String conphone1,String mail1,String nofloor1,String noofunit1,String unitfloor1,String buildarea1,String budgethr1) throws InterruptedException {
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
		propertypage=	projectpage.add();
		propertypage.details(proname1, proadd1, phone1, conname1, conphone1, mail1, nofloor1, noofunit1, unitfloor1, buildarea1,budgethr1);
		
		
	}
	

}
