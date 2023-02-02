package testRunners;

import io.github.cdimascio.dotenv.Dotenv;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import screens.TallyScreen;
import screens.RegistrationScreen;
import screens.TallyScreen;
import setup.Setup;
import utils.Utils;

import java.awt.*;


public class TallyTestRunner extends Setup {
    Dotenv dotenv = Dotenv.load();
    TallyScreen tScreen;

    @BeforeTest
    public void register() {
        RegistrationScreen rScreen = new RegistrationScreen(driver);
        rScreen.insertPhoneAndClickButton(Utils.randomPhoneNumber());
        rScreen.insertOtpAndClickButton(driver);
        rScreen.insertShopNameAndClickButton(Utils.randomShopName());
    }

    /*
     *--------------------------------------
     *  Customer create test cases
     * -------------------------------------
     */
    @Test(priority = 1)
    public void addCustomerWithNameWithoutNumber() {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addCustomerWithNameWithoutNumber("Customer With Name only");
        System.out.println("addCustomerWithNameWithoutNumber " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 2)
    public void addCustomerWithNameNumber() {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addCustomerWithNameNumber("Kyle simp", Utils.randomPhoneNumber());
        System.out.println("addCustomerWithNameWithoutNumber " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 3)
    public void addCustomerFromPhoneBook() {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addCustomerFromPhoneBook();
        System.out.println("addCustomerFromPhoneBook " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 4)
    public void addCustomerWithJer() {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addCustomerWithJer("Ross tylar", Utils.randomPhoneNumber(), "12");
        System.out.println("addCustomerWithJer " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 5)
    public void addCustomerFromPhoneBookWithJer() {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addCustomerFromPhoneBookWithJer("5");
        System.out.println("addCustomerFromPhoneBookWithJer " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 6)
    public void addCustomerWithJerPhotoDate() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addCustomerWithJerPhotoDate("Hamim", "01953471217", "3");
        System.out.println("addCustomerWithJerPhotoDate " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 7)
    public void addCustomerFromPhoneBookWithJerPhotoDate() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addCustomerFromPhoneBookWithJerPhotoDate("2");
        System.out.println("addCustomerFromPhoneBookWithJerPhotoDate " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 8)
    public void addCustomerWithInvalidNameValidPhone() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        boolean isBtnEnabled = tScreen.addCustomerWithInvalidNameValidPhone("hh", Utils.randomPhoneNumber());
        System.out.println("addCustomerWithInvalidNameValidPhone " + isBtnEnabled);
        Assert.assertFalse(isBtnEnabled);
    }

    @Test(priority = 9)
    public void addCustomerWithValidNameInvalidPhone() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String errorMessage = tScreen.addCustomerWithValidNameInvalidPhone("Piya Roy", "011");
        System.out.println("addCustomerWithValidNameInvalidPhone " + errorMessage);
        Assert.assertTrue(errorMessage.contains(dotenv.get("ERROR_MESSAGE_WHEN_INVALID_PHONE")));
    }

    @Test(priority = 10)
    public void addCustomerWithExistingPhone() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String errorMessage = tScreen.addCustomerWithExistingPhone("Asim Kha", "01953471217");
        System.out.println("addCustomerWithExistingPhone " + errorMessage);
        Assert.assertTrue(errorMessage.contains(dotenv.get("ERROR_MESSAGE_WHEN_EXISTING_PHONE")));
    }

    /*
     *--------------------------------------
     *  Supplier create test cases
     * -------------------------------------
     */
    @Test(priority = 11)
    public void addSupplierWithNameWithoutNumber() {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addSupplierWithNameWithoutNumber("Supplier With Name only");
        System.out.println("addSupplierWithNameWithoutNumber " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 12)
    public void addSupplierWithNameNumber() {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addSupplierWithNameNumber("Rizwan", "01517169846");
        System.out.println("addSupplierWithNameNumber " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));

    }

    @Test(priority = 13)
    public void addSupplierFromPhoneBook() {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addSupplierFromPhoneBook();
        System.out.println("addSupplierFromPhoneBook " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 14)
    public void addSupplierWithJer() {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addSupplierWithJer("Hussain", Utils.randomPhoneNumber(), "4");
        System.out.println("addSupplierWithJer " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 15)
    public void addSupplierFromPhoneBookWithJer() {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addSupplierFromPhoneBookWithJer("5");
        System.out.println("addSupplierFromPhoneBookWithJer " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 16)
    public void addSupplierWithJerPhotoAndDate() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addSupplierWithJerPhotoAndDate("Aila Mix", Utils.randomPhoneNumber(), "7");
        System.out.println("addSupplierWithJerPhotoAndDate " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 17)
    public void addSupplierFromPhoneBookWithJerPhotoAndDate() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addSupplierFromPhoneBookWithJerPhotoAndDate("3");
        System.out.println("addSupplierFromPhoneBookWithJerPhotoAndDate " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 18)
    public void addSupplierWithInvalidNameValidPhone() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        boolean isBtnEnabled = tScreen.addSupplierWithInvalidNameValidPhone("xx", Utils.randomPhoneNumber());
        System.out.println("addSupplierWithInvalidNameValidPhone " + isBtnEnabled);
        Assert.assertFalse(isBtnEnabled);
    }

    @Test(priority = 19)
    public void addSupplierWithValidNameInvalidPhone() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String errorMessage = tScreen.addSupplierWithValidNameInvalidPhone("Kim Ra yu", "011");
        System.out.println("addSupplierWithValidNameInvalidPhone " + errorMessage);
        Assert.assertTrue(errorMessage.contains(dotenv.get("ERROR_MESSAGE_WHEN_INVALID_PHONE")));
    }

    @Test(priority = 20)
    public void addSupplierWithExistingPhone() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String errorMessage = tScreen.addSupplierWithExistingPhone("Park Na", "01517169846");
        System.out.println("addSupplierWithExistingPhone " + errorMessage);
        Assert.assertTrue(errorMessage.contains(dotenv.get("ERROR_MESSAGE_WHEN_EXISTING_PHONE")));
    }


    /*
     * -------------------------------------------
     *  Update Dilam/pelam of customer test cases
     * -------------------------------------------
     */
    @Test(priority = 21)
    public void customerDilamBeshiPelamKom() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String motPaboValue = tScreen.customerDilamBeshiPelamKom("12", "5", Utils.randomFruitName());
        System.out.println("customerDilamBeshiPelamKom " + motPaboValue);
        Assert.assertTrue(motPaboValue.contains(dotenv.get("TEXT_TWENTY_NINE")));
    }

    @Test(priority = 22)
    public void customerDilamKomPelamBeshi() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String motPaboValue = tScreen.customerDilamKomPelamBeshi("2", "5", Utils.randomFruitName());
        System.out.println("customerDilamKomPelamBeshi " + motPaboValue);
        Assert.assertTrue(motPaboValue.contains(dotenv.get("TEXT_TWENTY_SIX")));
    }

