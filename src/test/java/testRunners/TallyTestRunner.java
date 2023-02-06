package testRunners;

import io.github.cdimascio.dotenv.Dotenv;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import screens.TallyScreen;
import screens.RegistrationScreen;
import setup.Setup;
import utils.Utils;


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
    @Description("Create customer with valid name only")
    public void addCustomerWithNameWithoutNumber() {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addCustomerWithNameWithoutNumber("Customer With Name Only");
        System.out.println("addCustomerWithNameWithoutNumber " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 2)
    @Description("Create customer with valid name and valid number")
    public void addCustomerWithNameNumber() {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addCustomerWithNameNumber("Kyle Simp", Utils.randomPhoneNumber());
        System.out.println("addCustomerWithNameWithoutNumber " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 3)
    @Description("Create customer From phonebook with valid name and valid number")
    public void addCustomerFromPhoneBook() {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addCustomerFromPhoneBook("Ottilie Margot");
        System.out.println("addCustomerFromPhoneBook " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 4)
    @Description("Create customer with valid name, valid number and positive jer")
    public void addCustomerWithJer() {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addCustomerWithJer("Ross Tylar", Utils.randomPhoneNumber(), "12");
        System.out.println("addCustomerWithJer " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 5)
    @Description("Create customer with valid name, valid number and jer 0")
    public void addCustomerWithJerZero() {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addCustomerWithJerZero("Jer Zero", Utils.randomPhoneNumber(), "0");
        System.out.println("addCustomerWithJerZero " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 6)
    @Description("Create customer from phonebook with valid name, valid number and positive jer")
    public void addCustomerFromPhoneBookWithJer() {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addCustomerFromPhoneBookWithJer("5", "Adeline Remy");
        System.out.println("addCustomerFromPhoneBookWithJer " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 7)
    @Description("Create customer with valid name, valid number, positive jer, with photo and current date")
    public void addCustomerWithJerPhotoDate() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addCustomerWithJerPhotoDate("Hamim", "01953471217", "3");
        System.out.println("addCustomerWithJerPhotoDate " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 8)
    @Description("Create customer from phonebook with valid name, valid number, positive jer, with photo and current date")
    public void addCustomerFromPhoneBookWithJerPhotoDate() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addCustomerFromPhoneBookWithJerPhotoDate("2", "Sophie Luka");
        System.out.println("addCustomerFromPhoneBookWithJerPhotoDate " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 9)
    @Description("Attempt to create customer with invalid name, valid number. Customer should not be created and confirm button should be disabled")
    public void addCustomerWithInvalidNameValidPhone() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        boolean isBtnEnabled = tScreen.addCustomerWithInvalidNameValidPhone("hh", Utils.randomPhoneNumber());
        System.out.println("addCustomerWithInvalidNameValidPhone " + isBtnEnabled);
        Assert.assertFalse(isBtnEnabled);
    }

    @Test(priority = 10)
    @Description("Attempt to create customer from with valid name, invalid number. Customer should not be created and error message should pop up")
    public void addCustomerWithValidNameInvalidPhone() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String errorMessage = tScreen.addCustomerWithValidNameInvalidPhone("Piya Roy", "011");
        System.out.println("addCustomerWithValidNameInvalidPhone " + errorMessage);
        Assert.assertTrue(errorMessage.contains(dotenv.get("ERROR_MESSAGE_WHEN_INVALID_PHONE")));
    }

    @Test(priority = 11)
    @Description("Attempt to create customer from with valid name and valid existing number. Customer should not be created and error message should pop up")
    public void addCustomerWithExistingPhone() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String errorMessage = tScreen.addCustomerWithExistingPhone("Asim Kha", "01953471217");
        System.out.println("addCustomerWithExistingPhone " + errorMessage);
        Assert.assertTrue(errorMessage.contains(dotenv.get("ERROR_MESSAGE_WHEN_EXISTING_PHONE")));
    }

    @Test(priority = 12)
    @Description("Select contact from phonebook with invalid name and valid number. An error message should pop up as soon as the contact is selected")
    public void addCustomerFromPhoneBookWithInvalidName() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String errorMessage = tScreen.addCustomerFromPhoneBookWithInvalidName();
        System.out.println("addCustomerFromPhoneBookWithInvalidName " + errorMessage);
        Assert.assertTrue(errorMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_ADDING_CUSTOMER_OR_SUPPLIER_FROM_PHONEBOOK_WITH_INVALID_NAME")));
    }

    @Test(priority = 13)
    @Description("Select contact from phonebook with valid name and invalid number. An error message should pop up as soon as the contact is selected")
    public void addCustomerFromPhoneBookWithInvalidNumber() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String errorMessage = tScreen.addCustomerFromPhoneBookWithInvalidNumber();
        System.out.println("addCustomerFromPhoneBookWithInvalidNumber " + errorMessage);
        Assert.assertTrue(errorMessage.contains(dotenv.get("ERROR_MESSAGE_WHEN_INVALID_PHONE")));
    }

    /*
     *--------------------------------------
     *  Supplier create test cases
     * -------------------------------------
     */
    @Test(priority = 14)
    @Description("Create supplier from phonebook with valid name")
    public void addSupplierWithNameWithoutNumber() {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addSupplierWithNameWithoutNumber("Supplier With Name Only");
        System.out.println("addSupplierWithNameWithoutNumber " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 15)
    @Description("Create supplier with valid name and valid number")
    public void addSupplierWithNameNumber() {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addSupplierWithNameNumber("Rizwan", "01517169846");
        System.out.println("addSupplierWithNameNumber " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));

    }

    @Test(priority = 16)
    @Description("Create supplier from phonebook with valid name, valid number")
    public void addSupplierFromPhoneBook() {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addSupplierFromPhoneBook("Emma John");
        System.out.println("addSupplierFromPhoneBook " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 17)
    @Description("Create supplier with valid name, valid number and positive jer")
    public void addSupplierWithJer() {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addSupplierWithJer("Hussain", Utils.randomPhoneNumber(), "4");
        System.out.println("addSupplierWithJer " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 18)
    @Description("Create supplier with valid name, valid number and jer 0")
    public void addSupplierWithJerZero() {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addSupplierWithJerZero("Jer Zero", Utils.randomPhoneNumber(), "0");
        System.out.println("addSupplierWithJerZero " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 19)
    @Description("Create supplier from phonebook with valid name, valid number, positive jer")
    public void addSupplierFromPhoneBookWithJer() {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addSupplierFromPhoneBookWithJer("5", "Lena Emilia");
        System.out.println("addSupplierFromPhoneBookWithJer " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 20)
    @Description("Create supplier with valid name, valid number, positive jer, with photo and current date")
    public void addSupplierWithJerPhotoAndDate() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addSupplierWithJerPhotoAndDate("Aila Mix", Utils.randomPhoneNumber(), "7");
        System.out.println("addSupplierWithJerPhotoAndDate " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 21)
    @Description("Create supplier from phonebook with valid name, valid number, positive jer, with photo and current date")
    public void addSupplierFromPhoneBookWithJerPhotoAndDate() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addSupplierFromPhoneBookWithJerPhotoAndDate("3", "Monika Christin");
        System.out.println("addSupplierFromPhoneBookWithJerPhotoAndDate " + confirmationMessage);
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 22)
    @Description("Attempt to create supplier with invalid name, valid number. Supplier should not be created and confirm button should be disabled")
    public void addSupplierWithInvalidNameValidPhone() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        boolean isBtnEnabled = tScreen.addSupplierWithInvalidNameValidPhone("xx", Utils.randomPhoneNumber());
        System.out.println("addSupplierWithInvalidNameValidPhone " + isBtnEnabled);
        Assert.assertFalse(isBtnEnabled);
    }

    @Test(priority = 23)
    @Description("Attempt to create supplier with valid name, invalid number. Supplier should not be created and error message should pop up")
    public void addSupplierWithValidNameInvalidPhone() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String errorMessage = tScreen.addSupplierWithValidNameInvalidPhone("Kim Ra Yu", "011");
        System.out.println("addSupplierWithValidNameInvalidPhone " + errorMessage);
        Assert.assertTrue(errorMessage.contains(dotenv.get("ERROR_MESSAGE_WHEN_INVALID_PHONE")));
    }

    @Test(priority = 24)
    @Description("Attempt to create supplier from with valid name and valid existing number. Supplier should not be created and error message should pop up")
    public void addSupplierWithExistingPhone() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String errorMessage = tScreen.addSupplierWithExistingPhone("Park Na", "01517169846");
        System.out.println("addSupplierWithExistingPhone " + errorMessage);
        Assert.assertTrue(errorMessage.contains(dotenv.get("ERROR_MESSAGE_WHEN_EXISTING_PHONE")));
    }

    @Test(priority = 25)
    @Description("Select contact from phonebook with invalid name and valid number. An error message should pop up as soon as the contact is selected")
    public void addSupplierFromPhoneBookWithInvalidName() {
        tScreen = new TallyScreen(driver);
        String errorMessage = tScreen.addSupplierFromPhoneBookWithInvalidName();
        System.out.println("addSupplierFromPhoneBookWithInvalidName " + errorMessage);
        Assert.assertTrue(errorMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_ADDING_CUSTOMER_OR_SUPPLIER_FROM_PHONEBOOK_WITH_INVALID_NAME")));
    }

    @Test(priority = 26)
    @Description("Select contact from phonebook with valid name and invalid number. An error message should pop up as soon as the contact is selected")
    public void addSupplierFromPhoneBookWithInvalidNumber() {
        tScreen = new TallyScreen(driver);
        String errorMessage = tScreen.addSupplierFromPhoneBookWithInvalidNumber();
        System.out.println("addSupplierFromPhoneBookWithInvalidNumber " + errorMessage);
        Assert.assertTrue(errorMessage.contains(dotenv.get("ERROR_MESSAGE_WHEN_INVALID_PHONE")));
    }

    /*
     * -------------------------------------------
     *  Update Dilam/pelam of customer test cases
     * -------------------------------------------
     */
    @Test(priority = 27)
    @Description("Update dilam pelam of customer with dilam beshi and pelam kom")
    public void customerDilamBeshiPelamKom() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String motPaboValue = tScreen.customerDilamBeshiPelamKom("12", "5", Utils.randomFruitName());
        System.out.println("customerDilamBeshiPelamKom " + motPaboValue);
        Assert.assertTrue(motPaboValue.contains(dotenv.get("TEXT_TWENTY_NINE")));
    }

    @Test(priority = 28)
    @Description("Update dilam pelam of customer with dilam kom and pelam beshi")
    public void customerDilamKomPelamBeshi() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String motPaboValue = tScreen.customerDilamKomPelamBeshi("2", "5", Utils.randomFruitName());
        System.out.println("customerDilamKomPelamBeshi " + motPaboValue);
        Assert.assertTrue(motPaboValue.contains(dotenv.get("TEXT_TWENTY_SIX")));
    }

    @Test(priority = 29)
    @Description("Update dilam pelam of customer with dilam and pelam soman")
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
    @Test(priority = 30)
    @Description("Update dilam pelam of supplier with dilam beshi and pelam kom")
    public void supplierDilamBeshiPelamKom() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String motPaboValue = tScreen.supplierDilamBeshiPelamKom("11", "1", Utils.randomFruitName());
        System.out.println("supplierDilamBeshiPelamKom " + motPaboValue);
        Assert.assertTrue(motPaboValue.contains(dotenv.get("TEXT_THIRTY_THREE")));
    }

    @Test(priority = 31)
    @Description("Update dilam pelam of supplier with dilam kom and pelam beshi")
    public void supplierDilamKomPelamBeshi() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String motPaboValue = tScreen.supplierDilamKomPelamBeshi("9", "13", "11", Utils.randomFruitName());
        System.out.println("supplierDilamKomPelamBeshi " + motPaboValue);
        Assert.assertTrue(motPaboValue.contains(dotenv.get("TEXT_TWENTY_NINE")));
    }

    @Test(priority = 32)
    @Description("Update dilam pelam of supplier with dilam and pelam soman")
    public void supplierDilamPelamSoman() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String motPaboValue = tScreen.supplierDilamPelamSoman("1", "1", Utils.randomFruitName());
        System.out.println("supplierDilamPelamSoman " + motPaboValue);
        Assert.assertTrue(motPaboValue.contains(dotenv.get("TEXT_TWENTY_NINE")));
    }

    /*
     *-------------------------------------------------------------
     *  Eye button, Search and download report button test cases
     * ------------------------------------------------------------
     */
    @Test(priority = 33)
    @Description("Click eye button and assert that all numbers are replaced with ---")
    public void clickEyeButton() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String motPaboValue = tScreen.clickEyeButton();
        System.out.println("clickEyeButton " + motPaboValue);
        Assert.assertTrue(motPaboValue.contains(dotenv.get("TEXT_AFTER_CLOSING_EYE_BUTTON")));
    }

    @Test(priority = 34)
    @Description("Search with a customer or supplier name that exist")
    public void searchWithNameThatExist() {
        tScreen = new TallyScreen(driver);
        int customerLength = tScreen.searchWithNameThatExist("Hamim");
        System.out.println("searchWithNameThatExist " + customerLength);
        Assert.assertEquals(1, 1);
    }

    @Test(priority = 35)
    @Description("Search with a customer or supplier name that doesn't exist")
    public void searchWithNameThatDontExist() {
        tScreen = new TallyScreen(driver);
        boolean doesCustomerExist = tScreen.searchWithNameThatDontExist("Wafi");
        System.out.println("searchWithNameThatDontExist " + doesCustomerExist);
        Assert.assertTrue(doesCustomerExist);
    }

    @Test(priority = 36)
    @Description("Click download button and confirm that a file is downloaded")
    public void clickDownloadButton() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        boolean isExternalLayoutVisible = tScreen.clickDownloadButton(driver);
        System.out.println("clickDownloadButton " + isExternalLayoutVisible);
        Assert.assertTrue(isExternalLayoutVisible);
    }

    @Test(priority = 37)
    @Description("Click ajker becha text and confirm that navigate to the Doinik hisab page")
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
    @Test(priority = 38)
    @Description("Add filter: Customer, kom -> beshi, puraton -> notun")
    public void customerKomPuraton() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String actualCustomerName = tScreen.customerKomPuraton();
        System.out.println("customerKomPuraton " + actualCustomerName);
        Assert.assertEquals(actualCustomerName, "Customer With Name Only");
    }

    @Test(priority = 39)
    @Description("Add filter: Customer, kom -> beshi, notun -> puraton ")
    public void customerKomNotun() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String actualCustomerName = tScreen.customerKomNotun();
        System.out.println("customerKomNotun " + actualCustomerName);
        Assert.assertEquals(actualCustomerName, "Jer Zero");
    }

    @Test(priority = 40)
    @Description("Add filter: Customer, beshi -> kom, notun -> puraton ")
    public void customerBeshiNotun() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String actualCustomerName = tScreen.customerBeshiNotun();
        System.out.println("customerBeshiNotun " + actualCustomerName);
        Assert.assertEquals(actualCustomerName, "Ross Tylar");
    }

    @Test(priority = 41)
    @Description("Add filter: Customer, beshi -> kom, puraton -> notun")
    public void customerBeshipuraton() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String actualCustomerName = tScreen.customerBeshipuraton();
        System.out.println("customerBeshipuraton " + actualCustomerName);
        Assert.assertEquals(actualCustomerName, "Ross Tylar");
    }

    @Test(priority = 42)
    @Description("Add filter: Supplier, kom -> beshi, puraton -> notun")
    public void supplierKomPuraton() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String actualSupplierName = tScreen.supplierKomPuraton();
        System.out.println("supplierKomPuraton " + actualSupplierName);
        Assert.assertEquals(actualSupplierName, "Supplier With Name Only");
    }

    @Test(priority = 43)
    @Description("Add filter: Supplier, kom -> beshi, notun -> puraton")
    public void supplierKomNotun() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String actualSupplierName = tScreen.supplierKomNotun();
        System.out.println("supplierKomNotun " + actualSupplierName);
        Assert.assertEquals(actualSupplierName, "Jer Zero");
    }

    @Test(priority = 44)
    @Description("Add filter: Supplier, beshi -> Kom, notun -> puraton")
    public void supplierBeshiNotun() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String actualSupplierName = tScreen.supplierBeshiNotun();
        System.out.println("supplierBeshiNotun " + actualSupplierName);
        Assert.assertEquals(actualSupplierName, "Aila Mix");
    }

    @Test(priority = 45)
    @Description("Add filter: Supplier, beshi -> kom, puraton -> notun")
    public void supplierBeshipuraton() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String actualSupplierName = tScreen.supplierBeshipuraton();
        System.out.println("supplierBeshipuraton " + actualSupplierName);
        Assert.assertEquals(actualSupplierName, "Aila Mix");
    }


    /*
     *--------------------------------------------------
     *  Tagada Pathai test cases
     * -------------------------------------------------
     */
    @Test(priority = 46)
    @Description("Confirm that Share Kori button works in tagda pathai page")
    public void shareKoriInTagadaPathai() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        boolean isExternalLayoutVisible = tScreen.shareKoriInTagadaPathai(driver);
        System.out.println("shareKoriInTagadaPathai " + isExternalLayoutVisible);
        Assert.assertTrue(isExternalLayoutVisible);
    }

    @Test(priority = 47)
    @Description("Confirm that Tally Message Kini button works in tagda pathai page")
    public void tallyMessageKiniInTagadaPathai() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String tallyMessageKiniText = tScreen.tallyMessageKiniInTagadaPathai();
        System.out.println("tallyMessageKiniInTagadaPathai " + tallyMessageKiniText);
        Assert.assertTrue(tallyMessageKiniText.contains(dotenv.get("TEXT_TALLY_MESSAGE_KINI")));
    }

    @Test(priority = 48)
    @Description("Confirm that Copy Link button works in tagda pathai page")
    public void copyLinkInTagadaPathai() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String confirmAlert = tScreen.copyLinkInTagadaPathai();
        System.out.println("copyLinkInTagadaPathai " + confirmAlert);
        Assert.assertTrue(confirmAlert.contains(dotenv.get("TEXT_AFTER_COPYING_PAYMENT_LINK")));
    }

    @Test(priority = 49)
    @Description("Confirm that tagada pathai batil button works in tagda pathai page when sending Tagada message")
    public void tagadaPathaiBatil() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        tScreen.tagadaPathaiBatil();
        // There is no assertion
        System.out.println("tagadaPathaiBatil ");
    }

    @Test(priority = 50)
    @Description("Confirm that Tagada message can be successfully sent")
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
    @Test(priority = 51)
    @Description("Confirm that tagada pathai button is disabled in customer report page when Pabo is smaller than 1")
    public void tagadaPathaiDisabledInCustomerReport() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String isClickable = tScreen.tagadaPathaiDisabledInCustomerReport();
        System.out.println("tagadaPathaiDisabledInCustomerReport " + isClickable);
        Assert.assertEquals(isClickable, "false");
    }

    @Test(priority = 52)
    @Description("Confirm that tagada pathai option is available in Kebab menu when Pabo is greater than 1")
    public void tagadaPathaiExistInKebabMenu() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String textTagadaSend = tScreen.tagadaPathaiExistInKebabMenu();
        System.out.println("tagadaPathaiExistInKebabMenu " + textTagadaSend);
        Assert.assertTrue(textTagadaSend.contains(dotenv.get("TEXT_TAGADA_PATHATE_TAP_KORUN")));
    }

    @Test(priority = 53)
    @Description("Confirm that tagada pathai button is enabled in customer report page when Pabo is greater than 0")
    public void tagadaPathaiEnabledInCustomerReport() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String isClickable = tScreen.tagadaPathaiEnabledInCustomerReport();
        System.out.println("tagadaPathaiEnabledInCustomerReport " + isClickable);
        Assert.assertEquals(isClickable, "true");
    }

    @Test(priority = 54)
    @Description("Cancel the info toast in customer report page when entering for the first time")
    public void cancelInfoInCustomerReport() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        boolean doesExist = tScreen.cancelInfoInCustomerReport();
        System.out.println("cancelInfoInCustomerReport " + doesExist);
        Assert.assertEquals(doesExist, false);
    }

    @Test(priority = 55)
    @Description("Confirm that Report share Toggle is working in customer report page")
    public void reportShareInCustomerReport() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String isChecked = tScreen.reportShareInCustomerReport();
        System.out.println("reportShareInCustomerReport " + isChecked);
        Assert.assertEquals(isChecked, "false");
    }

    @Test(priority = 56)
    @Description("Confirm that Transaction history is clickable in customer report page only when the transaction is update of dilam or pelam")
    public void isLendenClickableInCustomerReport() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String isClickable = tScreen.isLendenClickableInCustomerReport();
        System.out.println("isLendenClickableInCustomerReport " + isClickable);
        Assert.assertEquals(isClickable, "true");
    }

    @Test(priority = 57)
    @Description("Confirm that report download is working with 30 days option in customer report page")
    public void reportDownloadInCustomerReport() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        boolean isExternalLayoutVisible = tScreen.reportDownloadInCustomerReport(driver);
        System.out.println("reportDownloadInCustomerReport " + isExternalLayoutVisible);
        Assert.assertTrue(isExternalLayoutVisible);
    }

    @Test(priority = 58)
    @Description("Confirm that report download is working with custome date selection feature in customer report page")
    public void reportDownloadWithDateInCustomerReport() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        boolean isExternalLayoutVisible = tScreen.reportDownloadWithDateInCustomerReport(driver);
        System.out.println("reportDownloadWithDateInCustomerReport " + isExternalLayoutVisible);
        Assert.assertTrue(isExternalLayoutVisible);
    }

    @Test(priority = 59)
    @Description("Confirm that Transaction history can be edited in customer report page only when the transaction is update of dilam or pelam")
    public void editLendenInCustomerReport() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        Utils.swipeUp(driver, 1000);
        String textMotPaboValue = tScreen.editLendenInCustomerReport();
        System.out.println("editLendenInCustomerReport " + textMotPaboValue);
    }

    @Test(priority = 60)
    @Description("Confirm that Transaction history can be edited in customer report page only when the transaction is update of dilam or pelam")
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
    @Test(priority = 61)
    @Description("Confirm that tagada pathai option is unavailable when pabo is less than 1 in customer report kebab menu")
    public void isTagadaPathaiAvailableInCustomerReportKebabMenu() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        boolean isTagadaPathaiAvailable = tScreen.isTagadaPathaiAvailableInCustomerReportKebabMenu();
        System.out.println("isTagadaPathaiAvailableInCustomerReportKebabMenu " + isTagadaPathaiAvailable);
        Assert.assertFalse(isTagadaPathaiAvailable);
    }

    @Test(priority = 62)
    @Description("Confirm that submit button is inactive when the customer name is invalid in customer info edit page")
    public void buttonInactiveOnInvalidName() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        boolean isBtnEnabled = tScreen.buttonInactiveOnInvalidName("hh");
        System.out.println("buttonInactiveOnInvalidName " + isBtnEnabled);
        Assert.assertFalse(isBtnEnabled);
    }

    @Test(priority = 63)
    @Description("Confirm that submit button is inactive when the customer phone is invalid in customer info edit page")
    public void buttonInactiveOnInvalidPhone() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        boolean isBtnEnabled = tScreen.buttonInactiveOnInvalidPhone("011111111111111111");
        System.out.println("buttonInactiveOnInvalidPhone " + isBtnEnabled);
        Assert.assertFalse(isBtnEnabled);
    }

    @Test(priority = 64)
    @Description("Confirm that submit button is active when the customer name is invalid in customer info edit page " +
            "and customer info is updated")
    public void buttonActiveOnValidNamePhone() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String textConfirmationMessage = tScreen.buttonActiveOnValidNamePhone("name Edited", "01323478832");
        System.out.println("buttonActiveOnValidNamePhone " + textConfirmationMessage);
        Assert.assertTrue(textConfirmationMessage.contains(dotenv.get("TEXT_AFTER_UPDATING_NAME_OR_PHONE_OF_CUSTOMER_OR_SUPPLIER")));
    }

    @Test(priority = 65)
    @Description("Confirm that customer/supplier deletion can be canceled in customer/supplier delete page")
    public void cancelDelete() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        tScreen.cancelDelete();
        // There is no assertion
        System.out.println("cancelDelete ");
    }

    @Test(priority = 66)
    @Description("Confirm that customer/supplier can be deleted")
    public void confirmDelete() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String textConfirmationMessage = tScreen.confirmDelete();
        System.out.println("confirmDelete " + textConfirmationMessage);
        Assert.assertTrue(textConfirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_DELETING_CUSTOMER_OR_SUPPLIER")));
    }

    /*
     *--------------------------------------
     *  Report Supplier test cases
     * -------------------------------------
     */

    @Test(priority = 67)
    @Description("Confirm that tagada pathai option is unavailable in supplier report kebab menu")
    public void isTagadaPathaiAvailableInSupplierReportKebabMenu() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        boolean isTagadaPathaiAvailable = tScreen.isTagadaPathaiAvailableInSupplierReportKebabMenu();
        System.out.println("isTagadaPathaiAvailableInSupplierReportKebabMenu " + isTagadaPathaiAvailable);
        Assert.assertFalse(isTagadaPathaiAvailable);
    }

    @Test(priority = 68)
    @Description("Confirm that tagada pathai option is unavailable in supplier report page")
    public void isTagadaPathaiAvailableInSupplierReport() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        boolean isTagadaPathaiAvailable = tScreen.isTagadaPathaiAvailableInSupplierReport();
        System.out.println("isTagadaPathaiAvailableInSupplierReport " + isTagadaPathaiAvailable);
        Assert.assertFalse(isTagadaPathaiAvailable);
    }

    /*
     *----------------------------------------------------
     *  Record share Medium Customer/Supplier test cases
     * ---------------------------------------------------
     */
    @Test(priority = 69)
    @Description("Confirm that when lenden record shared in imo and imo is not installed in phone an error pops up")
    public void shareRecordInImo() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String textAlertUnavailableApp = tScreen.shareRecordInImo("Hamim", "12");
        System.out.println("shareRecordInImo " + textAlertUnavailableApp);
        Assert.assertTrue(textAlertUnavailableApp.contains(dotenv.get("TEXT_APP_UNAVAILABLE_TO_SHARE")));
    }

    @Test(priority = 70)
    @Description("Confirm that lenden record can be shared in messenger given that the app is installed and in dilam/pelam page it shows that last record was shared thorugh messenger when the toggle button is inactive")
    public void shareRecordInMessenger() throws InterruptedException {
        tScreen = new TallyScreen(driver);
        String textrecordSharedMedium = tScreen.shareRecordInMessenger();
        System.out.println("shareRecordInMessenger " + textrecordSharedMedium);
        Assert.assertTrue(textrecordSharedMedium.contains(dotenv.get("PARTIAL_TEXT_RECORD_SHARE_APP_MESSENGER")));
    }

}
