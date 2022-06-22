package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The page after the user has logged in
 */

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Locators using PageFactory
    @FindBy(id = "nav-link-new-post")
    WebElement newPostButton;

    @FindBy(xpath = "//i[contains(@class,'sign-out')]")
    WebElement logOutButton;

    // Interaction Methods

    // Boolean Methods to assert --> not to be confused with assertions
    public boolean isNewPostButtonDisplayed() {
        return newPostButton.isDisplayed();
    }

    public boolean isLogOutButtonDisplayed() {
        return logOutButton.isDisplayed();
    }
}
