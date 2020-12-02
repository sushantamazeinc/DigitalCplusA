package com.dca.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.utility.ListenerClass;

public class AssetsPage extends BaseClass{
	//error in edit page need to fix
	ActionDriver ad=new ActionDriver();
	ListenerClass lc=new ListenerClass();
	@FindBy(xpath="//select[@id='ProjectID']")
	WebElement selproject;
	@FindBy(xpath="//button[contains(text(),'Add New')]")
	WebElement addnew;
	@FindBy(xpath="//input[@id='txt_AssetName']")
	WebElement assetname;
	@FindBy(xpath="//select[@id='ddl_assetstype']")
	WebElement assettype;
	@FindBy(xpath="//select[@id='ddl_updateassetsFloor']")
	WebElement floor;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[2]/div[2]/div[1]/app-update-assets[1]/div[1]/div[3]/div[1]/form[1]/div[6]/div[3]/select[1]")
	WebElement parentasset;
	@FindBy(xpath="//input[@id='txt_ModelName']")
	WebElement modelname;
	@FindBy(xpath="//input[@id='txt_SerialNumber']")
	WebElement serialno;
	@FindBy(xpath="//input[@id='txt_PurchaseDate']")
	WebElement purchasedate;
	@FindBy(css="#txt_VendorName")
	WebElement newvendorname;
	@FindBy(xpath="//input[@name='VendorContactName']")
	WebElement vendorcontactname;
	@FindBy(xpath="//input[@id='txt_VendorPhone']")
	WebElement vendorphno;
	@FindBy(css="#txt_VendorEmail")
	WebElement vendoremail;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[2]/div[2]/div[1]/app-update-assets[1]/div[1]/div[3]/div[1]/form[1]/div[15]/div[3]/input[1]")
	WebElement warrantyfor;
	@FindBy(xpath="//input[@id='txt_usr']")
	WebElement warrantytill;
	@FindBy(xpath="//input[@id='txt_FirstServiceDue']")
	WebElement firstservicedue;
	@FindBy(xpath="//input[@id='txt_NextServiceDue']")
	WebElement nextservicedue;
	@FindBy(xpath="//input[@id='txt_Barcode']")
	WebElement barcode;
	@FindBy(xpath="//input[@id='txt_AssetCosts']")
	WebElement assetscost;
	@FindBy(xpath="//input[@id='txt_Depreciationpercentage']")
	WebElement depriciation;
	@FindBy(xpath="//select[@id='ddl_RemindIn']")
	WebElement remindin;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-update-assets[1]/div[1]/div[3]/div[1]/form[1]/div[23]/div[3]/ngx-dropzone[1]/div[1]/p[1]")
	WebElement invoiceimage;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-update-assets[1]/div[1]/div[3]/div[1]/form[1]/div[24]/div[3]/ngx-dropzone[1]/div[1]/p[1]")
	WebElement attachment;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-update-assets[1]/div[1]/div[3]/div[1]/form[1]/div[25]/div[3]/ngx-dropzone[1]/div[1]/p[1]")
	WebElement assetphoto;
	
	@FindBy(xpath="//input[@id='inlineradio02']")
	WebElement exisitingvendor;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-update-assets[1]/div[1]/div[3]/div[1]/form[1]/div[11]/div[3]/select[1]")
	WebElement exisitingvendorname;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement saveok;
	@FindBy(xpath="//input[@id='txt_assetSearch']")
	WebElement search;
	@FindBy(xpath="//select[@id='ddl_Floor']")
	WebElement floorfilter;
	@FindBy(xpath="//tbody/tr[1]/td[11]/a[1]/i[1]")
	WebElement edit;
	@FindBy(xpath="//button[contains(text(),'Update')]")
	WebElement update;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement updateok;
	@FindBy(css="div.wrapper:nth-child(3) div.RouterContent div.container-fluid div.shadow.p-3.mb-5.bg-white.rounded.col-lg-12.maincard:nth-child(3) div.table-responsive:nth-child(5) table.table.table-bordered.table-hover.table-condensed tbody:nth-child(2) tr:nth-child(1) td.TableActions:nth-child(11) a:nth-child(5) > i.far.fa-trash-alt")
	WebElement delete;
	@FindBy(xpath="//button[contains(text(),'Yes, delete it!')]")
	WebElement deleteok;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement deletelast;
	
	
	
