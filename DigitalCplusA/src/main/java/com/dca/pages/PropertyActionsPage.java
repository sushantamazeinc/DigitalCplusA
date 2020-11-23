package com.dca.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;

public class PropertyActionsPage extends BaseClass {
	ActionDriver ac=new ActionDriver();
	PropertyActionsPage projectpage;
	@FindBy(id="btn_button")
	public WebElement addnew;
	@FindBy(id="ProjectID")
	WebElement selproject;
	@FindBy(id="ddl_sBillType")
	WebElement selcountry;
	@FindBy(id="ddl_BillType")
	WebElement selstate;
	@FindBy(id="cityname")
	WebElement selcity;
	@FindBy(xpath="//tbody/tr[2]/td[9]/i[1]")
	WebElement edit;
	@FindBy(xpath="//tbody/tr[2]/td[9]/i[2]")
	WebElement delete;
	@FindBy(xpath="//tbody/tr[2]/td[9]/i[3]")
	WebElement attachment;
	@FindBy(xpath="//button[contains(text(),'Delete')]")
	WebElement attachmentdelete;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-building[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")
	WebElement attachmentupdate;
	@FindBy(xpath="//tbody/tr[2]/td[9]/i[4]")
	WebElement addphoto;
	@FindBy(xpath="//input[@id='txt_ContactPersonName']")
	WebElement updatedata;
	@FindBy(xpath="//button[contains(text(),'Update')]")
	WebElement updatebtn;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement popupupdate;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-building[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/ngx-dropzone[1]/div[1]/p[1]")
	WebElement updatephoto;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-building[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/button[1]")
	WebElement photoupdatebtn;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement photoupdatesuccessbtn;
	@FindBy(xpath="//button[contains(text(),'Yes, delete it!')]")
	WebElement confirmdelete;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-building[1]/div[4]/div[1]/div[1]/div[1]/div[3]/div[1]/ngx-dropzone[1]/div[1]")
	WebElement addPhotoNew;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-building[1]/div[4]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/button[1]")
	WebElement addphotobtn;
	@FindBy(xpath="//button[contains(text(),'Yes, delete it!')]")
	WebElement filedelete;
	//@FindBy(xpath="//button[contains(text(),'No, keep it')]")
	//WebElement nophotodel;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement lastdel;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement addphotook;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement filedelok;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[1]/nav[1]/ul[1]/li[2]/a[1]")
	WebElement dropconstructionproject;
	@FindBy(xpath="//a[contains(text(),'Project Files')]")
	WebElement selprojectfile;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[2]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[6]/a[1]")
	WebElement selprojecttimeline;
	@FindBy(linkText = "Communication")
	WebElement communication;
	@FindBy(xpath="//a[contains(text(),'Transmittals')]")
	WebElement transmittals;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[1]/nav[1]/ul[1]/li[5]/ul[1]/li[3]/a[1]")
	WebElement minutesofmeeting;
	@FindBy(linkText = "Project Emails")
	
	WebElement projectemails;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[1]/nav[1]/ul[1]/li[6]/ul[1]/li[1]/a[1]")
	WebElement projectmail;
	@FindBy(linkText ="Locator Request")
	WebElement locatorrequest;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[1]/nav[1]/ul[1]/li[5]/ul[1]/li[1]/a[1]")
	WebElement sellocatorrequest;
	@FindBy(linkText ="Field Management Tool")
	WebElement dropfieldmanagement;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[1]/nav[1]/ul[1]/li[8]/ul[1]/li[1]/a[1]")
	WebElement fieldmanagementtool;
	@FindBy(partialLinkText ="Expens")
	WebElement dropexpence;
	@FindBy(xpath="//a[contains(text(),'Material Expenses')]")
	WebElement materialexpence;
	@FindBy(linkText="Labour Expenses")
	WebElement lab;
	@FindBy(linkText = "Casas Employees")
	WebElement dropcasasemployee;
	@FindBy(xpath=("//body/app-root[1]/div[2]/div[1]/nav[1]/ul[1]/li[10]/ul[1]/li[1]/a[1]"))
	WebElement casasemployee;
	@FindBy(linkText = "Client Contacts")
	WebElement clientcontacts;
	@FindBy(linkText = "Staff Leave")
	WebElement staffLeave;
	@FindBy(linkText = "Inventory")
	WebElement inventory;
	@FindBy(xpath="//a[contains(text(),'Item Master')]")
	WebElement itemMaster;
	
	@FindBy(linkText ="Suppliers")
	WebElement suppliers;
	@FindBy(css="div.wrapper:nth-child(3) nav.navbarCustomProperties ul.list-unstyled.components li.submenuAlingment:nth-child(13) ul.list-unstyled.submenuAlingment.collapse.in li:nth-child(1) > a:nth-child(1)")
	WebElement supply;
	@FindBy(xpath="//a[contains(text(),'Supplier Invoice')]")
	WebElement supplierinvoice;
	@FindBy(xpath="//a[contains(text(),'Budget Dashboard')]")
	WebElement dropbudgetpage;
	@FindBy(xpath="//a[contains(text(),'Project Team')]")
	WebElement droprojectteam;
	@FindBy(xpath="//a[@href='#Update']")
	WebElement droprojectactivitiesmain;
	@FindBy(xpath="//a[contains(text(),'Site Visits')]")
	WebElement dropsitevisit;
	@FindBy(xpath="//a[@routerlink='/ProjectworkAssignDash']")
	WebElement droprojectactivities;
	@FindBy(xpath="//a[contains(text(),'My Tasks')]")
	WebElement dropmytask;
	@FindBy(partialLinkText="Project Actio")
	WebElement dropprojectactions;
	@FindBy(xpath="//a[contains(text(),'Actions Items')]")
	WebElement dropactionitem;
	@FindBy(partialLinkText ="Asse")
	WebElement dropassetsmain;
	@FindBy(linkText ="Asset")
	WebElement dropasset;
	@FindBy(css = "div.wrapper:nth-child(3) div:nth-child(1) nav.navbarCustomProperties ul.list-unstyled.components li.submenuAlingment:nth-child(15) > a.hoverchangeproperty")
	WebElement dropannouncementsmain;
	@FindBy(xpath ="//a[@routerlink='/Announcements']")
	WebElement dropannouncements;
	@FindBy(xpath ="//body/app-root[1]/div[2]/div[1]/nav[1]/ul[1]/li[14]/a[1]")
	WebElement dropmaster;
	@FindBy(xpath ="//a[contains(text(),'Punch List')]")
	WebElement droppunchlistmaster;
	@FindBy(xpath ="//a[contains(text(),'Architectural Stages')]")
	WebElement droparchitecturalstagemaster;
	@FindBy(xpath ="//body/app-root[1]/div[2]/div[1]/nav[1]/ul[1]/li[17]/a[1]")
	WebElement droptechsupportmain;
	@FindBy(xpath ="//a[contains(text(),'New Support Ticket')]")
	WebElement droptechsupport;
	
	///////////////////////////
	@FindBy(partialLinkText = "Construction Projec")
	WebElement constpro;
	
	////////////////////////////////////////
	
	public PropertyActionsPage() {
		PageFactory.initElements(getDriver(), this);
	}
	public PropertPage add() {
		addnew.click();
		return new PropertPage();
	}
	/**
	 * @throws IOException 
	 * 	 
	 */
	public void paction() throws InterruptedException, IOException {
		//Select select7=new Select(selproject);
		/**
		 * 	 Update projectname here
		 */
		
		//select7.selectByVisibleText("computer111");
		//Thread.sleep(5000);
		Select select8=new Select(selcountry);
		select8.selectByIndex(1);
		Select select9=new Select(selstate);
		select9.selectByIndex(1);
		Select select10=new Select(selcity);
		select10.selectByIndex(1);
		Thread.sleep(3000);
		edit.click();
		String olddata=updatedata.getAttribute("value");
		System.out.println("old data"+olddata);
		updatedata.clear();
		updatedata.sendKeys("Amit");
		String udata=updatedata.getAttribute("value");
		System.out.println("updated data"+udata);
		updatebtn.click();
		popupupdate.click();
		Thread.sleep(3000);
		attachment.click();
		attachmentdelete.click();
		confirmdelete.click();
		lastdel.click();
		
		Thread.sleep(2000);
		addphoto.click();
		//addPhotoNew.sendKeys("C:\\Users\\Amaze Inc Lap 03\\git\\DigitalCplusA\\DigitalCplusA\\Imagesrc\\flower.jpg");
		addPhotoNew.click();
		ac.upload();
		
		
		addphotobtn.click();
		addphotook.click();
		Thread.sleep(3000);
		
		attachment.click();
		attachmentupdate.click();
		//updatephoto.sendKeys("C:\\Users\\Amaze Inc Lap 03\\git\\DigitalCplusA\\DigitalCplusA\\Imagesrc\\flower.jpg");
		updatephoto.click();
		ac.upload();
		
		photoupdatebtn.click();
		photoupdatesuccessbtn.click();
		//Thread.sleep(2000);
		
		/*delete.click();
		filedelete.click();
		filedelok.click();*/
		
		}
	public ProjectFilesPages droprojectfile() {
		//Select select12=new Select(dropprojectfile);
		//select12.selectByIndex(1);
		dropconstructionproject.click();
		selprojectfile.click();
		return new ProjectFilesPages();
	}
	public ProjectTimelines1page droptimeline() throws InterruptedException {
		dropconstructionproject.click();
		selprojecttimeline.click();
		Thread.sleep(3000);
		return new ProjectTimelines1page();
	}
	public Communication communic() {
		communication.click();
		transmittals.click();
		return new Communication();
	}
	public Communication_meetingpage communication_meeting() {
		communication.click();
		minutesofmeeting.click();
		return new Communication_meetingpage();
	}

	public ProjectEmailsPage project_emails() {
		projectemails.click();
		projectmail.click();
		return new ProjectEmailsPage();
		
	}
	
	public LocatorRequestPage drop_LocatorRequest() throws InterruptedException {
		locatorrequest.click();
		Thread.sleep(3000);
		sellocatorrequest.click();
		return new LocatorRequestPage();
	}
	public FieldManagementToolPage dropfieldmanagementtool() {
		dropfieldmanagement.click();
		fieldmanagementtool.click();
		return new FieldManagementToolPage();
	}
	public MaterialExpencesPage materialexpence() {
		dropexpence.click();
		materialexpence.click();
		return new MaterialExpencesPage();
	}
	public LabourExpencepPage labourexpence() {
		dropexpence.click();
		materialexpence.click();
		return new LabourExpencepPage();
	}
	
	public LabourPage labour() {
		dropexpence.click();
		lab.click();
		return new LabourPage();
	}
	public CasasEmployeePage casasemployee() {
		dropcasasemployee.click();
		casasemployee.click();
		return new CasasEmployeePage();
	}
	
	public ClientContactPage clientcontact() {
		dropcasasemployee.click();
		clientcontacts.click();
		return new ClientContactPage();
	}
	public StaffLeavePage staffleave() {
		dropcasasemployee.click();
		staffLeave.click();
		return new StaffLeavePage();
	}
	public SupplierOnlyPage inventory() {
		inventory.click();
		itemMaster.click();
		return new SupplierOnlyPage();
	}
	public SupplierOnlyPage supplier() throws AWTException, InterruptedException {
		suppliers.click();
		 Robot robot=new Robot();
		 for(int i=0;i<2;i++) {
			 robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			 Thread.sleep(3000);
		 }
		supply.click();
		return new SupplierOnlyPage();
	}
	
	public SupplierInvoice supplierinvo() throws InterruptedException, AWTException{
		suppliers.click();
		 Robot robot=new Robot();
		 for(int i=0;i<1;i++) {
			 robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			 Thread.sleep(3000);
		 }
		supplierinvoice.click();
		return new SupplierInvoice();
	}
public BudgetDashboard dropbupage() throws InterruptedException {
		
	constpro.click();
		Thread.sleep(3000);
		dropbudgetpage.click();
			return new BudgetDashboard();
		}
	
	public ProjectTeam dropproteam() throws InterruptedException {
		constpro.click();
		droprojectteam.click();
		Thread.sleep(3000);
		return new ProjectTeam();
	}
	public ProjectActivitiesPage dropproactivities() throws InterruptedException {
		droprojectactivitiesmain.click();
		Thread.sleep(3000);
		droprojectactivities.click();
		Thread.sleep(3000);
		return new ProjectActivitiesPage();
		
	}
	public SiteVisitPage dropsitevisits() throws InterruptedException {
		droprojectactivitiesmain.click();
		Thread.sleep(3000);
		dropsitevisit.click();
		Thread.sleep(3000);
		return new SiteVisitPage();
		
		
	}
	public MyTaskPage dropmytasks() throws InterruptedException {
		droprojectactivitiesmain.click();
		Thread.sleep(3000);
		dropmytask.click();
		Thread.sleep(3000);
		return new MyTaskPage();
		
		
	}
	public ActionItemPage dropactionitem() throws InterruptedException {
		dropprojectactions.click();
		Thread.sleep(3000);
		dropactionitem.click();
		Thread.sleep(3000);
		return new ActionItemPage();
		
		
	}
	public AssetsPage dropasset() throws InterruptedException {
		
		dropassetsmain.click();
		Thread.sleep(3000);
		dropasset.click();
		Thread.sleep(3000);
		return new AssetsPage();
		
		
	}
public  AnnouncementPage dropannouncement() throws InterruptedException, AWTException {
	
	JavascriptExecutor js = (JavascriptExecutor) getDriver();
	js.executeScript("arguments[0].scrollIntoView();", dropannouncementsmain);
	 Dimension dm = new Dimension(1200,730);
		getDriver().manage().window().setSize(dm);
	    dropannouncementsmain.click();
		Thread.sleep(3000);
		Robot robot=new Robot();
		  for(int i=0;i<1;i++) {
		  robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(3000);
		  }
		 
		dropannouncements.click();
		Thread.sleep(3000);
		return new AnnouncementPage();
		
		}
public  PunchlistMastersPage droppunchlistmastert() throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) getDriver();
	js.executeScript("arguments[0].scrollIntoView();", dropmaster);
	dropmaster.click();
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();", droppunchlistmaster);
		droppunchlistmaster.click();
		Thread.sleep(3000);
		return new PunchlistMastersPage();
		
		
		
	}
public  ArchitecturalstagemasterPage droparchitecturalstagemaster() throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) getDriver();
	js.executeScript("arguments[0].scrollIntoView();", dropmaster);
	dropmaster.click();
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();", droppunchlistmaster);
		droparchitecturalstagemaster.click();
		Thread.sleep(3000);
		return new ArchitecturalstagemasterPage();
		
		
		
	}

public TechsupportPage droptechsupport() throws InterruptedException {
	// TODO Auto-generated method stub
	Dimension dm = new Dimension(1400,2000);
	getDriver().manage().window().setSize(dm);
	JavascriptExecutor js = (JavascriptExecutor) getDriver();
	js.executeScript("arguments[0].scrollIntoView();", droptechsupportmain);
	droptechsupportmain.click();
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();", droptechsupport);
		droptechsupport.click();
		Thread.sleep(3000);
		return new TechsupportPage();
		
	
}
	
	
	
}
	
	


