package com.Datacreation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebShop_OrderSuccess_Page {
	
	static WebElement element;
	public static WebElement Order_id(WebDriver driver) {
		
		element=driver.findElement(By.xpath("(//ul[@class='details'])/li[1]"));
			return element;
		
		}


}
