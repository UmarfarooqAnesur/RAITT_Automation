package com.Datacreation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebShop_Login_Page {
	
	static WebElement element;
	public static WebElement CheckoutAsguest(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//input[@value='Checkout as Guest']"));
			return element;
			
		}

}
