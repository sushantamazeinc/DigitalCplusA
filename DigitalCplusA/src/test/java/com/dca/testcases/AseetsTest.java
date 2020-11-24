package com.dca.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.dataprovider.DataProviders;
import com.dca.pages.AssetsPage;
import com.dca.pages.LoginPage;
import com.dca.pages.PropertyActionsPage;
import com.dca.utility.Log;

public class AseetsTest extends BaseClass {
	PropertyActionsPage projectpage;
	AssetsPage assetspage;
	ActionDriver ac=new ActionDriver();
	@Test(dataProvider = "Assets", dataProviderClass = DataProviders.class)
	public void assets(String selproject1,String assets,String type,String floors,String parentassets,String modelnames,
			String serialnos,String purchasedates,String vname,String vendorcontactnames,String vendorphnos,String vendoremails,
			String warrantyfors,String warrantytills,String firstservicedues,String nextservicedues,String barcodes,
			String assetscosts,String depriciations,String remindins,String exisitingvendornames,
			String vendor) throws Exception {
		Log.startTestCase("Assets");
		LoginPage loginpage=new LoginPage();
		projectpage=loginpage.login();
		WebElement selectproject=	getDriver().findElement(By.xpath("//select[@id='ProjectID']"));
		ac.selByVisibleText(selectproject, selproject1);
		Thread.sleep(5000);
		assetspage=projectpage.dropasset();
		assetspage.assets(selproject1,assets, type, floors, parentassets, modelnames, serialnos, purchasedates,vname, vendorcontactnames, vendorphnos, vendoremails, warrantyfors, warrantytills, firstservicedues, nextservicedues, barcodes, assetscosts, depriciations, remindins, exisitingvendornames, vendor);
		Log.endTestCase("Assets");
		
		
		
		
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
