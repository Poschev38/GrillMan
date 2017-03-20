package com.example.tests.test;

import java.util.regex.Pattern;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.base.Predicate;

public class sliv {
	WebDriver selenium = new FirefoxDriver();
	
	@Test
	public void test(){ 
		//WebDriverWait wait = new WebDriverWait(selenium, 30, 500);
		//selenium.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  // тест сходит с ума
		//selenium.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); // не работает
	 
		selenium.get("https://grill-man.ru/");	
	 
		WebElement Plus1 = (new WebDriverWait(selenium, 10))
				 .until(ExpectedConditions.presenceOfElementLocated(By.linkText("+")));
		selenium.findElement(By.linkText("+")).click();
	 	 
		
		WebElement button1 = (new WebDriverWait(selenium, 10))
			 .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector
					 ("form#commerce-cart-add-to-cart-form-177 input#edit-submit")));
		selenium.findElement(By.cssSelector("form#commerce-cart-add-to-cart-form-177 input#edit-submit")).click();
	 
		
		WebElement Plus2 = (new WebDriverWait(selenium, 10))
			 .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[contains(text(),'+')])[2]")));
		selenium.findElement(By.xpath("(//a[contains(text(),'+')])[2]")).click();
	 
		
		WebElement button2 = (new WebDriverWait(selenium, 10))
			 .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector
					 ("form#commerce-cart-add-to-cart-form-180 input#edit-submit--2")));
		selenium.findElement(By.cssSelector("form#commerce-cart-add-to-cart-form-180 input#edit-submit--2")).click();
	 
	  
	 
}

	
	
}
