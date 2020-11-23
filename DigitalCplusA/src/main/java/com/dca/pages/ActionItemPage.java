package com.dca.pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;

public class ActionItemPage extends BaseClass{
	ActionDriver ad=new ActionDriver();
	@FindBy(xpath="//select[@id='ProjectID']")
	WebElement selproject;
	@FindBy(xpath="//button[@id='btn_button']")
	WebElement addnew;
	@FindBy(xpath="//input[@id='Item']")
	WebElement itemtype;
	@FindBy(xpath="//textarea[@id='Des_Subject']")
	WebElement taskname;
	@FindBy(xpath="//select[@id='ddl_Priority']")
	WebElement priority;
	@FindBy(css="#ddl_Assigned")
	WebElement assignto;
	@FindBy(xpath="//input[@id='txt_DueDate']")
	WebElement duedate;
	@FindBy(xpath="//textarea[@id='Des_Description']")
	WebElement description;
	@FindBy(xpath="//select[@id='ddl_Status']")
	WebElement status;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement saveok;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement mailok;
	/*@FindBy(xpath="//select[@id='ddl_Assigned']")
	WebElement stafffilter;
	@FindBy(xpath="//input[@id='txt_StaffsearchBuilding']")
	WebElement search;
	@FindBy(xpath="//input[@id='txt_StaffsearchBuilding']")
	WebElement priorityfilter;*/
	@FindBy(xpath="//tbody/tr[2]/td[9]/i[2]")
	WebElement editclick;
	@FindBy(xpath="//select[@id='ddl_Status']")
	WebElement editstatus;
	@FindBy(xpath="//button[contains(text(),'Update')]")
	WebElement update;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement updateok;
	//delete
	/*@FindBy(xpath="//body[1]/app-root[1]/div[2]/div[2]/div[1]/app-action-items-dashboard[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[9]/i[1]")
	WebElement deleteclick;
	@FindBy(xpath="//button[contains(text(),'Yes, delete it!')]")
	WebElement deleteok;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement deletelast;*/
	
	@FindBy(xpath="//a[contains(text(),'Completed Action Items')]")
	WebElement dropcompleteditem;
	@FindBy(css="#ddl_Priority")
	WebElement comppriorityfilter;
	@FindBy(css="#ddl_Assigned")
	WebElement compstafffilter;
	
	@FindBy(xpath="//a[contains(text(),'Over Due Items')]")
	WebElement dropoverdue;
	@FindBy(xpath="//select[@id='ddl_Priority']")
	WebElement overduepriorityfilter;
	/*@FindBy(xpath="//select[@id='ddl_Assigned']")
	WebElement overduestafffilter;
	@FindBy(xpath="//input[@id='txt_StaffsearchBuilding']")
	WebElement overduesearch;*/
	
	
	public ActionItemPage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	public void actionItem(String selproject1, String item,String task,String priorities ,String assign,String date,String des,String status1,String estatus ) throws InterruptedException {
		ad.selByVisibleText(selproject, selproject1);
		Dimension dm = new Dimension(1200,730);
		getDriver().manage().window().setSize(dm);
		addnew.click();
		itemtype.sendKeys(item);
		taskname.sendKeys(task);
		ad.selByVisibleText(priority,priorities);
		Thread.sleep(3000);
		ad.selByVisibleText(assignto, assign);
		duedate.sendKeys(date);
		description.sendKeys(des);
		ad.selByVisibleText(status, status1);
	    save.click();
		saveok.click();
		Thread.sleep(3000);
		mailok.click();
		editclick.click();
		ad.selByVisibleText(editstatus, estatus);
		update.click();
		updateok.click();
		/*deleteclick.click();
		deleteok.click();
		deletelast.click();*/
		Thread.sleep(3000);
		
		dropcompleteditem.click();
		Thread.sleep(3000);
		ad.selByVisibleText(comppriorityfilter, priorities);
		Thread.sleep(3000);
		ad.selByVisibleText(compstafffilter, assign);
		
		dropoverdue.click();
		Thread.sleep(3000);
		ad.selByVisibleText(overduepriorityfilter, priorities);
		Thread.sleep(3000);
		//ad.selByVisibleText(overduestafffilter, assign);
		//ad.selByVisibleText(overduesearch, task);
		
		
		
		
		
		
		
		
		
		
	}

}
