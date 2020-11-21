package com.dca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;

public class BudgetDashboard extends BaseClass{
	ActionDriver ac=new ActionDriver();
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

public void budgetDashboard(String stage1,String hour, String des, String edithrs1) throws InterruptedException {
	// TODO Auto-generated method stub
	Thread.sleep(3000);
	addnew.click();
	Thread.sleep(3000);
	ac.selByVisibleText(stage,stage1);
	hours.sendKeys(hour);
	description.sendKeys(des);
	save.click();
	Thread.sleep(3000);
	saveok.click();
	search.sendKeys(stage1);
	search.clear();
	editclick.click();
	edithrs.sendKeys(edithrs1);
	update.click();
	editok.click();
	Thread.sleep(3000);
	exporttoexcel.click();
	delete.click();
	deleteok.click();
	deleteoklast.click();
	
	
	
}


}

