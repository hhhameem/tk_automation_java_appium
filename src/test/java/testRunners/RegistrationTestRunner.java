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
    public void enterPhoneNumberAndClickButton() {
        RegistrationScreen rScreen = new RegistrationScreen(driver);
        boolean isButtonEnabled = rScreen.insertPhoneAndClickButton(phoneNumber);
        Assert.assertTrue(isButtonEnabled);
    }
    @Test(priority = 2, description = "Enter OTP")
    public void enterOtpAndClickButton() {
        RegistrationScreen rScreen = new RegistrationScreen(driver);
        boolean isButtonEnabled = rScreen.insertOtpAndClickButton(driver);
        Assert.assertTrue(isButtonEnabled);
    }
    @Test(priority = 3, description = "Enter shop name")
    public void enterShopNameAndClickButton() throws IOException, ParseException {
        RegistrationScreen rScreen = new RegistrationScreen(driver);
        boolean isButtonEnabled = rScreen.insertShopNameAndClickButton(shopName);
        if (isButtonEnabled) {
            Utils.saveJsonList(phoneNumber, shopName);
        }
        Assert.assertTrue(isButtonEnabled);
    }
    @Test(priority = 4, description = "Match shop title")
    public void matchShopTitle() throws IOException, ParseException {
        RegistrationScreen rScreen = new RegistrationScreen(driver);
        String expected_shop_title = Utils.getLastRegisteredUserShop();
        String actual_shop_title = rScreen.textShopTitle.getText();
        Assert.assertEquals(expected_shop_title, actual_shop_title);
    }
}
