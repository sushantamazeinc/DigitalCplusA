package com.dca.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.utility.ListenerClass;

public class SupplierOnlyPage extends BaseClass {
	//public static String suppliername1;
	//public String selsupptypee;
	ActionDriver ac=new ActionDriver();
	ListenerClass lc=new ListenerClass();
	@FindBy(xpath="//select[@id='ProjectID']")
	WebElement selproject;
	@FindBy(xpath="//input[@id='txt_vendorSearch']")
	WebElement search;
	@FindBy(xpath="//select[@id='ddl_vendorBuilding']")
	WebElement selsuppliertype;
	
	
	@FindBy(xpath="//button[@id='btn_button']")
	WebElement addsupplier;
	@FindBy(xpath="//input[@id='txt_VendorName']")
	WebElement suppliername;
	@FindBy(xpath="//input[@id='txt_usr']")
	WebElement supplieremail;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-update-vendor[1]/div[1]/div[3]/form[1]/div[4]/div[3]/input[1]")
	WebElement supplierphone;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-update-vendor[1]/div[1]/div[3]/form[1]/div[5]/div[3]/select[1]")
	WebElement supplierservicearea;
	@FindBy(xpath="//textarea[@id='txt_VendorAddress']")
	WebElement supplieraddress;
	@FindBy(xpath="//input[@id='txt_VendorWebsite']")
	WebElement supplierwebsite;
	@FindBy(xpath="//input[@id='txt_ContactName']")
	WebElement contactname;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-update-vendor[1]/div[1]/div[3]/form[1]/div[9]/div[3]/select[1]")
	WebElement selsuppliertype1;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-update-vendor[1]/div[1]/div[3]/form[1]/div[10]/div[3]/select[1]")
	WebElement bankname;
	@FindBy(xpath="//input[@id='txt_AccountNumber']")
	WebElement accountnumber;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-update-vendor[1]/div[1]/div[3]/form[1]/div[12]/div[3]/select[1]")
	WebElement selaccounttype;
	@FindBy(xpath="//textarea[@id='txt_BankAddress']")
	WebElement bankaddress;
	@FindBy(xpath="//input[@id='txt_IFSCCode']")
	WebElement btsn;
	@FindBy(xpath="//input[@id='txt_BranchName']")
	WebElement branchname;
	@FindBy(xpath="//textarea[@id='txt_PaymentTerms']")
	WebElement paymentterms;
	@FindBy(xpath="//input[@id='txt_CreditLimit']")
	WebElement creditlimit;
	@FindBy(xpath="//input[@id='txt_CreditDays']")
	WebElement creditdays;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-update-vendor[1]/div[1]/div[3]/form[1]/div[19]/div[3]/select[1]")
	WebElement supplierservice;
	@FindBy(css="#txt_VendorSupplies")
	WebElement suppliersuplies;
	@FindBy(xpath="//button[@id='btn_updatevendorbutton']")
	WebElement save;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement saveok;
	
	
	@FindBy(xpath="//tbody/tr[2]/td[8]/div[1]/div[1]/a[1]/i[1]")
	WebElement edit;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[2]/div[2]/div[1]/app-update-vendor[1]/div[1]/div[3]/form[1]/div[12]/div[2]/button[1]")
	
