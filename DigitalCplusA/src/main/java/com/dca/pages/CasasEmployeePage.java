package com.dca.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.utility.ListenerClass;

public class CasasEmployeePage extends BaseClass {
	ActionDriver ac=new ActionDriver();
	ListenerClass lc=new ListenerClass();
	@FindBy(xpath="//select[@id='ProjectID']")
	WebElement selproject;
	@FindBy(xpath="//button[contains(text(),'Export To Excel')]")
	WebElement export;
	@FindBy(xpath="//input[@id='txt_StaffsearchBuilding']")
	WebElement search;
	@FindBy(xpath="//select[@id='ddl_BuildingName']")
	WebElement selectstafftype;
	@FindBy(xpath="//button[contains(text(),'Add')]")
	WebElement add;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-staff-details[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/input[1]")
	WebElement selAddNewEmployee;
	@FindBy(xpath="//input[@id='txt_SatffDetails_name']")
	WebElement name;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-staff-details[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/input[1]")
	WebElement phoneno;	
	@FindBy(xpath="//input[@id='txt_SatffDetails_email']")
	WebElement email;
	@FindBy(xpath="//select[@id='ddl_BuildingName']")
	WebElement selectstafftype1;
	@FindBy(xpath="//textarea[@id='txt_SatffDetails_address']")
	WebElement address;
	@FindBy(xpath="//select[@id='dSupervisor']")
	WebElement selsupervisor;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-staff-details[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[7]/div[3]/div[1]/input[1]")
	WebElement JoiningDate;
	@FindBy(xpath="//input[@id='txt_SatffDetails_leavesperday']")
	WebElement leavesPerYear;
	@FindBy(xpath="//input[@id='txt_SatffDetails_workingTimings']")
	WebElement workingTimings;
	@FindBy(xpath="//input[@id='txt_DOB']")
	WebElement dob;
	@FindBy(xpath="//input[@id='txt_TIN']")
	WebElement tinNo;
	@FindBy(xpath="//select[@id='ddl_rentRentMonth']")
	WebElement employyeStatus;
	@FindBy(xpath="//input[@id='txt_Location']")
	WebElement location;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-staff-details[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[14]/div[3]/input[1]")
	WebElement emergenctContactNo;
	@FindBy(xpath="//input[@id='rateperhour']")
	WebElement ratehr;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-staff-details[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[16]/div[3]/input[1]")
	WebElement basicSalary;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-staff-details[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[17]/div[3]/input[1]")
	WebElement sssrate;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-staff-details[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[18]/div[3]/input[1]")
	WebElement pagibigrate;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-staff-details[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[19]/div[3]/input[1]")
	WebElement philhealth;
	@FindBy(xpath="//input[@id='txt_Allowance']")
	WebElement allowance;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-staff-details[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[21]/div[3]/input[1]")
	WebElement grosssalary;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[2]/div[2]/div[1]/app-staff-details[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[22]/div[3]")
	WebElement idAttach;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[2]/div[2]/div[1]/app-staff-details[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[23]/div[3]/ngx-dropzone[1]/div[1]")
	WebElement staffPhoto;
	@FindBy(xpath="//button[@type='submit']")
	WebElement save;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement saveok;
	
	@FindBy(xpath="//tbody/tr[2]/td[8]/i[1]")
	WebElement edit;
	@FindBy(xpath="//button[@type='submit']")
	WebElement update1;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement updateok;
	@FindBy(xpath="//input[@id='txt_SatffDetails_leavesperday']")
	WebElement updateleavesperyear;
	@FindBy(xpath="//tbody/tr[8]/td[8]/i[2]")
	WebElement delete;
	@FindBy(xpath="//button[contains(text(),'Yes, delete it!')]")
	WebElement yesdelete;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement deleteok;
	
	public CasasEmployeePage() {
		PageFactory.initElements(getDriver(), this);
	}
	public void casasemployee(String selproject1,String name1,String phoneno1,String email1,String selstafftype11,
			String address1,String selsupervisor1,String joiningdate1,String leavesperyear1,
			String workingtimings1,String dob1,String tinno1,String employeestatus1,
			String location1,String emergencycontact,String ratehr1,String basicsalary1,
			String allowance1) throws Exception {
		ac.selByVisibleText(selproject, selproject1);
		add.click();
		lc.logs("Clicked On Add");
		selAddNewEmployee.click();
		lc.logs("Selected Add New Employee");
		name.sendKeys(name1);
		String a1=name.getText();
		lc.logs("Entered name"+" "+a1);
		phoneno.sendKeys(phoneno1);
		String a2=phoneno.getText();
		lc.logs("Entered PhoneNo"+" "+a2);
		email.sendKeys(email1);
		String a3=email.getText();
		lc.logs("Entered Email"+" "+a3);
		ac.selByVisibleText(selectstafftype1, selstafftype11);
		lc.logs("StaffType is"+" "+selstafftype11);
		address.sendKeys(address1);
		String a4=address.getText();
		lc.logs("Entered Address"+" "+a4);
		ac.selByVisibleText(selsupervisor, selsupervisor1);
		lc.logs("Selected Supervisor"+" "+selsupervisor1);
		JoiningDate.sendKeys(joiningdate1);
		String a5=JoiningDate.getText();
		lc.logs("Joining Date"+" "+a5);
		leavesPerYear.sendKeys(leavesperyear1);
		String a6=leavesPerYear.getText();
		lc.logs("Entered Leaves per year"+" "+a6);
		workingTimings.sendKeys(workingtimings1);
		String a7=workingTimings.getText();
		lc.logs("Working Time"+" "+a7);
		dob.sendKeys(dob1);
		String a8=dob.getText();
		lc.logs("Date Of Birth"+" "+a8);
		tinNo.sendKeys(tinno1);
		String a9=tinNo.getText();
		lc.logs("Tin Number"+" "+a9);
		ac.selByVisibleText(employyeStatus, employeestatus1);
		lc.logs("Employee status"+" "+employeestatus1);
		location.sendKeys(location1);
		String a10=location.getText();
		lc.logs("Entered Location"+" "+a10);
		emergenctContactNo.sendKeys(emergencycontact);
		String a11=emergenctContactNo.getText();
		lc.logs("Emergency Contact"+" "+a11);
		ratehr.sendKeys(ratehr1);
		String a12=ratehr.getText();
		lc.logs("RatePerHour"+" "+a12);
		basicSalary.sendKeys(basicsalary1);
		String a13=basicSalary.getText();
		lc.logs("Basic Salary is"+" "+a13);
		Thread.sleep(3000);
		allowance.sendKeys(allowance1);
		String a14=allowance.getText();
		lc.logs("Allowance is"+" "+a14);
		Thread.sleep(3000);
		//idAttach.sendKeys("C:\\Users\\Amaze Inc Lap 03\\git\\DigitalCplusA\\DigitalCplusA\\Imagesrc\\flower.jpg");
		idAttach.click();
		lc.logs("Clicked on IDPhoto Attachment");
		ac.upload();
		//staffPhoto.sendKeys("C:\\Users\\Amaze Inc Lap 03\\git\\DigitalCplusA\\DigitalCplusA\\Imagesrc\\flower.jpg");
		Thread.sleep(3000);
		staffPhoto.click();
		lc.logs("Clicked on StaffPhoto Attachment");
		ac.upload();
		Thread.sleep(3000);
		 Robot robot=new Robot();
		 for(int i=0;i<2;i++) {
			 robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			 Thread.sleep(3000);
		 }
		 lc.logs("Photo Attach Success");
		save.click();
		//ac.mouseHoverByJavaScript(save);
		saveok.click();
		lc.logs("Form Saved Success");
		Thread.sleep(3000);
		search.sendKeys(name1);
		ac.selByVisibleText(selectstafftype, selstafftype11);
		export.click();
		lc.logs("File Export Success");
		Thread.sleep(3000);
		edit.click();
		lc.logs("Clicked On Edit");
		updateleavesperyear.sendKeys(leavesperyear1);
		String a15=updateleavesperyear.getText();
		lc.logs("Updated data"+" "+a15);
		Thread.sleep(3000);
		 Robot robot11=new Robot();
		 for(int i=0;i<2;i++) {
			 robot11.keyPress(KeyEvent.VK_PAGE_DOWN);
			 Thread.sleep(3000);
		 }
		update1.click();
		 
		Thread.sleep(3000);
		updateok.click();
		lc.logs("Form Update success");
		/*Thread.sleep(3000);
		delete.click();
		Thread.sleep(3000);
		yesdelete.click();
		deleteok.click();*/
		
		
		
	}
	
	
	
	

}
