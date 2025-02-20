package com.Datacreation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebShop_Checkout_Shipping_Address {
	
	static WebElement element;
	public static WebElement Checkbox_Instore(WebDriver driver) {
		
		element=driver.findElement(By.id("PickUpInStore"));
			return element;
			
		}
	
	public static WebElement Continue(WebDriver driver) {
		
		element=driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
			return element;
			
		}

}
