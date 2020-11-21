package com.dca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;

public class SiteVisitPage extends BaseClass {
	ActionDriver ad=new ActionDriver();
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
	public void siteVisit(String stages,String types,String staffs,String vdate,String des,String eddate  ) throws InterruptedException {
		addnew.click();
		ad.selByVisibleText(stage, stages);
		ad.selByVisibleText(stafftype, types);
		ad.selByVisibleText(staff, staffs);
		Thread.sleep(3000);
		visitdate.sendKeys(vdate);
		description.sendKeys(des);
		save.click();
		saveok.click();
		Thread.sleep(3000);
		ad.selByVisibleText(stagefilter, stages);
		ad.selByVisibleText(stafftypefilter, types);
		//ad.selByVisibleText(stafffilterr, staffs);
		Thread.sleep(3000);
		editclick.click();
		editsdate.sendKeys(eddate);
		update.click();
		updateok.click();
		Thread.sleep(3000);
		delete.click();
		deleteok.click();
		deletelast.click();
		
		
	}

}
