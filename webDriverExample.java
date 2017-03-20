package com.example.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webDriverExample {
	WebDriver selenium = new FirefoxDriver();
	
	@Test
	public void test(){ 
		
		selenium.get("https://grill-man.ru/");	
		
		WebElement catalog = selenium.findElement(By.cssSelector("div#content"));
		 List<WebElement> list = catalog.findElements(By.cssSelector(".trimmed-text"));
		 for (WebElement foods : list) {
		     System.out.println(String.format("Блюдо: %s", foods.getText()));
		     foods.click();
		     
		    
		
		/* 
		List<WebElement> catalog = selenium.findElements(By.cssSelector(".trimmed-text"));
		 for (int i=0; i<catalog.size(); i++){
			 System.out.println(String.format("Блюдо: %s", catalog.getText()));
		 */
		     
		    
	 
		
		     
		 }
	}

}


