package com.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class waiUtils {

    WebDriver driver;

    public waiUtils(WebDriver driver) {
        this.driver = driver;
    }

    // Wait for an element to be visible
    public void waitForElementToBeVisible(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Wait for an element to be clickable
    public void waitForElementToBeClickable(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    // Wait for an element to be present in the DOM
    public void waitForElementToBePresent(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    // Wait for an element to be invisible
    public void waitForElementToBeInvisible(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    // Fluent Wait for an element (check periodically, wait for specific timeout)
    public void waitForElementWithFluentWait(By locator, int timeoutInSeconds, int pollingIntervalInSeconds) {
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(timeoutInSeconds))
            .pollingEvery(Duration.ofSeconds(pollingIntervalInSeconds))
            .ignoring(NoSuchElementException.class)
            .ignoring(ElementNotInteractableException.class);

        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
