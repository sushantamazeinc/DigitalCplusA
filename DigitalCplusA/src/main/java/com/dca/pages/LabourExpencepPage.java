package com.dca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.utility.ListenerClass;

public class LabourExpencepPage extends BaseClass{
	ListenerClass lc=new ListenerClass();
	ActionDriver ac=new ActionDriver();
	@FindBy(xpath="//select[@id='ProjectID']")
	WebElement selproject;
	@FindBy(xpath="//button[@id='btn_button']")
	WebElement addexpence;
	@FindBy(xpath="//select[@id='ExpenseType']")
	WebElement expencetype;
	@FindBy(xpath="//input[@id='ExpenseDate']")
	WebElement date;
	@FindBy(xpath="//button[contains(text(),'Add')]")
	WebElement add;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement saveok;
	@FindBy(xpath="//select[@id='StaffTypeID']")
	WebElement stafftype;
	@FindBy(xpath="//select[@id='StaffID']")
	WebElement staff;
	@FindBy(xpath="//input[@id='noofhrs']")
	WebElement noofhour;
	@FindBy(xpath="//textarea[@id='Remarks']")
	WebElement remarks;
	@FindBy(xpath="//input[@id='TotalExpense']")
	WebElement amount1;
	public LabourExpencepPage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	public void labourexpence(String selpro,String expencetype2,String date2,
			String stafftype2,
			String staff2,String noumberhr,String remak,String amount12) throws InterruptedException {
		
	
	ac.selByVisibleText(selproject, selpro);
	addexpence.click();
	lc.logs("clicked on add new");
	
	ac.selByVisibleText(expencetype, expencetype2);
	lc.logs("selected expence type"+" "+expencetype2);
	Thread.sleep(5000);
	
	date.sendKeys(date2);
	String a1=date.getText();
	lc.logs("picked date"+" "+a1);
	
	ac.selByVisibleText(stafftype, stafftype2);
	lc.logs("selected staff type"+" "+stafftype2);
	
	ac.selByVisibleText(staff, staff2);
	lc.logs("selected staff "+" "+staff2);
	
	noofhour.sendKeys(noumberhr);
	String b1=noofhour.getText();
	lc.logs("entered no of hrs"+" "+b1);
	
	remarks.sendKeys(remak);
	String c1=remarks.getText();
	lc.logs("entered remarks"+" "+c1);
	
	amount1.sendKeys(amount12);
	String d1=amount1.getText();
	lc.logs("entered amount"+" "+d1);
	
	add.click();
	lc.logs("clicked on add buttun");
	Thread.sleep(3000);
	save.click();
	saveok.click();
	lc.logs("saved successfully");
	
	}
}
