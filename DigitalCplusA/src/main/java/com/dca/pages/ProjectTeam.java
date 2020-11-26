package com.dca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.utility.ListenerClass;

public class ProjectTeam extends BaseClass {
	ListenerClass lc=new ListenerClass();
	ActionDriver ad=new ActionDriver();
	@FindBy(xpath="//select[@id='ProjectID']")
	WebElement selproject;
	@FindBy(xpath="//button[@id='btn_button']")
	WebElement addnew;
	@FindBy(xpath="//select[@id='TypeofStaff']")
	WebElement type;
	@FindBy(css="#StaffType")
	WebElement stafftype;
	@FindBy(css="#ddl_Staff")
	WebElement staff;
	@FindBy(xpath="//textarea[@id='RoleID']")
	WebElement description;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement saveok;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement mailok;
	@FindBy(xpath="//input[@id='txt_StaffsearchBuilding']")
	WebElement search;
	@FindBy(xpath="//select[@id='StaffType']")
	WebElement stafftypefilter;
	@FindBy(xpath="//button[contains(text(),'Send SMS')]")
	WebElement sendsmsclick;
	@FindBy(xpath="//textarea[@id='txt_announcementsDescriptions']")
	WebElement message;
	@FindBy(xpath="//button[contains(text(),'Send Message')]")
	WebElement smssave;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement oksms;
	@FindBy(xpath="//tbody/tr[2]/td[7]/button[2]")
	WebElement sendemailclick;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-projectteamdash[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/angular-editor[1]/div[1]/div[1]/div[1]")
	WebElement textmessage;
	/*@FindBy(xpath="//p[contains(text(),'Drop your files here (or click)')]")
	WebElement attachment;*/
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-projectteamdash[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
	WebElement mailsave;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement okmail;
	@FindBy(xpath="//tbody/tr[2]/td[7]/i[2]")
	WebElement editclick;
	@FindBy(xpath="//select[@id='ddl_Staff']")
	WebElement editstaff;
	@FindBy(xpath="//button[contains(text(),'Update')]")
	WebElement update;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement updateok;
	@FindBy(xpath="//tbody/tr[2]/td[7]/i[1]")
	WebElement chat;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-projectteamdash[1]/div[1]/div[5]/form[1]/div[1]/div[4]/div[1]/input[1]")
	WebElement textmsg;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-projectteamdash[1]/div[1]/div[5]/form[1]/div[1]/div[4]/div[2]/button[1]")
	WebElement sendchat;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-projectteamdash[1]/div[1]/div[5]/form[1]/div[1]/div[1]/div[3]/img[1]")
	WebElement chatclose;
	@FindBy(xpath="//tbody/tr[2]/td[7]/i[3]")
	WebElement delete;
	@FindBy(xpath="//button[contains(text(),'Yes, delete it!')]")
	WebElement deleteok;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement deletelast;
	
	public ProjectTeam() {
		PageFactory.initElements(getDriver(), this);
	}
	public void projectTeam(String selproject1, String type1,String stafftype1,String staff1,String des,String msg,String email,String staff2,String chat1 ) throws InterruptedException {
	    
		ad.selByVisibleText(selproject, selproject1);
		addnew.click();
		lc.logs("clicked on add new");
		ad.selByVisibleText(type, type1);
		Thread.sleep(3000);
		
		String test1=type.getAttribute("value");
		lc.logs(test1);
		
		ad.selByVisibleText(stafftype, stafftype1);
		lc.logs("staff type"+" "+stafftype1);
		
		ad.selByVisibleText(staff, staff1);
		String s=staff.getAttribute("value");
		lc.logs("selected"+" "+s);
		
		description.sendKeys(des);
		String a1=description.getText();
		lc.logs("entered description"+" "+a1);
		
		save.click();	
		saveok.click();
		lc.logs("saved project team");
		Thread.sleep(3000);
		mailok.click();
		lc.logs("mail sented");
		Thread.sleep(3000);
		
		search.sendKeys(des);
		search.clear();
		ad.selByVisibleText(stafftypefilter, stafftype1);
		String sf=stafftypefilter.getAttribute("value");
		lc.logs("selected"+" "+sf);
		
		
		Thread.sleep(3000);
		sendsmsclick.click();
		message.sendKeys(msg);
		smssave.click();
		oksms.click();
		lc.logs("sms saved");
		
		sendemailclick.click();
		textmessage.sendKeys(email);
		//attachment.sendKeys(("user.dir") +"\\imagesource\\image.jpg");
		mailsave.click();
		okmail.click();
		lc.logs("email saved");
		Thread.sleep(3000);
		
		editclick.click();
		editstaff.sendKeys(staff2);
		String es=editstaff.getText();
		lc.logs("edited staff"+" "+es);
		
		update.click();
		updateok.click();
		lc.logs("updated successfully");
		
		chat.click();
		textmsg.sendKeys(chat1);
		sendchat.click();
		chatclose.click();
		lc.logs("chat working");
		/*delete.click();
		deleteok.click();
		deletelast.click();*/
	
		
		
		
		}

}
