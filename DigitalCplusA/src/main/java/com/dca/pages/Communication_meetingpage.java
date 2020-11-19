package com.dca.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;

public class Communication_meetingpage extends BaseClass{
	ActionDriver ac=new ActionDriver();
	@FindBy(xpath="//select[@id='ProjectID']")
	WebElement selproject;
	@FindBy(xpath="//button[@id='btn_button']")
	WebElement addminutesofmeeting;
	@FindBy(xpath="//select[@id='MeetingTypeID']")
	WebElement meetinftype;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-meeting-minutes[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[3]/input[1]")
	WebElement meetinflink;
	
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-meeting-minutes[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[2]/div[3]/input[1]")
	WebElement password;
	@FindBy(xpath="//select[@id='MeetingCategory']")
	WebElement meetingcategory;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-meeting-minutes[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[3]/input[1]")
	WebElement meetingdate;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-meeting-minutes[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[3]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]")
	WebElement staffattendes;
	@FindBy(xpath="//select[@id='Attendees2']")
	WebElement clientattendes;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-meeting-minutes[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[3]/div[1]/input[1]")
	WebElement meetingtime;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-meeting-minutes[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[7]/div[3]/input[1]")
	WebElement meetingname;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-meeting-minutes[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[8]/div[3]/input[1]")
	WebElement location;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-meeting-minutes[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[9]/div[3]/input[2]")
	WebElement includetransmit;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save3;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement saveok3;
	
	@FindBy(xpath="//select[@id='MeetingTypeID']")
	WebElement selectmeetingtype;
	@FindBy(xpath="//tbody/tr[2]/td[12]/i[1]")
	WebElement edit12;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-meeting-minutes[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[3]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]")
	WebElement updatestaffattendes;
	@FindBy(xpath="//button[contains(text(),'Update')]")
	WebElement update12;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement update12ok;
	@FindBy(xpath="//div[contains(text(),'Select All')]")
	WebElement selclient;
	public Communication_meetingpage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	public void comm_meeting(String selproject1,String meettype,
			String link,String pswd,String meetcate,String meetdate,String clientattend,String meettime,
			String meetname,String meetloc,String selmeettype ) throws InterruptedException {
		ac.selByVisibleText(selproject, selproject1);
		addminutesofmeeting.click();
		ac.selByVisibleText(meetinftype, meettype);
		try {
			meetinflink.sendKeys(link);
			password.sendKeys(pswd);
		} catch (Exception e) {
			System.out.println(e);
		}
		ac.selByVisibleText(meetingcategory, meetcate);
		meetingdate.sendKeys(meetdate);
		//ac.selByVisibleText(staffattendes, staffattend);
		//ac.selByIndex(staffattendes, 2);
		staffattendes.click();
		selclient.click();
		
		ac.selByVisibleText(clientattendes, clientattend);
		meetingtime.sendKeys(meettime);
		meetingname.sendKeys(meetname);
		location.sendKeys(meetloc);
		includetransmit.click();
		save3.click();
		saveok3.click();
		Thread.sleep(3000);
		ac.selByVisibleText(selectmeetingtype, selmeettype);
		Thread.sleep(3000);
		edit12.click();
		staffattendes.click();
		selclient.click();
		//ac.selByIndex(staffattendes, 2);
		//ac.selByVisibleText(updatestaffattendes,staffattend );
		update12.click();
		update12ok.click();
		
	}
	
}
