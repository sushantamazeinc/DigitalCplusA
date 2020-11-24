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
import com.dca.pages.Communication;
import com.dca.pages.LoginPage;
import com.dca.pages.PropertyActionsPage;
import com.dca.utility.Log;

public class CommunicationTest extends BaseClass {
	PropertyActionsPage projectpage;
	Communication comm;
	ActionDriver ac = new ActionDriver();
	@Test(dataProvider = "Communication", dataProviderClass = DataProviders.class)
	public void commtest(String project,String subject1,String from1,String to1,String datesend,String desc,String remark,String updatesub,String clientcon,String messageby) throws InterruptedException, AWTException, IOException {
		Log.startTestCase("communication");
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
		WebElement selectproject=	getDriver().findElement(By.xpath("//select[@id='ProjectID']"));
		
		ac.selByIndex(selectproject, 1);
		Thread.sleep(5000);
		comm=projectpage.communic();
		comm.communicate(project, subject1, from1, to1, datesend, desc, remark, updatesub, 
				clientcon, messageby);
		Log.endTestCase("communication ");
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
