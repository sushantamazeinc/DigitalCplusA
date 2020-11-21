package com.dca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;

public class LocatorRequestPage extends BaseClass {
	ActionDriver ac=new ActionDriver();
	@FindBy(xpath="//select[@id='ProjectID']")
	WebElement selproject;
	@FindBy(xpath="//button[@id='btn_button']")
	WebElement addnew;
	@FindBy(xpath="//input[@id='Date']")
	WebElement date;
	@FindBy(xpath="//input[@id='Destination']")
	WebElement destination;
	@FindBy(xpath="//input[@id='Purpose']")
	WebElement purpose;
	@FindBy(xpath="//input[@id='TimeOfDeparture']")
	WebElement timeofdept;
	@FindBy(xpath="//input[@id='TimeOfReturn']")
	WebElement timeofreturn;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement saveok;
	@FindBy(xpath="//tbody/tr[4]/td[7]/button[1]")
	WebElement approve;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement approveok;
	public LocatorRequestPage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	public void locatorrequest(String selproject1,String date1,String destini,String purpo,String timedept,
			String timeretun) throws InterruptedException {
		ac.selByVisibleText(selproject, selproject1);
		addnew.click();
		date.sendKeys(date1);
		destination.sendKeys(destini);
		purpose.sendKeys(purpo);
		timeofdept.sendKeys(timedept);
		timeofreturn.sendKeys(timeretun);
		save.click();
		saveok.click();
		Thread.sleep(3000);
		approve.click();
		approveok.click();
		
		
	}
	
	

}
