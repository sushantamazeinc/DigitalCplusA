package com.dca.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;

public class FieldManagementToolPage extends BaseClass {
	ActionDriver ac=new ActionDriver();
	@FindBy(xpath="//select[@id='ProjectID']")
	WebElement selproject;
	@FindBy(xpath="//button[@id='btn_button']")
	WebElement addnew;
	@FindBy(xpath="//select[@id='FloorID']")
	WebElement floor;
	@FindBy(xpath="//select[@id='PunchListID']")
	WebElement punchlist;
	@FindBy(xpath="//select[@id='StaffId']")
	WebElement staff;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-punch-list-assigns[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[3]/div[1]/input[1]")
	WebElement startdate;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-punch-list-assigns[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[6]/div[3]/div[1]/input[1]")
	WebElement enddate;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-punch-list-assigns[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[7]/div[3]/textarea[1]")
	WebElement punchlistarea;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-punch-list-assigns[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[8]/div[3]/textarea[1]")
	WebElement fieldnotes;
	@FindBy(xpath="//select[@id='Status']")
	WebElement status;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement saveok;
	
	//Thread
	@FindBy(xpath="//button[contains(text(),'Export To Excel')]")
	WebElement exporttoexcel;
	//thread
	@FindBy(xpath="//tbody/tr[2]/td[7]/i[1]")
	WebElement edit;
	@FindBy(xpath="//select[@id='Status']")
	WebElement statusupdate;
	@FindBy(xpath="//button[contains(text(),'Update')]")
	WebElement update;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement updateok;
	
	public FieldManagementToolPage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	
	public void fieldmanage(String selproject1,String floor1,String punchlist1,String staff1,String sdate,
			String edate,String punchlista,String fieldn,String stat,String upstat) throws InterruptedException, AWTException {
		ac.selByVisibleText(selproject, selproject1);
		addnew.click();
		Thread.sleep(3000);
		ac.selByVisibleText(floor, floor1);
		ac.selByVisibleText(punchlist, punchlist1);
		ac.selByVisibleText(staff, staff1);
		startdate.sendKeys(sdate);
		enddate.sendKeys(edate);
		punchlistarea.sendKeys(punchlista);
		fieldnotes.sendKeys(fieldn);
		ac.selByVisibleText(status, stat);
		save.click();
		saveok.click();
		Thread.sleep(3000);
		Robot robot1=new Robot();
		 for(int i=0;i<1;i++) {
			 robot1.keyPress(KeyEvent.VK_PAGE_UP);
			 Thread.sleep(3000);
		 }
		exporttoexcel.click();
		Thread.sleep(3000);
		edit.click();
		ac.selByVisibleText(statusupdate, upstat);
		update.click();
		updateok.click();
		
		
		
	}
}
