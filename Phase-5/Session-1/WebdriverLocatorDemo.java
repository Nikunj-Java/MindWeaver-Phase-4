package com.simplielearn.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverLocatorDemo {

	
	public static void main(String[] args) {
		
				//step:1 Declare the Path of Google Chrome Driver
				System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\chromedriver_win32_Sept\\chromedriver.exe");
						
						
				//step:2 initializing webdriver
			    WebDriver driver= new ChromeDriver();
						
				//step:3 give a base url
				driver.get("http://www.facebook.com/");
				
				//by id
				WebElement email_id= driver.findElement(By.id("email"));
				
				//by name
				WebElement email_name= driver.findElement(By.name("email"));
				
				System.out.println("Email id by NAME and ID is: "+email_id.equals(email_name));
				
				
				
				//by id
				WebElement pass_id= driver.findElement(By.id("pass"));
				
				//by name
				WebElement pass_name= driver.findElement(By.name("pass"));
				
				System.out.println("Password id by NAME and ID is: "+pass_id.equals(pass_name));
				
				
				//link text
				WebElement Link= driver.findElement(By.linkText("Forgotten password?"));
				//Link.click();
				
				//by relative path (Xpath)
				WebElement email_xpath=driver.findElement(By.xpath("//*[@id=\"email\"]"));
				
				//by full xpath
				WebElement email_full_xpath=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
				
				
				System.out.println("Email id by XPATH and FULL X PATH is: "+email_xpath.equals(email_full_xpath));
				
				
				//by using selector(css)
				WebElement email_selector= driver.findElement(By.cssSelector("#email"));
				
				
				System.out.println("Email ID  by XPATH and SELECTOR is: "+email_xpath.equals(email_selector));
				
				
				//BY TAG
				
				//WebElement password_tag=driver.findElement(By.tagName("input"));
				
				 
				//get the list of all elements 
				
				List<WebElement> list= driver.findElements(By.cssSelector("input.inputtext"));
				
				for(WebElement e:list) {
					System.out.println("List of Webelements:"+e.getAttribute("placeholder"));
				}
				
				//driver.close();
				
				
				
				
		
	}
}
