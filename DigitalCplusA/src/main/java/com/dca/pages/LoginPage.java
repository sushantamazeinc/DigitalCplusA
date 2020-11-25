package com.dca.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.dca.base.BaseClass;

public class LoginPage extends BaseClass 
{
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
	@FindBy(xpath="//h4[contains(text(),'Project')]") 
	WebElement projecttest;

	
	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	public PropertyActionsPage login() {
		
		Select select=new Select(selcompany);
		select.selectByIndex(1);
		Select select1=new Select(Seltype);
		select1.selectByIndex(2);
		uname.sendKeys(prop.getProperty("username"));
		pswd.sendKeys(prop.getProperty("password"));
		signin.click();
		try {
			String verify= projecttest.getText();
			Assert.assertEquals(verify, "PROJECT");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return new PropertyActionsPage();
		
	
		
	}
	

}
