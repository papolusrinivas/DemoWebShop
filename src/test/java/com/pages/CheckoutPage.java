// CheckoutPage.java
package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    private WebDriver driver;
    private WebElement ele;
   
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ClicOnShoppingCart() {
        ele = driver.findElement(By.xpath("(//*[text()='Shopping cart'])[1]"));
        ele.click();
    }

   public void clickFirstOnCheckbox() {
	   ele = driver.findElement(By.xpath("(//*[@type='checkbox'])[1]"));
			   ele.click();
}
   
   public void clickSecondOnIAgree() {
	   ele = driver.findElement(By.xpath("(//*[@type='checkbox'])[2]"));
	   ele.click();
}
   
   public void clickOnCheckOut() {
	   ele = driver.findElement(By.id("checkout"));
	   ele.click();
}
   
   
   
}
   
   
   
