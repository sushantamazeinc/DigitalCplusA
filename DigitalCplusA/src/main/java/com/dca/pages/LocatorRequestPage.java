package com.dca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.utility.ListenerClass;

public class LocatorRequestPage extends BaseClass {
	ActionDriver ac=new ActionDriver();
	ListenerClass lc=new ListenerClass();
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
		lc.logs("clicked on add new button");
		
		date.sendKeys(date1);
		String a1=date.getText();
		lc.logs("picked date"+" "+a1);
		
		destination.sendKeys(destini);
		String b1=destination.getText();
		lc.logs("Entered destination"+" "+b1);
		
		purpose.sendKeys(purpo);
		String c1=purpose.getText();
		lc.logs("Entered purpose"+" "+c1);
		
		timeofdept.sendKeys(timedept);
		String d1=timeofdept.getText();
		lc.logs("Entered time of departure"+" "+d1);
		
		timeofreturn.sendKeys(timeretun);
		String e1=timeofreturn.getText();
		lc.logs("Entered time of return"+" "+e1);
		
		save.click();
		saveok.click();
		Thread.sleep(3000);
		lc.logs("Saved Successfully");
		
		approve.click();
		approveok.click();
		lc.logs("Approved Successfully");
		
		
	}
	
	

}
