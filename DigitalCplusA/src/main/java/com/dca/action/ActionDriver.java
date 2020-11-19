package com.dca.action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.dca.base.BaseClass;

public class ActionDriver extends BaseClass {
	
	public void selByIndex(WebElement ele,int index) {
		Select select11=new Select(ele);
		select11.selectByIndex(index);
	}
public void selByVisibleText(WebElement ele,String text) {
	Select select11=new Select(ele);
	select11.selectByVisibleText(text);
}
public void mouseHoverByJavaScript(WebElement ele) {
	
	
	WebElement mo = ele;
	String javaScript = "var evObj = document.createEvent('MouseEvents');"
			+ "evObj.initMouseEvent(\"mouseover\",true, false, window, 0, 0, 0, 0, 0, false, false, false, false, 0, null);"
			+ "arguments[0].dispatchEvent(evObj);";
	JavascriptExecutor js = (JavascriptExecutor) getDriver();
	js.executeScript(javaScript, mo);
}
public void mouseover(WebDriver driver, WebElement ele) {
	
	
	new Actions(getDriver()).moveToElement(ele).build().perform();
}
}

