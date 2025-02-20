package com.Datacreation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebShop_Checkout_ShippingMethod {
	
	static WebElement element;
	public static WebElement ShippingMethod_Ground(WebDriver driver) {
		
		element=driver.findElement(By.id("shippingoption_0"));
			return element;
			
		}
	
	public static WebElement ShippingMethod_NextDayAir(WebDriver driver) {
		
		element=driver.findElement(By.id("shippingoption_1"));
			return element;
			
		}
	
	public static WebElement ShippingMethod_2ndDayAir(WebDriver driver) {
		
		element=driver.findElement(By.id("shippingoption_2"));
			return element;
			
		}
	
	public static WebElement Continue(WebDriver driver) {
		
		element=driver.findElement(By.className("shipping-method-next-step-button"));
			return element;
			
		}

}
