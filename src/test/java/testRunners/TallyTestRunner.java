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
//        String customerPhoneNumber = Utils.randomPhoneNumber();
        String customerPhoneNumber = "01517169846";
        String confirmationMessage = tScreen.addCustomerWithNameAndPhone(customerName, customerPhoneNumber);
        String[] arrOfStr = confirmationMessage.split("-");
        String[] bangla = new String[]{"কে টালিতে যোগ করা হয়েছে।"};
//        String bangla1 = "কে টালিতে যোগ করা হয়েছে।";
//        String rawString = "Entwickeln Sie mit Vergnügen";
//        ByteBuffer buffer = StandardCharsets.UTF_8.encode(rawString);

//        String utf8EncodedString = StandardCharsets.UTF_8.decode(buffer).toString();
//        System.out.println("actual "+confirmationMessage);
//        String expected = "\"" + customerName + "\"- " + " কে টালিতে যোগ করা হয়েছে।";
//        System.out.println("after splitting "+ arrOfStr[1]);
//        System.out.println("bangla "+ bangla[0].getClass().getName());
        Utils.saveJsonList(customerPhoneNumber, customerName,"customers");
//        Assert.assertTrue(confirmationMessage.contains(arrOfStr[1]));
    }
    @Test(priority = 2, description = "Create customer with all the input along with date and image")
    public void addCustomerFromContactBookWithAllInput() {
        TallyScreen tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addCustomerFromContactBookWithAllInput("12");
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
    @Test(priority = 4, description = "Create supplier with all the input along with date and image")
    public void addSupplierFromContactBookWithAllInput() {
        TallyScreen tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addSupplierFromContactBookWithAllInput("11");
        System.out.println(confirmationMessage);
    }
    @Test(priority = 5, description = "Loop through customer list and print out length of data")
    public void loopThroughCustomerData() {
        TallyScreen tScreen = new TallyScreen(driver);
        int actualTotalCustomerLength = tScreen.objectCustomerDetailsContainer.size();
        System.out.println("Customer length " + actualTotalCustomerLength);
//        Assert.assertEquals(actualTotalCustomerLength, 2);
    }
    @Test(priority = 6, description = "Edit first customer from  the customer list")
    public void editFirstCustomerPelam() throws IOException, ParseException, InterruptedException {
        TallyScreen tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.editFirstCustomerPelam("12");
        System.out.println("confirmation Message after edit " + confirmationMessage);
//        Assert.assertEquals(customerFound, 1);
    }
    @Test(priority = 7, description = "Update first customer name from  the customer list")
    public void editFirstCustomerName() throws IOException, ParseException, InterruptedException {
        TallyScreen tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.editFirstCustomerName(Utils.randomCustomerName());
        System.out.println("confirmation Message after name update " + confirmationMessage);
//        Assert.assertEquals(customerFound, 1);
    }
    @Test(priority = 8, description = "Search for the last customer added in the customer list")
    public void searchForLastAddedCustomer() throws IOException, ParseException, InterruptedException {
        TallyScreen tScreen = new TallyScreen(driver);
        int customerFound = tScreen.searchLastAddedCustomer(Utils.getLastAddedCustomerName("customers"));
        System.out.println("Customer found " + customerFound);
//        Assert.assertEquals(customerFound, 1);
    }
    @Test(priority = 9, description = "Close eye Button and check that all numbers ar hidden")
    public void closeEyeButton() throws IOException, ParseException, InterruptedException {
        TallyScreen tScreen = new TallyScreen(driver);
        String totalPabo = tScreen.closeEyeButton();
        Assert.assertEquals(totalPabo, "- - -");
    }
    @Test(priority = 10, description = "Add filter for Showing only customer")
    public void addFilterOnlyCustomer() throws IOException, ParseException, InterruptedException {
        TallyScreen tScreen = new TallyScreen(driver);
        int customerFound = tScreen.addFilter();
        System.out.println("Customer found " + customerFound);
    }
    @Test(priority = 11, description = "Tagada pathai to customers")
    public void tagadaPathai() throws IOException, ParseException, InterruptedException {
        TallyScreen tScreen = new TallyScreen(driver);
        String tagadaSentConfirmationMessage = tScreen.tagadaPathai();
        System.out.println("tagada Sent Confirmation Message " + tagadaSentConfirmationMessage);
    }
    @Test(priority = 12, description = "Delete Last customer from the list")
    public void deleteLastCustomer() throws IOException, ParseException, InterruptedException {
        TallyScreen tScreen = new TallyScreen(driver);
        String deleteCustomerConfirmationMessage = tScreen.deleteLastCustomer();
        System.out.println("delete Confirmation Message " + deleteCustomerConfirmationMessage);
    }
}
