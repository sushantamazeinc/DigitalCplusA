package com.dca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;

public class AnnouncementPage extends BaseClass {
	ActionDriver ad=new ActionDriver();
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
	
	public void announcement(String selproject1, String announcements,String descriptions,String dates,String times,String details,String venus,String edate ) throws InterruptedException {
		ad.selByVisibleText(selproject, selproject1);
		Thread.sleep(3000);
		addnew.click();
		announcementfor.click();
		announcement.sendKeys(announcements);
		description.sendKeys(descriptions);
		date.sendKeys(dates);
		time.sendKeys(times);
		announcementdetails.sendKeys(details);
		venu.sendKeys(venus);
		save.click();
		saveok.click();
		search.sendKeys(announcements);
		edit.click();
		editdate.sendKeys(edate);
		update.click();
		updateok.click();
		delete.click();
		deleteok.click();
		deleteoklast.click();
		
		
		
		
		
		
	}

	
	
}
