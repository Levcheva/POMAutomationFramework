package pages;

import org.openqa.selenium.WebDriver;

public class SignUpModal extends BasePage{
    public SignUpModal(WebDriver driver) {
        super(driver);
    }

    // Locators

    // Interaction Methods
    public void inputUserName() {
        usernameField.sendKeys("test61");
    }

    public void inputEmail() {
        emailField.sendKeys("test61");
    }

    public void inputPassword() {
        passwordField.sendKeys("test61");
    }

    public void clickSingUp() {
        signUpButton.click();
    }

    public void registerUser() {
        inputUserName();
        inputEmail();
        clickSingUp()
    }

}
