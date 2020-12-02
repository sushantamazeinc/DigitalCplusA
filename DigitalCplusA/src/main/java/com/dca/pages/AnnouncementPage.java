package com.dca.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.utility.ListenerClass;

public class AnnouncementPage extends BaseClass {
	ActionDriver ad=new ActionDriver();
	ListenerClass lc=new ListenerClass();
	@FindBy(xpath="//select[@id='ProjectID']")
	WebElement selproject;	
	@FindBy(xpath="//button[contains(text(),'New Announcement')]")
	WebElement addnew;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-update-announcements[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[3]/input[1]")
	WebElement announcementfor;
	@FindBy(xpath="//input[@id='txt_announcements']")
	WebElement announcement;
	@FindBy(xpath="//textarea[@id='txt_announcementsDescriptions']")
	WebElement description;
	@FindBy(xpath="//input[@id='txt_announcementsDate']")
	WebElement date;
	@FindBy(xpath="//input[@id='txt_announcementsTime']")
	WebElement time;
	@FindBy(xpath="//textarea[@id='txt_announcementsDetails']")
	WebElement announcementdetails;
	@FindBy(xpath="//input[@id='txt_announcementsVenue']")
	WebElement venu;
	@FindBy(xpath="//p[contains(text(),'Drop your files here (or click)')]")
	WebElement attachment;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement saveok;
	@FindBy(xpath="//input[@id='txt_projectrequestSearch']")
	WebElement search;
	@FindBy(xpath="//tbody/tr[1]/td[5]/i[1]")
	WebElement edit;
	@FindBy(xpath="//input[@id='txt_announcementsDate']")
	WebElement editdate;
	@FindBy(xpath="//button[contains(text(),'Update')]")
	WebElement update;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement updateok;
	@FindBy(xpath="//tbody/tr[1]/td[5]/i[2]")
	WebElement delete;
	@FindBy(xpath="//button[contains(text(),'Yes, delete it!')]")
	WebElement deleteok;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement deleteoklast;
	
	
	
	public AnnouncementPage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	
	public void announcement(String selproject1, String announcements,String descriptions,String dates,String times,String details,String venus,String edate ) throws InterruptedException, IOException {
		Thread.sleep(3000);
		ad.selByVisibleText(selproject, selproject1);
		Thread.sleep(5000);
		addnew.click();
		lc.logs("Clicked On AddNew");
		announcementfor.click();
		lc.logs("Clicked on Annocement For");
		announcement.sendKeys(announcements);
		String a1=announcement.getText();
		lc.logs("Announcement"+" "+a1);
		description.sendKeys(descriptions);
		String a2=description.getText();
		lc.logs("Description"+" "+a2);
		date.sendKeys(dates);
		String a3=date.getText();
		lc.logs("Date"+" "+a3);
		time.sendKeys(times);
		String a4=time.getText();
		lc.logs("Time"+" "+a4);
		announcementdetails.sendKeys(details);
		String a5=announcementdetails.getText();
		lc.logs("Announcement Details"+" "+a5);
		venu.sendKeys(venus);
		String a6=venu.getText();
		lc.logs("Venue"+" "+a6);
		attachment.click();
		lc.logs("Clicked on Attachment");
		ad.upload();
		lc.logs("Attachment Upload Success");
		Thread.sleep(7000);
		save.click();
		saveok.click();
		lc.logs("Save Success");
		//search.sendKeys(announcements);
		edit.click();
		lc.logs("Clicked on Edit");
		editdate.sendKeys(edate);
		String a7=editdate.getText();
		lc.logs("Updated Date"+" "+a7);
		update.click();
		updateok.click();
		lc.logs("Update Success");
		delete.click();
		lc.logs("Clicked on Delete");
		deleteok.click();
		deleteoklast.click();
		lc.logs("Delete Success");
		
		
		
		
		
		
	}

	
	
}
