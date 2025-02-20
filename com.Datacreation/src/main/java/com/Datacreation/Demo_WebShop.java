package com.Datacreation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demo_WebShop extends Webshop_Launch_Browser {

	public static void main(String[] args) throws InterruptedException {
		
		//-------------------Launching the browser-----------------------
		Webshop_Launch_Browser.Browser("chrome");
		Webshop_Launch_Browser.Open_URL(driver, "https://demowebshop.tricentis.com/");
		
		
		//-------------------Home-Page--------------------------------
		WebShop_Home_Page.Click_apparel_shoes(driver).click();
		WebShop_Home_Page.Click_on_BlueJeans(driver).click();
		WebShop_Home_Page.Click_on_AddToCart(driver).click();
		
		//-------------------cart-page-----------------------------------
		WebShop_Cart_Page.Click_Shopping_Cart(driver).click();
		WebShop_Cart_Page.Country(driver);
		WebShop_Cart_Page.postal_code(driver).sendKeys("12577");
		WebShop_Cart_Page.click_on_EstimateShipping(driver).click();
		WebShop_Cart_Page.CheckBox(driver).click();
		WebShop_Cart_Page.Checkout(driver).click();
		
		//-------------------Login-page/Continue-as-a-guest----------------------------
		WebShop_Login_Page.CheckoutAsguest(driver).click();
		
		//---------------------Check-out-Page-----------------------------------------
		//------------Billing_Address-----------------------
		WebShop_Checkout_Billing.First_name(driver).sendKeys("Rohan");
		WebShop_Checkout_Billing.Last_name(driver).sendKeys("Jeet");
		WebShop_Checkout_Billing.Email(driver).sendKeys("Jhon564@yopmail.com");
		WebShop_Checkout_Billing.Company(driver).sendKeys("NA");
		WebShop_Checkout_Billing.Country(driver).selectByContainsVisibleText("India");
		WebShop_Checkout_Billing.City(driver).sendKeys("Berlin");
		WebShop_Checkout_Billing.Address1(driver).sendKeys("hgtfdgv");
		WebShop_Checkout_Billing.Postalcode(driver).sendKeys("475832" );
		WebShop_Checkout_Billing.Phone_numaber(driver).sendKeys("9967456332");
		WebShop_Checkout_Billing.Click_On_Continue(driver).click();
		Thread.sleep(1000);
		
		
		//------------shipping_Address------------------------------------------------
		WebShop_Checkout_Shipping_Address.Continue(driver).click();
		Thread.sleep(1000);
		
		//------------shipping_method---------------------------------------------------
		WebShop_Checkout_ShippingMethod.ShippingMethod_Ground(driver).click();
		WebShop_Checkout_ShippingMethod.Continue(driver).click();
		Thread.sleep(1000);
	
		//------------Payment_mehtod------------------------------------------------------
		WebShop_Checkout_PaymentMethod.COD(driver).click();
		WebShop_Checkout_PaymentMethod.Continue(driver).click();
		Thread.sleep(1000); 
		
		//------------Payment_Information---------------------------------------------
		WebShop_Checkout_PaymentInfo.Continue(driver).click();
		Thread.sleep(1000);
		
		//------------order_Summary----------------------------------------------------
		WebShop_Checkout_OrderSummary.Submit_order(driver).click();
		Thread.sleep(1000);
		String id = WebShop_OrderSuccess_Page.Order_id(driver).getText();
		System.out.print(id);
		
		//----------------------quit----------------
		Webshop_Launch_Browser.Close_Browser(driver);
		
	}

}
