package com.Datacreation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webshop_Launch_Browser {
	
	public static WebDriver driver;
	
	public static  void Browser(String name) {
		
		if(name=="chrome") {
			driver = new ChromeDriver();
			
			}
		
		if(name=="edge") {
			
		}
		
		if(name=="firefox") {
			
		}
			
		}
	
	public static void Open_URL(WebDriver driver, String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void Close_Browser(WebDriver driver) {
		driver.close();
		driver.quit();
	}
	
}
