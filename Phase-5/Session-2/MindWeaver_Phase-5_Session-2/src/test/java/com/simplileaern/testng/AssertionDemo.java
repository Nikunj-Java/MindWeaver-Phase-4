package com.simplileaern.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AssertionDemo {
	
	
	  WebDriver driver=null;
	  SoftAssert soft=null;
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  soft= new SoftAssert();
		  System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\chromedriver_win32_Sept\\chromedriver.exe");
		  driver= new ChromeDriver();
	  }

	  @AfterMethod
	  public void afterMethod() {
		  
		  soft=null;
		  driver=null;
	  }
	  
	  @Test
	  public void FacebookTittle() {
		  				driver.get("https://www.facebook.com/");
		  				System.out.println(driver.getTitle());
		  				
		  				soft.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		  				soft.assertAll();
		  				driver.close();
		  				
		  				 
	  }
}
