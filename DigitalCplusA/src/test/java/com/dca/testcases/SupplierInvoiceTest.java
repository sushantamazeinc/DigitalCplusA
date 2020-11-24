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
import com.dca.pages.SupplierInvoice;
import com.dca.utility.Log;

public class SupplierInvoiceTest extends BaseClass {
	PropertyActionsPage projectpage;
	SupplierInvoice sip;
	ActionDriver ac=new ActionDriver();
	@Test(dataProvider = "SupplierInvoice", dataProviderClass = DataProviders.class)
	public void supplier_invoice_test(String selproject1, String date1, String invoiceno1,String warrentydate1,
			String mfname1, String partno1, String actualquanity1, String mrp1,String  discount1,
			String comments1, String selpaymenttype1,  String comment1, String returnquanity1, String remarks1,String  address11,String floor1, String location1,
			String currentquanity1, String minimumquantity, String expirydate12,String assignedto1,String  description1,
			String selcat, String selty, String staff1) throws Exception{
		Log.startTestCase("supplier invoice");
		LoginPage login=new LoginPage();
		projectpage=login.login();
		WebElement selectproject=	getDriver().findElement(By.xpath("//select[@id='ProjectID']"));
		ac.selByVisibleText(selectproject, selproject1);
		Thread.sleep(3000);
		sip=projectpage.supplierinvo();
		sip.supplierinvoice(selproject1, date1, invoiceno1, warrentydate1,
				mfname1, partno1, actualquanity1, mrp1, discount1, comments1, selpaymenttype1
				, comment1, returnquanity1, remarks1, address11, floor1, location1,
				currentquanity1, minimumquantity, expirydate12, assignedto1, description1,
				selcat, selty, staff1);
		Log.endTestCase("supplier invoice");
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
