package com.ScreenFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.GenericFunctions.GenericFunction;

public class Admin_Page extends GenericFunction{
	@FindBy(how=How.XPATH,using="//*[text()='Admin ']")
	public static WebElement Tab_Admin;
	
	@FindBy(how=How.XPATH,using="//*[@name='uname']")
	public static WebElement UserName;
	
	@FindBy(how=How.XPATH,using="//*[@name='pwd']")
	public static WebElement PassWord;

	@FindBy(how=How.XPATH,using="//*[@name='submitBtn']")
	public static WebElement SubmitBtn;
	
	@FindBy(how=How.XPATH,using="//a[text()='Add staff member']")
	public static WebElement AddStaffMember;
	
	@FindBy(how=How.XPATH,using="//*[@name='staff_name']")
	public static WebElement StaffName;
	
	
	@FindBy(how=How.XPATH,using="//*[@name='staff_gender'][2]")
	public static WebElement Gender;
	

	@FindBy(how=How.XPATH,using="//*[@name='staff_dob']")
	public static WebElement StaffDob;
	
	@FindBy(how=How.XPATH,using="//*[@name='staff_status']")
	public static WebElement RelationShip;
	
	@FindBy(how=How.XPATH,using="//*[@name='staff_dept']")
	public static WebElement Department;
	
	@FindBy(how=How.XPATH,using="//*[@name='staff_doj']")
	public static WebElement DateOfJoin;
	
	@FindBy(how=How.XPATH,using="//textarea[@name='staff_address']")
	public static WebElement StaffAddr;
	
	@FindBy(how=How.XPATH,using="//*[@name='staff_mobile']")
	public static WebElement StaffMobile;
	
	@FindBy(how=How.XPATH,using="//*[@name='staff_email']")
	public static WebElement StaffEmail;
	
	@FindBy(how=How.XPATH,using="//*[@name='staff_pwd']")
	public static WebElement StaffPwd;

	@FindBy(how=How.XPATH,using="//*[@name='add_staff']")
	public static WebElement StaffAdd;
	
	@FindBy(how=How.XPATH,using="//*[text()='the email-id is already registered']")
	public static WebElement EmailError;
	
	@FindBy(how=How.XPATH,using="//*[text()='Delete staff']")
	public static WebElement DeleteStaff;
	
	@FindBy(how=How.XPATH,using="//tbody/tr")
	public static WebElement DeleteRadio;
	
	@FindBy(how=How.XPATH,using="//*[text()='Delete staff']")
	public static WebElement Btn_DelStaff;
	
	public Admin_Page() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public static boolean clickOnAdmin(){
		
		boolean status=true;
		try{
			
			status=hoverAndClick(Tab_Admin);
			System.out.println("success");
		}
		
			
			catch(Exception e){
				
				System.out.println(e.getMessage());
				
				status=false;
			}
		
		return status;
	}
		public static boolean clickOnLogin(String UID,String PWD){
			boolean status=true;
			
			try{
				
				UserName.sendKeys(UID);
				PassWord.sendKeys(PWD);
				SubmitBtn.click();
				
			}
			
			catch(Exception e){
				
				System.out.println(e.getMessage());
				
				status=false;
			}
		
		return status;
		}
	
		public static  void staffDetails(String SName,String SDob,String SRelation, String SJoin,String SDept, String SAddr,String SMobile,String SEmail,String SPwd){
			
			//boolean status=true;
			try{
				
				StaffName.sendKeys(SName);
				Gender.click();
				StaffDob.sendKeys(SDob);
				Select sc=new Select(RelationShip);
				sc.selectByVisibleText(SRelation);
				DateOfJoin.sendKeys(SJoin);
				Select sc1=new Select(Department);
				sc1.selectByVisibleText(SDept);
				StaffAddr.sendKeys(SAddr);
				StaffMobile.sendKeys(SMobile);
				StaffEmail.sendKeys(SEmail);
				StaffPwd.sendKeys(SPwd);
				StaffAdd.click();
				
				
				
			
			}
catch(Exception e){
				
				System.out.println(e.getMessage());
				
				//status=false;
		}
			//return status;
	
}
}
