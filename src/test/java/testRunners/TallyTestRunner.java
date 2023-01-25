package testRunners;

import io.github.cdimascio.dotenv.Dotenv;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import screens.RegistrationScreen;
import screens.TallyScreen;
import setup.Setup;
import utils.Utils;

import java.io.IOException;

public class TallyTestRunner extends Setup {
    Dotenv dotenv = Dotenv.load();
    @BeforeTest
    public void register() {
        RegistrationScreen rScreen = new RegistrationScreen(driver);
        rScreen.insertPhoneAndClickButton(Utils.randomPhoneNumber());
        rScreen.insertOtpAndClickButton(driver);
        rScreen.insertShopNameAndClickButton(Utils.randomShopName());
    }
    @Test(priority = 1, description = "Create Customer with only name and phone")
    public void addCustomerWithNameAndPhone() throws Exception {
        TallyScreen tScreen = new TallyScreen(driver);
        String customerName = Utils.randomCustomerName();
//        String customerPhoneNumber = Utils.randomPhoneNumber();
        String customerPhoneNumber = "01571761196";
        String confirmationMessage = tScreen.addCustomerWithNameAndPhone(customerName, customerPhoneNumber);
        Utils.saveJsonList(customerPhoneNumber, customerName,"customers");
        System.out.println("add customer " + dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER"));
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }
    @Test(priority = 2, description = "Create customer with all the input along with date and image")
    public void addCustomerFromContactBookWithAllInput() {
        TallyScreen tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addCustomerFromContactBookWithAllInput("12");
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }
    @Test(priority = 3, description = "Create supplier with only name and phone")
    public void addSupplierWithNameAndPhone() throws Exception {
        TallyScreen tScreen = new TallyScreen(driver);
        String supplierName = Utils.randomCustomerName();
        String supplierPhoneNumber = Utils.randomPhoneNumber();
        String confirmationMessage = tScreen.addSupplierWithNameAndPhone(supplierName, supplierPhoneNumber);
        Utils.saveJsonList(supplierPhoneNumber, supplierName,"customers");
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }
    @Test(priority = 4, description = "Create supplier with all the input along with date and image")
    public void addSupplierFromContactBookWithAllInput() {
        TallyScreen tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addSupplierFromContactBookWithAllInput("11");
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_CREATING_CUSTOMER_OR_SUPPLIER")));
    }
    @Test(priority = 5, description = "Loop through customer list and print out length of data")
    public void loopThroughCustomerData() {
        TallyScreen tScreen = new TallyScreen(driver);
        int actualTotalCustomerLength = tScreen.objectCustomerDetailsContainer.size();
        System.out.println("Customer length " + actualTotalCustomerLength);
        Assert.assertEquals(actualTotalCustomerLength, 4);
    }
    @Test(priority = 6, description = "Edit PELAM of first customer from  the customer list")
    public void editFirstCustomerPelam() {
        TallyScreen tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.editFirstCustomerPelam("12");
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("TEXT_AFTER_UPDATING_PELAM_DILAM")));
    }
    @Test(priority = 7, description = "Update first customer name from  the customer list")
    public void editFirstCustomerName() throws InterruptedException {
        TallyScreen tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.editFirstCustomerName(Utils.randomCustomerName());
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("TEXT_AFTER_UPDATING_NAME_OR_MOBILE_OF_CUSTOMER_OR_SUPPLIER")));
    }
    @Test(priority = 8, description = "Search for the last customer added in the customer list")
    public void searchForLastAddedCustomer() throws IOException, ParseException, InterruptedException {
        TallyScreen tScreen = new TallyScreen(driver);
        int customerFound = tScreen.searchLastAddedCustomer(Utils.getLastAddedCustomerName("customers"));
        Assert.assertEquals(customerFound, 1);
    }
    @Test(priority = 9, description = "Close eye Button and check that all numbers ar hidden")
    public void closeEyeButton() throws InterruptedException {
        TallyScreen tScreen = new TallyScreen(driver);
        String totalPabo = tScreen.closeEyeButton();
        Assert.assertEquals(totalPabo, dotenv.get("TEXT_AFTER_CLOSING_EYE_BUTTON"));
    }
    @Test(priority = 10, description = "Add filter for Showing only customer")
    public void addFilterOnlyCustomer() throws InterruptedException {
        TallyScreen tScreen = new TallyScreen(driver);
        int customerFound = tScreen.addFilter();
        Assert.assertEquals(customerFound, 2);
    }
    @Test(priority = 11, description = "Tagada pathai to customers")
    public void tagadaPathai() {
        TallyScreen tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.tagadaPathai();
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("TEXT_AFTER_SENDING_TAGADA_MESSAGE")));
    }
    @Test(priority = 12, description = "Delete Last customer from the list")
    public void deleteLastCustomer() throws InterruptedException {
        TallyScreen tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.deleteLastCustomer();
        Assert.assertTrue(confirmationMessage.contains(dotenv.get("PARTIAL_TEXT_AFTER_DELETING_CUSTOMER_OR_SUPPLIER")));
    }
    @Test(priority = 13, description = "If Nischit button enabled with sending invalid customer name when creating customers")
    public void isNischitButtonEnabledWhenCreatingCustomer() throws InterruptedException {
        TallyScreen tScreen = new TallyScreen(driver);
        boolean isBtnEnabled = tScreen.isNischitButtonEnabledWhenCreatingCustomer("hh");
        Assert.assertFalse(isBtnEnabled);
    }
    @Test(priority = 14, description = "If Poroborti button enabled with sending invalid customer name when updating customers info")
    public void isPorobortiButtonEnabledWhenEditingCustomerInfo() throws InterruptedException {
        TallyScreen tScreen = new TallyScreen(driver);
        boolean isBtnEnabled = tScreen.isPorobortiButtonEnabledWhenEditingCustomerInfo("hh");
        Assert.assertFalse(isBtnEnabled);
    }
}
