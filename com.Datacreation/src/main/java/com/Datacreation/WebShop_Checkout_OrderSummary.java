package com.Datacreation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebShop_Checkout_OrderSummary {
	
	static WebElement element;
	public static WebElement Submit_order(WebDriver driver) {
		
		element=driver.findElement(By.xpath("//input[@value='Confirm']"));
			return element;
		
		}

}
