package com.dca.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.utility.ListenerClass;

public class Communication extends BaseClass{
	ActionDriver ac = new ActionDriver();
	ListenerClass lc=new ListenerClass();
	@FindBy(xpath="//select[@id='ProjectID']")
	WebElement selproject;
	
	@FindBy(xpath="//button[@id='btn_button']")
	WebElement addtransmits;
	
	
	@FindBy(xpath="//input[@id='Subject']")
	WebElement subject;
	@FindBy(xpath="//select[@id='StaffID']")
	WebElement from;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[2]/div[2]/div[1]/app-transmittals[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[4]/div[3]/select[1]")
	WebElement to;
	@FindBy(xpath="//input[@id='txt_SentDate']")
	WebElement date;
	@FindBy(xpath="//textarea[@id='Description']")
	WebElement description;
	@FindBy(xpath="//textarea[@id='Remarks']")
	WebElement remarks;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[2]/div[2]/div[1]/app-transmittals[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[8]/div[3]/ngx-dropzone[1]/div[1]")
	WebElement attachment1;
	@FindBy(xpath="//button[@type='submit']")
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
	
	
	@FindBy(xpath="//a[@href='#/infoexchangedash']")
	WebElement emails;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[2]/div[2]/div[1]/app-info-exchangedash[1]/div[1]/div[1]/div[2]/div[1]/button[1]")
	WebElement addemail;
	@FindBy(css="#ContactID")
	WebElement clientcontact;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-info-exchange[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[3]/angular-editor[1]/div[1]/div[1]/div[1]")
	WebElement msgbody;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[2]/div[2]/div[1]/app-info-exchange[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[5]/div[3]/ngx-dropzone[1]/div[1]")
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
			String messageby) throws InterruptedException, AWTException, IOException {
		ac.selByVisibleText(selproject, project);
		
		  addtransmits.click();
		  lc.logs("clicked on transmittals add page");
			
		  subject.sendKeys(subject1);
		  String a1=subject.getText();
		  lc.logs("Entered Subject"+" "+a1);
		  
		  ac.selByVisibleText(from, from1);
		  lc.logs("Entered from"+" "+from1);
		  Thread.sleep(3000);
		  
		  ac.selByVisibleText(to, to1);
		  lc.logs("Entered to"+" "+to1);
		  Thread.sleep(3000);
		  
		  date.sendKeys(datesend);
		  String p1=date.getText();
		  lc.logs("Entered Subject"+" "+p1);
		  
		  description.sendKeys(desc);
		  String de=description.getText();
		  lc.logs("Entered Subject"+" "+de);
		  
		  remarks.sendKeys(remark); 
		  String re=remarks.getText();
		  lc.logs("Entered Subject"+" "+re);
		  
		  Robot robot=new
		  Robot(); for(int i=0;i<2;i++)
		  { robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		  Thread.sleep(3000); } 
		  attachment1.click(); 
		  Thread.sleep(3000); 
		  ac.upload(); 
		  Thread.sleep(7000);
		  lc.logs("uploaded attachment");
		  
		  save.click(); 
		  saveok.click(); 
		  Thread.sleep(3000);
		  lc.logs("Saved Successfully");
		  
		  edit.click();
		  updatesubject.sendKeys(updatesub);
		  update.click(); 
		  updateok.click();
		  lc.logs("updated successfully");
		  
		  //Thread.sleep(3000); 
		  //exporttoexcel.click(); 
		  Robot robot1=new Robot();
		  for(int i=0;i<1;i++) 
		  { 
			  robot1.keyPress(KeyEvent.VK_PAGE_UP);
		  Thread.sleep(3000);
		  }
		 
		emails.click();
		Thread.sleep(3000);
		lc.logs("clicked on emails");
		Actions actions=new Actions(getDriver());
		//actions.keyUp(Keys.ARROW_UP);
		actions.moveToElement(getDriver().findElement(By.xpath("//button[@id='btn_button']")));
		Robot robot11=new Robot();
		  for(int i=0;i<1;i++) 
		  { 
			  robot11.keyPress(KeyEvent.VK_PAGE_UP);
		  Thread.sleep(3000); 
		  }
		
		
		addemail.click();
		lc.logs("clicked on add emails");
		
		ac.selByVisibleText(clientcontact,clientcon);
		lc.logs("selected client contact"+" "+clientcon);
		
		msgbody.sendKeys(messageby);
		String me=msgbody.getText();
		lc.logs("Entered message"+" "+me);
		
		 Robot robot111=new Robot();
		  for(int i=0;i<1;i++) 
		  { 
			  robot111.keyPress(KeyEvent.VK_PAGE_DOWN);
		  Thread.sleep(3000); 
		  }
		  Thread.sleep(3000);
		  
		attachmnet.click();
		Thread.sleep(3000);
		ac.upload();
		Thread.sleep(7000);
		lc.logs("uploaded attachment");
		
		save1.click();
		Thread.sleep(3000);
		lc.logs("saved successfully");
		
		update1ok.click();
		Thread.sleep(3000);
		edit1.click();
		update1.click();
		//sleep(3000);
		update1ok.click();
		lc.logs("Updated Successfully");
		
		//export1.click();
		
		
	

}
	
}
