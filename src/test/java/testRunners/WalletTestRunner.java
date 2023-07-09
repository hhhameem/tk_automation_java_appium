package testRunners;

import io.github.cdimascio.dotenv.Dotenv;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import screens.RegistrationAndLoginScreen;
import screens.WalletScreen;
import setup.Setup;
import utils.Utils;

public class WalletTestRunner extends Setup {
    Dotenv dotenv = Dotenv.load();
    WalletScreen wScreen;

    @BeforeTest
    public void register() throws InterruptedException {
        RegistrationAndLoginScreen rScreen = new RegistrationAndLoginScreen(driver);
        rScreen.loginBeforeRunningWalletOps(driver, dotenv.get("PHONE_NUMBER_FOR_LOGIN"));
    }

    @Test(priority = 1)
    public void arrowButtonDisabledForInvalidPhoneNumber() {
        wScreen = new WalletScreen(driver);
        boolean isArrowButtonDisabled = wScreen.arrowButtonDisabledForInvalidPhoneNumber("015364");
        System.out.println("arrowButtonDisabledForInvalidPhoneNumber - " + isArrowButtonDisabled);
    }
    @Test(priority = 2)
    public void errorInputMessageForInvalidPhoneNumber() {
        wScreen = new WalletScreen(driver);
        String errorMessage = wScreen.errorInputMessageForInvalidPhoneNumber();
        System.out.println("errorInputMessageForInvalidPhoneNumber - " + errorMessage);
    }
    @Test(priority = 3)
    public void infoMessageInScreenForNewValidNumber(String validPhoneNumber) {
        wScreen = new WalletScreen(driver);
        String errorMessage = wScreen.infoMessageInScreenForNewValidNumber("01876345636");
        System.out.println("infoMessageInScreenForNewValidNumber - " + errorMessage);
    }
    @Test(priority = 4)
    public void arrowButtonEnabledForValidPhoneNumber() {
        wScreen = new WalletScreen(driver);
        boolean isArrowEnabled = wScreen.arrowButtonEnabledForValidPhoneNumber();
        System.out.println("arrowButtonEnabledForValidPhoneNumber - " + isArrowEnabled);
    }
    @Test(priority = 5)
    public void selectOperatorAndConnectionType() {
        wScreen = new WalletScreen(driver);
        String errorMessage = wScreen.selectOperatorAndConnectionType();
        System.out.println("selectOperatorAndConnectionType - " + errorMessage);
    }
    @Test(priority = 6)
    public void insufficientBalanceErrorMessage(String insufficientAmountToRecharge) {
        wScreen = new WalletScreen(driver);
        String errorMessage = wScreen.insufficientBalanceErrorMessage("12000");
        System.out.println("insufficientBalanceErrorMessage - " + errorMessage);
    }
    @Test(priority = 7)
    public void porobortiButtonDisabledForInsufficientBalance() {
        wScreen = new WalletScreen(driver);
        boolean isButtonDisabled =  wScreen.porobortiButtonDisabledForInsufficientBalance();
        System.out.println("porobortiButtonDisabledForInsufficientBalance - " + isButtonDisabled);
    }
    @Test(priority = 8)
    public void rechargeAmountSameInPinPage(String rechargeAmount) {
        wScreen = new WalletScreen(driver);
        String errorMessage = wScreen.rechargeAmountSameInPinPage("21");
        System.out.println("rechargeAmountSameInPinPage - " + errorMessage);
    }
    @Test(priority = 9)
    public void buttonDisabledForPinLessThanFour(String pinLessThanFour) {
        wScreen = new WalletScreen(driver);
        boolean isButtonDisabled = wScreen.buttonDisabledForPinLessThanFour("123");
        System.out.println("buttonDisabledForPinLessThanFour - " + isButtonDisabled);
    }
    @Test(priority = 10)
    public void errorMessageForWrongPin(String wrongPin) {
        wScreen = new WalletScreen(driver);
        String errorMessage = wScreen.errorMessageForWrongPin("1234");
        System.out.println("errorMessageForWrongPin - " + errorMessage);
    }
    @Test(priority = 11)
    public void rechargeSuccessful(String correctPin) {
        wScreen = new WalletScreen(driver);
        String successMessage = wScreen.rechargeSuccessful(dotenv.get("PIN"));
        System.out.println("rechargeSuccessful - " + successMessage);
    }
    @Test(priority = 12)
    public void frequentRechargeAmountVisible() {
        wScreen = new WalletScreen(driver);
        boolean isvisible = wScreen.frequentRechargeAmountVisible();
        System.out.println("frequentRechargeAmountVisible - " + isvisible);
    }
    @Test(priority = 13)
    public void rechargeFromFrequentRechargeAmount(String pin) {
        wScreen = new WalletScreen(driver);
        String successMessage = wScreen.rechargeFromFrequentRechargeAmount(dotenv.get("PIN"));
        System.out.println("rechargeFromFrequentRechargeAmount - " + successMessage);
    }
    @Test(priority = 14)
    public void noPackageAvailable(String gpPhoneNumber) {
        wScreen = new WalletScreen(driver);
        String message = wScreen.noPackageAvailable("01726897612");
        System.out.println("noPackageAvailable - " + message);
    }
    @Test(priority = 15)
    public void rechargeBundlePackage(String pin) {
        wScreen = new WalletScreen(driver);
        String successMessage = wScreen.rechargeBundlePackage(dotenv.get("PIN"));
        System.out.println("rechargeBundlePackage - " + successMessage);
    }
}
