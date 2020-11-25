package com.dca.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
@FindBy(xpath="//p[contains(text(),'Drop your files here (or click)')]")
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
@FindBy(xpath="//tbody/tr[1]/td[7]/i[2]")
WebElement webview;


@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-buildingplanimages[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]/a[1]/i[1]")
WebElement dowload;
@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-buildingplanimages[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/li[1]")
WebElement edit;
@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[2]/div[2]/div[1]/app-buildingplanimages[1]/div[4]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")
WebElement photo;
@FindBy(xpath="//button[contains(text(),'Update')]")
WebElement uploadphoto;
@FindBy(xpath="//button[contains(text(),'OK')]")
WebElement uploadphotosucess;
@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-buildingplanimages[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/li[1]")
WebElement photodel;
@FindBy(xpath="//button[contains(text(),'Yes, delete it!')]")
WebElement confirmphotodel;
@FindBy(xpath="//button[contains(text(),'OK')]")
WebElement photodelok;
@FindBy(xpath="//tbody/tr[1]/td[7]/button[1]")
WebElement aupdateplan;

@FindBy(linkText ="Project Files")
WebElement projectFile;
@FindBy(xpath="//tbody/tr[1]/td[3]/div[1]/div[1]/i[1]")
WebElement performaction;
@FindBy(xpath="//tbody/tr[1]/td[4]/div[1]/div[1]/ngx-dropzone[1]/div[1]")
WebElement projectFileUpload;
@FindBy(xpath="//tbody/tr[1]/td[4]/div[1]/div[3]/button[1]")
WebElement sharefile;
@FindBy(xpath="//span[contains(text(),'Select Casas Employees')]")
WebElement selcasasaemployee;
@FindBy(xpath="//div[contains(text(),'Select All')]")
WebElement selectselall;
@FindBy(css="div.wrapper:nth-child(3) div.RouterContent div.container-fluid.Pages_background.Backgroundforipad:nth-child(1) div.container-fluid.shadow.p-3.mb-5.bg-white.rounded.maincard:nth-child(2) div.row.tabledivproperties:nth-child(4) div.col-lg-12.table-responsive table.table.table-bordered.table-hover.table-condensed.ng-scope tr:nth-child(1) td:nth-child(4) div.row:nth-child(1) div.col-lg-1 > i.fa.fa-share")
WebElement blueicon;
@FindBy(xpath="//button[contains(text(),'OK')]")
WebElement blueiconok;
@FindBy(xpath="//button[contains(text(),'Select All')]")
WebElement selectall;
@FindBy(xpath="//tbody/tr[3]/td[3]/input[1]")
WebElement clicking;
@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-building-plans[1]/div[3]/div[1]/div[1]/div[4]/div[1]/button[1]")

WebElement share;
@FindBy(xpath="//button[contains(text(),'OK')]")
WebElement shareok;

public ProjectFilesPages() {
	PageFactory.initElements(getDriver(), this);
}

	
	

public void projectfile(String selproject1, String foldname1, String planname1, String description11, String version11,
		String updatedver1) throws InterruptedException, IOException, AWTException {
	ac.selByVisibleText(selproj,selproject1);
	Thread.sleep(5000);
	newplanbtn.click();
	foldername.sendKeys(foldname1);
	save.click();
	savesuccess.click();
	Thread.sleep(3000);
	folder.sendKeys(foldname1);
	plan.sendKeys(planname1);
	//projectplan.sendKeys("C:\\Users\\Amaze Inc Lap 03\\git\\DigitalCplusA\\DigitalCplusA\\Imagesrc\\flower.jpg");
	projectplan.click();
	ac.upload();
	Thread.sleep(5000);
	description.sendKeys(description11);
	version.sendKeys(version11);
	includetrans.click();
	save2.click();
	savesuccess2.click();
	Thread.sleep(3000);
	//projectFile.click();
	getDriver().navigate().back();
	Thread.sleep(2000);
	getDriver().navigate().back();
	Thread.sleep(3000);
	serachfield.sendKeys(foldname1);
	Thread.sleep(3000);
	performaction.click();
	Thread.sleep(3000);
	//action.click();
	aupdateplan.click();
	updateversionno.sendKeys(updatedver1);
	updateplan1.click();
	webview.click();
	dowload.click();
	Thread.sleep(3000);
	edit.click();
	photo.sendKeys("C:\\Users\\Dell\\git\\DigitalCplusA\\DigitalCplusA\\Imagesrc\\flower.jpg");
	//photo.click();
	//ac.upload();
	Thread.sleep(5000);
	
	
	uploadphoto.click();
	uploadphotosucess.click();
	Thread.sleep(3000);
	photodel.click();
	Thread.sleep(3000);
	confirmphotodel.click();
	Thread.sleep(3000);
	photodelok.click();
	Thread.sleep(3000);
	getDriver().navigate().back();
	Thread.sleep(2000);
	getDriver().navigate().back();
	Thread.sleep(3000);
	serachfield.sendKeys(foldname1);
	
	projectFileUpload.click();
	ac.upload();
	Thread.sleep(5000);
	//blueicon.click();
	//Thread.sleep(3000);
	//blueiconok.click();
	
	sharefile.click();
	Thread.sleep(5000);
	selcasasaemployee.click();
	selectselall.click();
	//selectall.click();
	//clicking.click();
	//Thread.sleep(3000);
	//selectselall.click();
	 Robot robot1=new Robot();
	 for(int i=0;i<1;i++) {
		 robot1.keyPress(KeyEvent.VK_PAGE_DOWN);
		 Thread.sleep(3000);
	 }
	 clicking.click();
	share.click();
	Thread.sleep(3000);
	shareok.click();
	
	
}

	
}



