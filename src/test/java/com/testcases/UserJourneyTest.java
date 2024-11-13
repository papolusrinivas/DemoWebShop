package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.CartPage;
import com.pages.CheckoutPage;
import com.pages.LoginPage;
import com.pages.ProductSearchPage;
import com.pages.RegistrationPage;
import com.pages.HomePage; // Assuming you have a HomePage class for navigation links
import com.utils.TestBase;

public class UserJourneyTest extends TestBase {

	@Test
	public void testEndToEndUserJourney() throws InterruptedException {
		// Initialize the page objects
		HomePage homePage = new HomePage(driver); // For navigating to login page
		LoginPage loginPage = new LoginPage(driver);
		ProductSearchPage searchPage = new ProductSearchPage(driver);
		CartPage cartPage = new CartPage(driver);
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		RegistrationPage registrationPage = new RegistrationPage(driver);

		homePage.clickRegisterLink();
		registrationPage.selectGenderMale();
		registrationPage.enterFirstName("jeueu"); 
		registrationPage.enterLastName("vasu"); 
		registrationPage.enterEmail("mppmn.vasu44@example.com"); 
		registrationPage.enterPassword("password123"); 
		registrationPage.enterConfirmPassword("password123"); 
		registrationPage.clickRegister();
		registrationPage.assertRegistrationConfirmationMessage();
		registrationPage.clicklogout();

		homePage.clickLoginLink(); 
		loginPage.login("mppmn.vasu44@example.com", "password123");
		
		// Step 2: Search for a product
		searchPage.searchProduct("Laptop");
		cartPage.lapImage();
		cartPage.addToCart();
		checkoutPage.ClicOnShoppingCart();
		checkoutPage.clickFirstOnCheckbox();
		checkoutPage.clickSecondOnIAgree();
		checkoutPage.clickOnCheckOut();

		
	}
}