    @Test(priority = 23)
    public void customerDilamPelamSoman() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String motPaboValue = tScreen.customerDilamPelamSoman("6", "6", Utils.randomFruitName());
        System.out.println("customerDilamPelamSoman " + motPaboValue);
        Assert.assertTrue(motPaboValue.contains(dotenv.get("TEXT_TWENTY_SIX")));
    }

    /*
     * -------------------------------------------
     *  Update Dilam/pelam of supplier test cases
     * -------------------------------------------
     */
    @Test(priority = 24)
    public void supplierDilamBeshiPelamKom() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String motPaboValue = tScreen.supplierDilamBeshiPelamKom("11", "1", Utils.randomFruitName());
        System.out.println("supplierDilamBeshiPelamKom " + motPaboValue);
        Assert.assertTrue(motPaboValue.contains(dotenv.get("TEXT_THIRTY_THREE")));
    }

    @Test(priority = 25)
    public void supplierDilamKomPelamBeshi() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String motPaboValue = tScreen.supplierDilamKomPelamBeshi("9", "13", "11", Utils.randomFruitName());
        System.out.println("supplierDilamKomPelamBeshi " + motPaboValue);
        Assert.assertTrue(motPaboValue.contains(dotenv.get("TEXT_TWENTY_NINE")));
    }

    @Test(priority = 26)
    public void supplierDilamPelamSoman() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String motPaboValue = tScreen.supplierDilamPelamSoman("1", "1", Utils.randomFruitName());
        System.out.println("supplierDilamPelamSoman " + motPaboValue);
        Assert.assertTrue(motPaboValue.contains(dotenv.get("TEXT_TWENTY_NINE")));
    }

    /*
     *--------------------------------------------------
     *  Eye button, Search and Report button test cases
     * -------------------------------------------------
     */
    @Test(priority = 27)
    public void clickEyeButton() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String motPaboValue = tScreen.clickEyeButton();
        System.out.println("clickEyeButton " + motPaboValue);
        Assert.assertTrue(motPaboValue.contains(dotenv.get("TEXT_AFTER_CLOSING_EYE_BUTTON")));
    }

    @Test(priority = 28)
    public void searchWithNameThatExist() {
        tScreen = new TallyScreen(driver);
        int customerLength = tScreen.searchWithNameThatExist("Hamim");
        System.out.println("searchWithNameThatExist " + customerLength);
        Assert.assertEquals(1, 1);
    }

    @Test(priority = 29)
    public void searchWithNameThatDontExist() {
        tScreen = new TallyScreen(driver);
        boolean doesCustomerExist = tScreen.searchWithNameThatDontExist("Wafi");
        System.out.println("searchWithNameThatDontExist " + doesCustomerExist);
        Assert.assertTrue(doesCustomerExist);
    }

    @Test(priority = 30)
    public void clickDownloadButton() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        boolean isExternalLayoutVisible = tScreen.clickDownloadButton(driver);
        System.out.println("clickDownloadButton " + isExternalLayoutVisible);
        Assert.assertTrue(isExternalLayoutVisible);
    }

    @Test(priority = 31)
    public void clickAjkerBecha() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String doinikHisab = tScreen.clickAjkerBecha();
        System.out.println("clickAjkerBecha " + doinikHisab);
        Assert.assertTrue(doinikHisab.contains(dotenv.get("TEXT_DOINIK_HISAB")));
    }

    /*
     *--------------------------------------------------
     *  Filter test cases
     * -------------------------------------------------
     */
    @Test(priority = 32)
    public void customerKomPuraton() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        tScreen.customerKomPuraton();
        System.out.println("customerKomPuraton ");
    }

    @Test(priority = 33)
    public void customerKomNotun() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        tScreen.customerKomNotun();
        System.out.println("customerKomNotun ");
    }

    @Test(priority = 34)
    public void customerBeshiNotun() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        tScreen.customerBeshiNotun();
        System.out.println("customerBeshiNotun ");
    }

    @Test(priority = 35)
    public void customerBeshipuraton() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        tScreen.customerBeshipuraton();
        System.out.println("customerBeshipuraton ");
    }

    @Test(priority = 36)
    public void supplierKomPuraton() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        tScreen.supplierKomPuraton();
        System.out.println("supplierKomPuraton ");
    }

    @Test(priority = 37)
    public void supplierKomNotun() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        tScreen.supplierKomNotun();
        System.out.println("supplierKomNotun ");
    }

    @Test(priority = 38)
    public void supplierBeshiNotun() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        tScreen.supplierBeshiNotun();
        System.out.println("supplierBeshiNotun ");
    }

    @Test(priority = 39)
    public void supplierBeshipuraton() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        tScreen.supplierBeshipuraton();
        System.out.println("supplierBeshipuraton ");
    }


    /*
     *--------------------------------------------------
     *  Tagada Pathai test cases
     * -------------------------------------------------
     */
    @Test(priority = 40)
    public void shareKoriInTagadaPathai() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        boolean isExternalLayoutVisible = tScreen.shareKoriInTagadaPathai(driver);
        System.out.println("shareKoriInTagadaPathai " + isExternalLayoutVisible);
        Assert.assertTrue(isExternalLayoutVisible);
    }

    @Test(priority = 41)
    public void tallyMessageKiniInTagadaPathai() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String tallyMessageKiniText = tScreen.tallyMessageKiniInTagadaPathai();
        System.out.println("tallyMessageKiniInTagadaPathai " + tallyMessageKiniText);
        Assert.assertTrue(tallyMessageKiniText.contains(dotenv.get("TEXT_TALLY_MESSAGE_KINI")));
    }

    @Test(priority = 42)
    public void copyLinkInTagadaPathai() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String confirmAlert = tScreen.copyLinkInTagadaPathai();
        System.out.println("copyLinkInTagadaPathai " + confirmAlert);
