package com.dca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dca.action.ActionDriver;
import com.dca.base.BaseClass;

public class ProjectTimelines1page extends BaseClass {
	ActionDriver ac=new ActionDriver();
	@FindBy(xpath="//select[@id='ProjectID']")
	WebElement selproject;
	@FindBy(xpath="//button[contains(text(),'View Timeline Excel')]")
	WebElement viewtimelineexcel;
	@FindBy(xpath="//button[contains(text(),'Add New')]")
	WebElement addnew;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[2]/div[2]/div[1]/app-architectural-project-timeline-dasboard[1]/div[1]/div[1]/div[2]/div[1]/button[1]")
	WebElement exporttoexcel;
	@FindBy(xpath="//span[contains(text(),'19/11/2020')]")
	WebElement startdate;
	@FindBy(xpath="//span[contains(text(),'19/11/2020')]")
	WebElement enddate;
	@FindBy(xpath="//select[@id='StageName']")
	WebElement selstage1;
	@FindBy(xpath="//select[@id='StaffName']")
	WebElement staffname;
	
	
	@FindBy(xpath="//select[@id='ddlddd_Stage']")
	WebElement selectstage;
	@FindBy(xpath="//select[@id='ProcessCheck']")
	WebElement selprocesscheck;
	@FindBy(xpath="//input[@id='S_Date']")
	WebElement sdate;
	@FindBy(xpath="//input[@id='E_Date']")
	WebElement edate;
	@FindBy(xpath="//select[@id='MileStone_Staf']")
	WebElement careof;
	@FindBy(xpath="//input[@id='ismilestone']")
	WebElement milestone;
	@FindBy(xpath="//textarea[@id='Comments']")
	WebElement comments;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement save;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement saveok;
	
	
	
	@FindBy(xpath="//button[contains(text(),'Add Accomplishment')]")
	WebElement addaccomplishment;
	@FindBy(xpath="//select[@id='Accomplishment']")
	WebElement accomplishment;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement accompsave;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement accsaveok;
	
	
	@FindBy(xpath="//tbody/tr[2]/td[9]/i[1]")
	WebElement edit;
	@FindBy(xpath="//select[@id='MileStone_Staf']")
	WebElement updatecareof;
	@FindBy(xpath="//button[contains(text(),'Update')]")
	WebElement update;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement updateok;
	
	
	@FindBy(xpath="//tbody/tr[2]/td[9]/i[2]")
	WebElement del;
	@FindBy(xpath="//button[contains(text(),'Yes, delete it!')]")
	WebElement yesdel;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement delok;
	
	
	
	@FindBy(xpath="//button[@id='btn_button']")
	WebElement tpaddnew;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-timeline-plan[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/input[1]")
	WebElement tpplanupload;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement tpsave;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement tpsaveok;
	@FindBy(xpath="//tbody/tr[1]/td[3]/i[1]")
	WebElement tpdel;
	@FindBy(xpath="//button[contains(text(),'Yes, delete it!')]")
	WebElement tpyesdelete;
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement tpdelok;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-architectural-project-timeline-dasboard[1]/div[1]/div[3]/div[2]/div[1]/ng-daterangepicker[1]/div[1]/div[3]/div[1]/div[1]/span[1]/*[1]")
	WebElement dateclick;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[2]/div[2]/div[1]/app-architectural-project-timeline-dasboard[1]/div[1]/div[3]/div[2]/div[1]/ng-daterangepicker[1]/div[1]/div[3]/div[1]/div[1]/span[2]")
	WebElement day1;
	@FindBy(xpath="//body/app-root[1]/div[2]/div[2]/div[1]/app-architectural-project-timeline-dasboard[1]/div[1]/div[3]/div[2]/div[1]/ng-daterangepicker[1]/div[1]/div[3]/div[1]/div[3]/div[16]/span[1]")
	WebElement day2;
	
	
	@FindBy(id="Shape")
	WebElement dateclick1;
	@FindBy(xpath="//div[16]/span")
	WebElement datesel;
	@FindBy(xpath="//div[19]/span")
	WebElement datesel1;
	@FindBy(xpath="//*[@id=\"exportButton\"]")
	WebElement exportexcel1;
	
	
	
	
	
	
	public ProjectTimelines1page() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	//	String month="November 2019";
		//String day="10";
		
		//startdate.click();
		//Thread.sleep(3000);
		//startdate.sendKeys(sdate1);
		//enddate.sendKeys(edate1);
//		while(true) {
//			String text=day1.getText();
//			if(text.equals(month))
//			{
//				break;
//			}
//			else {
//				dateclick.click();
//			}
//		}
//		day2.click();
//		
	//	dateclick1.click();
	//	datesel.click();
	//	datesel1.click();
	//	Thread.sleep(3000);
		
		
	

	public void projecttimeline(String selproject1, String selstage, String procheck
, String selsdate,String enddate, String coff,

			String comm) throws InterruptedException {
		ac.selByVisibleText(selproject, selproject1);
		addnew.click();
		ac.selByVisibleText(selectstage, selstage);
		Thread.sleep(3000);
		ac.selByVisibleText(selprocesscheck, procheck);
		
		Thread.sleep(3000);
		sdate.sendKeys(selsdate);
		Thread.sleep(3000);
		edate.sendKeys(enddate);
		ac.selByVisibleText(careof, coff);
		
		milestone.click();
		Thread.sleep(3000);
		comments.sendKeys(comm);
		Thread.sleep(3000);
		save.click();
		Thread.sleep(5000);
		saveok.click();
		selstage1.sendKeys(selstage);
		//staffname.sendKeys(coff);
		Thread.sleep(3000);
		try {
			addaccomplishment.click();
			ac.selByIndex(accomplishment, 3);
			Thread.sleep(3000);
			accompsave.click();
			accsaveok.click();
			Thread.sleep(3000);
			edit.click();
			updatecareof.sendKeys(coff);
			update.click();
			Thread.sleep(3000);
			updateok.click();
			Thread.sleep(3000);
			getDriver().navigate().refresh();
			//exportexcel1.click();
			//exportexcel1.click();
			//exportexcel1.click();
			//Thread.sleep(3000);
			del.click();
			yesdel.click();
			delok.click();
		} catch (Exception e) {
			System.out.println(e);
		}
		Thread.sleep(3000);
		viewtimelineexcel.click();
		tpaddnew.click();
		Thread.sleep(3000);
		tpplanupload.sendKeys("C:\\Users\\Mac\\Desktop\\empty-shelf-illustration_1284-9525.jpg");
		tpsave.click();
		tpsaveok.click();
		getDriver().navigate().refresh();
		tpdel.click();
		tpyesdelete.click();
		tpdelok.click();
		
		
		
	}
	

}
