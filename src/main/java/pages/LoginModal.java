package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginModal {
    WebDriver driver;

    public LoginModal(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
 By usernameField = By.xpath("//*[@id='nav-link-login']");
 By passwordFieldField = By.xpath("//*[@id='nav-link-login']");
 By signInButton = By.xpath("//*[@id='nav-link-login']");

    // Methods
    public void enterUsername(String username) {
        driver.findElement(usernameField).clear();
        driver.findElement(usernameField).sendKeys();
    }

    public void enterPassword(String password) {
        driver.findElement(passwordFieldField).clear();
        driver.findElement(passwordFieldField).sendKeys();
    }

    public void clickSignIn() {
        driver.findElement(signInButton).click();
    }
}
