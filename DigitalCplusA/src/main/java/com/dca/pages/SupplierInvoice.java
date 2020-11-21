package com.dca.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;

public class SupplierInvoice extends BaseClass {
	ActionDriver ac = new ActionDriver();
	@FindBy(xpath = "//select[@id='ProjectID']")
	WebElement selproject;

	@FindBy(css = "#btn_button")
	WebElement addsupplierinvoice;
	@FindBy(xpath = "//input[@id='txt_invoiceSearch']")
	WebElement serach;
	@FindBy(xpath = "//select[@id='ddl_invoiceSearchVendor']")
	WebElement selsupplier;
	// @FindBy(xpath="//select[@id='ddl_invoiceSearchVendor']")
	// WebElement selsupplier2;
	@FindBy(css = "#ddl_invoiceSearchPO")
	WebElement searchpono;
	@FindBy(css="#txt_purchaseitemDate")
	WebElement date;

	@FindBy(xpath = "//body/app-root[1]/div[2]/div[2]/div[1]/app-update-vendor-invoice[1]/div[1]/div[3]/div[2]/div[1]/div[2]/input[1]")
	WebElement invoiceno;
	@FindBy(xpath = "//body/app-root[1]/div[2]/div[2]/div[1]/app-update-vendor-invoice[1]/div[1]/div[3]/div[2]/div[1]/div[3]/input[1]")
	WebElement suppliercontact;
	@FindBy(xpath = "//body/app-root[1]/div[2]/div[2]/div[1]/app-update-vendor-invoice[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/select[1]")
	WebElement itemname;
	@FindBy(xpath = "//body/app-root[1]/div[2]/div[2]/div[1]/app-update-vendor-invoice[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")
	WebElement warrentydate;
	@FindBy(xpath = "//body/app-root[1]/div[2]/div[2]/div[1]/app-update-vendor-invoice[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/div[3]/input[1]")
	WebElement mfname;
	@FindBy(xpath = "//body/app-root[1]/div[2]/div[2]/div[1]/app-update-vendor-invoice[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/div[4]/input[1]")
	WebElement partno;
	@FindBy(xpath = "//body/app-root[1]/div[2]/div[2]/div[1]/app-update-vendor-invoice[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/div[7]/input[1]")
	WebElement actualquantity;
	@FindBy(xpath = "//body/app-root[1]/div[2]/div[2]/div[1]/app-update-vendor-invoice[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/div[8]/input[1]")
	WebElement mrp;
	@FindBy(xpath = "//body/app-root[1]/div[2]/div[2]/div[1]/app-update-vendor-invoice[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/div[10]/input[1]")
	WebElement discount;
	@FindBy(xpath = "//body/app-root[1]/div[2]/div[2]/div[1]/app-update-vendor-invoice[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[2]/div[1]/div[14]/input[1]")
	WebElement comments;
	@FindBy(xpath = "//button[@id='btn_saveinvoice']")
	WebElement save1;
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement saveok1;

	@FindBy(xpath = "//input[@id='txt_invoiceSearch']")
	WebElement search1;
	@FindBy(xpath = "//select[@id='ddl_Vendor']")
	WebElement selsuppliers3;
	@FindBy(xpath = "//tbody/tr[1]/td[8]/div[1]/div[2]/a[1]/i[1]")
	WebElement download12;
	/////////////////////////////////////////////
	@FindBy(partialLinkText = "Supplier Outstanding")
	WebElement supplieroutstanding;
	@FindBy(xpath = "//select[@id='ddl_vendorpaymentVendor']")
	WebElement selsuppliers4;
	@FindBy(xpath = "//button[contains(text(),'Export To Excel')]")
	WebElement export1;
	@FindBy(xpath = "//button[contains(text(),'Payment Reports')]")
	WebElement paymentreports;

