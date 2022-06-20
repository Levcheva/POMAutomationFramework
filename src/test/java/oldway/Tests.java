package oldway;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {
    WebDriver driver;

    @Test
    public void loginTest() {
        driver.get("http://training.skillo-bg.com/posts/all");

        WebElement loginButton = driver.findElement(By.xpath("//*[@id='nav-link-login']"));
        loginButton.click();
        WebElement userNameField = driver.findElement(By.xpath("//*[@id='defaultLoginFormUsername']"));
        userNameField.sendKeys("test51");
        WebElement passwordField = driver.findElement(By.xpath("//*[@id='defaultLoginFormPassword']"));
        passwordField.sendKeys("test51");
        WebElement signInButton = driver.findElement(By.xpath("//*[@id='sign-in-button']"));
        signInButton.click();
        WebElement newPostButton = driver.findElement(By.xpath("//*[@id='nav-link-new-post']"));
        Assert.assertTrue(newPostButton.isDisplayed());
    }
}
