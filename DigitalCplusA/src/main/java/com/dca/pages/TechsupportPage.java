package com.dca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;

public class TechsupportPage extends BaseClass {
	ActionDriver ad=new ActionDriver();
	@FindBy(xpath="//select[@id='ProjectID']")
	WebElement selproject;
	@FindBy(xpath="//button[@id='btn_button']")
	WebElement addnew;
	@FindBy(xpath="//input[@id='date']")
	WebElement date;
	@FindBy(xpath="//textarea[@id='txt_supportNotes']")
	WebElement issue;
	@FindBy(xpath="//textarea[@id='txt_supportName']")
	WebElement description;
	@FindBy(xpath="//button[@id='btn_utilitySave']")
	WebElement save;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement saveok;
	
	public TechsupportPage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	
	public void techsupport(String selproject1,String dates,String issues,String descriptions ) {
		ad.selByVisibleText(selproject, selproject1);
		addnew.click();
		date.sendKeys(dates);
		issue.sendKeys(issues);
		description.sendKeys(descriptions);
		save.click();
		saveok.click();
	}
	
		
	
	
	
	

}
