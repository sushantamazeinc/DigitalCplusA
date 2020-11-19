package com.dca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;

public class ProjectActionsPages extends BaseClass {
	ActionDriver ac=new ActionDriver();
	@FindBy(xpath="//body/app-root[1]/div[2]/div[1]/nav[1]/ul[1]/li[4]/a[1]")
	WebElement projectactions;
	@FindBy(xpath="//a[contains(text(),'Actions Items')]")
	WebElement actionitems;
	@FindBy(xpath="//button[@id='btn_button']")
	WebElement addactionitems;
	@FindBy(xpath="//input[@id='Item']")
	WebElement actionitemtype;
	@FindBy(xpath="//textarea[@id='Des_Subject']")
	WebElement taskname;
	@FindBy(xpath="//select[@id='ddl_Priority']")
	WebElement priority;
	@FindBy(xpath="//select[@id='ddl_Assigned']")
	WebElement assignedto;
	@FindBy(xpath="//input[@id='txt_DueDate']")
	WebElement duedate;
	@FindBy(xpath="//textarea[@id='Des_Description']")
	WebElement description;
	@FindBy(xpath="//select[@id='ddl_Status']")
	WebElement status;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement ok;
	
	
	
	
	
	@FindBy(xpath="//a[contains(text(),'Completed Action Items')]")
	WebElement completedactionitems;
	@FindBy(xpath="//a[contains(text(),'Over Due Items')]")
	WebElement overdueitems;

}
