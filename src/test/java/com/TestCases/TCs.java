package com.TestCases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.GenericFunctions.GenericFunction;
import com.google.common.collect.Ordering;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class TCs extends GenericFunction{
	
	
	@Given("Enter URL")
	
	/*********************************'
	 Method Name: launchApp
	 
	 Description: This method is using for launch the application
	 
	 Outcome: Application should launch 
	 
	 DateOfModified: 26-10-2018
	 
	 **********************************/ 
	
	public static void launchApp(){
		System.out.println("lauched application");
		
		invokeApplication("ff","http://server/bank/");
		
		
	}
	
	
	/*********************************'
	 Method Name: validateUrl
	 
	 Description: By using this method we can validate whether Application is launched or not, by verifying the text on the page
	 
	 Outcome: Give result as Application launched or not
	 
	 DateOfModified: 26-10-2018
	 
	 **********************************/
	
	@Then ("Validate URL")
	
	public static void validateUrl(){
		System.out.println("second");
		
		String strPageExpeTitle= "ONLINE BANKING SYSTEM";
		
		String strPageActTitle=driver.getTitle().toUpperCase();
		
		
		if (strPageExpeTitle.equals(strPageActTitle)){ 
			
			System.out.println("Application launched ");
		}
		else
			System.out.println("Application not launched");
		
	}
	

	/*********************************'
	 Method Name: fieldValidation
	 
	 Description: By using this method we can validate whether Application is having Username,Password,Log In buttons or not
	 
	 Outcome: Will get to know whether fields or existing or not on Login page
	 
	 DateOfModified: 26-10-2018
	 
	 **********************************/
	
	@And ("Validate Securelogin,username, passwod fields are displaying or not")
	
	public static void fieldValidation() {
		
		String strLogActTitle=driver.findElement(By.xpath("//span[@class='caption']")).getText();
		
		
		
		if (strLogActTitle.equals("Secure Login")){
			
			System.out.println("Secure Login is displaying on the page");
		}
		
		else
		{
			System.out.println("Secure Login is NOT displaying on the page");
		}
		
		String strUname=driver.findElement(By.xpath("//tbody/tr[3]/td")).getText();
		
	
		if (strUname.equals("Username:")){
			
			System.out.println("username is displaying on the page");
		}
		else{
			System.out.println("username is NOT displaying on the page");
		
		}
		String strPwd=driver.findElement(By.xpath("//tbody/tr[5]/td")).getText();
		
		if (strPwd.equals("Password:")){
			
			System.out.println("Password is displaying on the page");
		}
		else {
			System.out.println("Password is NOT displaying on the page");
		
		}
		String strBtnLogin=driver.findElement(By.xpath("//tbody/tr[7]/td/input")).getAttribute("value").toLowerCase();
		
		if (strBtnLogin.equals("log in")){
			
			System.out.println("Log In is displaying on the page");
		}
		else {
			System.out.println("Log In is NOT displaying on the page");
		}
		
		
		//String s5=driver.findElement(By.xpath("//tbody/tr[4]/td/input")).getAttribute("value").toLowerCase();
		
		
		
		
	}
	
	/*********************************'
	 Method Name: ErrValidation
	 
	 Description: By using this method we can get Application login error messages
	 
	 Outcome: Will get what all error messages Login page is hsowing for invalid data entry
	 
	 DateOfModified: 26-10-2018
	 
	 **********************************/
	
	
	@Then ("Validate error messages")
	
	public static void ErrValidation(){
		

		
		driver.findElement(By.xpath("//tbody/tr[7]/td/input")).click();
		
		System.out.println("error msg");
		
		List<WebElement> errCnt =driver.findElements(By.cssSelector("input:invalid"));
		
		int intErrCount = errCnt.size();
		
		System.out.println(intErrCount);
	}
	
	
	@Given("open facebook url")
	
	public static void launchFBapp(){
		
		invokeApplication("ff", "https://www.makemytrip.com/");
		
		}
	
	@Then("Identify dropdown box")
	
	public static void identyfyDropdown(){
		
		driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']")).click();
			
		List<WebElement> list1=driver.findElements(By.xpath("//li[text()='Top Cities']//following-sibling::li//span[1]"));
		
		//Actions moveMouse=new Actions(driver);
		
		//moveMouse.moveToElement(toElement)
		
		
		int sizeOfListElements=list1.size();
		
		System.out.println(sizeOfListElements);
		
		String place;
		
		List<String> cities=new ArrayList();
		
		
		//Collections.sort(list1, Ordering.natural().nullsFirst());
		
		for(int i=0;i<sizeOfListElements;i++){
			
			
			
			if (!(list1.get(i).getText()).isEmpty()){
				
				place=list1.get(i).getText();
			
			//System.out.println(place);
			cities.add(place);
			
			
			
			
			
			}
			
			
			
			
			
			
			
			
			
			
			
		}
		
		Collections.sort(cities);
		
		
		
		for (int j=0;j<cities.size();j++){
		
		System.out.println(cities.get(j));
		}
		
		
		
		
		
		
	}
	
	@And("Validate whether dropdown is sorted or not")
	
	public static void checkSorted(){
		
		System.out.println("got listed items");
		
	}
	
	
}



