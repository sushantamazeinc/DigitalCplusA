package com.dca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.utility.ListenerClass;

public class PunchlistMastersPage extends BaseClass {
	ActionDriver ad=new ActionDriver();
	ListenerClass lc=new ListenerClass();
	@FindBy(xpath="//select[@id='ProjectID']")
	WebElement selproject;
	@FindBy(xpath="//button[@id='btn_button']")
	WebElement addnew;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-punch-lists[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[3]/input[1]")
	WebElement name;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-punch-lists[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[3]/input[1]")
	WebElement location;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-punch-lists[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[3]/textarea[1]")
	WebElement description;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-punch-lists[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[3]/input[1]")
	WebElement reviewtype;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement saveok;
	@FindBy(xpath="//tbody/tr[2]/td[6]/i[1]")
	WebElement edit;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-punch-lists[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[3]/input[1]")
	WebElement editname;
	@FindBy(xpath="//button[contains(text(),'Update')]")
	WebElement update;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement updateok;
	@FindBy(xpath="//tbody/tr[2]/td[6]/i[2]")
	WebElement delete;
	@FindBy(xpath="//button[contains(text(),'Yes, delete it!')]")
	WebElement deleteok;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement deleteoklast;
	
	
	public PunchlistMastersPage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	
	
	public void punchlistmaster(String selproject1,String names,String locations,String descriptions,String reviewtypes,String ename ) throws InterruptedException {
		ad.selByVisibleText(selproject, selproject1);
		addnew.click();
		lc.logs("clicked on add new");
		
		name.sendKeys(names);
		String c1=name.getText();
		lc.logs("Entered name"+" "+c1);
		
		location.sendKeys(locations);
		String a1=location.getText();
		lc.logs("Entered location"+" "+a1);
		
		description.sendKeys(descriptions);
		String b1=description.getText();
		lc.logs("Entered description"+" "+b1);
		
		reviewtype.sendKeys(reviewtypes);
		String d1=reviewtype.getText();
		lc.logs("Entered reviewtype"+" "+d1);
		
		save.click();
		saveok.click();
		Thread.sleep(3000);
		lc.logs("Saved Successfully");
		
		edit.click();
		editname.sendKeys(ename);
		String e1=editname.getText();
		lc.logs("edited name"+" "+e1);
		update.click();
		updateok.click();
		Thread.sleep(3000);
		lc.logs("Updated successfully");
		
		/*delete.click();
		deleteok.click();
		deleteoklast.click();
		lc.logs("Deleted Successfully");*/
		
	}
}
