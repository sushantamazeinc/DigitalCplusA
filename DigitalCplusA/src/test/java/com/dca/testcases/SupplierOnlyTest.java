package com.dca.testcases;

import java.awt.AWTException;

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
import com.dca.pages.SupplierOnlyPage;
import com.dca.utility.Log;

public class SupplierOnlyTest extends BaseClass{
	//ProjectPage projectpage;
	//InventoryPage inventorypage;
	PropertyActionsPage projectpage;
	SupplierOnlyPage sop;
	ActionDriver ac=new ActionDriver();
	@Test(priority = 1,dataProvider = "SupplierOnly", dataProviderClass = DataProviders.class)
public void supplier_only_test(String selproject1, String name1, String email11, String phoneo1, 
		String servicearea1, String address1, 
		String website1, String contactname1, String suppliertype1, String bankname1, 
		String Accountno1, String accounttype1, 
		String bankaddress1, String btxn1, String branchname1, String paymentterms1, String creditlimit1, 
		String creditdays1, 
		String supplierservices, String suppliersupplies) throws InterruptedException, AWTException {
	Log.startTestCase("supplier");
	LoginPage login=new LoginPage();
	projectpage=login.login();
	WebElement selectproject=	getDriver().findElement(By.xpath("//select[@id='ProjectID']"));
	ac.selByVisibleText(selectproject, selproject1);
	Thread.sleep(3000);
	sop=	projectpage.supplier();
			sop.supplieronlypage(selproject1, name1, email11, phoneo1, servicearea1, address1, 
					website1, contactname1, suppliertype1, bankname1, Accountno1, accounttype1, 
					bankaddress1, btxn1, branchname1, paymentterms1, creditlimit1, creditdays1, 
					supplierservices, suppliersupplies);
	
	
}
	@Test(priority = 2,dataProvider = "Inventory", dataProviderClass = DataProviders.class)
	public void inventory(String selproject1,String category1,String subcategory1,String itemname1,
			String itemdescri1,String expirydate1,String mrp1,String selpotype1,
			String date11,String quantity1,String comments1,String serviceamount1,String financemanager1,
			String cfo1,String servicedesc1,String financedirector1,String selsupptypee) throws InterruptedException, AWTException {
		LoginPage lp=new LoginPage();
		projectpage=lp.login();
		WebElement selectproject=	getDriver().findElement(By.xpath("//select[@id='ProjectID']"));
		ac.selByVisibleText(selectproject, selproject1);
		Thread.sleep(3000);
		sop=projectpage.inventory();
		sop.inventorypage(selproject1, category1, subcategory1, itemname1, 
				itemdescri1, expirydate1, mrp1, selpotype1, date11,
				quantity1, comments1, serviceamount1, financemanager1, 
				cfo1, servicedesc1, financedirector1,selsupptypee);
		Log.endTestCase("supplier ");
		
		
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
