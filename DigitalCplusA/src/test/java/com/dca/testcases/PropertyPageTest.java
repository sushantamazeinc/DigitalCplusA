package com.dca.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.LoginPage;
import com.dca.pages.PropertyActionsPage;
import com.dca.pages.PropertPage;
import com.dca.utility.Log;


public class PropertyPageTest extends BaseClass{
	PropertyActionsPage projectpage;
	PropertPage propage;
	PropertPage propertypage;
	ActionDriver ac=new ActionDriver();
	@Test(dataProvider = "Project", dataProviderClass = DataProviders.class)
	public void propertyreg(String proname1,String proadd1,String phone1,String conname1,String conphone1,String mail1,String nofloor1,String noofunit1,String unitfloor1,String buildarea1,String budgethr1) throws InterruptedException, IOException, AWTException {
		Log.startTestCase("property");
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
	    WebElement selectproject=	getDriver().findElement(By.xpath("//select[@id='ProjectID']"));
		ac.selByVisibleText(selectproject, proname1);
		Thread.sleep(5000);
		propage=	projectpage.droppropertypage();
		//propertypage=	projectpage.add();
		propage.details(proname1, proadd1, phone1, conname1, conphone1, mail1, nofloor1, noofunit1, unitfloor1, buildarea1,budgethr1);
		//propertypage.details(proname1, proadd1, phone1, conname1, conphone1, mail1, nofloor1, noofunit1, unitfloor1, buildarea1,budgethr1);
		Log.endTestCase("property ");
		
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
