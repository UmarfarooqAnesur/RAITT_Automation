package com.Datacreation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebShop_Home_Page {

		static WebElement element;
		public static WebElement Click_apparel_shoes(WebDriver driver) {
			
		element=driver.findElement(By.xpath("//ul[@class='top-menu']//a[@href='/apparel-shoes']"));
			return element;
			
		}
		
		public static WebElement Click_on_BlueJeans(WebDriver driver) {
			
			element=driver.findElement(By.xpath("//img[@title='Show details for Blue Jeans']"));
				return element;
				
			}
		
		
        public static WebElement Click_on_AddToCart(WebDriver driver) {
			
			element=driver.findElement(By.id("add-to-cart-button-36"));
				return element;
				
			}

	}


