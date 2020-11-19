package com.dca.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.ClientContactPage;
import com.dca.pages.LoginPage;
import com.dca.pages.ProjectPage;

public class ClientContactTest extends BaseClass {
	ProjectPage projectpage;
	ClientContactPage clientcontactpage;
	@Test(dataProvider = "ClientContacts", dataProviderClass = DataProviders.class)
	public void client_contact(String selproject1,String firstname1,String lastname1,String title1,
			String email1,String phone1,String description1,String text11,String writemail1  ) throws InterruptedException {
		LoginPage lp=new LoginPage();
		projectpage=lp.login();
		clientcontactpage=	projectpage.clientcontact();
				clientcontactpage.clientcontact(selproject1, firstname1, lastname1, title1, 
						email1, phone1, description1, text11, writemail1);;
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
