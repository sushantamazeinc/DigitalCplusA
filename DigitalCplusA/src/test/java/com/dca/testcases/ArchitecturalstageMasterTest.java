package com.dca.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.ArchitecturalstagemasterPage;
import com.dca.pages.LoginPage;
import com.dca.pages.PropertyActionsPage;
import com.dca.utility.Log;

public class ArchitecturalstageMasterTest extends BaseClass {
	PropertyActionsPage projectpage;
	ArchitecturalstagemasterPage architectstagemasterpage;
	@Test(dataProvider = "Architecturalstagemaster", dataProviderClass = DataProviders.class)
	
	public void stagemaster(String selproject1,String stage,String descriptions) throws InterruptedException {
		Log.startTestCase("stagemaster");
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();	
		Log.info("login is successful");
		architectstagemasterpage=projectpage.droparchitecturalstagemaster();
		architectstagemasterpage.architecturalmaster(selproject1,stage, descriptions);
		Log.endTestCase("stagemaster ");
		
	}
	@BeforeMethod()
	public void setup() {
	launchApp();
	}

	@AfterMethod()
	public void tearDown() {
	//getDriver().quit();
	}

}
