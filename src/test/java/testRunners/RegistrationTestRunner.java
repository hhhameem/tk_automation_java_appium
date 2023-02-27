package testRunners;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.RegistrationScreen;
import setup.Setup;
import utils.Utils;

import java.io.IOException;

public class RegistrationTestRunner extends Setup {
    private final String phoneNumber = Utils.randomPhoneNumber();
    private final String shopName = Utils.randomShopName();

    @Test(priority = 1, description = "Enter phone number")
    public void enterPhoneNumberAndClickButton() throws InterruptedException {
        RegistrationScreen rScreen = new RegistrationScreen(driver);
        boolean isButtonEnabled = rScreen.insertPhoneAndClickButton(phoneNumber);
        Utils.saveScreenshot("Screenshot", driver);
        Assert.assertTrue(isButtonEnabled);
    }

    @Test(priority = 2, description = "Enter OTP")
    public void enterOtpAndClickButton() throws InterruptedException {
        RegistrationScreen rScreen = new RegistrationScreen(driver);
        boolean isButtonEnabled = rScreen.insertOtpAndClickButton(driver);
        Utils.saveScreenshot("Screenshot", driver);
        Assert.assertTrue(isButtonEnabled);
    }

    @Test(priority = 3, description = "Enter shop name")
    public void enterShopNameAndClickButton() throws Exception {
        RegistrationScreen rScreen = new RegistrationScreen(driver);
        boolean isButtonEnabled = rScreen.insertShopNameAndClickButton(shopName);
        Utils.saveScreenshot("Screenshot", driver);
        if (isButtonEnabled) {
            Utils.saveJsonList(phoneNumber, shopName, "users");
        }
        Assert.assertTrue(isButtonEnabled);
    }

    @Test(priority = 4, description = "Match shop title")
    public void matchShopTitle() throws IOException, ParseException {
        RegistrationScreen rScreen = new RegistrationScreen(driver);
        String expected_shop_title = Utils.getLastRegisteredUserShopName("users");
        String actual_shop_title = rScreen.textShopTitle.getText();
        Utils.saveScreenshot("Screenshot", driver);
        Assert.assertEquals(expected_shop_title, actual_shop_title);
    }
}