	@FindBy(css="#inlineradio02")
	WebElement pay;
	@FindBy(xpath = "//*[@id=\"ddl_VendorName\"]")
	WebElement selpaymenttype;
	@FindBy(xpath = "//*[@id=\"txt_PayableAmount\"]")
	WebElement payableamount;
	@FindBy(xpath = "//textarea[@id='txt_PayableAmount']")
	WebElement comment;

	@FindBy(xpath = "//tbody/tr[1]/td[8]/div[1]/div[2]/a[1]/i[1]")
	WebElement download;

	@FindBy(xpath = "/html/body/app-root/div[2]/div[2]/div/app-vendor-payments/div/div[4]/div/div/form/div[6]/div[2]/button")
	WebElement payment;
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement paymentok;

	///////////////////////////////////////////////
	@FindBy(xpath = "//button[contains(text(),'Export To Excel')]")
	WebElement export12;
	@FindBy(xpath = "//select[@id='ddl_vendordashboardInvoiceNo']")
	WebElement selsupplier12;
	@FindBy(xpath = "//tbody/tr[1]/td[7]/div[1]/div[2]/a[1]/i[1]")
	WebElement download1;
	@FindBy(partialLinkText = "Supplier Retu")
	WebElement supplierreturn;
	@FindBy(xpath = "//button[contains(text(),'Add New')]")
	WebElement addnew;
	@FindBy(xpath = "//button[contains(text(),'Export To Excel')]")
	WebElement exporttoexcel;
	@FindBy(xpath = "//input[@id='txt_vendorreturnSearch']")
	WebElement search12;

	@FindBy(xpath = "//body/app-root[1]/div[2]/div[2]/div[1]/app-vendor-return[1]/div[1]/div[3]/div[1]/div[1]/select[1]")
	WebElement selsupplier123;
	@FindBy(css = "div.wrapper:nth-child(3) div.RouterContent div.container-fluid.Pages_background div.shadow.p-3.mb-5.bg-white.rounded.col-lg-12.maincard:nth-child(3) div.row:nth-child(3) div.col-lg-3:nth-child(2) > select.dropdown.form-control.headerdropdown:nth-child(2)")

	WebElement selinvoicenumber;
	@FindBy(xpath = "//tbody/tr[1]/td[3]/input[1]")
	WebElement returnquanity;
	@FindBy(xpath = "//tbody/tr[1]/td[6]/textarea[1]")
	WebElement remarks;
	@FindBy(xpath = "//input[@id='inlineCheckbox02']")
	WebElement sel;
	@FindBy(xpath = "//button[contains(text(),'Return')]")
	WebElement returnpro;
	@FindBy(xpath = "//button[contains(text(),'Yes, Return !')]")
	WebElement yesreturn;
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement returnok;

	///////////////////////////////////////////////////////////
	@FindBy(xpath = "//body/app-root[1]/div[2]/div[1]/nav[1]/ul[1]/li[12]/ul[1]/li[4]/a[1]")
	WebElement inventory1;
	@FindBy(css = "#btn_button")
	WebElement addnewinventory;
	@FindBy(xpath = "//select[@id='ddl_ItemName']")
	WebElement itemname1;
	@FindBy(xpath = "//input[@id='txt_newinventoryAddress']")
	WebElement address1;
	@FindBy(xpath = "//select[@id='ddl_newinventoryFloor']")
	WebElement floor;
	@FindBy(xpath = "//input[@id='txt_newinventoryLocation']")
	WebElement location;
	@FindBy(xpath = "//input[@id='txt_Currentqty']")
	WebElement currentqty;
	@FindBy(xpath = "//input[@id='txt_maxQty']")
	WebElement minimumqty;
	@FindBy(xpath = "//input[@id='WarrantyExpiryDate']")
	WebElement expirydate;
	@FindBy(xpath = "//select[@id='ddl_AssignedTo']")
	WebElement assignedto;
	@FindBy(xpath = "//textarea[@id='txt_Description']")
	WebElement description;
	@FindBy(xpath = "//button[@id='btn_newinventorybutton']")
	WebElement save123;
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement saveok12;

