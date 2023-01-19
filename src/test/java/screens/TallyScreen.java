package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TallyScreen {
    public TallyScreen(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @FindBy(id = "com.progoti.tallykhata:id/item_tally")
    WebElement tabTally;
    @FindBy(id = "com.progoti.tallykhata:id/add_customer")
    WebElement btnAddCustomer;
    @FindBy(id = "com.progoti.tallykhata:id/back_button")
    WebElement btnBack;
    @FindBy(id = "com.progoti.tallykhata:id/btnCustomer")
    WebElement tabCustomer;
    @FindBy(id = "com.progoti.tallykhata:id/btnSupplier")
    WebElement tabSupplier;
    @FindBy(id = "com.progoti.tallykhata:id/etCustomerOrSupplier")
    WebElement inputCustomerOrSupplierName;
    @FindBy(id = "com.progoti.tallykhata:id/etMobileNumber")
    WebElement inputCustomerOrSupplierMobileNumber;
    @FindBy(id = "com.progoti.tallykhata:id/etCreditInput")
    WebElement inputPurberBaki;
    @FindBy(id = "com.progoti.tallykhata:id/btnConfirm")
    WebElement btnNischit;
    @FindBy(id = "com.progoti.tallykhata:id/layoutContact")
    WebElement btnPhoneBookThekeJogKori;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout")
    WebElement objectSecondContact;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.RelativeLayout")
    WebElement objectSixthContact;
    @FindBy(id = "com.progoti.tallykhata:id/tvConfirmationMessageForCustomer")
    WebElement textConfirmMessageAfterCreation;
    @FindBy(id = "com.progoti.tallykhata:id/ivLayCamera")
    WebElement btnOpenCamera;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/" +
            "androidx.appcompat.widget.LinearLayoutCompat/android.widget.RelativeLayout/android.widget.ImageView[2]")
    WebElement btnClickPhoto;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/" +
            "androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ImageView[2]")
    WebElement btnAcceptClickedPhoto;
    @FindBy(id = "com.progoti.tallykhata:id/layoutCalender")
    WebElement btnDatePicker;
    @FindBy(xpath = "//android.view.View[@content-desc=\"19 January 2023\"]")
    WebElement btnPickDate;
    @FindBy(id = "android:id/button1")
    WebElement btnOkAfterDatePicking;
    @FindBy(id = "com.progoti.tallykhata:id/layoutSmsEnabled")
    WebElement btnradioSendSMS;
    @FindBy(id = "com.progoti.tallykhata:id/tvListCustomer")
    WebElement textListOfSupplierAndCustomer;


    public String addCustomerWithNameAndPhone(String customerName, String customerPhoneNumber) {
        tabTally.click();
        btnAddCustomer.click();
        inputCustomerOrSupplierName.sendKeys(customerName);
        inputCustomerOrSupplierMobileNumber.sendKeys(customerPhoneNumber);
        btnNischit.click();
        return textConfirmMessageAfterCreation.getText();
    }
    public String addCustomerFromContactBookWithAllInput() {
        tabTally.click();
        btnAddCustomer.click();
        btnPhoneBookThekeJogKori.click();
        objectSecondContact.click();
//        inputPurberBaki.sendKeys(purberBaki);
        btnOpenCamera.click();
        btnClickPhoto.click();
        btnAcceptClickedPhoto.click();
        btnDatePicker.click();
        btnPickDate.click();
        btnOkAfterDatePicking.click();
        btnNischit.click();
        return textConfirmMessageAfterCreation.getText();
    }
    public String addSupplierWithNameAndPhone(String supplierName, String supplierPhoneNumber) {
        tabTally.click();
        btnAddCustomer.click();
        tabSupplier.click();
        inputCustomerOrSupplierName.sendKeys(supplierName);
        inputCustomerOrSupplierMobileNumber.sendKeys(supplierPhoneNumber);
        btnNischit.click();
        return textConfirmMessageAfterCreation.getText();
    }
    public String addSupplierFromContactBookWithAllInput() {
        tabTally.click();
        btnAddCustomer.click();
        tabSupplier.click();
        btnPhoneBookThekeJogKori.click();
        objectSixthContact.click();
//        inputPurberBaki.sendKeys(purberBaki);
        btnOpenCamera.click();
        btnClickPhoto.click();
        btnAcceptClickedPhoto.click();
        btnDatePicker.click();
        btnPickDate.click();
        btnOkAfterDatePicking.click();
        btnNischit.click();
        return textConfirmMessageAfterCreation.getText();
    }
}
