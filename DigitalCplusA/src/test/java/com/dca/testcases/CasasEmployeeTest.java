package com.dca.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.CasasEmployeePage;
import com.dca.pages.LoginPage;
import com.dca.pages.PropertyActionsPage;
import com.dca.utility.Log;

public class CasasEmployeeTest extends BaseClass {
	PropertyActionsPage projectpage;
	CasasEmployeePage casasEmployeePage;
	ActionDriver ac=new ActionDriver();
	@Test(dataProvider = "CasasEmployee", dataProviderClass = DataProviders.class)
	public void casasemployee(String selproject1,String name1,String phoneno1,String email1,String selstafftype11,
			String address1,String selsupervisor1,String joiningdate1,String leavesperyear1,String workingtimings1,
			String dob1,String tinno1,String employeestatus1,String location1,String emergencycontact,String ratehr1,String basicsalary1,
			String allowance1) throws Exception {
		Log.startTestCase("casasemployees");
		LoginPage lp=new LoginPage();
		projectpage=	lp.login();
		WebElement selectproject=	getDriver().findElement(By.xpath("//select[@id='ProjectID']"));
		ac.selByVisibleText(selectproject, selproject1);
		Thread.sleep(3000);
		casasEmployeePage=	projectpage.casasemployee();
		casasEmployeePage.casasemployee(selproject1, name1, phoneno1, email1, selstafftype11,
				address1, selsupervisor1, joiningdate1, leavesperyear1, workingtimings1, dob1, 
				tinno1, employeestatus1, location1, emergencycontact, ratehr1, basicsalary1, 
				allowance1);
		Log.endTestCase("casasemployees");
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
