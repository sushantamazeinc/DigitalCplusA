package com.dca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.utility.ListenerClass;

public class ClientContactPage extends BaseClass{
	ActionDriver ac=new ActionDriver();
	ListenerClass lc=new ListenerClass();
	@FindBy(xpath="//select[@id='ProjectID']")
	WebElement selproject;
	@FindBy(xpath="//button[@id='btn_button']")
	WebElement addcontact;
	@FindBy(xpath="//input[@id='txt_FirstName']")
	WebElement firstname;
	@FindBy(xpath="//input[@id='txt_LastName']")
	WebElement lastName;
	@FindBy(xpath="//input[@id='txt_Tittle']")
	WebElement title;
	@FindBy(xpath="//input[@id='txt_emailID']")
	WebElement email;
	@FindBy(xpath="//input[@id='txt_phoneno']")
	WebElement phone;
	@FindBy(xpath="//textarea[@id='txt_Address']")
	WebElement description;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement saveok;
	@FindBy(xpath="//input[@id='txt_StaffsearchBuilding']")
	WebElement search;
	@FindBy(xpath="//tbody/tr[2]/td[6]/i[1]")
	WebElement edit;
	@FindBy(xpath="//button[contains(text(),'Update')]")
	WebElement update;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement updateok;
	@FindBy(xpath="//tbody/tr[2]/td[6]/button[1]")
	WebElement sendsms;
	@FindBy(xpath="//textarea[@id='txt_announcementsDescriptions']")
	WebElement text1;
	@FindBy(xpath="//button[contains(text(),'Send Message')]")
	WebElement sendmsg;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement sendmsgok;
	@FindBy(xpath="//tbody/tr[2]/td[6]/button[2]")
	WebElement sendemail;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-client-contactsdash[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[1]/angular-editor[1]/div[1]/div[1]/div[1]")
	WebElement writemail;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-client-contactsdash[1]/div[1]/div[4]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
	WebElement sendemail1;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement sendmailok;
	@FindBy(xpath="//tbody/tr[2]/td[6]/i[2]")
	WebElement delete;
	@FindBy(xpath="//button[contains(text(),'Yes, delete it!')]")
	WebElement yesdelete;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement deleteok;
	public ClientContactPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void clientcontact(String selproject1,String firstname1,String lastname1,
			String title1,String email1,String phone1,String description1,
			String text11,String writemail1 ) throws InterruptedException {
		ac.selByVisibleText(selproject, selproject1);
		addcontact.click();
		lc.logs("Clicked on AddContact");
		firstname.sendKeys(firstname1);
		String a1=firstname.getText();
		lc.logs("First Name"+" "+a1);
		lastName.sendKeys(lastname1);
		String a2=lastName.getText();
		lc.logs("LastName"+" "+a2);
		title.sendKeys(title1);
		String a3=title.getText();
		lc.logs("Title"+" "+a3);
		email.sendKeys(email1);
		String a4=email.getText();
		lc.logs("Email"+" "+a4);
		phone.sendKeys(phone1);
		String a5=phone.getText();
		lc.logs("Phone"+" "+a5);
		description.sendKeys(description1);
		String a6=description.getText();
		lc.logs("Description"+" "+a6);
		save.click();
		saveok.click();
		lc.logs("Save Success");
		Thread.sleep(3000);
		search.sendKeys(firstname1);
		Thread.sleep(3000);
		edit.click();
		lc.logs("Clicked on Edit");
		Thread.sleep(3000);
		update.click();
		Thread.sleep(3000);
		updateok.click();
		lc.logs("Update Success");
		Thread.sleep(3000);
		sendsms.click();
		lc.logs("Clicked On Send Sms");
		text1.sendKeys(text11);
		String a7=text1.getText();
		lc.logs("Message Text"+" "+a7);
		sendmsg.click();
		Thread.sleep(3000);
		lc.logs("Clicked On Send Messgae");
		sendmsgok.click();
		Thread.sleep(2000);
		sendemail.click();
		lc.logs("Clicked On Send Email");
		writemail.sendKeys(writemail1);
	String a8=	writemail.getText();
		lc.logs("Email Body"+" "+a8);
		sendemail1.click();
		Thread.sleep(3000);
		sendmailok.click();
		lc.logs("Email Send Success");
		Thread.sleep(2000);
		/*delete.click();
		yesdelete.click();
		deleteok.click();*/
	}

}
