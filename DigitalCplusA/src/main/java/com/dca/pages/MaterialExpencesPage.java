package com.dca.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.utility.ListenerClass;

public class MaterialExpencesPage extends BaseClass {
	ActionDriver ac=new ActionDriver();
	ListenerClass lc=new ListenerClass();
	@FindBy(xpath="//select[@id='ProjectID']")
	WebElement selproject;
	@FindBy(xpath="//button[@id='btn_button']")
	WebElement addexpence;
	@FindBy(xpath="//select[@id='ExpenseType']")
	WebElement expencetype;
	@FindBy(xpath="//input[@id='ExpenseDate']")
	WebElement date;
	
	//material expence
	
	@FindBy(xpath="//select[@id='ItemCategory']")
	WebElement category;
	@FindBy(xpath="//select[@id='ItemSubCategory']")
	WebElement subcategory;
	@FindBy(xpath="//select[@id='Item']")
	WebElement item;
	@FindBy(xpath="//input[@id='Quantity']")
	WebElement quantity;
	@FindBy(xpath="//input[@id='TotalExpense']")
	WebElement amount;
	
	//add
	@FindBy(xpath="//button[contains(text(),'Add')]")
	WebElement add;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement saveok;
	
	@FindBy(xpath="//select[@id='Category']")
	WebElement selcateg;
	@FindBy(xpath="//select[@id='SubCategory']")
	WebElement subcateg;
	@FindBy(xpath="//tbody/tr[2]/td[8]/i[2]")
	WebElement edit;
	@FindBy(xpath="//button[contains(text(),'Update')]")
	WebElement update;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement updateok;
	
	//labour
	@FindBy(xpath="//select[@id='StaffTypeID']")
	WebElement stafftype;
	@FindBy(xpath="//select[@id='StaffID']")
	WebElement staff;
	@FindBy(xpath="//input[@id='noofhrs']")
	WebElement noofhour;
	@FindBy(xpath="//textarea[@id='Remarks']")
	WebElement remarks;
	@FindBy(xpath="//input[@id='TotalExpense']")
	WebElement amount1;
	
	
	public MaterialExpencesPage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	public void materialexpen(String selpro,
			String expencetype1,String date1,String cat,String subcat,
			String quant,String amoun) throws InterruptedException, AWTException {
		//ac.selByVisibleText(selproject, selpro);
		Robot robot=new Robot();
		 for(int i=0;i<2;i++) {
			 robot.keyPress(KeyEvent.VK_PAGE_UP);
			 Thread.sleep(3000);
		 }
		addexpence.click();
		lc.logs("clicked on add new");
		
		ac.selByVisibleText(expencetype, expencetype1);
		lc.logs("expence type selected"+" "+expencetype1);
		
		date.sendKeys(date1);
		String a1=date.getText();
		lc.logs("picked date"+" "+a1);
		
		category.sendKeys(cat);
		String b1=category.getText();
		lc.logs("entered category"+" "+b1);
		
		subcategory.sendKeys(subcat);
		String c1=subcategory.getText();
		lc.logs("entered sub category"+" "+c1);
		
		ac.selByIndex(item, 1);
		String d1=item.getText();
		lc.logs("selected item"+" "+d1);
		
		quantity.sendKeys(quant);
		String e1=quantity.getText();
		lc.logs("entered quantity"+" "+e1);
		
		amount.sendKeys(amoun);
		String f1=amount.getText();
		lc.logs("entered amount"+" "+f1);
		
		add.click();
		lc.logs("click add button");
		
		save.click();
		saveok.click();
		Thread.sleep(3000);
		lc.logs("saved successfully");
		
		ac.selByVisibleText(selcateg, cat);
		ac.selByVisibleText(subcateg, subcat);
		Thread.sleep(3000);
		
		edit.click();
		update.click();
		updateok.click();
		lc.logs("updated successfully");
		
		//JavascriptExecutor js=(JavascriptExecutor)getDriver();
		//js.executeScript("windows.scrollBy(0,350", "350");
		//JavascriptExecutor js=(JavascriptExecutor)getDriver();
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight");
		//ac.mouseover(getDriver(), addexpence);
		//ac.mouseHoverByJavaScript(addexpence);
		
		/*
		 * addexpence.click(); ac.selByVisibleText(expencetype, expencetype2);
		 * date.sendKeys(date2); ac.selByVisibleText(stafftype, stafftype2);
		 * ac.selByVisibleText(staff, staff2); noofhour.sendKeys(noumberhr);
		 * remarks.sendKeys(remak); amount1.sendKeys(amount12); add.click();
		 * save.click(); saveok.click();
		 */
	}
	
	
	

}