	public AssetsPage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	public void assets(String selproject1, String assets,String type,String floors,String parentassets,
			String modelnames,String serialnos,String purchasedates,String vname,String vendorcontactnames,String vendorphnos,
			String vendoremails,String warrantyfors,String warrantytills,String firstservicedues,String nextservicedues,
			String barcodes,String assetscosts,String depriciations,String remindins,
			String exisitingvendornames,String vendor) throws Exception{
		ad.selByVisibleText(selproject, selproject1);
		addnew.click();
		lc.logs("Clicked on AddNew");
		
		assetname.sendKeys(assets);
		Thread.sleep(2000);
		String a1=assetname.getAttribute("value");
		lc.logs("Assert Name"+" "+a1);
		ad.selByVisibleText(assettype, type);
		lc.logs("Assert Type"+" "+type);
		ad.selByVisibleText(floor, floors);
		lc.logs("Floor"+" "+floors);
		ad.selByVisibleText(parentasset, parentassets);
		lc.logs("Parrent Assert"+" "+parentassets);
		modelname.sendKeys(modelnames);
		Thread.sleep(2000);
	String a2=	modelname.getAttribute("value");
	lc.logs("Model Name"+" "+a2);
		serialno.sendKeys(serialnos);
		Thread.sleep(2000);
		String a3=serialno.getAttribute("value");
		lc.logs("Serial Number"+" "+a3);
		purchasedate.sendKeys(purchasedates);
		Thread.sleep(2000);
		String a4=purchasedate.getAttribute("value");
		lc.logs("Purchase date"+" "+a4);
		if(vendor.contentEquals("existingvendor")) {
			exisitingvendor.click();
			lc.logs("Clicked on Existing Vendor");
			
			exisitingvendorname.sendKeys(exisitingvendornames);
			Thread.sleep(2000);
			String a5=exisitingvendorname.getText();
			lc.logs("Existing vendor Name"+" "+a5);
		}
		else {
			newvendorname.sendKeys(vname);
			Thread.sleep(2000);
			String a5=newvendorname.getAttribute("value");
			lc.logs("New Vendor Name"+" "+a5);
			vendorcontactname.sendKeys(vendorcontactnames);
			Thread.sleep(2000);
			String a6=vendorcontactname.getAttribute("value");
			lc.logs("Vendor Contact Name"+" "+a6);
			vendorphno.sendKeys(vendorphnos);
			Thread.sleep(2000);
			String a7=vendorphno.getAttribute("value");
			lc.logs("Vendor phone No"+" "+a7);
			vendoremail.sendKeys(vendoremails);
			Thread.sleep(2000);
			String a8=vendoremail.getAttribute("value");
			lc.logs("Vendor Email"+" "+a8);
		    }
		
		warrantyfor.sendKeys(warrantyfors);
		Thread.sleep(2000);
		String a8=warrantyfor.getAttribute("value");
		lc.logs("Warrenty"+" "+a8);
		warrantytill.sendKeys(warrantytills);
		Thread.sleep(2000);
		String a9=warrantytill.getAttribute("value");
		lc.logs("Warrenty Till"+" "+a9);
		firstservicedue.sendKeys(firstservicedues);
		Thread.sleep(2000);
		String a10=firstservicedue.getAttribute("value");
		lc.logs("Firist Service Due"+" "+a10);
		nextservicedue.sendKeys(nextservicedues);
		Thread.sleep(2000);
	String a11=	nextservicedue.getAttribute("value");
		lc.logs("Next Service Due"+" "+a11);
		barcode.clear();
		barcode.sendKeys(barcodes);
		Thread.sleep(2000);
		String a12=barcode.getAttribute("value");
		lc.logs("BarCodes"+" "+a12);
		assetscost.sendKeys(assetscosts);
		Thread.sleep(2000);
		String a13=assetscost.getAttribute("value");
		lc.logs("AssertCost"+" "+a13);
		depriciation.sendKeys(depriciations);
		Thread.sleep(2000);
		String a14=depriciation.getAttribute("value");
		lc.logs("Deprication"+" "+a14);
		remindin.sendKeys(remindins);
		Thread.sleep(2000);
		String a15=remindin.getAttribute("value");
		lc.logs("Remind In"+" "+a15);
		invoiceimage.click();
		ad.upload();
		lc.logs("invoice image Upload");
		Thread.sleep(3000);
		attachment.click();
		ad.upload();
		Thread.sleep(3000);
		lc.logs("Attachment Upload");
		assetphoto.click();
		Thread.sleep(3000);
		ad.upload();
		Thread.sleep(3000);
		lc.logs("Assert photo upload");
		save.click();
		Thread.sleep(3000);
		saveok.click();
		lc.logs("Save Success");
		search.sendKeys(assets);
		floorfilter.sendKeys(floors);
		
		edit.click();
		lc.logs("Clicked on Edit");
		Thread.sleep(3000);
		update.click();	
		Thread.sleep(3000);
		updateok.click();
		lc.logs("Update Success");
		
		delete.click();	
		lc.logs("Clicked on Delete");
		deleteok.click();
		deletelast.click();
		lc.logs("Deleted");
		
		//error in edit page need to fix
	
		
		
			
			
			
			
		
		
		}
	
	}
