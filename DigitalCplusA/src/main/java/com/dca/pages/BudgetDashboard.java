package com.dca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.utility.ListenerClass;

public class BudgetDashboard extends BaseClass{
	ActionDriver ac=new ActionDriver();
	ListenerClass lc=new ListenerClass();
	@FindBy(xpath="//select[@id='ProjectID']")
	WebElement selproject;
	@FindBy(xpath="//button[contains(text(),'Add New')]")
	WebElement addnew;
	@FindBy(xpath="//select[@id='Stage']")
	WebElement stage;
	@FindBy(xpath="//input[@id='NoOfHours']")
	WebElement hours;
	@FindBy(xpath="//textarea[@id='Description']")
	WebElement description;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement saveok;
	@FindBy(xpath="//tbody/tr[2]/td[4]/i[1]")
	WebElement editclick;
	@FindBy(xpath="//input[@id='NoOfHours']")
	WebElement edithrs;
	@FindBy(xpath="//button[contains(text(),'Update')]")
	WebElement update;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement editok;
	@FindBy(xpath="//input[@id='txt_StaffsearchBuilding']")
	WebElement search;
	@FindBy(xpath="//button[contains(text(),'Export To Excel')]")
	WebElement exporttoexcel;
	@FindBy(xpath="//tbody/tr[2]/td[4]/i[2]")
	WebElement delete;
	@FindBy(xpath="//button[contains(text(),'Yes, delete it!')]")
	WebElement deleteok;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement deleteoklast;
	
	public BudgetDashboard() {
		PageFactory.initElements(getDriver(), this);
		
		
		
	}


public void budgetDashboard1(String selproject1, String stage1, String hour, String des, String edithrs1) throws InterruptedException {
	// TODO Auto-generated method stub
	// TODO Auto-generated method stub
		ac.selByVisibleText(selproject, selproject1);
		Thread.sleep(3000);
		addnew.click();
		lc.logs("Clicked On AddNew");
		Thread.sleep(3000);
		ac.selByVisibleText(stage,stage1);
		lc.logs("Selcted Stage"+" "+stage1);
		hours.sendKeys(hour);
		String a1=hours.getText();
		lc.logs("Hours"+" "+a1);
		description.sendKeys(des);
		String a2=description.getText();
		lc.logs("Description"+" "+des);
		save.click();
		Thread.sleep(3000);
		saveok.click();
		lc.logs("Form Saved Success");
		search.sendKeys(stage1);
		search.clear();
		editclick.click();
		lc.logs("Clicked on Edit");
		edithrs.sendKeys(edithrs1);
		String a3=edithrs.getText();
		lc.logs("Edited Hours"+" "+a3);
		update.click();
		editok.click();
		lc.logs("Updated Success");
		Thread.sleep(3000);
		exporttoexcel.click();
		lc.logs("Export Success");
		delete.click();
		lc.logs("Clicked on Delete");
		deleteok.click();
		deleteoklast.click();
		lc.logs("Delete Success");
	
}


}

