package com.Datacreation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebShop_Checkout_PaymentInfo {
	
	static WebElement element;
	public static WebElement Continue(WebDriver driver) {
		
		element=driver.findElement(By.className("payment-info-next-step-button"));
			return element;
			
		}

}
