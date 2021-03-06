package com.dca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.utility.ListenerClass;

public class ArchitecturalstagemasterPage extends BaseClass {
	ListenerClass lc=new ListenerClass();
	ActionDriver ad=new ActionDriver();
	@FindBy(xpath="//select[@id='ProjectID']")
	WebElement selproject;
	@FindBy(xpath="//button[@id='btn_button']")
	WebElement addnew;
	@FindBy(xpath="//select[@id='StagesID']")
	WebElement stages;
	@FindBy(xpath="//textarea[@id='txt_Decriptions']")
	WebElement description;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement saveok;
	@FindBy(xpath="//tbody/tr[2]/td[3]/a[1]/i[1]")
	WebElement delete;
	@FindBy(xpath="//button[contains(text(),'Yes, delete it!')]")
	WebElement deleteok;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement deleteoklast;
	
	public ArchitecturalstagemasterPage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	
	public void architecturalmaster(String selproject1, String stage,String descriptions) throws InterruptedException {
		ad.selByVisibleText(selproject, selproject1);
		addnew.click();
		lc.logs("Clicked On AddNew");
		Thread.sleep(3000);
		ad.selByVisibleText(stages, stage);
		lc.logs("Selected Stages"+" "+stage);
		description.sendKeys(descriptions);
		String a1=description.getText();
		lc.logs("Entered Discription"+" "+a1);
		save.click();
		saveok.click();
		lc.logs("Saved Success");
		Thread.sleep(3000);
		delete.click();
		lc.logs("Clicked on Delete");
		deleteok.click();
		deleteoklast.click();
		lc.logs("Delete Success");
		
		
		
	}

}
