package testRunners;

import org.testng.annotations.BeforeTest;
import screens.RegistrationScreen;
import setup.Setup;
import utils.Utils;

public class WalletTestRunner extends Setup {
    @BeforeTest
    public void register() {
        RegistrationScreen rScreen = new RegistrationScreen(driver);
        rScreen.insertPhoneAndClickButton(Utils.randomPhoneNumber());
        rScreen.insertOtpAndClickButton(driver);
        rScreen.insertShopNameAndClickButton(Utils.randomShopName());
    }
}
