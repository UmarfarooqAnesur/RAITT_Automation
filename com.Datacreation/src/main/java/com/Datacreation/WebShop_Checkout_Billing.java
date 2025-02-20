package com.Datacreation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebShop_Checkout_Billing {
	
	static WebElement element;
	public static WebElement First_name(WebDriver driver) {
		
		element=driver.findElement(By.id("BillingNewAddress_FirstName"));
			return element;
			
		}
	
	public static WebElement Last_name(WebDriver driver) {
		
		element=driver.findElement(By.id("BillingNewAddress_LastName"));
			return element;
			
		}
	
	public static WebElement Email(WebDriver driver) {
		
		element=driver.findElement(By.id("BillingNewAddress_Email"));
			return element;
			
		}
	
	public static WebElement Company(WebDriver driver) {
		
		element=driver.findElement(By.id("BillingNewAddress_Company"));
			return element;
			
		}
	
	public static Select Country(WebDriver driver) {
		
		element=driver.findElement(By.id("BillingNewAddress_CountryId"));
		Select CountryName = new Select(element);
			return CountryName;
			
		}
	
	public static WebElement Address1(WebDriver driver) {
		
		element=driver.findElement(By.id("BillingNewAddress_Address1"));
			return element;
			
		}
	
     public static WebElement City(WebDriver driver) {
		
		element=driver.findElement(By.id("BillingNewAddress_City"));
			return element;
			
		}
     
     public static WebElement Postalcode(WebDriver driver) {
 		
 		element=driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
 			return element;
 			
 		}
     
     public static WebElement Phone_numaber(WebDriver driver) {
 		
 		element=driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
 			return element;
 			
 		}
     
     public static WebElement Click_On_Continue(WebDriver driver) {
  		
  		element=driver.findElement(By.xpath("//input[@onclick='Billing.save()']"));
  			return element;
  		
  		}

}













