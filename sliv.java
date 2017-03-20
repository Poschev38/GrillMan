package com.example.tests;

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
	 
	 selenium.findElement(By.linkText("+")).click();
	 
	 (new WebDriverWait(selenium, 4)).until(ExpectedConditions.
			  textToBePresentInElementLocated(By.linkText("+"), 
					  "+"));
	 
	 selenium.findElement(By.cssSelector("form#commerce-cart-add-to-cart-form-177 input#edit-submit")).click();
	 
	 //(new WebDriverWait(selenium, 4)).until(ExpectedConditions.
			 // textToBePresentInElementLocated(By.cssSelector("form#commerce-cart-add-to-cart-form-177 input#edit-submit"), 
					 // "Заказать"));
	 
	 WebElement dynamicElement = (new WebDriverWait(selenium, 10))
			 .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("form#commerce-cart-add-to-cart-form-177 input#edit-submit")));
	 
	 	 
	 selenium.findElement(By.xpath("(//a[contains(text(),'+')])[2]")).click();
	 
	 (new WebDriverWait(selenium, 4)).until(ExpectedConditions.
			  textToBePresentInElementLocated(By.xpath("(//a[contains(text(),'+')])[2]"), 
					  "+"));
	 
	 selenium.findElement(By.cssSelector("form#commerce-cart-add-to-cart-form-180 input#edit-submit--2")).click();
	 
	 (new WebDriverWait(selenium, 4)). until(ExpectedConditions.
			  textToBePresentInElementLocated(By.cssSelector("form#commerce-cart-add-to-cart-form-180 input#edit-submit--2"), 
					  "Заказать"));
	 
	 //selenium.findElement(By.cssSelector("a.checkout-button")).click(); //нажатие на кнопку "заказать"
	 
	 /*
	 кнопка 2
	 selenium.findElement(By.xpath("(//a[contains(text(),'+')])[2]")).click();
	 selenium.findElement(By.cssSelector("form#commerce-cart-add-to-cart-form-180 input#edit-submit--2")).click();
	 
	 Кнопка 3 
	 selenium.findElement(By.xpath("(//a[contains(text(),'+')])[3]")).click();
	 selenium.findElement(By.cssSelector("form#commerce-cart-add-to-cart-form-362 input#edit-submit--3")).click();
	 */
	 
	 
	 
	 
	  /* WebElement a;
	 a = selenium.findElement(By.cssSelector(".trimmed-text"));
	 assertTrue(selenium.findElement(By.cssSelector(".trimmed-text")).getText().contains("text"));
	 System.out.println(a);
	 
	 selenium.findElement(By.cssSelector("div#content")).findElements(By.cssSelector(".trimmed-text"));
	
	 
	 
	 List<WebElement> foods = selenium.findElement(By.cssSelector("div#content")).findElements(By.cssSelector(".trimmed-text"));
	 */
}

	
	
}
