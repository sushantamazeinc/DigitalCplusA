package com.dca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;

public class LabourPage extends BaseClass {
	ActionDriver ac=new ActionDriver();
	@FindBy(xpath="//select[@id='ProjectID']")
	WebElement selproject;
	@FindBy(xpath="//select[@id='StaffTypeID']")
	WebElement selstafftype;
	@FindBy(xpath="//select[@id='GetStaffID']")
	WebElement selectstaff;
	@FindBy(xpath="//tbody/tr[2]/td[7]/i[2]")
	WebElement edit;
	@FindBy(xpath="//button[contains(text(),'Update')]")
	WebElement update;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement updateok;
	@FindBy(xpath="//button[@id='exportButton']")
	WebElement export;
	
	public LabourPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void labour(String selproject1, String selstafftype1, String selectstaff1) throws InterruptedException {
		ac.selByVisibleText(selproject, selproject1);
		ac.selByVisibleText(selstafftype, selstafftype1);
		ac.selByVisibleText(selectstaff, selectstaff1);
		Thread.sleep(3000);
		export.click();
		Thread.sleep(2000);
		edit.click();
		update.click();
		updateok.click();
		
	}
}