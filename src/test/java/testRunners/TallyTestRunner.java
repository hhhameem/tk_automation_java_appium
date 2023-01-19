package testRunners;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import screens.RegistrationScreen;
import screens.TallyScreen;
import setup.Setup;
import utils.Utils;

public class TallyTestRunner extends Setup {
    public String customerName = Utils.randomCustomerName();
    public String supplierName = Utils.randomCustomerName();
    @BeforeTest
    public void register() {
        RegistrationScreen rScreen = new RegistrationScreen(driver);
        rScreen.insertPhoneAndClickButton(Utils.randomPhoneNumber());
        rScreen.insertOtpAndClickButton(driver);
        rScreen.insertShopNameAndClickButton(Utils.randomShopName());
    }
    @Test(priority = 1, description = "Create Customer with only name and phone")
    public void addCustomerWithNameAndPhone() {
        TallyScreen tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addCustomerWithNameAndPhone(customerName ,Utils.randomPhoneNumber());
        String[] arrOfStr = confirmationMessage.split("-");
        String[] bangla = new String[]{"কে টালিতে যোগ করা হয়েছে।"};
//        String bangla1 = "কে টালিতে যোগ করা হয়েছে।";
//        String rawString = "Entwickeln Sie mit Vergnügen";
//        ByteBuffer buffer = StandardCharsets.UTF_8.encode(rawString);

//        String utf8EncodedString = StandardCharsets.UTF_8.decode(buffer).toString();
        System.out.println("actual "+confirmationMessage);
//        String expected = "\"" + name + "\"- " + " কে টালিতে যোগ করা হয়েছে।";
        System.out.println("after splitting "+ arrOfStr[1]);
        System.out.println("bangla "+ bangla[0].getClass().getName());
        Assert.assertTrue(confirmationMessage.contains(arrOfStr[1]));
    }
    @Test(priority = 2, description = "Create customer with all the input along with date and image")
    public void addCustomerFromContactBookWithAllInput() {
        TallyScreen tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addCustomerFromContactBookWithAllInput();
        System.out.println(confirmationMessage);
    }
    @Test(priority = 3, description = "Create supplier with only name and phone")
    public void addSupplierWithNameAndPhone() {
        TallyScreen tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addSupplierWithNameAndPhone(supplierName, Utils.randomPhoneNumber());
        System.out.println(confirmationMessage);
    }
    @Test(priority = 4, description = "Create supplier with all the input along with date and image")
    public void addSupplierFromContactBookWithAllInput() {
        TallyScreen tScreen = new TallyScreen(driver);
        String confirmationMessage = tScreen.addSupplierFromContactBookWithAllInput();
        System.out.println(confirmationMessage);
    }
}
