package com.dca.pages;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;
import com.dca.pages.PropertyActionsPage;
import com.dca.utility.ListenerClass;

public class PropertPage extends BaseClass {
	ListenerClass lc=new ListenerClass();
	ActionDriver ac=new ActionDriver();
	@FindBy(id = "ProejectType")
	public WebElement projecttype;
	@FindBy(xpath="//input[@id='txt_BuildingName']")
	public WebElement projectname;
	@FindBy(xpath="//textarea[@id='txt_BuildingAddress']")
	public WebElement propertyaddr ;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-update-building-details[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[4]/div[3]/select[1]")
	public WebElement country;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-update-building-details[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/div[3]/select[1]")
	public WebElement state ;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-update-building-details[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[6]/div[3]/select[1]")
	public WebElement city ;
	@FindBy(xpath="//input[@id='txt_PhoneNumber']")
	public WebElement phonenumber ;
	@FindBy(xpath="//select[@id='ddl_BuildinType']")
	public WebElement propertytype ;
	@FindBy(xpath="//input[@id='txt_ContactPersonName']")
	public WebElement contactname ;
	@FindBy(xpath="//input[@id='txt_ContactPersonPhone']")
	public WebElement contactphone ;
	@FindBy(xpath="//input[@id='txt_ContactPersonEmail']")
	public WebElement contactemail ;
	@FindBy(xpath="//input[@id='txt_NumberofFloors']")
	public WebElement numberoffloor ;
	@FindBy(css="#base1")
	public WebElement numberofbase ;
	@FindBy(xpath="//input[@id='txt_TotalNumberofUnits']")
	public WebElement numberofunit ;
	@FindBy(xpath="//input[@id='txt_UnitsPerFloor']")
	public WebElement unitperfloor ;
	@FindBy(xpath="//input[@id='txt_TotalBuildingArea']")
	public WebElement buildingarea ;
	@FindBy(xpath="//p[contains(text(),'Drop your files here (or click)')]")
	public WebElement photo ;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	public WebElement savebtn ;
	@FindBy(xpath="//input[@id='txt_YearBuilt']")
	public WebElement yearbuild;
	@FindBy(xpath="//select[@id='ddl_Entrance']")
	public WebElement enterance;
	@FindBy(xpath="//select[@id='ddl_ProjectExecutedBy']")
	public WebElement executed;
	@FindBy(xpath="//input[@id='Budgethours']")
	public WebElement budgethour;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	public WebElement propsaved;
	public PropertPage() {
		PageFactory.initElements(getDriver(), this);
	}
	public PropertyActionsPage details(String proname, String proadd, String phone,String conname,String conphone,String mail,String nofloor,String noofunit,String unitfloor,String buildarea,String budgethr) throws InterruptedException, IOException {

		Select select2=new Select(projecttype);
		select2.selectByIndex(1);
		Thread.sleep(1000);
		Select select3=new Select(country);
		select3.selectByIndex(1);
		String ctext=country.getText();
		lc.logs(ctext);
		Thread.sleep(1000);
		Select select4=new Select(state);
		select4.selectByIndex(1);
		String state1=state.getText();
		lc.logs(state1);
		Thread.sleep(1000);
		Select select5=new Select(city);
		select5.selectByIndex(1);
		String city1=city.getText();
		lc.logs(city1);
		Thread.sleep(1000);
		Select select6=new Select(propertytype);
		select6.selectByIndex(2);
		String proptype=propertytype.getText();
		Thread.sleep(3000);
		lc.logs(proptype);
		Thread.sleep(1000);
		projectname.sendKeys(proname);
		lc.logs("Entered Projectname"+" "+proname);
		
		propertyaddr.sendKeys(proadd);
		lc.logs("Entered PropertyAddress"+" "+proadd);
		phonenumber.sendKeys(phone);
		String mob=phonenumber.getAttribute("value");
		if(mob.length()==10) {
			System.out.println("Phone Number Valid");
		}else {
			System.out.println("Phone Number Invalid");
		}
		lc.logs("Entered PhoneNo"+" "+phone);
		contactname.sendKeys(conname);
		lc.logs("Entered ContactName"+" "+conname);
		contactphone.sendKeys(conphone);
		lc.logs("Entered Contact Phone"+" "+conphone);
		String comob=contactphone.getAttribute("value");
		if(comob.length()==10) {
			System.out.println("Contact Person Phone Valid");
		}else {
			System.out.println("Contact Person Phone invalid");
		}
		
		contactemail.sendKeys(mail);
		String email=contactemail.getAttribute("value");
		if((email).contains("@")){
		    System.out.println("Valid Email");
		}
		else{
			
		
		System.out.println("Invalid Emails");
		}
		lc.logs("Entered Contact Emails"+" "+mail);
		numberoffloor.sendKeys(nofloor);
		lc.logs("Number Of Floors"+" "+nofloor);
		numberofbase.click();
		lc.logs("Clicked On BaseMent");
		numberofunit.sendKeys(noofunit);
		lc.logs(" Entered Number Of Unit"+" "+noofunit);
		unitperfloor.sendKeys(unitfloor);
		lc.logs("Entered Number Of Unit Per Floor"+" "+unitfloor);
		buildingarea.sendKeys(buildarea);
		lc.logs("Entered Building Area"+" "+buildarea);
		budgethour.sendKeys(budgethr);
		lc.logs("Entered Budget Hour"+" "+budgethr);
		//Select select2=new Select(projecttype);
		//select2.selectByIndex(1);
		//yearbuild.sendKeys(ybuild);
		//budgethour.sendKeys(budgethr);
		//Select select3=new Select(country);
		//select3.selectByIndex(1);
		//Select select4=new Select(state);
		//select4.selectByIndex(1);
		//Select select5=new Select(city);
		//select5.selectByIndex(1);
		//Select select6=new Select(propertytype);
		//select6.selectByIndex(2);
		//photo.sendKeys("C:\\Users\\Amaze Inc Lap 03\\git\\DigitalCplusA\\DigitalCplusA\\Imagesrc\\flower.jpg");
		Thread.sleep(3000);
		photo.click();
		lc.logs("Clicked On Photo");
		ac.upload();
		lc.logs("Photo upload Success");
		//Select select7=new Select(enterance);
		//select7.selectByIndex(2);
		//Select select8=new Select(executed);
		//select8.selectByIndex(2);
		
		Thread.sleep(7000);
		savebtn.click();
		propsaved.click();
		lc.logs("Property Saved Success");
		Thread.sleep(3000);
		getDriver().navigate().refresh();

		return new PropertyActionsPage();
		
		
	}

}
