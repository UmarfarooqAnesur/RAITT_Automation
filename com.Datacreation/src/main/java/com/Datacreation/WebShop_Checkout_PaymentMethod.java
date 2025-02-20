package com.Datacreation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebShop_Checkout_PaymentMethod {
	
	static WebElement element;
	public static WebElement COD(WebDriver driver) {
		
		element=driver.findElement(By.id("paymentmethod_0"));
			return element;
			
		}
	
	public static WebElement Check_moneyOrder(WebDriver driver) {
		
		element=driver.findElement(By.id("paymentmethod_1"));
			return element;
			
		}
	
	public static WebElement Credit_Card(WebDriver driver) {
		
		element=driver.findElement(By.id("paymentmethod_2"));
			return element;
			
		}
	
	public static WebElement Purshase_Order(WebDriver driver) {
		
		element=driver.findElement(By.id("paymentmethod_3"));
			return element;
			
		}
	
	public static WebElement Continue(WebDriver driver) {
		
		element=driver.findElement(By.className("payment-method-next-step-button"));
			return element;
			
		}

}
