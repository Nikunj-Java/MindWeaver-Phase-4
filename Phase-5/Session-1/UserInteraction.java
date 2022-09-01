package com.simplielearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class UserInteraction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\chromedriver_win32_Sept\\chromedriver.exe");
		
	    WebDriver driver= new ChromeDriver();
	
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.facebook.com/");
	    
	    WebElement email= driver.findElement(By.id("email"));
	    WebElement pass= driver.findElement(By.id("pass"));
	    WebElement login= driver.findElement(By.name("login"));
	    
	    Actions builder= new Actions(driver);
	    
	    Action serieOfAction =  builder
	    		.moveToElement(email)
	    		.sendKeys(email,"Hello")
	    		.keyDown(email,Keys.SHIFT)
	    		.doubleClick()
	    		.contextClick()
	    		.build();
	    serieOfAction.perform();
	
	}
}