	///////////////////////////////////////////////////////////

	@FindBy(partialLinkText = "Asse")
	WebElement assertclick;
	@FindBy(linkText = "Inventory")
	WebElement inventorylink;

	//////////////////////////////////////////////////

	@FindBy(xpath = "//input[@id='ddl_inventorySearch']")
	WebElement search123;
	@FindBy(xpath = "//select[@id='Category']")
	WebElement selcategory;
	@FindBy(xpath = "//select[@id='ddl_inventoryType']")
	WebElement selype;
	@FindBy(xpath = "//select[@id='DSd']")
	WebElement selinventory;

	@FindBy(xpath = "//tbody/tr[2]/td[11]/a[3]/i[1]")
	WebElement consume;
	@FindBy(xpath = "//body/app-root[1]/div[2]/div[2]/div[1]/app-inventory[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[5]/div[2]/input[1]")
	WebElement consumecount;
	@FindBy(xpath = "//body/app-root[1]/div[2]/div[2]/div[1]/app-inventory[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[3]/button[1]")
	WebElement saveconsume;
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement consumeok;

	@FindBy(xpath = "//h4[contains(text(),'Supplier Invoice')]")
	WebElement clicking;

	@FindBy(xpath = "//select[@id='StaffID']")
	WebElement staff;

	@FindBy(xpath = "//input[@id='txt_TotalAmount']")
	WebElement getamount;

	public SupplierInvoice() {
		PageFactory.initElements(getDriver(), this);
	}

