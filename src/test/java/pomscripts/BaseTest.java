package pomscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.DefaultPage;
import pages.HomePage;
import pages.LoginModal;
import utils.Screenshot;

import java.time.Duration;
public class BaseTest {

    WebDriver driver;
    DefaultPage defaultPage;
    LoginModal loginModal;
    HomePage homePage;
    signUpModal signUpModal;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        defaultPage = new DefaultPage(driver);
        homePage = new HomePage(driver);
    }

    @AfterTest
    public void
    tearDown() {
        if(!resulg.isSuccess()) {
            Screenshot.capture(driver, "screenshots", result.getName());
        }
        driver.quit();
    }
}
