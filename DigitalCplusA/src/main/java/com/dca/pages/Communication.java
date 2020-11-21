package com.dca.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;

public class Communication extends BaseClass{
	ActionDriver ac = new ActionDriver();
	@FindBy(xpath="//select[@id='ProjectID']")
	WebElement selproject;
	
	
	
	
	@FindBy(xpath="//button[@id='btn_button']")
	WebElement addtransmits;
	
	
	@FindBy(xpath="//input[@id='Subject']")
	WebElement subject;
	@FindBy(xpath="//select[@id='StaffID']")
	WebElement from;
	@FindBy(xpath="//select[@id='To']")
	WebElement to;
	@FindBy(xpath="//input[@id='txt_SentDate']")
	WebElement date;
	@FindBy(xpath="//textarea[@id='Description']")
	WebElement description;
	@FindBy(xpath="//textarea[@id='Remarks']")
	WebElement remarks;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-transmittals[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[8]/div[3]/input[1]")
	WebElement attachment;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement saveok;
	@FindBy(xpath="//tbody/tr[2]/td[8]/i[1]")
	WebElement image;
	@FindBy(xpath="//tbody/tr[2]/td[8]/i[3]")
	WebElement edit;
	@FindBy(xpath="//input[@id='Subject']")
	WebElement updatesubject;
	@FindBy(xpath="//button[contains(text(),'Update')]")
	WebElement update;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement updateok;
	@FindBy(xpath="//button[@id='exportButton']")
	WebElement exporttoexcel;
	
	
	@FindBy(xpath="//body/app-root[1]/div[2]/div[1]/nav[1]/ul[1]/li[5]/ul[1]/li[2]/a[1]")
	WebElement emails;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[2]/div[2]/div[1]/app-info-exchangedash[1]/div[1]/div[1]/div[2]/div[1]/button[1]")
	WebElement addemail;
	@FindBy(css="#ContactID")
	WebElement clientcontact;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-info-exchange[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[3]/angular-editor[1]/div[1]/div[1]/div[1]")
	WebElement msgbody;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-info-exchange[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[5]/div[3]/input[1]")
	WebElement attachmnet;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save1;
	@FindBy(xpath="body.swal2-shown.swal2-height-auto:nth-child(4) div.swal2-container.swal2-center.swal2-fade.swal2-shown:nth-child(8) div.swal2-popup.swal2-modal.swal2-show div.swal2-actions > button.swal2-confirm.swal2-styled")
	WebElement saveok1;
	@FindBy(xpath="//tbody/tr[2]/td[6]/i[1]")
	WebElement edit1;
	@FindBy(xpath="//button[contains(text(),'Update')]")
	WebElement update1;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement update1ok;
	@FindBy(xpath="//button[@id='exportButton']")
	WebElement export1;
	
	
	
	
	
	public Communication() {
		PageFactory.initElements(getDriver(), this);
		
	}
	
	public void communicate(String project,String subject1,String from1,String to1,
			String datesend,String desc,String remark,String updatesub,String clientcon,
			String messageby) throws InterruptedException, AWTException {
		ac.selByVisibleText(selproject, project);
		
		addtransmits.click();
		subject.sendKeys(subject1);
		ac.selByVisibleText(from, from1);
		ac.selByVisibleText(to, to1);
		date.sendKeys(datesend);
		description.sendKeys(desc);
		remarks.sendKeys(remark);
		attachment.sendKeys("C:\\Users\\Amaze Inc Lap 03\\git\\DigitalCplusA\\DigitalCplusA\\Imagesrc\\flower.jpg");
		save.click();
		saveok.click();
		Thread.sleep(3000);
		edit.click();
		updatesubject.sendKeys(updatesub);
		update.click();
		updateok.click();
		Thread.sleep(3000);
		//exporttoexcel.click();
		 Robot robot=new Robot();
		 for(int i=0;i<1;i++) {
			 robot.keyPress(KeyEvent.VK_PAGE_UP);
			 Thread.sleep(3000);
		 }
		emails.click();
		Thread.sleep(3000);
		Actions actions=new Actions(getDriver());
		//actions.keyUp(Keys.ARROW_UP);
		actions.moveToElement(getDriver().findElement(By.xpath("//button[@id='btn_button']")));
		//actions.keyUp(Keys.ARROW_UP);
		
		
		addemail.click();
		ac.selByVisibleText(clientcontact,clientcon);
		msgbody.sendKeys(messageby);
		attachmnet.sendKeys("C:\\Users\\Amaze Inc Lap 03\\git\\DigitalCplusA\\DigitalCplusA\\Imagesrc\\flower.jpg");
		save1.click();
		Thread.sleep(3000);
		update1ok.click();
		Thread.sleep(3000);
		edit1.click();
		update1.click();
		//sleep(3000);
		update1ok.click();
		
		//export1.click();
		
		
		
		
		
	
	
	/*
	 * @FindBy(xpath=
	 * "//body/app-root[1]/div[2]/div[1]/nav[1]/ul[1]/li[5]/ul[1]/li[3]/a[1]")
	 * WebElement minutesofmeeting;
	 * 
	 * @FindBy(xpath="//button[@id='btn_button']") WebElement addmeeting;
	 * 
	 * @FindBy(xpath="")
	 */
	
	

}
	
}