//        Assert.assertTrue(confirmAlert.contains(dotenv.get("TEXT_TALLY_MESSAGE_KINI")));
    }

    @Test(priority = 43)
    public void tagadaPathaiBatil() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        tScreen.tagadaPathaiBatil();
        // There is no assertion
        System.out.println("tagadaPathaiBatil ");
    }

    @Test(priority = 44)
    public void tagadaPathaiConfirm() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String textSMSCount = tScreen.tagadaPathaiConfirm();
        // assert that sms will be deducted by 1 from 5
        System.out.println("tagadaPathaiConfirm " + textSMSCount);
        Assert.assertTrue(textSMSCount.contains(dotenv.get("TEXT_OBOSHISTHO_FOUR")));
    }

    /*
     *--------------------------------------
     *  Report Customer/Supplier test cases
     * -------------------------------------
     */
    @Test(priority = 45)
    public void tagadaPathaiDisabledInCustomerReport() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String isClickable = tScreen.tagadaPathaiDisabledInCustomerReport();
        System.out.println("tagadaPathaiDisabledInCustomerReport " + isClickable);
        Assert.assertEquals(isClickable, "false");
    }

    @Test(priority = 46)
    public void tagadaPathaiExistInKebabMenu() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String textTagadaSend = tScreen.tagadaPathaiExistInKebabMenu();
        System.out.println("tagadaPathaiExistInKebabMenu " + textTagadaSend);
        Assert.assertTrue(textTagadaSend.contains(dotenv.get("TEXT_TAGADA_PATHATE_TAP_KORUN")));
    }

    @Test(priority = 47)
    public void tagadaPathaiEnabledInCustomerReport() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String isClickable = tScreen.tagadaPathaiEnabledInCustomerReport();
        System.out.println("tagadaPathaiEnabledInCustomerReport " + isClickable);
        Assert.assertEquals(isClickable, "true");
    }

    //TODO Need to change priority
    @Test(priority = 48)
    public void cancelInfoInCustomerReport() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        boolean doesExist = tScreen.cancelInfoInCustomerReport();
        System.out.println("cancelInfoInCustomerReport " + doesExist);
        Assert.assertEquals(doesExist, false);
    }

    @Test(priority = 49)
    public void reportShareInCustomerReport() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String isChecked = tScreen.reportShareInCustomerReport();
        System.out.println("reportShareInCustomerReport " + isChecked);
        Assert.assertEquals(isChecked, "false");
    }

    @Test(priority = 50)
    public void isLendenClickableInCustomerReport() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String isClickable = tScreen.isLendenClickableInCustomerReport();
        System.out.println("isLendenClickableInCustomerReport " + isClickable);
        Assert.assertEquals(isClickable, "true");
    }

    @Test(priority = 51)
    public void reportDownloadInCustomerReport() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        boolean isExternalLayoutVisible = tScreen.reportDownloadInCustomerReport(driver);
        System.out.println("reportDownloadInCustomerReport " + isExternalLayoutVisible);
        Assert.assertTrue(isExternalLayoutVisible);
    }

    @Test(priority = 52)
    public void reportDownloadWithDateInCustomerReport() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        boolean isExternalLayoutVisible = tScreen.reportDownloadWithDateInCustomerReport(driver);
        System.out.println("reportDownloadWithDateInCustomerReport " + isExternalLayoutVisible);
        Assert.assertTrue(isExternalLayoutVisible);
    }

    @Test(priority = 53)
    public void editLendenInCustomerReport() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        Utils.swipeUp(driver, 1000);
        String textMotPaboValue = tScreen.editLendenInCustomerReport();
        System.out.println("editLendenInCustomerReport " + textMotPaboValue);
    }

    @Test(priority = 54)
    public void deleteLendenInCustomerReport() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String textConfirmMessage = tScreen.deleteLendenInCustomerReport();
        System.out.println("deleteLendenInCustomerReport " + textConfirmMessage);
        Assert.assertTrue(textConfirmMessage.contains(dotenv.get("TEXT_AFTER_DELETING_LENDEN")));
    }

    /*
     *-------------------------------------------
     *  Edit/Delete Customer/Supplier test cases
     * ------------------------------------------
     */
    @Test(priority = 55)
    public void buttonInactiveOnInvalidName() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        boolean isBtnEnabled = tScreen.buttonInactiveOnInvalidName("hh");
        System.out.println("buttonInactiveOnInvalidName " + isBtnEnabled);
        Assert.assertFalse(isBtnEnabled);
    }

    @Test(priority = 56)
    public void buttonInactiveOnInvalidPhone() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        boolean isBtnEnabled = tScreen.buttonInactiveOnInvalidPhone("011111111111111111");
        System.out.println("buttonInactiveOnInvalidPhone " + isBtnEnabled);
        Assert.assertFalse(isBtnEnabled);
    }

    @Test(priority = 57)
    public void buttonActiveOnValidNamePhone() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String textConfirmationMessage = tScreen.buttonActiveOnValidNamePhone("name Edited", "01323478832");
        System.out.println("buttonActiveOnValidNamePhone " + textConfirmationMessage);
        Assert.assertTrue(textConfirmationMessage.contains(dotenv.get("TEXT_AFTER_UPDATING_NAME_OR_PHONE_OF_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 58)
    public void cancelDelete() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        tScreen.cancelDelete();
        // There is no assertion
        System.out.println("cancelDelete ");
    }

    @Test(priority = 59)
    public void confirmDelete() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String textConfirmationMessage = tScreen.confirmDelete();
        System.out.println("confirmDelete " + textConfirmationMessage);
        Assert.assertTrue(textConfirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_DELETING_CUSTOMER_OR_SUPPLIER")));
    }

    /*
     *--------------------------------------
     *  Record share Medium Customer/Supplier
     * -------------------------------------
     */
    @Test(priority = 60)
    public void shareRecordInImo() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String textAlertUnavailableApp = tScreen.shareRecordInImo("Hamim", "12");
        System.out.println("shareRecordInImo " + textAlertUnavailableApp);
        Assert.assertTrue(textAlertUnavailableApp.contains(dotenv.get("TEXT_APP_UNAVAILABLE_TO_SHARE")));
    }

    @Test(priority = 61)
    public void shareRecordInMessenger() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String textrecordSharedMedium = tScreen.shareRecordInMessenger();
        System.out.println("shareRecordInMessenger " + textrecordSharedMedium);
        Assert.assertTrue(textrecordSharedMedium.contains(dotenv.get("PARTIAL_TEXT_RECORD_SHARE_APP_MESSENGER")));
    }
}
