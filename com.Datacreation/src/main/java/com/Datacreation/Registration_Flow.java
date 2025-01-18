package com.Datacreation;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration_Flow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//ul[@class='top-menu']//a[@href='/apparel-shoes']")).click();
		driver.findElement(By.xpath("//div[@data-productid='36']//input[@value='Add to cart']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Shopping cart Page
		driver.findElement(By.xpath("//li[@id='topcartlink']//a[@class='ico-cart']")).click();
		Select country = new Select(driver.findElement(By.id("CountryId")));
		country.selectByContainsVisibleText("India");
		driver.findElement(By.name("estimateshipping")).click();
		driver.findElement(By.name("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.xpath("//input[@value='Checkout as Guest']")).click();
		
		//Initiating the Checkout process
		//Billing Address
		driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Jhon");
		driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Cena");
		driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("Jhon564@yopmail.com");
		driver.findElement(By.id("BillingNewAddress_Company")).sendKeys("NAN");
		Select CountryName = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
		CountryName.selectByContainsVisibleText("India");
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Berlin");
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("jhyterd");
		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("10117");
		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("9978465322");
		driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();
		Thread.sleep(2000);
		
		//Shipping Address
		String ParentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent Window ID" +ParentWindowHandle);
		
		Set<String> ChildWindowHandler = driver.getWindowHandles();
		for(String hadle : ChildWindowHandler)
		{
			System.out.println("All Windows IDS" +hadle);
		}
		driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
		//driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("shippingoption_1")).click();
		driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']")).click();
		
		//Payment method
		driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
		
		//Payment Information
		driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
		
		//Confirm Order
		driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();
		List<WebElement> Orderid = driver.findElements(By.xpath("//ul[@class='details']"));
		for(WebElement el : Orderid)
		{
			if(el.getText().startsWith("Order number:"));
			{
			System.out.print(el.getText());
			}
			break;
		}
		
		driver.quit();
		
		
	}

}
