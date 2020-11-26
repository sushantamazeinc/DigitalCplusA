package com.dca.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.utility.ListenerClass;

public class StaffLeavePage extends BaseClass{
	ActionDriver ac=new ActionDriver();
	ListenerClass lc=new ListenerClass();
	@FindBy(xpath="//select[@id='ProjectID']")
	WebElement selproject;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-staffleaves[1]/div[1]/div[2]/div[2]/div[1]/label[1]/span[1]")
	WebElement stafftoggle;
	@FindBy(xpath="//button[contains(text(),'Apply Leave')]")
	WebElement applyleave;
	@FindBy(xpath="//select[@id='ddl_StaffName']")
	WebElement staffName;
	@FindBy(xpath="//select[@id='ddl_BuildingName']")
	WebElement leaveType;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-applystaffleaves[1]/div[1]/div[3]/form[1]/div[3]/div[3]/div[1]/input[1]")
	WebElement sdate;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-applystaffleaves[1]/div[1]/div[3]/form[1]/div[4]/div[3]/div[1]/input[1]")
	WebElement edate;
	@FindBy(xpath="//select[@id='ddl_Covering']")
	WebElement coveringStaff;
	@FindBy(xpath="//textarea[@id='comment']")
	WebElement reason;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement saveok;
	@FindBy(xpath="//input[@id='txt_staffleavessearchBuilding']")
	WebElement search;
	@FindBy(xpath="//select[@id='ddl_buildingplans']")
	WebElement selleavetype;
	@FindBy(xpath="//tbody/tr[2]/td[9]/i[1]")
	WebElement reject;
	@FindBy(xpath="//tbody/tr[2]/td[9]/i[2]")
	WebElement accept;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-staffleaves[1]/div[2]/div[1]/div[1]/div[1]/div[3]/textarea[1]")
	WebElement reasonofcancel;
	@FindBy(xpath="//button[contains(text(),'Cancel')]")
	WebElement cancel;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement cancelok;
	@FindBy(partialLinkText = "Approved Staff Lea")
	WebElement approvestaffleave;
	@FindBy(partialLinkText = "Rejected Staff Lea")
	WebElement rejectedstaffleave;
	@FindBy(xpath="//button[@id='btn_buttsson']")
	WebElement accexport;
	@FindBy(xpath="//input[@id='txt_staffleavessearchBuilding']")
	WebElement accsearch;
	@FindBy(xpath="//select[@id='ddl_buildingplans']")
	WebElement accseleavetype;
	@FindBy(xpath="//body[1]/app-root[1]/div[2]/div[2]/div[1]/app-approved-staff-leaves[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]")
	WebElement accgetstaffname;
	@FindBy(xpath="//button[@id='btn_buttsson']")
	WebElement rejexport;
	@FindBy(xpath="//input[@id='txt_staffleavessearchBuilding']")
	WebElement rejsearch;
	@FindBy(xpath="//select[@id='ddl_buildingplans']")
	WebElement rejselleavetype;
	@FindBy(xpath="//body[1]/app-root[1]/div[2]/div[2]/div[1]/app-rejected-staff-leaves[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]")
	WebElement rejgetstaffname;
	@FindBy(partialLinkText = "Expens")
	WebElement scrol;
	@FindBy(linkText = "Casas Employees")
	WebElement scroll;
	@FindBy(xpath="//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/i[1]")
	WebElement drop;
	@FindBy(partialLinkText ="Communicati")
	WebElement drop1;
	
	
	
	public StaffLeavePage() {
		PageFactory.initElements(getDriver(), this);
	}
	 public void staffleave(String selproject1,String staffname1,String leavetype1,String sdate1,
			 String edate1,String coveringstaff,String reason1,String status,String resonforcancel1) throws InterruptedException, AWTException {
		 ac.selByVisibleText(selproject, selproject1);
		 //stafftoggle.click();
		 applyleave.click();
		 lc.logs("Clicked on apply leave");
		 
		 ac.selByVisibleText(staffName, staffname1);
		 lc.logs("selected staff name"+" "+staffname1);
		 
		 ac.selByVisibleText(leaveType, leavetype1);
		 lc.logs("selected leave type"+" "+leavetype1);
		 
		 sdate.sendKeys(sdate1);
		 String a1=sdate.getText();
		 lc.logs("picked start date"+" "+a1);
		 
		 edate.sendKeys(edate1);
		 String b1=sdate.getText();
		 lc.logs("picked end date"+" "+b1);
		 
		 ac.selByVisibleText(coveringStaff, coveringstaff);
		 lc.logs("selected covering staff"+" "+coveringstaff);
		 
		 reason.sendKeys(reason1);
		 String re=reason.getText();
		 lc.logs("Entered Reason"+" "+re);
		 
		 save.click();
		 saveok.click();
		 Thread.sleep(3000);
		 lc.logs("Saved Successfully");
		 
		 stafftoggle.click();
		 lc.logs("Clicked on staff toggle");
		 
		 search.sendKeys(staffname1);
		 ac.selByVisibleText(selleavetype, leavetype1);
		 lc.logs("selected leave type"+" "+leavetype1);
		 Thread.sleep(3000);
		 
		 if(status.contentEquals("Accepted")) {
			 accept.click();
		 }else {
			 reject.click();
			 reasonofcancel.sendKeys(resonforcancel1);
			 cancel.click();
			 cancelok.click();
		 }
		
		 scrol.click();
		
		 Robot robot=new Robot();
		 for(int i=0;i<2;i++) {
			 robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			 Thread.sleep(3000);
		 }
	
		 
		 if(status.contentEquals("Accepted")) {
		 approvestaffleave.click();
		 lc.logs("clicked on approved staff leave");
		 accexport.click();
		 accsearch.sendKeys(staffname1);
		 ac.selByVisibleText(accseleavetype, leavetype1);
		String accstaffname= accgetstaffname.getText();
		System.out.println("Match Found "+accstaffname);
		 }else {
			 rejectedstaffleave.click();
			 rejexport.click();
			 rejsearch.sendKeys(staffname1);
			 ac.selByVisibleText(rejselleavetype, leavetype1);
			 String rejstaffname=rejgetstaffname.getText();
			 System.out.println("Match Found "+rejstaffname);
			 
			 
		 }
		 
		 
		 
		 
	 }
	

}
