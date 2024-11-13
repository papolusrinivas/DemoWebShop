// HomePage.java
package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage {
    private WebDriver driver;

   
    private By registerLink = By.xpath("//a[normalize-space()='Register']");
    
    private By loginLink = By.xpath("//a[normalize-space()='Log in']");

   
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

   
    public void clickRegisterLink() {
    	
        driver.findElement(registerLink).click();
       // Assert.assertEquals(true, null); 
    }

  
    public void clickLoginLink() {
        driver.findElement(loginLink).click();
    }
}
