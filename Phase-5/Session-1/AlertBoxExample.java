package com.simplielearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxExample {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\chromedriver_win32_Sept\\chromedriver.exe");
		
	    WebDriver driver= new ChromeDriver();
	
	    driver.manage().window().maximize();
	    
	    driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	    
	    //simple alertbox
	    driver.findElement(By.name("alertbox")).click();
	    driver.switchTo().alert().accept();
	    
	    //confirm  alert box
	    driver.findElement(By.name("confirmalertbox")).click();
	    driver.switchTo().alert().accept();
	    
	    System.out.println(driver.findElement(By.id("demo")).getText());
	    
	    //prompt alertbox
	    
	    driver.findElement(By.name("promptalertbox1234")).click();
	    driver.switchTo().alert().sendKeys("Yes");
	    driver.switchTo().alert().accept();
	   // driver.switchTo().alert().dismiss();
	    
	    System.out.println(driver.findElement(By.id("demoone")).getText());
	    
	     
	    
	    //driver.close();
	    
	    
	    
	
	}

}
