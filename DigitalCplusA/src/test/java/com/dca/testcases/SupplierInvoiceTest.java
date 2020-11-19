package com.dca.testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.LoginPage;
import com.dca.pages.ProjectPage;
import com.dca.pages.SupplierInvoice;

public class SupplierInvoiceTest extends BaseClass {
	ProjectPage projectpage;
	SupplierInvoice sip;
	@Test(dataProvider = "SupplierInvoice", dataProviderClass = DataProviders.class)
	public void supplier_invoice_test(String selproject1, String date1, String invoiceno1,String warrentydate1,
			String mfname1, String partno1, String actualquanity1, String mrp1,String  discount1,
			String comments1, String selpaymenttype1,  String comment1, String returnquanity1, String remarks1,String  address11,String floor1, String location1,
			String currentquanity1, String minimumquantity, String expirydate12,String assignedto1,String  description1,
			String selcat, String selty, String staff1) throws InterruptedException, AWTException {
		LoginPage login=new LoginPage();
		projectpage=login.login();
		sip=projectpage.supplierinvo();
		sip.supplierinvoice(selproject1, date1, invoiceno1, warrentydate1,
				mfname1, partno1, actualquanity1, mrp1, discount1, comments1, selpaymenttype1
				, comment1, returnquanity1, remarks1, address11, floor1, location1,
				currentquanity1, minimumquantity, expirydate12, assignedto1, description1,
				selcat, selty, staff1);
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
