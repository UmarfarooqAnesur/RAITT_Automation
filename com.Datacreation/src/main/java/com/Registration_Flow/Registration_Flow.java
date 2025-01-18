package com.Registration_Flow;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration_Flow {
	
	public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://ct1-www.o2online.de/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	String ParentWindowHandle = driver.getWindowHandle();
	Set<String> ChildWindowHandle = driver.getWindowHandles();
	for(String st : ChildWindowHandle)
	{
		System.out.println("Windows IDS "+st);
	}
	
	//-------------------------PLP Page-----------------------------
	driver.findElement(By.xpath("//one-card[@data-ui-test-id='tariff-card-a60770c4-6c8c-4575-a4b7-245b6e34926e']//one-button[@data-ui-test-id='card-cta']")).click();
	Thread.sleep(3000);
	
	//-----------------Shopping cart Page----------------------------
	driver.findElement(By.xpath("//one-button[text()='Checkout']")).click();
	Thread.sleep(1000);
	
	//-----------------------personal-Detail-Page--------------------------------------
	//Personal-detail-section
   WebElement Email= driver.findElement(By.xpath("//one-input[@id='email']")).getShadowRoot()
    						.findElement(By.className("form-control"))
       						.findElement(By.className("form-control__input"))
       						.findElement(By.className("input--width-md"))
       						.findElement(By.id("input-18"));
    						Email.sendKeys("jkhyrf439@yopmail.com");
    						System.out.println("Email_id :" + Email.getDomAttribute("value"));
                            Thread.sleep(1000);
    
    driver.findElement(By.xpath("//one-input[@id='firstname']")).getShadowRoot()
    						.findElement(By.className("form-control--md"))
    						.findElement(By.className("form-control__input"))
    						.findElement(By.className("input--width-md"))
    						.findElement(By.id("input-22")).sendKeys("Test");
    
    driver.findElement(By.xpath("//one-input[@id='surname']")).getShadowRoot()
							.findElement(By.className("form-control--md"))
							.findElement(By.className("form-control__input"))
							.findElement(By.className("input--width-md"))
							.findElement(By.id("input-23")).sendKeys("Test");
                             Thread.sleep(1000);
    
    driver.findElement(By.xpath("(//one-input[@type='text'])[4]")).getShadowRoot()
							.findElement(By.className("form-control--md"))
							.findElement(By.className("form-control__input"))
							.findElement(By.className("input--width-md"))
							.findElement(By.id("input-24")).sendKeys("04");
	
    driver.findElement(By.xpath("(//one-input[@type='text'])[5]")).getShadowRoot()
							.findElement(By.className("form-control--md"))
							.findElement(By.className("form-control__input"))
							.findElement(By.className("input--width-md"))
							.findElement(By.id("input-25")).sendKeys("03");
    
    driver.findElement(By.xpath("(//one-input[@type='text'])[6]")).getShadowRoot()
							.findElement(By.className("form-control--md"))
							.findElement(By.className("form-control__input"))
							.findElement(By.className("input--width-md"))
							.findElement(By.id("input-26")).sendKeys("1993");
    
    driver.findElement(By.xpath("//one-input[@id='postalCode']")).getShadowRoot()
							.findElement(By.className("form-control--md"))
							.findElement(By.className("form-control__input"))
							.findElement(By.className("input--width-md"))
							.findElement(By.id("input-27")).sendKeys("10117");
    						Thread.sleep(1000);
    						
    driver.findElement(By.xpath("//one-select[@id='street']")).getShadowRoot()
    						.findElement(By.className("form-control--medium"))
    						.findElement(By.className("form-control__input"))
    						.findElement(By.className("select--expanded"))
    						.findElement(By.className("select__box"))
    						.findElement(By.className("select__control")).sendKeys("Am Kupfergraben");
    
    						Actions action = new Actions(driver);
    						action.sendKeys(Keys.ENTER).perform();
    
    
    driver.findElement(By.xpath("//one-input[@id='houseNumber']")).getShadowRoot()
							.findElement(By.className("form-control--md"))
							.findElement(By.className("form-control__input"))
							.findElement(By.className("input--width-md"))
							.findElement(By.id("input-30")).sendKeys("44");
    						Thread.sleep(1000);
    
    driver.findElement(By.xpath("//one-button[contains(text(),'Bestätigen')]")).click();
    Thread.sleep(2000);
    
    //Password-setup
    WebElement Password = driver.findElement(By.xpath("//one-input[@id='password']")).getShadowRoot()
							.findElement(By.className("form-control--md"))
							.findElement(By.className("form-control__input"))
							.findElement(By.className("input--width-md"))
							.findElement(By.className("input__control"));
							Password.sendKeys("TEF@12345678");
							System.out.println("Password : " + Password.getDomAttribute("Value"));
							
    						Thread.sleep(1000);
    //Confirm Password
    driver.findElement(By.xpath("//one-input[@id='confirm_password']")).getShadowRoot()
							.findElement(By.className("form-control--md"))
							.findElement(By.className("form-control__input"))
							.findElement(By.className("input--width-md"))
							.findElement(By.className("input__control")).sendKeys("TEF@12345678");
    						Thread.sleep(1000);
    driver.findElement(By.xpath("//one-button[contains(text(),'Kennwort speichern')]")).click();
    Thread.sleep(2000);
    
    
    //-----------------------------------E-mail Verification-----------------------------------
    driver.findElement(By.xpath("//one-pin-input[@type='number']")).getShadowRoot()
							.findElement(By.className("form-control--md"))
							.findElement(By.className("form-control__input"))
							.findElement(By.className("pin-input--width-md"))
							.findElement(By.className("pin-input__cell"))
							.findElement(By.id("pin-input-43-0")).sendKeys("0");
							   						
    
    driver.findElement(By.xpath("//one-pin-input[@type='number']")).getShadowRoot()
							.findElement(By.className("form-control--md"))
							.findElement(By.className("form-control__input"))
							.findElement(By.className("pin-input--width-md"))
							.findElement(By.className("pin-input__cell"))
							.findElement(By.className("pin-input__control")).sendKeys("0");
	
    driver.findElement(By.xpath("//one-pin-input[@type='number']")).getShadowRoot()
							.findElement(By.className("form-control--md"))
							.findElement(By.className("form-control__input"))
							.findElement(By.className("pin-input--width-md"))
							.findElement(By.className("pin-input__cell"))
							.findElement(By.className("pin-input__control")).sendKeys("0");
    
    driver.findElement(By.xpath("//one-pin-input[@type='number']")).getShadowRoot()
							.findElement(By.className("form-control--md"))
							.findElement(By.className("form-control__input"))
							.findElement(By.className("pin-input--width-md"))
							.findElement(By.className("pin-input__cell"))
							.findElement(By.className("pin-input__control")).sendKeys("0");
    
    driver.findElement(By.xpath("//one-pin-input[@type='number']")).getShadowRoot()
							.findElement(By.className("form-control--md"))
							.findElement(By.className("form-control__input"))
							.findElement(By.className("pin-input--width-md"))
							.findElement(By.className("pin-input__cell"))
							.findElement(By.className("pin-input__control")).sendKeys("0");
    
    driver.findElement(By.xpath("//one-pin-input[@type='number']")).getShadowRoot()
							.findElement(By.className("form-control--md"))
							.findElement(By.className("form-control__input"))
							.findElement(By.className("pin-input--width-md"))
							.findElement(By.className("pin-input__cell"))
							.findElement(By.className("pin-input__control")).sendKeys("0");
    
    driver.findElement(By.xpath("//one-button[contains(text(),'E-Mail bestätigen')]")).click();
    Thread.sleep(6000);
    driver.findElement(By.xpath("//one-button[contains(text(),'Weiter')]")).click();
    Thread.sleep(10000);
    
    //-------------------------Transfer page/Port-in------------------------------------
    driver.findElement(By.xpath("//one-button[normalize-space()='Weiter']")).click();
    Thread.sleep(10000);
    
    //----------------------------Payment-Screen----------------------------------------
    //--------------------Payment-type Page---------------------------
    driver.findElement(By.xpath("//one-button[normalize-space()='Weiter']")).click();
    Thread.sleep(2000);
    
    //--------------------Payment-Method Page---------------------------
    driver.findElement(By.xpath("//one-icon[@name='functional/plus']")).click();
    
    driver.findElement(By.xpath("//one-input[@type='text']")).getShadowRoot()
							.findElement(By.className("form-control--md"))
							.findElement(By.className("form-control__input"))
							.findElement(By.className("input--width-md"))
							.findElement(By.className("input__control")).sendKeys("DE42700304000000116734");
    driver.findElement(By.xpath("//one-button[@id='validateIban']")).click();
    driver.findElement(By.xpath("//one-button[normalize-space()='Zahlungsart hinzufügen']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//one-button[normalize-space()='Weiter']")).click();
    Thread.sleep(1000);
  
    
    
    
    
  //----------------------------Summary-Screen----------------------------------------
    driver.findElement(By.xpath("//one-button[@class='sumbit-confirm-btn']")).click();
    Thread.sleep(6000);
    String URL = driver.getCurrentUrl();
    System.out.println("Order id :-"+URL);
    driver.quit();
    
	}

}
