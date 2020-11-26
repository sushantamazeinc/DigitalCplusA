package com.dca.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.utility.ListenerClass;

public class SupplierInvoice extends BaseClass {
	ActionDriver ac = new ActionDriver();
	ListenerClass lc=new ListenerClass();
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
	@FindBy(css = "#txt_purchaseitemDate")
	WebElement date;

	@FindBy(xpath = "//body/app-root[1]/div[2]/div[2]/div[1]/app-update-vendor-invoice[1]/div[1]/div[3]/div[2]/div[1]/div[2]/input[1]")
	WebElement invoiceno;
	@FindBy(xpath = "//body/app-root[1]/div[2]/div[2]/div[1]/app-update-vendor-invoice[1]/div[1]/div[3]/div[2]/div[1]/div[3]/input[1]")
	WebElement suppliercontact;
	@FindBy(xpath = "//p[contains(text(),'Drop your files here (or click)')]")
	WebElement attachement;

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
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[2]/div[2]/div[1]/app-invoice-dashboard[1]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/div[2]/button[1]")
	WebElement supplieroutstandingpay;
	@FindBy(xpath = "//select[@id='ddl_vendorpaymentVendor']")
	WebElement selsuppliers4;
	@FindBy(xpath = "//button[contains(text(),'Export To Excel')]")
	WebElement export1;
	@FindBy(xpath = "//button[contains(text(),'Payment Reports')]")
	WebElement paymentreports;

	@FindBy(css = "#inlineradio02")
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
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[2]/div[1]/nav[1]/ul[1]/li[11]/ul[1]/li[5]/a[1]")
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
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[2]/div[1]/nav[1]/ul[1]/li[10]/ul[1]/li[4]/a[1]")
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
	@FindBy(xpath = "//p[contains(text(),'Drop your files here (or click)')]")
	WebElement invoiceattachment;
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
	@FindBy(xpath = "//a[@href='#/Vendor']")
	WebElement supplier;
	
	
	
	
	

	public SupplierInvoice() {
		PageFactory.initElements(getDriver(), this);
	}

