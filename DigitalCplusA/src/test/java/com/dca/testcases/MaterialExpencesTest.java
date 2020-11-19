package com.dca.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.LoginPage;
import com.dca.pages.MaterialExpencesPage;
import com.dca.pages.ProjectPage;

public class MaterialExpencesTest extends BaseClass{
	ProjectPage projectpage;
	MaterialExpencesPage materialexpensespage;
	
	@Test(dataProvider = "Expences", dataProviderClass = DataProviders.class)
	public void material_expences(String selpro,String expencetype1,String date1,String cat,String subcat
			,String quant,String amoun) throws InterruptedException {
		LoginPage login=new LoginPage();
		projectpage=login.login();
		materialexpensespage=projectpage.materialexpence();
		materialexpensespage.materialexpen(selpro, expencetype1, date1, cat,
				subcat, quant, amoun);
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
