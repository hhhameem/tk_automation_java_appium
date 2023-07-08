package testRunners;

import io.github.cdimascio.dotenv.Dotenv;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.RegistrationAndLoginScreen;
import setup.Setup;
import utils.Utils;

public class LoginTestRunner extends Setup {
    Dotenv dotenv = Dotenv.load();

    @Test(priority = 1, description = "Verify that the device selection warning text is visible during login")
    public void isDeviceSelectionWarningTextVisible() throws InterruptedException {
        RegistrationAndLoginScreen rScreen = new RegistrationAndLoginScreen(driver);
        boolean isWarningTextVisible = rScreen.isDeviceSelectionWarningTextVisible(driver, dotenv.get("PHONE_NUMBER_FOR_LOGIN"));
        Utils.saveScreenshot("Screenshot", driver);
        Assert.assertTrue(isWarningTextVisible);
    }

    @Test(priority = 2, description = "Verify that snackbar alert is present if login attempt is taken with wrong pin")
    public void unsuccessfulLogin() {
        RegistrationAndLoginScreen rScreen = new RegistrationAndLoginScreen(driver);
        String alertText = rScreen.unsuccessfulLogin(driver);
        Utils.saveScreenshot("Screenshot", driver);
        Assert.assertTrue(alertText.contains(dotenv.get("TEXT_SNACKBAR_ERROR_WHEN_INVALID_PASSWORD_DURING_LOGIN")));
    }

    @Test(priority = 3, description = "Verify that user can login successfully with correct credentials")
    public void successfulLogin() {
        RegistrationAndLoginScreen rScreen = new RegistrationAndLoginScreen(driver);
        rScreen.successfulLogin(driver);
        Utils.saveScreenshot("Screenshot", driver);
        Assert.assertEquals("010", rScreen.textShopTitle.getText());
    }
}