	public void supplierinvoice(String selproject1, String date1, String invoiceno1, String warrentydate1,
			String mfname1, String partno1, String actualquanity1, String mrp1, String discount1, String comments1,
			String selpaymenttype1, String comment1, String returnquanity1, String remarks1, String address11,
			String floor1, String location1, String currentquanity1, String minimumquantity, String expirydate12,
			String assignedto1, String description1, String selcat, String selty, String staff1)
			throws IOException, InterruptedException, AWTException {
		ac.selByVisibleText(selproject, selproject1);
		// clicking.click();

		
		  addsupplierinvoice.click(); 
		  lc.logs("Clicked on Supplier invoice");
		  Thread.sleep(3000); 
		  Select select22=new Select(selsupplier); 
		  int selectoptions= select22.getOptions().size();
		  select22.selectByIndex(selectoptions - 1);
		  String a1=selsupplier.getText();
		  lc.logs("Select Supplier"+" "+a1);
		  //selsupplier.click();
		 Thread.sleep(3000);
		 Select select23=new Select(searchpono); 
		 int selectop=select23.getOptions().size();
		 select23.selectByIndex(selectop - 1);
		  //ac.selByVisibleText(selsupplier2, suppname);
		  //ac.selByVisibleText(searchpono, ponumbb); 
		 String a2=searchpono.getText();
		 lc.logs("Search Po Number"+" "+a2);
		 date.sendKeys(date1);
		 String a3=date.getText();
		 lc.logs("date"+" "+a3);
		  invoiceno.sendKeys(invoiceno1); 
		  String a4=invoiceno.getText();
		  lc.logs("Invoice number"+" "+a4);
		  // attachement.click(); 
		  // Thread.sleep(3000);
		  // ac.upload(); 
		  Thread.sleep(5000);
		  ac.selByIndex(itemname, 1);
		  String a5=itemname.getText();
		  lc.logs("Item Name"+" "+a5);
		  warrentydate.sendKeys(warrentydate1);
		  String a6=warrentydate.getText();
		  lc.logs("Warrenty Date"+" "+a6);
		  mfname.sendKeys(mfname1);
		  String a7=mfname.getText();
		  lc.logs("MF name"+" "+a7);
		  partno.sendKeys(partno1);
		 String a8= partno.getText();
		  lc.logs("Part number"+" "+a8);
		  actualquantity.sendKeys(actualquanity1);
		  String a9=actualquantity.getText();
		  lc.logs("Actual Quantity"+" "+a9);
		  mrp.sendKeys(mrp1);
		  String a10=mrp.getText();
		  lc.logs("Mrp"+" "+a10);
		  discount.sendKeys(discount1); 
		  String a11=discount.getText();
		  lc.logs("Discount"+" "+a11);
		  comments.sendKeys(comments1); 
		  String a12=comments.getText();
		  lc.logs("Comments"+" "+a12);
		  Thread.sleep(7000); 
		  save1.click();
		  saveok1.click(); 
		  lc.logs("Save Success");
		  Thread.sleep(3000); 
		  //search1.sendKeys(invoiceno1);
		  //ac.selByVisibleText(selsuppliers3, text); 
		  download12.click();
		  lc.logs("Export Success");
		  Thread.sleep(5000); 
		  supplieroutstandingpay.click();
		  lc.logs("Clicked on Supplier Outstanding Pay");
		  Thread.sleep(3000); 
		  Select select27=new Select(selsuppliers4); 
		  int sel27=select27.getOptions().size();
		  select27.selectByIndex(sel27 - 1);
		  String a13=selsuppliers4.getText();
		  lc.logs("Select Supplier"+" "+a13);
		  //ac.selByVisibleText(selsuppliers4, text); 
		  Robot robot=new Robot();
		  for(int i=0;i<2;i++) 
		  { 
			  robot.keyPress(KeyEvent.VK_PAGE_UP);
			  Thread.sleep(3000);
			  }
		  //export1.click();
		  Thread.sleep(3000);
		  pay.click(); 
		  lc.logs("Clicked on Pay");
		  Thread.sleep(3000); 
		  Robot robot1=new Robot();
		  for(int i=0;i<1;i++)
		  {
		  robot1.keyPress(KeyEvent.VK_PAGE_DOWN);
		  Thread.sleep(3000); 
		  }
		  ac.selByVisibleText(selpaymenttype, selpaymenttype1);
		  lc.logs("Select Payment type"+" "+selpaymenttype1);
		  String payable=getamount.getAttribute("value"); 
		  payableamount.clear();
		  Thread.sleep(3000); 
		  payableamount.sendKeys(payable);
		  lc.logs("Payable Amount"+" "+payable);
		  comment.sendKeys(comment1); 
		 String a14= comment.getText();
		  lc.logs("Comment"+" "+a14);
		  payment.click();
		  paymentok.click();
		  lc.logs("Payment Success");
		  //paymentreports.click(); 
		  Thread.sleep(3000); 
		  ac.selByIndex(selsupplier12,1);
		  Thread.sleep(3000); 
		  export12.click(); 
		  lc.logs("Export Success");
		  //ac.selByIndex(selsupplier12, 1);
		  //ac.selByVisibleText(selsupplier12, text); 
		  //download1.click();
		  Thread.sleep(6000);
		  
		  supplier.click();
		Robot robot411 = new Robot();
		for (int i = 0; i < 3; i++) {
			robot411.keyPress(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(3000);}
		
		/*Dimension dm = new Dimension(1200, 730);
		getDriver().manage().window().setSize(dm);*/
		supplierreturn.click();
		lc.logs("Clicked on Supplier Return");
		Robot robot111 = new Robot();
		for (int i = 0; i < 2; i++) {
			robot111.keyPress(KeyEvent.VK_PAGE_UP);
			Thread.sleep(3000);
		}
		addnew.click();
		lc.logs("Clicked on Add new");
		Thread.sleep(3000);
		// ac.selByIndex(selsupplier123, 11); 
		Thread.sleep(3000);
		Select select28 = new Select(selsupplier123);
		int sel289 = select28.getOptions().size();
		select28.selectByIndex(sel289 - 1);
		String a15=selsupplier123.getText();
		lc.logs("Select Supplier"+" "+a15);
		Select select30 = new Select(selinvoicenumber);
		int sel30 = select30.getOptions().size();
		select30.selectByIndex(sel30 - 1);
		String a16=selinvoicenumber.getText();
		lc.logs("Select invoice number"+" "+a16);
		// ac.selByVisibleText(selsupplier123, text);
		// ac.selByVisibleText(selinvoicenumber, invoiceno1);
		// ac.selByIndex(selinvoicenumber, 1);
		returnquanity.sendKeys(returnquanity1);
		String a17=returnquanity.getText();
		lc.logs("Return Quantity"+" "+a17);
		remarks.sendKeys(remarks1);
		String a18=remarks.getText();
		lc.logs("Remarks"+" "+a18);
		sel.click();
		
		returnpro.click();
		lc.logs("Clicked on Return");
		yesreturn.click();
		returnok.click();
		lc.logs("Return Success");
		Thread.sleep(3000);

		assertclick.click();
		Robot robot1111 = new Robot();
		for (int i = 0; i < 2; i++) {
			robot1111.keyPress(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(3000);
		}

		inventorylink.click();
		inventory1.click();
		lc.logs("Clicked on inventory");
		Robot robot11111 = new Robot();
		for (int i = 0; i < 2; i++) {
			robot11111.keyPress(KeyEvent.VK_PAGE_UP);
			Thread.sleep(3000);
		}
Thread.sleep(5000);
		addnewinventory.click();
		lc.logs("Clicked on Add New Inventory");
		Thread.sleep(3000);
		Select select29 = new Select(itemname1);
		int sel29 = select29.getOptions().size();
		select29.selectByIndex(sel29 - 1);
		Thread.sleep(3000);
		String a19=itemname1.getText();
		lc.logs("ItemName"+" "+a19);
		// ac.selByVisibleText(itemname1, text);
		address1.sendKeys(address11);
		String a20=address1.getText();
		lc.logs("Address"+" "+a20);
		ac.selByVisibleText(floor, floor1);
		lc.logs("Floor"+" "+floor1);
		location.sendKeys(location1);
		String a21=location.getText();
		lc.logs("Location"+" "+a21);
		currentqty.sendKeys(currentquanity1);
		String a22=currentqty.getText();
		lc.logs("Current Quantity"+" "+a22);
		minimumqty.sendKeys(minimumquantity);
		String a23=minimumqty.getText();
		lc.logs("Minimum Quantity"+" "+a23);
		expirydate.sendKeys(expirydate12);
		String a24=expirydate.getText();
		lc.logs("ExpiryDate"+" "+a24);
		ac.selByVisibleText(assignedto, assignedto1);
		lc.logs("Assigned To"+" "+assignedto1);
		description.sendKeys(description1);
		String a25=description.getText();
		lc.logs("Description"+" "+a25);
		invoiceattachment.click();
		ac.upload();
		Thread.sleep(7000);
		lc.logs("Invoice Attachment Success");
		save123.click();
		saveok12.click();
		Thread.sleep(3000);
		lc.logs("Form Save Success");
		search123.sendKeys(location1);
		String a26=search123.getText();
		lc.logs("Searching"+" "+a26);
		ac.selByVisibleText(selcategory, selcat);
		ac.selByVisibleText(selype, selty);
		Thread.sleep(3000);
		// Select select31=new Select(selinventory);
		// int sel31=select31.getOptions().size();
		// select31.selectByIndex(sel31 - 1);

		// ac.selByVisibleText(selinventory, text);
		consume.click();
		lc.logs("Clicked on Consume");
		Thread.sleep(3000);
		consumecount.sendKeys("1");
		String a27=consumecount.getText();
		lc.logs("Consume Count"+" "+a27);
		Thread.sleep(3000);
		// consumecount.sendKeys(keysToSend);
		// ac.selByVisibleText(staff, staff1);
		ac.selByIndex(staff, 1);
		String a28=staff.getText();
		lc.logs("Staff"+" "+a28);
		Thread.sleep(3000);

		saveconsume.click();
		lc.logs("Consume Saved Success");
		// Thread.sleep(3000);
		// consumeok.click();

	}
}