	WebElement update;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement updateok;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[2]/div[2]/div[1]/app-vendor[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[8]/div[1]/div[2]/a[1]/i[1]")
	WebElement deletesupp;
	@FindBy(xpath="//button[contains(text(),'Yes, delete it!')]")
	WebElement deletesuppok;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement delsuppok;
//////////////////////////////////////////////////////////////////////////////////////
	
	@FindBy(partialLinkText = "Expens")
	WebElement scrol;
	
	
	
	
	@FindBy(xpath="//select[@id='Category']")
	WebElement selcategory;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-item-master[1]/div[1]/div[2]/div[1]/div[2]/select[1]")
	WebElement selsubcategory;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-item-master[1]/div[1]/div[2]/div[1]/div[3]/select[1]")
	WebElement selitem;
	@FindBy(xpath="//button[contains(text(),'Export To Excel')]")
	WebElement export;
	@FindBy(xpath="//button[@id='btn_button']")
	WebElement addnew;
	@FindBy(xpath="//select[@id='Category']")
	WebElement category;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-new-item-master[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[3]/div[1]/select[1]")
	WebElement subcategory;
	@FindBy(xpath="//input[@id='txt_ItemName']")
	WebElement itemname;
	@FindBy(xpath="//textarea[@id='txt_ItemDescription']")
	WebElement itemdescri;
	@FindBy(xpath="//input[@id='ExpiryDate']")
	WebElement expirydate;
	@FindBy(xpath="//input[@id='mrp']")
	WebElement mrp;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save1;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement saveok11;
	@FindBy(xpath="//tbody/tr[2]/td[4]/i[1]")
	WebElement edit1;
	@FindBy(css="div.wrapper:nth-child(3) div.RouterContent div.container-fluid.Pages_background div.container-fluid.shadow.p-3.mb-5.bg-white.rounded.maincard form.ng-untouched.ng-pristine.ng-valid:nth-child(3) div.row div.col-lg-8 div.row:nth-child(8) div.col-lg-2:nth-child(3) div.form-group > button.btn.btn-block.btn-md.savebutton")
	WebElement update1;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement updateok1;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[2]/div[2]/div[1]/app-item-master[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[4]/i[2]")
	WebElement delete;
	@FindBy(xpath="//button[contains(text(),'Yes, delete it!')]")
	WebElement deleteok;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement deletelast;
	
	
	
	@FindBy(linkText = "Purchase Order")
	WebElement purchaseorder;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-podashboard[1]/div[1]/div[3]/div[1]/div[2]/select[1]")
	WebElement selsupplier;
	@FindBy(xpath="//button[@id='btn_button']")
	WebElement newpo;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-new-po[1]/div[1]/div[3]/div[1]/div[1]/select[1]")
	WebElement selpotype;
	@FindBy(xpath="//select[@id='ddl_newpotype']")
	WebElement seltype;
	@FindBy(xpath="//select[@id='ddl_newvendor']")
	WebElement selsupplier1;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-new-po[1]/div[1]/div[3]/div[2]/div[3]/input[1]")
	WebElement date;
	@FindBy(xpath="//button[contains(text(),'Add New Item')]")
	WebElement addnewitem;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-new-po[1]/div[1]/div[3]/div[1]/div[1]/select[1]")
	WebElement selpotype1;
	@FindBy(xpath="//select[@id='ddl_newpotype']")
	WebElement selitemcategory;
	@FindBy(xpath="//select[@id='ddl_newvendor']")
	WebElement selsupplier3;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-new-po[1]/div[1]/div[3]/div[2]/div[3]/input[1]")
	WebElement date1;
	@FindBy(xpath="//button[contains(text(),'Add New Item')]")
	WebElement addnewitem1;
	@FindBy(xpath="//tbody/tr[2]/td[2]/select[1]")
	WebElement selitem1;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement miniumquanityok;
	@FindBy(name = "quantity")
	WebElement quantity;
	@FindBy(xpath="//tbody/tr[2]/td[4]/input[1]")
	WebElement comments;
	@FindBy(xpath="//button[contains(text(),'Save PO')]")
	WebElement savepo;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement saveok1;
	
	
	@FindBy(xpath="//select[@id='ddl_TypeID']")
	WebElement property;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-new-po[1]/div[2]/div[3]/div[2]/div[2]/select[1]")
	WebElement suppliertype;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-new-po[1]/div[2]/div[3]/div[3]/div[2]/input[1]")
	WebElement serviceamount;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-new-po[1]/div[2]/div[3]/div[4]/div[2]/input[1]")
	WebElement taxamount;
	@FindBy(css="div.wrapper:nth-child(3) div.RouterContent div.container-fluid.Pages_background:nth-child(2) div.container-fluid.shadow.p-3.mb-5.bg-white.rounded.maincard:nth-child(9) div.row.p-2:nth-child(12) div.col-lg-4:nth-child(2) > select.form-control")
	WebElement financemanager;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-new-po[1]/div[2]/div[3]/div[6]/div[2]/select[1]")
	WebElement cfo;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-new-po[1]/div[2]/div[3]/div[2]/div[4]/select[1]")
	WebElement selsupplier2;
	@FindBy(css="div.wrapper:nth-child(3) div.RouterContent div.container-fluid.Pages_background:nth-child(2) div.container-fluid.shadow.p-3.mb-5.bg-white.rounded.maincard:nth-child(9) div.row.p-2:nth-child(8) div.col-lg-4:nth-child(4) > input.form-control.ng-pristine.ng-valid.ng-touched")
	WebElement servicedesc;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-new-po[1]/div[2]/div[3]/div[4]/div[4]/input[1]")
	WebElement grandtotal;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-new-po[1]/div[2]/div[3]/div[5]/div[4]/select[1]")
	WebElement financedirector;
	@FindBy(xpath="//*[@id=\"content\"]/div/app-new-po/div[2]/div[3]/div[7]/div[2]/button")
	WebElement save4;
	@FindBy(xpath="/html/body/div/div/div[3]/button[1]")
	WebElement saveok4;
	
	
	@FindBy(xpath="//label[contains(text(),'Select Project')]")
	WebElement clickmain;
	
	
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-podashboard[1]/div[1]/div[3]/div[1]/div[2]/select[1]")
	WebElement selsupplier11;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[2]/div[2]/div[1]/app-delivered-po[1]/div[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[1]")
	WebElement ponumber;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement itemdetailsok;
	

	
	
	public SupplierOnlyPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	
	
	
	
	
	
	
	
	
	public void supplieronlypage(String selproject1,String name1,String email11,String phoneo1
			,String servicearea1,String address1,
			String website1,String contactname1,String suppliertype1,String bankname1,
			String Accountno1,
			String accounttype1,String bankaddress1,String btxn1,String branchname1,String paymentterms1,
			String creditlimit1,String creditdays1,String supplierservices,
			String suppliersupplies) throws InterruptedException {
	ac.selByVisibleText(selproject, selproject1);
	addsupplier.click();
	lc.logs("Clicked on Add Supplier");
	suppliername.sendKeys(name1);
	String a1=suppliername.getText();
	lc.logs("SupplierName"+" "+a1);
	//suppliername1=suppliername.getAttribute("value");
	//System.out.println(suppliername1);
	//z=supplier;
	supplieremail.sendKeys(email11);
	String a2=supplieremail.getText();
	lc.logs("SupplierEmail"+" "+a2);
	supplierphone.sendKeys(phoneo1);
	String a3=supplierphone.getText();
	lc.logs("Supplier Home"+" "+a3);
	ac.selByVisibleText(supplierservicearea, servicearea1);
	lc.logs("SupplierServiceAre"+" "+servicearea1);
	supplieraddress.sendKeys(address1);
	String a4=supplieraddress.getText();
	lc.logs("Supplier Address"+" "+a4);
	supplierwebsite.sendKeys(website1);
	String a5=supplierwebsite.getText();
	lc.logs("Supplier Website"+" "+a5);
	contactname.sendKeys(contactname1);
	String a6=contactname.getText();
	lc.logs("Contact Name"+" "+a6);
	ac.selByVisibleText(selsuppliertype1, suppliertype1);
	lc.logs("Select Supplier type"+" "+suppliertype1);
	//selsupptypee=selsuppliertype1.getAttribute("value");
	//y=selsupptype;
	ac.selByVisibleText(bankname, bankname1);
	lc.logs("Select Bank name"+" "+bankname1);
	
	accountnumber.sendKeys(Accountno1);
	String a7=accountnumber.getText();
	lc.logs("Account number"+" "+a7);
	ac.selByVisibleText(selaccounttype, accounttype1);
	lc.logs("Select Account type"+" "+ accounttype1);
	bankaddress.sendKeys(bankaddress1);
	String a8=bankaddress.getText();
	lc.logs("Bank Address"+" "+a8);
	btsn.sendKeys(btxn1);
	String a9=btsn.getText();
	lc.logs("Bxtn"+" "+a9);
	branchname.sendKeys(branchname1);
	String a10=branchname.getText();
	lc.logs("Branch name"+" "+a10);
	paymentterms.sendKeys(paymentterms1);
	String a11=paymentterms.getText();
	lc.logs("Payment Terms"+" "+a11);
	creditlimit.sendKeys(creditlimit1);
	String a12=creditlimit.getText();
	lc.logs("Credit limit"+" "+a12);
	creditdays.sendKeys(creditdays1);
	String a13=creditdays.getText();
	lc.logs("Credit Days"+" "+a13);
	ac.selByVisibleText(supplierservice, supplierservices);
	lc.logs("Supplier Service"+" "+supplierservices);
	suppliersuplies.sendKeys(suppliersupplies);
	lc.logs("Supplier Supplies"+" "+suppliersupplies);
	save.click();
	saveok.click();
	lc.logs("Save Success");
	Thread.sleep(3000);
	search.sendKeys(name1);
	ac.selByVisibleText(selsuppliertype, suppliertype1);
	edit.click();
	lc.logs("Clicked on Edit");
	Thread.sleep(3000);
	update.click();
	updateok.click();
	lc.logs("Update Success");
	Thread.sleep(3000);
	/*
	 * deletesupp.click(); deletesuppok.click(); delsuppok.click();
	 */
	}
	
	
	public String getsuppliername() {
		
	String suppname=	suppliername.getText();
		return suppname;
		
	}
	
	public void inventorypage(String selproject1,String category1, String subcategory1,
			String itemname1,
			String itemdescri1,String expirydate1,String mrp1,
			String selpotype1,String date11,String quantity1,
			String comments1,String serviceamount1,
			String financemanager1,String cfo1,String servicedesc1,
			String financedirector1,String selsupptypee) throws InterruptedException, AWTException {
		addnew.click();
		lc.logs("Clicked on AddNew");
		ac.selByVisibleText(category, category1);
		lc.logs("Category"+" "+category1);
		ac.selByVisibleText(subcategory, subcategory1);
		lc.logs("SubCategory"+" "+subcategory1);
		itemname.sendKeys(itemname1);
		String a14=itemname.getText();
		lc.logs("ItemName"+" "+a14);
		itemdescri.sendKeys(itemdescri1);
		String a15=itemdescri.getText();
		lc.logs("Item Description"+" "+a15);
		expirydate.sendKeys(expirydate1);
		String a16=expirydate.getText();
		lc.logs("ExpiryDate"+" "+a16);
		mrp.sendKeys(mrp1);
		String a17=mrp.getText();
		lc.logs("MRP"+" "+a17);
		Thread.sleep(3000);
		save1.click();
		Thread.sleep(3000);
		saveok11.click();
		lc.logs("Saved Success");
		Thread.sleep(3000);
		ac.selByVisibleText(selcategory, category1);
		Thread.sleep(3000);
		ac.selByVisibleText(selsubcategory, subcategory1);
		ac.selByVisibleText(selitem, itemname1);
		Thread.sleep(3000);
		edit1.click();
		lc.logs("Clicked on Edit");
		update1.click();
		updateok1.click();
		lc.logs("Update Success");
		export.click();
		lc.logs("Export Success");
		delete.click();
		deleteok.click();
		deletelast.click();
		Thread.sleep(3000);
		scrol.click();
		 Robot robot=new Robot();
		 for(int i=0;i<2;i++) {
			 robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			 Thread.sleep(3000);
		 }
		 purchaseorder.click();
		 lc.logs("Clicked on Purchase Order");
		 clickmain.click();
		 Robot robot1=new Robot();
		 for(int i=0;i<1;i++) {
			 robot1.keyPress(KeyEvent.VK_PAGE_UP);
			 Thread.sleep(3000);
		 }
		 
		 newpo.click();
		 lc.logs("Clicked on new po");
		 ac.selByVisibleText(selpotype, selpotype1);
		 if(selpotype1.contentEquals("Inventory PO")) {
			ac.selByVisibleText(selitemcategory, subcategory1);
			lc.logs("Select item Category"+" "+subcategory1);
			ac.selByIndex(selsupplier3, 1);
			String a18=selsupplier3.getText();
			lc.logs("Select Supplier"+" "+a18);
			date1.sendKeys(date11);
			String a19=date1.getText();
			lc.logs("Date"+" "+a19);
			addnewitem1.click();
			lc.logs("Clicked on Add new");
			ac.selByVisibleText(selitem1, itemname1);
			lc.logs("Select Item"+" "+itemname1);
			try {
				miniumquanityok.click();
				lc.logs("Clicked on Minimum Quanity");
			} catch (Exception e) {
				System.out.println(e);
			}
			//itemdetailsok.click();
			quantity.sendKeys(quantity1);
			String a20=quantity.getText();
			lc.logs("Quanity"+" "+a20);
			comments.sendKeys(comments1);
			String a21=comments.getText();
			lc.logs("Comments"+" "+a21);
			savepo.click();
			saveok1.click();
			lc.logs("Save Success");
		 }else {
			 ac.selByVisibleText(property, selproject1);
			 ac.selByVisibleText(suppliertype, selsupptypee);
			 lc.logs("SupplierType"+" "+selsupptypee);
			 serviceamount.sendKeys(serviceamount1);
			String a22= serviceamount.getText();
			lc.logs("Service Amount"+" "+a22);
			 ac.selByVisibleText(financemanager, financemanager1);
			 lc.logs("Finance Manager"+" "+financemanager1);
			ac.selByVisibleText(cfo, cfo1);
			lc.logs("CFO"+" "+cfo1);
			ac.selByIndex(selsupplier2, 1);
			String a23=selsupplier2.getText();
			lc.logs("Select Supplier"+" "+a23);
			//servicedesc.sendKeys(servicedesc1);
			ac.selByVisibleText(financedirector, financedirector1);
			lc.logs("FinanaceDirector"+" "+financedirector1);
			save4.click();
			saveok4.click();
			lc.logs("Save Success");
			
			
		 }
		// ac.selByVisibleText(selsupplier11, suppliername1);
		
	}
	}
	
	
	

 

