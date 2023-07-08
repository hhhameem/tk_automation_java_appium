package testRunners;

import io.github.cdimascio.dotenv.Dotenv;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.RegistrationAndLoginScreen;
import setup.Setup;
import utils.Utils;

public class UnverifiedRegistrationTestRunner extends Setup {
    Dotenv dotenv = Dotenv.load();

    @Test(priority = 1)
    public void createUnverifiedAccount() throws InterruptedException {
        RegistrationAndLoginScreen rScreen = new RegistrationAndLoginScreen(driver);
        String shopName = Utils.randomShopName();
        String actualShopName = rScreen.createUnverifiedAccount(Utils.randomPhoneNumber(), shopName, driver);
        Assert.assertEquals(actualShopName, shopName);
    }

    @Test(priority = 2)
    public void verifyMobile() throws InterruptedException {
        RegistrationAndLoginScreen rScreen = new RegistrationAndLoginScreen(driver);
        boolean isUnavailable = rScreen.verifyMobile(driver);
        System.out.println("verifyMobile " + isUnavailable);
        Assert.assertTrue(isUnavailable);
    }

    @Test(priority = 3)
    public void verifyDataBackup() throws InterruptedException {
        RegistrationAndLoginScreen rScreen = new RegistrationAndLoginScreen(driver);
        String confirmationMessage = rScreen.verifyDataBackup();
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("TEXT_DATA_BACKUP_NEWA_ACHE")));
    }
}