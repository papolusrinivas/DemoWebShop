// ProductSearchPage.java
package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductSearchPage {
    private WebDriver driver;
    private By searchBox = By.id("small-searchterms");
    private By searchButton = By.cssSelector("input[value='Search']");
    private By productTitle = By.xpath("//h2[@class='product-title']/a");

    public ProductSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProduct(String productName) {
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchButton).click();
    }

    public boolean isProductDisplayed(String productName) {
        return driver.findElement(productTitle).getText().contains(productName);
    }
}
