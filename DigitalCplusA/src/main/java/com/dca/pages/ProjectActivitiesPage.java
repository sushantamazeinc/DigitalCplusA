package com.dca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.utility.ListenerClass;

public class ProjectActivitiesPage extends BaseClass {
	ActionDriver ad=new ActionDriver();
	ListenerClass lc=new ListenerClass();
	@FindBy(xpath="//select[@id='ProjectID']")
	WebElement selproject;
	@FindBy(xpath="//button[@id='btn_button']")
	WebElement addnew;
	@FindBy(xpath="//select[@id='StageID']")
	WebElement stage;
	@FindBy(xpath="//select[@id='StaffTypeID']")
	WebElement stafftype;
	@FindBy(xpath="//select[@id='StaffID']")
	WebElement staff;
	@FindBy(xpath="//input[@id='StartDate']")
	WebElement startdate;
	@FindBy(xpath="//input[@id='EndDate']")
	WebElement enddate;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-projectwork-assign[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[7]/div[3]/angular-editor[1]/div[1]/div[1]/div[1]")
	WebElement description;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement saveok;
	@FindBy(xpath="//select[@id='StageID']")
	WebElement stagefilter;
	@FindBy(xpath="//select[@id='StaffTypeID']")
	WebElement stafftypefilter;
	//@FindBy(css="#StaffName")
	//WebElement stafffilter;
	@FindBy(xpath="//tbody/tr[2]/td[7]/i[1]")
	WebElement editclick;
	@FindBy(xpath="//input[@id='StartDate']")
	WebElement editsdate;
	@FindBy(xpath="//button[contains(text(),'Update')]")
	WebElement update;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement updateok;
	@FindBy(xpath="//tbody/tr[2]/td[7]/i[2]")
	WebElement delete;
	@FindBy(xpath="//button[contains(text(),'Yes, delete it!')]")
	WebElement deleteok;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement deletelast;
	
	
	
	public ProjectActivitiesPage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	
	
	public void projectTeam1(String selproject1, String stages, String stafftypes, String staffs, String sdate, String edate, String des,String eddate) throws InterruptedException {
		// TODO Auto-generated method stub
		ad.selByVisibleText(selproject, selproject1);
		addnew.click();
		lc.logs("clicked on add new");
		
		ad.selByVisibleText(stage,stages );
		lc.logs("selected stage"+" "+stages);
		
		ad.selByVisibleText(stafftype, stafftypes );
		lc.logs("selected staff type"+" "+stafftypes);
		
		ad.selByVisibleText(staff, staffs );
		lc.logs("selected staff"+" "+staffs);
		
		startdate.sendKeys(sdate);
		String d=startdate.getText();
		lc.logs("startdate is picked"+" "+d);
		Thread.sleep(3000);
		
		enddate.sendKeys(edate);
		String e=enddate.getText();
		lc.logs("enddate is picked"+" "+e);
		
		Thread.sleep(3000);
		description.sendKeys(des);
		String des1=description.getText();
		lc.logs("description entered"+" "+des1);
		
		
		save.click();
		saveok.click();
		lc.logs("saved successfully");
		
		ad.selByVisibleText(stagefilter, stages);
		ad.selByVisibleText(stafftypefilter, stafftypes);
		Thread.sleep(3000);
		
		//ad.selByVisibleText(stafffilter, staffs);
		editclick.click();
		editsdate.sendKeys(eddate);
		String ed=editsdate.getText();
		lc.logs("date is edited"+" "+ed);
		
		update.click();
		updateok.click();
		Thread.sleep(3000);
		lc.logs("updated successfully");
		
		delete.click();
		deleteok.click();
		deletelast.click();
		lc.logs("deleted successfully");
		
		
		
		
	}
	
}
