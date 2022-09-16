package com.simplileaern.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FacebookTest {
   
	WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\chromedriver_win32_Sept\\chromedriver.exe");
	  driver= new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver=null;
  }
  
  @Test
  public void Facebook() {
	  				driver.get("https://www.facebook.com/");
	  				System.out.println(driver.getTitle());
	  				
	  				WebElement email= driver.findElement(By.id("email"));
	  				email.sendKeys("Nikunj@gmail.com");
	  				
	  				WebElement password= driver.findElement(By.name("pass"));
	  				password.sendKeys("Nikunj@123");
	  				
	  				WebElement  login= driver.findElement(By.name("login"));
	  				login.click();
	  				
	  				//driver.close();
  }

}
