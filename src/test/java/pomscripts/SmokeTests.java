package pomscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTests extends BaseTest {

    @Test(retryAnalyzer = utils.Retries.class)
    public void loginTest() {
        driver.get("http://training.skillo-bg.com/");
        defaultPage.clickLoginButton();
        loginModal.enterUsername("test51");
        loginModal.enterPassword("test51");
        loginModal.clickSignIn();
        Assert.assertTrue(homePage.isNewPostButtonDisplayed());
    }

    @Test
    public void createAccount() {
    driver.get("http://training.skillo-bg.com/");
        defaultPage.clickLoginButton();
        loginModal.clickRegisterButton();
        signUpModal.registerUser("testKam", "kamQA");
        Assert.assertTrue(homePage.isNewPostButtonDisplayed());
    }

    @Test
    public void likePost() {
        loginTest();
        //TODO like post test logic after login
        driver.get("http://training.skillo-bg.com/users/2471");

        logoutTest();
    }

    @Test
    public void logoutTest() {
        driver.navigate().refresh();
        loginTest();
        //TODO implement logout functionality from every place
        // click the home button
        // click the logut button
    }
}
