package com.TestCases;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.GenericFunctions.GenericFunction;
import com.ScreenFunctions.Admin_Page;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TS02_TestCase extends Admin_Page{
	
	
	@Given("open url")
	public static void openBrowser(DataTable testdata){
		
		List<List<String>> data=testdata.raw();
		String browser=data.get(0).get(0);
		String url=data.get(0).get(1);
		
		System.out.println("launching browser");
		invokeApplication(browser,url);
		
	}
	@And("click on admin tab")
	public static void navigateToAdminTab(){
		
		Admin_Page sp=PageFactory.initElements(driver, Admin_Page.class);
		sp.clickOnAdmin();
		
		
	}
	
	@Then("Give username,passwords and click on login button")
	public static void clickOn(DataTable testdata ){
		
		List<List<String>> data=testdata.raw();
		System.out.println(data.get(0).get(0));
		System.out.println(data.get(0).get(1));
		String UserId=data.get(0).get(0);
		String PwdId=data.get(0).get(1);
		
		
		Admin_Page sp=PageFactory.initElements(driver, Admin_Page.class);
		sp.clickOnLogin(UserId, PwdId);
	}
	@When("Click on Add staff memeber link")
	public static void clickAddStaff(){
		
		Admin_Page sp=PageFactory.initElements(driver, Admin_Page.class);
		sp.hoverAndClick(sp.AddStaffMember);
		
	}
	
	@Then("Give deatils of staff")
	
	
	
	
	
	
	public void detailsOfStaff(DataTable testdata) throws Throwable {

		//Write the code to handle Data Table
		for (Map<String, String> data : testdata.asMaps(String.class, String.class)) {
			Admin_Page sp2=PageFactory.initElements(driver, Admin_Page.class);
			
			
			
			sp2.staffDetails(data.get("C1"),data.get("C2"),data.get("C3"),data.get("C4"),data.get("C5"),data.get("C6"),data.get("C7"),data.get("C8"),data.get("C9"));
			
			
			AddStaffMember.click();
			
			/*if((sp2.EmailError).isDisplayed()){
			
				driver.navigate().back();
			
			}*/
			
			
			
			/* DeleteStaff.click();
			
			List<WebElement> List=driver.findElements(By.xpath("//tbody/tr/td[10]"));
		
			
			for (int i=1;i<List.size();i++){
			
				
				if((List.get(i).getText()).equals(data.get("C8"))){
					
					System.out.println(data.get("C8")+"equals"+List.get(i).getText());
					System.out.println(List.get(i).getText());
					System.out.println(i+"i value");
					System.out.println(data.get("C8"));
					
					driver.findElement(By.xpath("//tbody/tr["+i+"]/td/input")).click();
					
					
					
				}
				
			}*/
			
			{
				
				
				
			}
			
			
			
			
			
		    
			}

	}
	
	
	
}
