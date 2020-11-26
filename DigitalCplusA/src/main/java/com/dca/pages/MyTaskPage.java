package com.dca.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.utility.ListenerClass;

public class MyTaskPage extends BaseClass {
	ActionDriver ad=new ActionDriver();
	ListenerClass lc=new ListenerClass();
	@FindBy(xpath="//select[@id='ProjectID']")
	WebElement selproject;
	@FindBy(xpath="//button[@id='btn_button']")
	WebElement addnew;
	@FindBy(xpath="//input[@id='StartDate']")
	WebElement startdate;
	@FindBy(xpath="//input[@id='EndDate']")
	WebElement enddate;
	@FindBy(xpath="//input[@id='TaskName']")
	WebElement taskname;
	@FindBy(xpath="//textarea[@id='Description']")
	WebElement description;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement saveok;
	@FindBy(xpath="//input[@id='txt_StaffsearchBuilding']")
	WebElement search;
	@FindBy(xpath="//tbody/tr[2]/td[6]/i[1]")
	WebElement editclick;
	@FindBy(xpath="//input[@id='StartDate']")
	WebElement editsdate;
	@FindBy(xpath="//button[contains(text(),'Update')]")
	WebElement update;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement updateok;
	/*@FindBy(xpath="//tbody/tr[2]/td[6]/i[2]")
	WebElement delete;
	@FindBy(xpath="//button[contains(text(),'Yes, delete it!')]")
	WebElement deleteok;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement deletelast;*/
	@FindBy(xpath="//button[contains(text(),'Complete')]")
	WebElement completeclick;
	@FindBy(xpath="//button[contains(text(),'Yes, Complete it!')]")
	WebElement complete;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement completeok;
	@FindBy(xpath="//a[contains(text(),'Completed Tasks')]")
	WebElement dropcompletetask;
	@FindBy(xpath="//input[@id='txt_StaffsearchBuilding']")
	WebElement search1;
	
	
	
	public MyTaskPage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	
	public void myTask(String selproject1,String sdate,String edate,String task,String des,String eddate   ) throws InterruptedException {
		ad.selByVisibleText(selproject, selproject1);
		addnew.click();
		lc.logs("clicked on add new");
		
		startdate.sendKeys(sdate);
		String sd=startdate.getText();
		lc.logs("picked start date"+" "+sd);
		
		enddate.sendKeys(edate);
		String ed=enddate.getText();
		lc.logs("picked end date"+" "+ed);
		
		taskname.sendKeys(task);
		String tn=taskname.getText();
		lc.logs("task name entered"+" "+tn);
		
		description.sendKeys(des);
		String de=description.getText();
		lc.logs("description entered"+" "+de);
		
		save.click();
		saveok.click();
		lc.logs("saved successfully");
		
		search.sendKeys(task);
		String se=search.getText();
		lc.logs("search is working"+" "+se);
		
		
		editclick.click();
		editsdate.sendKeys(eddate);
		String editdate1=editsdate.getText();
		lc.logs("edited end date"+" "+editdate1);
		update.click();
		updateok.click();
		lc.logs("updated successfully");
		
		Thread.sleep(3000);
		/*delete.click();
		deleteok.click();
		deletelast.click();*/
		completeclick.click();
		lc.logs("clicked on complete");
		complete.click();
		completeok.click();
		dropcompletetask.click();
		Thread.sleep(3000);
		search1.sendKeys(task);
		System.out.println(task);
		
		
		
		
		
	
		
		
		
		
		
	}
	
	
	

}
