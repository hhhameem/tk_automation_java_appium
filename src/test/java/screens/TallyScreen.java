package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class TallyScreen {
    public TallyScreen(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //    Main Menus(Tabs)
    @FindBy(id = "com.progoti.tallykhata:id/item_tally")
    WebElement tabTally;

    //    Tally Main page elements
    @FindBy(id = "com.progoti.tallykhata:id/add_customer")
    WebElement btnAddCustomer;
    @FindBy(id = "com.progoti.tallykhata:id/iv_view")
    WebElement btnEye;
    @FindBy(id = "com.progoti.tallykhata:id/iv_filter")
    WebElement btnFilter;
    @FindBy(id = "com.progoti.tallykhata:id/ivClearFilter")
    WebElement btnClearFilter;
    @FindBy(id = "com.progoti.tallykhata:id/lay_tagada_message")
    WebElement btnTagadaPathai;
    @FindBy(id = "com.progoti.tallykhata:id/tvTotalPabo")
    WebElement textTotalpabo;
    @FindBy(id = "com.progoti.tallykhata:id/tvListCustomer")
    WebElement textListOfSupplierAndCustomer;
    @FindBy(id = "com.progoti.tallykhata:id/layout")
    public List<WebElement> objectCustomerDetailsContainer;
    @FindBy(id = "com.progoti.tallykhata:id/layoutCustomerInfo")
    List<WebElement> objectCustomerInfoContainer;
    @FindBy(id = "com.progoti.tallykhata:id/etSearchHome")
    WebElement inputSearchBox;

    //    Tally Main page Modal elements
    @FindBy(id = "com.progoti.tallykhata:id/ivCheckCustomer")
    WebElement inputCheckBoxCustomer;
    @FindBy(id = "com.progoti.tallykhata:id/ivCheckSupplier")
    WebElement inputCheckBoxSupplier;

    //    Tally Customer add page elements
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
    @FindBy(id = "com.progoti.tallykhata:id/layoutSmsEnabled")
    WebElement btnradioSendSMS;
    @FindBy(id = "com.progoti.tallykhata:id/back_button")
    WebElement btnBack;
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

    //    Tally Tagada pathai page elements
    @FindBy(id = "com.progoti.tallykhata:id/layout")
    public List<WebElement> objectTagadaPathaiDetailsContainer;
    @FindBy(id = "com.progoti.tallykhata:id/layoutSendSms")
    public WebElement btnSendTagadaSms;
    @FindBy(id = "com.progoti.tallykhata:id/button")
    public WebElement btnThikAche;
    @FindBy(id = "com.progoti.tallykhata:id/tv_cancel")
    public WebElement btnBatil;
    @FindBy(id = "com.progoti.tallykhata:id/tv_status_message")
    public WebElement textTagadaMessageSentConfirmation;

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
//        btnradioSendSMS.click();
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
//        btnradioSendSMS.click();
        btnOpenCamera.click();
        btnClickPhoto.click();
        btnAcceptClickedPhoto.click();
        btnDatePicker.click();
        btnPickDate.click();
        btnOkAfterDatePicking.click();
        btnNischit.click();
        return textConfirmMessageAfterCreation.getText();
    }

    public int searchLastAddedCustomer(String customerName) throws InterruptedException {
        inputSearchBox.sendKeys(customerName);
        Thread.sleep(500);
        return objectCustomerDetailsContainer.size();
    }
    public String closeEyeButton() throws InterruptedException {
        inputSearchBox.clear();
        Thread.sleep(500);
        btnEye.click();
        Thread.sleep(1000);
        String totalPabo = textTotalpabo.getText();
        System.out.println("totalPabo "+ totalPabo);
        System.out.println(totalPabo == "- - -");
        return  totalPabo;
    }

    public int addFilter() throws InterruptedException {
        btnEye.click();
        Thread.sleep(1000);
        btnFilter.click();
        inputCheckBoxCustomer.click();
        btnNischit.click();
        return objectCustomerDetailsContainer.size();
    }
}