	public void supplierinvoice(String selproject1, String date1, String invoiceno1, String warrentydate1,
			String mfname1, String partno1, String actualquanity1, String mrp1, String discount1, String comments1,
			String selpaymenttype1, String comment1, String returnquanity1, String remarks1, String address11,
			String floor1, String location1, String currentquanity1, String minimumquantity, String expirydate12,
			String assignedto1, String description1, String selcat, String selty, String staff1)
			throws InterruptedException, AWTException {
		ac.selByVisibleText(selproject, selproject1);
		// clicking.click();

		
		 addsupplierinvoice.click(); 
		 Thread.sleep(3000);
		 Select select22=new
		 Select(selsupplier);
		 int selectoptions= select22.getOptions().size();
		 select22.selectByIndex(selectoptions - 1); 
		 //selsupplier.click();
		 Thread.sleep(3000);
		 Select select23=new Select(searchpono);
		 int selectop=select23.getOptions().size(); 
		 select23.selectByIndex(selectop - 1);
		  //ac.selByVisibleText(selsupplier2, suppname);
		  //ac.selByVisibleText(searchpono, ponumbb); 
		 date.sendKeys(date1);
		  invoiceno.sendKeys(invoiceno1); 
		  ac.selByIndex(itemname, 1);
		  warrentydate.sendKeys(warrentydate1); 
		  mfname.sendKeys(mfname1);
		  partno.sendKeys(partno1); 
		  actualquantity.sendKeys(actualquanity1);
		  mrp.sendKeys(mrp1);
		  discount.sendKeys(discount1);
		  comments.sendKeys(comments1); 
		  save1.click(); 
		  saveok1.click();
		  Thread.sleep(3000);
		  search1.sendKeys(invoiceno1);
		  //ac.selByVisibleText(selsuppliers3, text);
		  download12.click();
		  Thread.sleep(3000); 
		  supplieroutstanding.click();
		  Thread.sleep(3000); Select
		  select27=new Select(selsuppliers4);
		  int sel27=select27.getOptions().size();
		  select27.selectByIndex(sel27 - 1);
		  
		  //ac.selByVisibleText(selsuppliers4, text);
		  Robot robot=new Robot();
		  for(int i=0;i<2;i++) {
		  robot.keyPress(KeyEvent.VK_PAGE_UP);
		  Thread.sleep(3000);
		  }
		  //export1.click(); 
		  Thread.sleep(3000);
		  pay.click();
		  Thread.sleep(3000);
		  Robot robot1=new Robot();
		  for(int i=0;i<1;i++) {
		  robot1.keyPress(KeyEvent.VK_PAGE_DOWN);
		  Thread.sleep(3000);
		  }
		  ac.selByVisibleText(selpaymenttype, selpaymenttype1); 
		  String
		  payable=getamount.getAttribute("value");
		  payableamount.clear();
		  Thread.sleep(3000);
		  payableamount.sendKeys(payable);
		  comment.sendKeys(comment1);
		  payment.click();
		  paymentok.click();
		  //paymentreports.click(); 
		  Thread.sleep(3000); 
		  ac.selByIndex(selsupplier12,1); 
		  Thread.sleep(3000); export12.click();
		  //ac.selByIndex(selsupplier12, 1);
		  //ac.selByVisibleText(selsupplier12, text); 
		  download1.click();
		  Thread.sleep(3000);
		  
		  
		  supplierreturn.click();
		  Robot robot11=new Robot();
		  for(int i=0;i<1;i++) {
		  robot11.keyPress(KeyEvent.VK_PAGE_UP); 
		  Thread.sleep(3000);
		  } addnew.click();
		  Thread.sleep(3000);
		  //ac.selByIndex(selsupplier123, 11); Thread.sleep(3000);
		  Select select28=new Select(selsupplier123);
		  int sel289=select28.getOptions().size(); 
		  select28.selectByIndex(sel289-1);
		  
		  
		  
		  Select select30=new Select(selinvoicenumber); 
		  int  sel30=select30.getOptions().size(); 
		  select30.selectByIndex(sel30-1);
		  //ac.selByVisibleText(selsupplier123, text);
		  //ac.selByVisibleText(selinvoicenumber, invoiceno1);
		  //ac.selByIndex(selinvoicenumber, 1); 
		  returnquanity.sendKeys(returnquanity1);
		  remarks.sendKeys(remarks1); 
		  sel.click(); 
		  returnpro.click();
		  yesreturn.click();
		  returnok.click(); 
		  Thread.sleep(3000);
		 
		assertclick.click();
		Robot robot111 = new Robot();
		for (int i = 0; i < 2; i++) {
			robot111.keyPress(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(3000);
		}

		inventorylink.click();
		inventory1.click();
		Robot robot1111 = new Robot();
		for (int i = 0; i < 2; i++) {
			robot1111.keyPress(KeyEvent.VK_PAGE_UP);
			Thread.sleep(3000);
		}

		addnewinventory.click();
		Thread.sleep(3000);
		Select select29 = new Select(itemname1);
		int sel29 = select29.getOptions().size();
		select29.selectByIndex(sel29 - 1);
		Thread.sleep(3000);
		// ac.selByVisibleText(itemname1, text);
		address1.sendKeys(address11);
		ac.selByVisibleText(floor, floor1);
		location.sendKeys(location1);
		currentqty.sendKeys(currentquanity1);
		minimumqty.sendKeys(minimumquantity);
		expirydate.sendKeys(expirydate12);
		ac.selByVisibleText(assignedto, assignedto1);
		description.sendKeys(description1);
		save123.click();
		saveok12.click();
		Thread.sleep(3000);
		search123.sendKeys(location1);
		ac.selByVisibleText(selcategory, selcat);
		ac.selByVisibleText(selype, selty);
		Thread.sleep(3000);
		// Select select31=new Select(selinventory);
		// int sel31=select31.getOptions().size();
		// select31.selectByIndex(sel31 - 1);

		// ac.selByVisibleText(selinventory, text);
		consume.click();
		Thread.sleep(3000);
		consumecount.sendKeys("1");
		Thread.sleep(3000);
		// consumecount.sendKeys(keysToSend);
		// ac.selByVisibleText(staff, staff1);
		ac.selByIndex(staff, 1);
		Thread.sleep(3000);
		
		saveconsume.click();
		// Thread.sleep(3000);
		// consumeok.click();

	}
}
