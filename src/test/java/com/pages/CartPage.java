// CartPage.java
package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CartPage {

	private WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	public void lapImage() throws InterruptedException {
		Thread.sleep(3000);
		WebElement ele =  driver.findElement(By.xpath("//*[@class='picture']//a//img"));
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click();", ele);

	}

	public void addToCart() {
		WebElement addtocart =  driver.findElement(By.xpath("//*[@id='add-to-cart-button-31']"));
		addtocart.click();
	}

}
