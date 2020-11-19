package com.dca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;

public class CasasEmployeePage extends BaseClass {
	ActionDriver ac=new ActionDriver();
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
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-staff-details[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[22]/div[3]/input[1]")
	WebElement idAttach;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-staff-details[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[23]/div[3]/input[1]")
	WebElement staffPhoto;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement saveok;
	
	@FindBy(xpath="//tbody/tr[2]/td[8]/i[1]")
	WebElement edit;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[2]/div[2]/div[1]/app-staff-details[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[24]/div[3]/button[1]")
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
			String allowance1) throws InterruptedException {
		ac.selByVisibleText(selproject, selproject1);
		add.click();
		selAddNewEmployee.click();
		name.sendKeys(name1);
		phoneno.sendKeys(phoneno1);
		email.sendKeys(email1);
		ac.selByVisibleText(selectstafftype1, selstafftype11);
		address.sendKeys(address1);
		ac.selByVisibleText(selsupervisor, selsupervisor1);
		JoiningDate.sendKeys(joiningdate1);
		leavesPerYear.sendKeys(leavesperyear1);
		workingTimings.sendKeys(workingtimings1);
		dob.sendKeys(dob1);
		tinNo.sendKeys(tinno1);
		ac.selByVisibleText(employyeStatus, employeestatus1);
		location.sendKeys(location1);
		emergenctContactNo.sendKeys(emergencycontact);
		ratehr.sendKeys(ratehr1);
		basicSalary.sendKeys(basicsalary1);
		Thread.sleep(3000);
		allowance.sendKeys(allowance1);
		idAttach.sendKeys("C:\\Users\\Mac\\git\\digi_ca\\DigiCa3\\Imagesrc\\flower.jpg");
		staffPhoto.sendKeys("C:\\Users\\Mac\\git\\digi_ca\\DigiCa3\\Imagesrc\\flower.jpg");
		save.click();
		saveok.click();
		Thread.sleep(3000);
		search.sendKeys(name1);
		ac.selByVisibleText(selectstafftype, selstafftype11);
		export.click();
		Thread.sleep(3000);
		edit.click();
		updateleavesperyear.sendKeys(leavesperyear1);
		update1.click();
		Thread.sleep(3000);
		updateok.click();
		Thread.sleep(3000);
		delete.click();
		Thread.sleep(3000);
		yesdelete.click();
		deleteok.click();
		
		
		
	}
	
	
	
	

}
