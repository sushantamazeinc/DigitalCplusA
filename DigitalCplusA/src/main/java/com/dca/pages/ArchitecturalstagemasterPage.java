package com.dca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;

public class ArchitecturalstagemasterPage extends BaseClass {
	ActionDriver ad=new ActionDriver();
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
	
	public void architecturalmaster(String stage,String descriptions) throws InterruptedException {
		addnew.click();
		Thread.sleep(3000);
		ad.selByVisibleText(stages, stage);
		description.sendKeys(descriptions);
		save.click();
		saveok.click();
		delete.click();
		deleteok.click();
		deleteoklast.click();
		
		
		
		
	}

}
