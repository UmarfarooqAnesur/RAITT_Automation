package com.Datacreation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebShop_Cart_Page {
	
	static WebElement element;
	public static WebElement Click_Shopping_Cart(WebDriver driver) {
		
	element = driver.findElement(By.xpath("//li[@id='topcartlink']//a[@class='ico-cart']"));
		return element;
		
	}
	
	public static WebElement Country(WebDriver driver) {
		
		element = driver.findElement(By.id("CountryId"));
		Select country = new Select(element);
			return element;
			
		}
	
	public static WebElement postal_code(WebDriver driver) {
		
		element = driver.findElement(By.id("ZipPostalCode"));
			return element;
			
		}
	
	public static WebElement click_on_EstimateShipping(WebDriver driver) {
		
		element = driver.findElement(By.name("estimateshipping"));
			return element;
			
		}
	
	public static WebElement CheckBox(WebDriver driver) {
		
		element = driver.findElement(By.name("termsofservice"));
			return element;
			
		}
	
	public static WebElement Checkout(WebDriver driver) {
		
		element = driver.findElement(By.id("checkout"));
			return element;
			
		}

}
