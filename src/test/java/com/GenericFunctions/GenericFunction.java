package com.GenericFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericFunction {

	public static WebDriver driver;
	
	public static WebDriverWait wait;
	public static Actions action;

	public static boolean invokeApplication(String browser, String URL)
	{
		boolean status = true;
		try{ 
		switch(browser.toLowerCase()){
			
		case "ff": 
			
			driver=new FirefoxDriver();
			
			driver.get(URL);
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			//wait=new WebDriverWait(driver,10);
			
		case "gg":
			
			driver=new ChromeDriver();
			
			driver.get(URL);
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);
			
			default:
				
				System.out.println("invalid");
			
		}}
		
		catch(Exception e){
			
			status = false;
		}
		
		
		
		
		
		return status;

	}
	
	public static boolean hoverAndClick(WebElement element){
		
		boolean status=true;
		
		try{
			
			action=new Actions(driver);
			action.moveToElement(element).click(element).build().perform();
			
			
			
		}
		catch(Exception e){
			
			System.out.println(e.getMessage());
			
			status=false;
		}
		
		return status;
	}
	
	
}
