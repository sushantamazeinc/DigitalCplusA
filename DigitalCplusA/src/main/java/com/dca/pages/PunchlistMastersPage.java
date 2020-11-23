package com.dca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;

public class PunchlistMastersPage extends BaseClass {
	ActionDriver ad=new ActionDriver();
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
	
	
	public void punchlistmaster(String selproject1,String names,String locations,String descriptions,String reviewtypes,String ename ) {
		ad.selByVisibleText(selproject, selproject1);
		addnew.click();
		name.sendKeys(names);
		location.sendKeys(locations);
		description.sendKeys(descriptions);
		reviewtype.sendKeys(reviewtypes);
		save.click();
		saveok.click();
		edit.click();
		editname.sendKeys(ename);
		update.click();
		updateok.click();
		delete.click();
		deleteok.click();
		deleteoklast.click();
		
	}
}
