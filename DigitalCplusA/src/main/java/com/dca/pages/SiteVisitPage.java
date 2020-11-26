package com.dca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.utility.ListenerClass;

public class SiteVisitPage extends BaseClass {
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
	WebElement visitdate;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-sitevisit[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[6]/div[3]/angular-editor[1]/div[1]/div[1]/div[1]")
	WebElement description;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement saveok;
	@FindBy(xpath="//select[@id='StageID']")
	WebElement stagefilter;
	@FindBy(xpath="//select[@id='StaffTypeID']")
	WebElement stafftypefilter;
	//@FindBy(xpath="//select[@id='StaffName']")
	//WebElement stafffilterr;
	@FindBy(xpath="//tbody/tr[2]/td[6]/i[1]")
	WebElement editclick;
	@FindBy(xpath="//input[@id='StartDate']")
	WebElement editsdate;
	@FindBy(xpath="//button[contains(text(),'Update')]")
	WebElement update;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement updateok;
	@FindBy(xpath="//tbody/tr[2]/td[6]/i[2]")
	WebElement delete;
	@FindBy(xpath="//button[contains(text(),'Yes, delete it!')]")
	WebElement deleteok;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement deletelast;
	
	
	
	
	
	public SiteVisitPage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	public void siteVisit(String selproject1, String stages,String types,String staffs,String vdate,String des,String eddate  ) throws InterruptedException {
		ad.selByVisibleText(selproject, selproject1);
		addnew.click();
		lc.logs("clicked on add new");
		
		ad.selByVisibleText(stage, stages);
		lc.logs("selected stage"+" "+stages);
		
		ad.selByVisibleText(stafftype, types);
		lc.logs("selected staff type"+" "+types);
		
		ad.selByVisibleText(staff, staffs);
		lc.logs("selected staff "+" "+staffs);
		Thread.sleep(3000);
		
		visitdate.sendKeys(vdate);
		String a1=visitdate.getText();
		lc.logs("picked visit date"+" "+a1);
		
		description.sendKeys(des);
		String de=description.getText();
		lc.logs("description entered"+" "+de);
		
		save.click();
		saveok.click();
		Thread.sleep(3000);
		lc.logs("saved successfully");
		
		ad.selByVisibleText(stagefilter, stages);
		Thread.sleep(3000);
		ad.selByVisibleText(stafftypefilter, types);
		//ad.selByVisibleText(stafffilterr, staffs);
		Thread.sleep(3000);
		
		editclick.click();
		Thread.sleep(3000);
		editsdate.sendKeys(eddate);
		String e1=editsdate.getText();
		lc.logs("edited date"+" "+e1);
		update.click();
		Thread.sleep(3000);
		updateok.click();
		Thread.sleep(3000);
		lc.logs("updated successfully");
		
		delete.click();
		deleteok.click();
		Thread.sleep(3000);
		deletelast.click();
		
		
	}

}
