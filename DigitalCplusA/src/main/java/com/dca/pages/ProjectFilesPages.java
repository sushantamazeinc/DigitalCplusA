package com.dca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;

public class ProjectFilesPages extends BaseClass {
	ActionDriver ac=new ActionDriver();
@FindBy(xpath="//select[@id='ProjectID']")
WebElement selproj;
@FindBy(xpath="//button[@id='btn_button']")
WebElement newplanbtn;
@FindBy(xpath="//input[@id='txt_Search']")
WebElement search;
@FindBy(xpath="//select[@id='UploadedBy']")
WebElement uploadby;


@FindBy(xpath="//input[@id='txt_Address']")
WebElement foldername;
@FindBy(xpath="//button[contains(text(),'Save')]")
WebElement save;
@FindBy(xpath="//button[contains(text(),'OK')]")
WebElement savesuccess;


@FindBy(xpath="//select[@id='folders']")
WebElement folder;
@FindBy(xpath="//input[@id='txt_PlanName']")
WebElement plan;
@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-building-planupdate[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[4]/div[3]/input[1]")
WebElement projectplan;
@FindBy(xpath="//textarea[@id='Description']")
WebElement description;
@FindBy(xpath="//input[@id='VersionNo']")
WebElement version;
@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-building-planupdate[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[7]/div[3]/input[2]")
WebElement includetrans;
@FindBy(xpath="//button[contains(text(),'Save')]")
WebElement save2;
@FindBy(xpath="//button[contains(text(),'OK')]")
WebElement savesuccess2;


@FindBy(xpath="//input[@id='txt_Search']")
WebElement serachfield;
@FindBy(xpath="//tbody/tr[1]/td[4]/i[1]")
WebElement action;


@FindBy(xpath="//tbody/tr[1]/td[6]/button[1]")
WebElement updateplan;
@FindBy(xpath="//input[@id='Version']")
WebElement updateversionno;
@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-project-plans-details[1]/div[2]/div[1]/div[1]/div[2]/div[5]/div[2]/button[1]")
WebElement updateplan1;
@FindBy(xpath="//tbody/tr[1]/td[6]/i[2]")
WebElement webview;


@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-buildingplanimages[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]/a[1]/i[1]")
WebElement dowload;
@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-buildingplanimages[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/li[1]")
WebElement edit;
@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-buildingplanimages[1]/div[4]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")
WebElement photo;
@FindBy(xpath="//button[contains(text(),'Update')]")
WebElement uploadphoto;
@FindBy(xpath="//button[contains(text(),'OK')]")
WebElement uploadphotosucess;
@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[2]/div[2]/div[1]/app-buildingplanimages[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/li[1]")
WebElement photodel;
@FindBy(xpath="//button[contains(text(),'Yes, delete it!')]")
WebElement confirmphotodel;
@FindBy(xpath="//button[contains(text(),'OK')]")
WebElement photodelok;
@FindBy(xpath="//tbody/tr[1]/td[6]/button[1]")
WebElement aupdateplan;
public ProjectFilesPages() {
	PageFactory.initElements(getDriver(), this);
}
public void projectfile(String foldname1, String planname1, String description11, String version11,
		String updatedver1) throws InterruptedException {
	
	//ac.selByVisibleText(selproj,text1);
	Thread.sleep(5000);
	newplanbtn.click();
	foldername.sendKeys(foldname1);
	save.click();
	savesuccess.click();
	Thread.sleep(3000);
	folder.sendKeys(foldname1);
	plan.sendKeys(planname1);
	projectplan.sendKeys("C:\\Users\\Mac\\Desktop\\empty-shelf-illustration_1284-9525.jpg");
	description.sendKeys(description11);
	version.sendKeys(version11);
	includetrans.click();
	save2.click();
	savesuccess2.click();
	Thread.sleep(3000);
	serachfield.sendKeys(foldname1);
	Thread.sleep(3000);
	action.click();
	aupdateplan.click();
	updateversionno.sendKeys(updatedver1);
	updateplan1.click();
	webview.click();
	dowload.click();
	Thread.sleep(3000);
	edit.click();
	photo.sendKeys("C:\\Users\\Mac\\Desktop\\flower.jpg");
	uploadphoto.click();
	uploadphotosucess.click();
	Thread.sleep(3000);
	photodel.click();
	Thread.sleep(3000);
	confirmphotodel.click();
	Thread.sleep(3000);
	photodelok.click();
	Thread.sleep(3000);
	

	
}

	
}



