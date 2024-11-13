// LoginPage.java
package  com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By emailField = By.id("Email");
    private By passwordField = By.id("Password");
    private By loginButton = By.cssSelector("input[value='Log in']");
    private By logoutLink = By.linkText("Log out");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String email, String password) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public boolean isLoginSuccessful() {
        return driver.findElements(logoutLink).size() > 0;
    }
}
