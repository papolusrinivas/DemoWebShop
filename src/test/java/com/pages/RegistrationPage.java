// RegistrationPage.java
package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.utils.waiUtils;

public class RegistrationPage {
    private WebDriver driver;
    waiUtils waitUtils;

    // Locators for registration form elements
    private By genderMale = By.id("gender-male");
    private By firstName = By.id("FirstName");
    private By lastName = By.id("LastName");
    private By email = By.id("Email");
    private By password = By.id("Password");
    private By confirmPassword = By.id("ConfirmPassword");
    private By registerButton = By.id("register-button");
    private By registrationConfirmation = By.xpath("//*[@class='page-body']");
    private By logout =By.xpath("//a[normalize-space()='Log out']");

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

	
	  public void selectGenderMale() {
		  
		  driver.findElement(genderMale).click();
	  
	  }
	
    public void enterFirstName(String firstNameValue) {
        driver.findElement(firstName).sendKeys(firstNameValue);
    }

    public void enterLastName(String lastNameValue) {
        driver.findElement(lastName).sendKeys(lastNameValue);
    }

    public void enterEmail(String emailValue) {
        driver.findElement(email).sendKeys(emailValue);
    }

    public void enterPassword(String passwordValue) {
        driver.findElement(password).sendKeys(passwordValue);
    }

    public void enterConfirmPassword(String confirmPasswordValue) {
        driver.findElement(confirmPassword).sendKeys(confirmPasswordValue);
    }

    public void clickRegister() {
        driver.findElement(registerButton).click();
    }

    public void assertRegistrationConfirmationMessage() {
    	
    		WebElement ele = driver.findElement(By.xpath("//*[@class='page-body']"));
        	String actualvalue = ele.getText();
        	String expectedvalue = "Your registration completed";
        	try
        	{
        	Assert.assertEquals(actualvalue, expectedvalue, "Same");
        	System.out.println("Your registration completed");
        	}
        	catch(Exception e) {
        		System.out.println("Your registration not completed");
    		Assert.assertEquals(actualvalue, expectedvalue, "Not same");
    	
        	}
    	
    	
    	
    }
    
	
	  public void clicklogout() { 
		  driver.findElement(logout).click(); 
		  
	  }
	  
}
	 
	  
