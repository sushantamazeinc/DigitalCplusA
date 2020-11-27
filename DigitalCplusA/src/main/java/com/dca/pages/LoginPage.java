package com.dca.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestListener;

import com.dca.base.BaseClass;
import com.dca.utility.ListenerClass;
import com.dca.utility.Log;

public class LoginPage extends BaseClass implements ITestListener
{
	ListenerClass lc=new ListenerClass();
	WebDriver driver;
	//WebElement selcompany=driver.findElement(By.id("ddl_LoginLanguageName"));
	@FindBy(id="ddl_LoginLanguageName")
	public WebElement selcompany;
	@FindBy(xpath=("//body/app-root[1]/div[2]/div[2]/div[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/select[1]"))
	public WebElement Seltype;
	@FindBy(xpath=("/html[1]/body[1]/app-root[1]/div[2]/div[2]/div[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]"))
	public WebElement uname;
	@FindBy(id="txt_Loginuserpassword")
	public WebElement pswd;
	@FindBy(id="btn_Loginbutton")
	public WebElement signin;
	@FindBy(xpath="//h6[contains(text(),'Project DASHBOARD')]") 
	WebElement projecttest;

	
	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	public PropertyActionsPage login() throws InterruptedException {
		
		Select select=new Select(selcompany);
		select.selectByIndex(1);
		Select select1=new Select(Seltype);
		select1.selectByIndex(2);
		uname.sendKeys(prop.getProperty("username"));
		String a1=uname.getAttribute("value");
		
		lc.logs("Username is"+" "+a1);
		
		pswd.sendKeys(prop.getProperty("password"));
		String a2=pswd.getAttribute("value");
		
		lc.logs("Password is"+" "+a2);
		signin.click();
		lc.logs("Clicked On SignIn");
		String verify= projecttest.getText();
		Assert.assertEquals(verify, "PROJECT DASHBOARD");
		return new PropertyActionsPage();
		
	
		
	}
	

}
