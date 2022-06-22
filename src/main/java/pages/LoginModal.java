package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginModal extends BasePage{

    public LoginModal(WebDriver driver) {
        super(driver);
    }

    // Locators
 By usernameField = By.xpath("//*[@id='nav-link-login']");
 By passwordFieldField = By.xpath("//*[@id='nav-link-login']");
 By signInButton = By.xpath("//*[@id='nav-link-login']");
 By registerButton = By.xpath("//a[contains(text(), 'Register')]");

    // Interaction Methods
    public void enterUsername(String username) {
        driver.findElement(usernameField).clear();
        driver.findElement(usernameField).sendKeys();
        driver.findElement(signInButton).click();
    }

    public void enterPassword(String password) {
        driver.findElement(passwordFieldField).clear();
        driver.findElement(passwordFieldField).sendKeys();
    }

    public void clickSignIn() {
        driver.findElement(signInButton).click();
    }

    public void registerUser() {
        clickRegisterButton();
    }

    public void clickRegisterButton() {
        driver.findElement(registerButton).click();
    }
}
