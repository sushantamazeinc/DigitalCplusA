package com.dca.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.utility.ListenerClass;

public class ProjectEmailsPage extends BaseClass {
	ActionDriver ac=new ActionDriver();
	ListenerClass lc=new ListenerClass();
	@FindBy(xpath="//select[@id='ProjectID']")
	WebElement selproject;
	@FindBy(xpath="//button[@id='btn_button']")
	WebElement addnew;
	@FindBy(xpath="//input[@id='EmailID']")
	WebElement recipient;
	@FindBy(xpath="//input[@id='Subject']")
	WebElement subject;
	@FindBy(xpath="//input[@id='Date']")
	WebElement date;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-project-email[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[5]/div[3]/ngx-dropzone[1]/div[1]")
	WebElement emailattach;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement attactmenisbig;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save;
	//put some sleep
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement ok;
	@FindBy(xpath="//input[@id='txt_StaffsearchBuilding']")
	WebElement search;
	@FindBy(xpath="//tbody/tr[2]/td[5]/i[1]")
	WebElement edit;
	@FindBy(xpath="//button[contains(text(),'Update')]")
	WebElement update;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement updateok;
	@FindBy(css="#exportButton")
	WebElement export;
	
	public ProjectEmailsPage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	
	public void projectemail(String selpro,String recipiet,String sub,String date1) throws InterruptedException, IOException {
		ac.selByVisibleText(selproject, selpro);
		addnew.click();
        lc.logs("Clicked on add new button");
        
		recipient.sendKeys(recipiet);
		String a1=recipient.getText();
		lc.logs("Entered recipient"+" "+a1);
		
		subject.sendKeys(sub);
		String b1=subject.getText();
		lc.logs("Entered subject"+" "+b1);
		
		date.sendKeys(date1);
		String c1=date.getText();
		lc.logs("picked date"+" "+c1);
		//emailattach.sendKeys("C:\\Users\\Amaze Inc Lap 03\\git\\DigitalCplusA\\DigitalCplusA\\Imagesrc\\flower.jpg");
		
		emailattach.click();
		ac.upload();
		Thread.sleep(7000);
		attactmenisbig.click();
		lc.logs("attachment uploded");
		
		save.click();
		Thread.sleep(5000);
		ok.click();
		Thread.sleep(3000);
		lc.logs("saved successfully");
		
		search.sendKeys(sub);
		edit.click();
		update.click();
		updateok.click();
		Thread.sleep(3000);
		lc.logs("Updated Suceessfully");
		
		export.click();
		lc.logs("excel exported");
		
		
		
		
		
	}
	

}
