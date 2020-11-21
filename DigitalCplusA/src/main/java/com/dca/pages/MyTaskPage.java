package com.dca.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;

public class MyTaskPage extends BaseClass {
	ActionDriver ad=new ActionDriver();
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
	
	public void myTask(String sdate,String edate,String task,String des,String eddate   ) throws InterruptedException {
		addnew.click();
		startdate.sendKeys(sdate);
		enddate.sendKeys(edate);
		taskname.sendKeys(task);
		description.sendKeys(des);
		save.click();
		saveok.click();
		search.sendKeys(task);
		editclick.click();
		editsdate.sendKeys(eddate);
		update.click();
		updateok.click();
		Thread.sleep(3000);
		/*delete.click();
		deleteok.click();
		deletelast.click();*/
		completeclick.click();
		complete.click();
		completeok.click();
		dropcompletetask.click();
		Thread.sleep(3000);
		search1.sendKeys(task);
		System.out.println(task);
		
		
		
		
		
	
		
		
		
		
		
	}
	
	
	

}
