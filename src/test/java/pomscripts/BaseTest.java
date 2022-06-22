package pomscripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.DefaultPage;
import pages.HomePage;
import pages.LoginModal;
import pages.SignUpModal;
import utils.Screenshot;
import org.testng.ITestResult;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;
    DefaultPage defaultPage;
    LoginModal loginModal;
    HomePage homePage;
    SignUpModal signUpModal;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        defaultPage = new DefaultPage(driver);
        homePage = new HomePage(driver);
        loginModal = new LoginModal(driver);
        signUpModal = new SignUpModal(driver);
    }

    @AfterTest
        public void tearDown(ITestResult result) {
            if (!result.isSuccess()) {
                Screenshot.capture(driver, "screenshots", result.getName());
            }
        driver.quit();
    }
}