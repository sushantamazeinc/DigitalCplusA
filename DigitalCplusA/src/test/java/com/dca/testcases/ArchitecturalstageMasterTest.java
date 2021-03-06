package com.dca.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.ArchitecturalstagemasterPage;
import com.dca.pages.LoginPage;
import com.dca.pages.PropertyActionsPage;
import com.dca.utility.Log;

public class ArchitecturalstageMasterTest extends BaseClass {
	PropertyActionsPage projectpage;
	ArchitecturalstagemasterPage architectstagemasterpage;
	ActionDriver ac=new ActionDriver();
	@Test(dataProvider = "Architecturalstagemaster", dataProviderClass = DataProviders.class)
	
	public void architechstagemaster(String selproject1,String stage,String descriptions) throws InterruptedException {
		Log.startTestCase("stagemaster");
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();	
		WebElement selectproject=	getDriver().findElement(By.xpath("//select[@id='ProjectID']"));
		ac.selByVisibleText(selectproject, selproject1);
		Thread.sleep(5000);
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
