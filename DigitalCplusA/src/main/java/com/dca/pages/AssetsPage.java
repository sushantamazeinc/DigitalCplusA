package com.dca.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;

public class AssetsPage extends BaseClass{
	//error in edit page need to fix
	ActionDriver ad=new ActionDriver();
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
		assetname.sendKeys(assets);
		ad.selByVisibleText(assettype, type);
		ad.selByVisibleText(floor, floors);
		ad.selByVisibleText(parentasset, parentassets);
		modelname.sendKeys(modelnames);
		serialno.sendKeys(serialnos);
		purchasedate.sendKeys(purchasedates);
		
		if(vendor.contentEquals("existingvendor")) {
			exisitingvendor.click();
			
			exisitingvendorname.sendKeys(exisitingvendornames);
			
		}
		else {
			newvendorname.sendKeys(vname);
			vendorcontactname.sendKeys(vendorcontactnames);
			vendorphno.sendKeys(vendorphnos);
			vendoremail.sendKeys(vendoremails);
			
		    }
		
		warrantyfor.sendKeys(warrantyfors);
		warrantytill.sendKeys(warrantytills);
		firstservicedue.sendKeys(firstservicedues);
		nextservicedue.sendKeys(nextservicedues);
		barcode.clear();
		barcode.sendKeys(barcodes);
		assetscost.sendKeys(assetscosts);
		depriciation.sendKeys(depriciations);
		remindin.sendKeys(remindins);
		invoiceimage.click();
		ad.upload();
		Thread.sleep(3000);
		attachment.click();
		ad.upload();
		Thread.sleep(3000);
		assetphoto.click();
		Thread.sleep(3000);
		ad.upload();
		Thread.sleep(3000);
		save.click();
		Thread.sleep(3000);
		saveok.click();
		search.sendKeys(assets);
		floorfilter.sendKeys(floors);
		
		edit.click();
		Thread.sleep(3000);
		update.click();	
		Thread.sleep(3000);
		updateok.click();
		
		delete.click();	
		deleteok.click();
		deletelast.click();
		
		//error in edit page need to fix
	
		
		
			
			
			
			
		
		
		}
	
	}
