package testRunners;

import jdk.jshell.execution.Util;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import screens.RegistrationScreen;
import screens.TallyScreen;
import setup.Setup;
import utils.Utils;

import java.io.IOException;

public class TallyTestRunner extends Setup {
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
        String customerPhoneNumber = Utils.randomPhoneNumber();
        String confirmationMessage = tScreen.addCustomerWithNameAndPhone(customerName, customerPhoneNumber);
        String[] arrOfStr = confirmationMessage.split("-");
        String[] bangla = new String[]{"কে টালিতে যোগ করা হয়েছে।"};
//        String bangla1 = "কে টালিতে যোগ করা হয়েছে।";
//        String rawString = "Entwickeln Sie mit Vergnügen";
//        ByteBuffer buffer = StandardCharsets.UTF_8.encode(rawString);

//        String utf8EncodedString = StandardCharsets.UTF_8.decode(buffer).toString();
//        System.out.println("actual "+confirmationMessage);
//        String expected = "\"" + name + "\"- " + " কে টালিতে যোগ করা হয়েছে।";
//        System.out.println("after splitting "+ arrOfStr[1]);
//        System.out.println("bangla "+ bangla[0].getClass().getName());
        Utils.saveJsonList(customerPhoneNumber, customerName,"customers");
//        Assert.assertTrue(confirmationMessage.contains(arrOfStr[1]));
    }
    @Test(priority = 2, enabled = false, description = "Create customer with all the input along with date and image")
    public void addCustomerFromContactBookWithAllInput() {
        TallyScreen tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addCustomerFromContactBookWithAllInput();
        System.out.println(confirmationMessage);
    }
    @Test(priority = 3, description = "Create supplier with only name and phone")
    public void addSupplierWithNameAndPhone() throws Exception {
        TallyScreen tScreen = new TallyScreen(driver);
        String supplierName = Utils.randomCustomerName();
        String supplierPhoneNumber = Utils.randomPhoneNumber();
        String confirmationMessage = tScreen.addSupplierWithNameAndPhone(supplierName, supplierPhoneNumber);
        Utils.saveJsonList(supplierPhoneNumber, supplierName,"customers");
        System.out.println(confirmationMessage);
    }
    @Test(priority = 4, enabled = false, description = "Create supplier with all the input along with date and image")
    public void addSupplierFromContactBookWithAllInput() {
        TallyScreen tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addSupplierFromContactBookWithAllInput();
        System.out.println(confirmationMessage);
    }
    @Test(priority = 5, description = "Loop through customer list and print out length of data")
    public void loopThroughCustomerData() {
        TallyScreen tScreen = new TallyScreen(driver);
        int actualTotalCustomerLength = tScreen.objectCustomerDetailsContainer.size();
        System.out.println("Customer length " + actualTotalCustomerLength);
//        Assert.assertEquals(actualTotalCustomerLength, 2);
    }
    @Test(priority = 6, description = "Search for the last customer")
    public void searchForLastCustomer() throws IOException, ParseException, InterruptedException {
        TallyScreen tScreen = new TallyScreen(driver);
        int customerFound = tScreen.searchLastAddedCustomer(Utils.getLastAddedCustomerName("customers"));
        System.out.println("Customer found " + customerFound);
//        Assert.assertEquals(customerFound, 1);
    }
    @Test(priority = 7, description = "Close eye Button and check that all numbers ar hidden")
    public void closeEyeButton() throws IOException, ParseException, InterruptedException {
        TallyScreen tScreen = new TallyScreen(driver);
        String totalPabo = tScreen.closeEyeButton();
        Assert.assertEquals(totalPabo, "- - -");
    }
    @Test(priority = 8, description = "Add filter for Showing only customer")
    public void addFilterOnlyCustomer() throws IOException, ParseException, InterruptedException {
        TallyScreen tScreen = new TallyScreen(driver);
        int customerFound = tScreen.addFilter();
        System.out.println("Customer found " + customerFound);
    }
}
