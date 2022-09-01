package com.simplielearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTest {

public static void main(String[] args) {
		
		
		//step:1 Declare the Path of Google Chrome Driver
		String path="D:\\Phase-5\\chromedriver_win32_Sept\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		
		//step:2 initializing webdriver
		WebDriver driver= new ChromeDriver();
		
		//step: give a base url
		String url="https://www.facebook.com/";
		driver.get(url);
		
		
		//locating webpage element
		
		
		WebElement email=driver.findElement(By.id("email"));
		System.out.println(email.getAttribute("placeholder"));
		email.sendKeys("nikunj@gmail.com");
		
		WebElement pass=driver.findElement(By.name("pass"));
		System.out.println(pass.getAttribute("placeholder"));
		pass.sendKeys("Nikunj@123");
		
		WebElement login=driver.findElement(By.name("login"));
	    login.click();
	    
		//driver.close();
		
	}
}
