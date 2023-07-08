package testRunners;

import io.github.cdimascio.dotenv.Dotenv;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import screens.CashboxScreen;
import screens.RegistrationAndLoginScreen;
import setup.Setup;
import utils.Utils;

public class CashboxTestRunner extends Setup {
    Dotenv dotenv = Dotenv.load();
    SoftAssert softAssert = new SoftAssert();

    @BeforeTest
    public void register() throws InterruptedException {
        RegistrationAndLoginScreen rScreen = new RegistrationAndLoginScreen(driver);
        rScreen.insertPhoneAndClickButton(Utils.randomPhoneNumber());
        rScreen.insertOtpAndClickButton(driver);
        rScreen.insertShopNameAndClickButton(Utils.randomShopName());
    }

    @Test(priority = 1, description = "Insert cash becha and assert the confirmation message")
    public void cashBecha() throws InterruptedException {
        CashboxScreen cbScreen = new CashboxScreen(driver);
        String confirmationMessage = cbScreen.cashBecha(driver, "33 taka bechlam");
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("TEXT_AFTER_UPDATING_PELAM_DILAM")));
    }

    @Test(priority = 2, description = "Insert cash kena and assert the confirmation message")
    public void cashKena() {
        CashboxScreen cbScreen = new CashboxScreen(driver);
        String confirmationMessage = cbScreen.cashKena("9 taka Kinlam");
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("TEXT_AFTER_UPDATING_PELAM_DILAM")));
    }

    @Test(priority = 3, description = "Insert khoroch and assert the confirmation message")
    public void khoroch() {
        CashboxScreen cbScreen = new CashboxScreen(driver);
        String confirmationMessage = cbScreen.khoroch("7 taka khoroch korlam");
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("TEXT_AFTER_UPDATING_PELAM_DILAM")));
    }

    @Test(priority = 4, description = "Insert malik dilo  and assert the confirmation message")
    public void malikDilo() {
        CashboxScreen cbScreen = new CashboxScreen(driver);
        String confirmationMessage = cbScreen.malikDilo("9 taka malik dilo");
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("TEXT_AFTER_UPDATING_PELAM_DILAM")));
    }

    @Test(priority = 5, description = "Insert malik nilo  and assert the confirmation message")
    public void malikNilo() {
        CashboxScreen cbScreen = new CashboxScreen(driver);
        String confirmationMessage = cbScreen.malikNilo();
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("TEXT_AFTER_UPDATING_PELAM_DILAM")));
    }

    @Test(priority = 6, description = "Assert the Dashboard summary in  cashbox homepage")
    public void dashboardSummary() {
        CashboxScreen cbScreen = new CashboxScreen(driver);
        String actualAjkerBecha = cbScreen.textAjkerBecha.getText();
        String expectedAjkerBecha = dotenv.get("TEXT_AJKER_BECHA");
        softAssert.assertEquals(actualAjkerBecha, expectedAjkerBecha);
        String actualAjPelam = cbScreen.textAjPelam.getText();
        String expectedAjPelam = dotenv.get("TEXT_AJ_PELAM");
        softAssert.assertEquals(actualAjPelam, expectedAjPelam);
        String actualAjDilam = cbScreen.textAjDilam.getText();
        String expectedAjDilam = dotenv.get("TEXT_AJ_DILAM");
        softAssert.assertEquals(actualAjDilam, expectedAjDilam);
        String actualBortomanCash = cbScreen.textBortomanCash.getText();
        String expectedBortomanCash = dotenv.get("TEXT_BORTOMAN_CASH");
        softAssert.assertEquals(actualBortomanCash, expectedBortomanCash);
        softAssert.assertAll();
    }

    @Test(priority = 7, description = "Close eye Button and check that all numbers ar hidden")
    public void closeEyeButton() {
        CashboxScreen cbScreen = new CashboxScreen(driver);
        String textAjkerBecha = cbScreen.closeEyeButton();
        Assert.assertEquals(textAjkerBecha, dotenv.get("TEXT_AFTER_CLOSING_EYE_BUTTON"));
    }

    @Test(priority = 8, description = "Cashbox milai")
    public void cashboxMilai() {
        CashboxScreen cbScreen = new CashboxScreen(driver);
        String cashGhatti = cbScreen.cashboxMilai();
        Assert.assertEquals(cashGhatti, dotenv.get("TEXT_GHATTI"));
    }

    @Test(priority = 9, description = "Cashbox report")
    public void cashboxReport() throws InterruptedException {
        CashboxScreen cbScreen = new CashboxScreen(driver);
        cbScreen.cashboxReport();
        String actualMotDilam = cbScreen.textMotDilamInCashHisab.getText();
        String expectedMotDilam = dotenv.get("TEXT_MOT_DILAM_CASHBOX");
        softAssert.assertEquals(actualMotDilam, expectedMotDilam);
        String actualMotPelam = cbScreen.textMotPelamInCashHisab.getText();
        String expectedMotPelam = dotenv.get("TEXT_MOT_PELAM_CASHBOX");
        softAssert.assertEquals(actualMotPelam, expectedMotPelam);
        String actualBalance = cbScreen.textBalanceInCashHisab.getText();
        String expectedBalance = dotenv.get("TEXT_BALANCE_CASHBOX");
        softAssert.assertEquals(actualBalance, expectedBalance);
        softAssert.assertAll();
    }

    @Test(priority = 10, description = "Cash report")
    public void cashReport() throws InterruptedException {
        CashboxScreen cbScreen = new CashboxScreen(driver);
        cbScreen.cashReport();
        String actualMotDilam = cbScreen.textMotDilamInCashHisab.getText();
        String expectedMotDilam = dotenv.get("TEXT_MOT_DILAM_CASH");
        softAssert.assertEquals(actualMotDilam, expectedMotDilam);
        String actualMotPelam = cbScreen.textMotPelamInCashHisab.getText();
        String expectedMotPelam = dotenv.get("TEXT_MOT_PELAM_CASH");
        softAssert.assertEquals(actualMotPelam, expectedMotPelam);
        String actualCashBalance = cbScreen.textCashBalancePelamInCashHisab.getText();
        String expectedCashBalance = dotenv.get("TEXT_CASH_BALANCE_CASH");
        softAssert.assertEquals(actualCashBalance, expectedCashBalance);
        String actualMalikerBalance = cbScreen.textMalikerBalanceInCashHisab.getText();
        String expectedMalikerBalance = dotenv.get("TEXT_CASH_MALIKER_BALANCE_CASH");
        softAssert.assertEquals(actualMalikerBalance, expectedMalikerBalance);
        softAssert.assertAll();
    }

    @Test(priority = 11, description = "Cash becha report")
    public void cashBechaReport() throws InterruptedException {
        CashboxScreen cbScreen = new CashboxScreen(driver);
        String actualTotalTransactionAmount = cbScreen.cashBechaReport();
        String expectedTotalTransactionAmount = dotenv.get("TEXT_CASH_BECHA");
        Assert.assertEquals(actualTotalTransactionAmount, expectedTotalTransactionAmount);
    }

    @Test(priority = 12, description = "Cash becha report")
    public void cashKenaReport() throws InterruptedException {
        CashboxScreen cbScreen = new CashboxScreen(driver);
        String actualTotalTransactionAmount = cbScreen.cashKenaReport();
        String expectedTotalTransactionAmount = dotenv.get("TEXT_CASH_KENA");
        Assert.assertEquals(actualTotalTransactionAmount, expectedTotalTransactionAmount);
    }

    @Test(priority = 13, description = "Khoroch report")
    public void khorochReport() throws InterruptedException {
        CashboxScreen cbScreen = new CashboxScreen(driver);
        String actualTotalTransactionAmount = cbScreen.khorochReport();
        String expectedTotalTransactionAmount = dotenv.get("TEXT_KHOROCH");
        Assert.assertEquals(actualTotalTransactionAmount, expectedTotalTransactionAmount);
    }

    @Test(priority = 14, description = "Malik Dilo report")
    public void malikDiloReport() throws InterruptedException {
        CashboxScreen cbScreen = new CashboxScreen(driver);
        String actualTotalTransactionAmount = cbScreen.malikDiloReport();
        String expectedTotalTransactionAmount = dotenv.get("TEXT_MALIK_DILO");
        Assert.assertEquals(actualTotalTransactionAmount, expectedTotalTransactionAmount);
    }

    @Test(priority = 15, description = "Malik Nilo report")
    public void malikNiloReport() throws InterruptedException {
        CashboxScreen cbScreen = new CashboxScreen(driver);
        String actualTotalTransactionAmount = cbScreen.malikNiloReport();
        String expectedTotalTransactionAmount = dotenv.get("TEXT_MALIK_NILO");
        Assert.assertEquals(actualTotalTransactionAmount, expectedTotalTransactionAmount);
    }
}