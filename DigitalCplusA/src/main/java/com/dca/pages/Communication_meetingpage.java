package com.dca.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.utility.ListenerClass;

public class Communication_meetingpage extends BaseClass{
	ActionDriver ac=new ActionDriver();
	ListenerClass lc=new ListenerClass();
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
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-meeting-minutes[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[3]/ng-multiselect-dropdown[1]/div[1]/div[1]/span[1]")
	WebElement staffattendes1;
	
	@FindBy(xpath="//a[@href='#/CompletedMeetingMinutesDash']")
	WebElement minutedOfMeet;
	@FindBy(xpath="//input[@id='txt_StaffsearchBuilding']")
	WebElement searchmeet;
	@FindBy(xpath="//button[contains(text(),'Add Meeting Minutes')]")
	WebElement addmeetingminute;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-completed-meeting-minutes-dash[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/angular-editor[1]/div[1]/div[1]/div[1]")
	WebElement addmeetdesc;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-completed-meeting-minutes-dash[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/ngx-dropzone[1]/div[1]")
	WebElement attachment;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement savemeet;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement savemeetok;
	@FindBy(xpath="//button[@id='exportButton']")
	WebElement exportmeet;
	@FindBy(xpath="//button[contains(text(),'Send Meeting Minutes')]")
	WebElement sendmeetingminutes;
	@FindBy(xpath="//select[@id='StaffMailID']")
	WebElement recepient;
	@FindBy(xpath="//input[@id='Subject']")
	WebElement subject;
	@FindBy(xpath="//input[@id='Date']")
	WebElement date;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-completed-meeting-minutes-dash[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/button[1]")
	WebElement send;
	public Communication_meetingpage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	
	

	public void comm_meeting(String selproject1, String meettype, String link, String pswd, String meetcate,
			String meetdate, String clientattend, String meettime, String meetname, String meetloc, String selmeettype,
			String updateddate, String subject1, String date1) throws InterruptedException, IOException {
	
ac.selByVisibleText(selproject, selproject1);
		
		addminutesofmeeting.click();
		lc.logs("clicked on add button");
		
		ac.selByVisibleText(meetinftype, meettype);
		lc.logs("selected meeting type"+" "+meettype);
		try {
			meetinflink.sendKeys(link);
			password.sendKeys(pswd);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		ac.selByVisibleText(meetingcategory, meetcate);
		lc.logs("selected meeting category"+" "+meetcate);
		
		meetingdate.sendKeys(meetdate);
		Thread.sleep(2000);
		String a1=meetingdate.getAttribute("value");
		lc.logs("picked date"+" "+a1);
		
		//ac.selByVisibleText(staffattendes, staffattend);
		//ac.selByIndex(staffattendes, 2);
		staffattendes.click();
		selclient.click();
		Thread.sleep(2000);
		staffattendes1.click();
		lc.logs("clicked on client");
		
		ac.selByVisibleText(clientattendes, clientattend);
		lc.logs("selected clientattendes"+" "+clientattend);
		
		meetingtime.sendKeys(meettime);
		Thread.sleep(2000);
		String b1=meetingtime.getAttribute("value");
		lc.logs("picked date"+" "+b1);
		
		meetingname.sendKeys(meetname);
		Thread.sleep(2000);
		String c1=meetingname.getAttribute("value");
		lc.logs("picked date"+" "+c1);
		
		location.sendKeys(meetloc);
		Thread.sleep(2000);
		String d1=location.getAttribute("value");
		lc.logs("picked date"+" "+d1);
		
		includetransmit.click();
		lc.logs("clicked on include transmittals");
		Thread.sleep(5000);
		save3.click();
		Thread.sleep(3000);
		saveok3.click();
		Thread.sleep(7000);
		lc.logs("saved successfully");
		
		ac.selByVisibleText(selectmeetingtype, selmeettype);
		Thread.sleep(3000);
		edit12.click();
		lc.logs("Clicked on Edit");
		staffattendes.click();
		selclient.click();
		Thread.sleep(2000);
		staffattendes1.click();
		meetingdate.sendKeys(updateddate);
		Thread.sleep(2000);
		String a7=meetingdate.getAttribute("value");
		lc.logs("Meeting Date"+" "+a7);
		//ac.selByIndex(staffattendes, 2);
		//ac.selByVisibleText(updatestaffattendes,staffattend );
		update12.click();
		update12ok.click();
		lc.logs("Updated Successfully");
		Thread.sleep(3000);
		minutedOfMeet.click();
		lc.logs("Clicked On Minutes of Meeting");
		Thread.sleep(3000);
		searchmeet.sendKeys(meetname);
		Thread.sleep(2000);
		String a2=searchmeet.getAttribute("value");
		lc.logs("Searching Meet"+" "+a2);
		
		Thread.sleep(2000);
		addmeetingminute.click();
		lc.logs("Clicked On AddMeeting");
		addmeetdesc.sendKeys("22");
		Thread.sleep(2000);
		String a3=addmeetdesc.getAttribute("value");
		lc.logs("Meet Timings"+" "+a2);
		attachment.click();
		lc.logs("Clicked On Attachment");
		ac.upload();
		lc.logs("File Upload Success");
		Thread.sleep(7000);
		savemeet.click();
		savemeetok.click();
		Thread.sleep(2000);
		lc.logs("Meet Saved Success");
		exportmeet.click();
		Thread.sleep(2000);
		lc.logs("File Export Success");
		sendmeetingminutes.click();
		lc.logs("Clciked on Send Meeting Minutes");
		ac.selByVisibleText(recepient, clientattend);
		Thread.sleep(3000);
		String a4=recepient.getAttribute("value");
		lc.logs("Selected Receipt"+" "+a4);
		
		subject.sendKeys(subject1);
		Thread.sleep(2000);
		String a5=subject.getAttribute("value");
		lc.logs("Entered Subject"+" "+a5);
		date.sendKeys(date1);
		Thread.sleep(2000);
		String a6=date.getAttribute("value");
		lc.logs("Entered Date"+" "+a6);
		send.click();
		lc.logs("Clicked On Send");
	}
	
}
