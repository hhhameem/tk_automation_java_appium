package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

import java.util.List;

public class TallyScreen {
    AndroidDriver driver;

    public TallyScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //    Main Menus(Tabs)
    @FindBy(id = "com.progoti.tallykhata:id/item_tally")
    WebElement tabTally;

    // Common elements throughout the tally tab
    @FindBy(id = "com.progoti.tallykhata:id/btnConfirm")
    WebElement btnNischit;
    @FindBy(id = "com.progoti.tallykhata:id/iv_settings")
    WebElement btnKebab;
    @FindBy(id = "com.progoti.tallykhata:id/content")
    List<WebElement> btnKebabMenuOptions;
    @FindBy(id = "com.progoti.tallykhata:id/btnConfirmCreditEntry")
    WebElement btnConfirmInDilamPelamAndLendenEdit;
    @FindBy(id = "com.progoti.tallykhata:id/tvConfirmMessage")
    WebElement textConfirmMessage;
    @FindBy(id = "com.progoti.tallykhata:id/tvConfirmationMessage")
    WebElement textConfirmationMessage;
    @FindBy(id = "com.progoti.tallykhata:id/tvAlertMsg")
    WebElement textDeleteAlertMessage;
    @FindBy(id = "com.progoti.tallykhata:id/tvCash")
    WebElement textToolbarTitleLendenOrLendenEditOrTagadaPathaiOrDoinikHisab;
    @FindBy(id = "com.progoti.tallykhata:id/tvNavTitle")
    WebElement textToolbarTitleCustomerSupplierDeleteOrTallyMessageKini;
    @FindBy(id = "com.progoti.tallykhata:id/back_button")
    WebElement btnBack;
    @FindBy(id = "com.progoti.tallykhata:id/layoutSmsEnabled")
    WebElement btnRadioSendSMSEnabled;
    @FindBy(id = "com.progoti.tallykhata:id/ivLayCamera")
    WebElement btnOpenCamera;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.RelativeLayout/android.widget.ImageView[2]")
    WebElement btnClickPhoto;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" + "android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/" + "androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ImageView[2]")
    WebElement btnAcceptClickedPhoto;
    @FindBy(id = "com.progoti.tallykhata:id/layoutCalender")
    WebElement btnDatePicker;
    @FindBy(xpath = "//android.view.View[@content-desc=\"19 January 2023\"]")
    WebElement btnPickDate;
    @FindBy(id = "android:id/button1")
    WebElement btnOkAfterDatePicking;
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    WebElement btnBackToApp;
    @FindBy(id = "com.progoti.tallykhata:id/snackbar_text")
    WebElement alertSnackbarText;
    @FindBy(id = "com.progoti.tallykhata:id/snackbar_action")
    WebElement alertSnackbarClose;
    @FindBy(id = "android:id/chooser_header")
    WebElement objectExtraLayout;

    //    Tally Main page elements
    @FindBy(id = "com.progoti.tallykhata:id/tvTotalPabo")
    WebElement textMotPaboValue;
    @FindBy(id = "com.progoti.tallykhata:id/tvTotalDebo")
    WebElement textMotDeboValue;
    @FindBy(id = "com.progoti.tallykhata:id/tvCurrentCash")
    WebElement textAjkerBecha;
    @FindBy(id = "com.progoti.tallykhata:id/iv_view")
    WebElement btnEye;
    @FindBy(id = "com.progoti.tallykhata:id/iv_filter")
    WebElement btnFilter;
    @FindBy(id = "com.progoti.tallykhata:id/ivClearFilter")
    WebElement btnClearFilter;
    @FindBy(id = "com.progoti.tallykhata:id/etSearchHome")
    WebElement inputSearchBox;
    @FindBy(id = "com.progoti.tallykhata:id/iv_download")
    WebElement btnDownload;
    @FindBy(id = "com.progoti.tallykhata:id/lay_tagada_message")
    WebElement btnTagadaPathai;
    @FindBy(id = "com.progoti.tallykhata:id/tvListCustomer")
    WebElement textCustomerAndSupplierCount;
    @FindBy(id = "com.progoti.tallykhata:id/add_customer")
    WebElement btnCustomerJogKori;
    @FindBy(id = "com.progoti.tallykhata:id/layout")
    public List<WebElement> objectCustomerDetailsContainer;
    @FindBy(id = "com.progoti.tallykhata:id/layoutCustomerInfo")
    List<WebElement> objectCustomerInfoContainer;
    @FindBy(id = "com.progoti.tallykhata:id/tvAmount")
    WebElement textCustomerAndSupplierAmountValue;

    //    Tally Main page Modal(Filter) elements
    @FindBy(id = "com.progoti.tallykhata:id/ivCheckCustomer")
    WebElement inputCheckBoxCustomer;
    @FindBy(id = "com.progoti.tallykhata:id/ivCheckSupplier")
    WebElement inputCheckBoxSupplier;
    @FindBy(id = "com.progoti.tallykhata:id/rbDeboPaboAscending")
    WebElement inputCheckBoxKomToBeshi;
    @FindBy(id = "com.progoti.tallykhata:id/rbDeboPaboDescending")
    WebElement inputCheckBoxBeshiToKom;
    @FindBy(id = "com.progoti.tallykhata:id/rbNewToOld")
    WebElement inputCheckBoxNotunToPuraton;
    @FindBy(id = "com.progoti.tallykhata:id/rbOldToNew")
    WebElement inputCheckBoxPuratonToNotun;
    @FindBy(id = "com.progoti.tallykhata:id/ivClose")
    WebElement btnFilterModalClose;

    //    Notun customer/supplier page elements
    @FindBy(id = "com.progoti.tallykhata:id/btnCustomer")
    WebElement tabCustomer;
    @FindBy(id = "com.progoti.tallykhata:id/btnSupplier")
    WebElement tabSupplier;
    @FindBy(id = "com.progoti.tallykhata:id/layoutContact")
    WebElement btnPhoneBookThekeJogKori;
    @FindBy(id = "com.progoti.tallykhata:id/etCustomerOrSupplier")
    WebElement inputCustomerOrSupplierName;
    @FindBy(id = "com.progoti.tallykhata:id/etMobileNumber")
    WebElement inputCustomerOrSupplierMobileNumber;
    @FindBy(id = "com.progoti.tallykhata:id/etCreditInput")
    WebElement inputPurberBaki;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" + "android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" + "androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.RelativeLayout")
    WebElement objectFirstContact;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" + "android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" + "androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout")
    WebElement objectSecondContact;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" + "android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" + "androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.RelativeLayout")
    WebElement objectThirdContact;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" + "android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" + "androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.RelativeLayout")
    WebElement objectFourthContact;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" + "android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" + "androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.RelativeLayout")
    WebElement objectFifthContact;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" + "android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" + "androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.RelativeLayout")
    WebElement objectSixthContact;
    @FindBy(id = "com.progoti.tallykhata:id/tvConfirmationMessageForCustomer")
    WebElement textConfirmMessageAfterSupplierOrCustomerCreation;

    // Dilam/Pelam update page elements
    @FindBy(id = "com.progoti.tallykhata:id/tvCreditType")
    WebElement textCreditType;
    @FindBy(id = "com.progoti.tallykhata:id/tvCreditAmount")
    WebElement textCreditAmountValue;
    @FindBy(id = "com.progoti.tallykhata:id/tv_last_share_medium_name")
    WebElement textrecordShareMedium;
    @FindBy(id = "com.progoti.tallykhata:id/etSale")
    WebElement inputDilam;
    @FindBy(id = "com.progoti.tallykhata:id/etGot")
    WebElement inputPelam;
    @FindBy(id = "com.progoti.tallykhata:id/etDescription")
    WebElement inputBiboron;
    @FindBy(id = "com.progoti.tallykhata:id/et_cash_sale")
    WebElement inputCashBecha;
    @FindBy(id = "com.progoti.tallykhata:id/et_malik_dilo")
    WebElement inputMalikDilo;
    @FindBy(id = "com.progoti.tallykhata:id/tvDate")
    WebElement btnDatePickerDilamPelam;
    @FindBy(id = "com.progoti.tallykhata:id/tvSMS")
    WebElement btnRadioSendSMSDilamPelam;
    @FindBy(id = "com.progoti.tallykhata:id/tvCamera")
    WebElement btnOpenCameraDilamPelam;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ImageView[2]")
    WebElement btnAcceptClickedPhotoDilamPelam;
    @FindBy(id = "com.progoti.tallykhata:id/tv_no_button")
    WebElement btnBatilCashGhatti;
    @FindBy(id = "com.progoti.tallykhata:id/tv_yes_button")
    WebElement btnNischitCashGhatti;

    //Lenden record share page after Dilam pelam update
    @FindBy(id = "com.progoti.tallykhata:id/some_id")
    WebElement textConfirmMessageAfterDialmOrPelamUpdate;
    @FindBy(id = "com.progoti.tallykhata:id/ivClose")
    WebElement btnConfirmWindowClose;
    @FindBy(id = "com.progoti.tallykhata:id/tvshare")
    WebElement textShareOptions;
    @FindBy(id = "com.progoti.tallykhata:id/messageTV")
    WebElement textAlertNoAppToShareRecord;
    @FindBy(id = "com.progoti.tallykhata:id/root")
    List<WebElement> btnShareOptions;
    @FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"Send\"])[1]")
    WebElement btnSendRecordInMessenger;
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Back\"]")
    WebElement btnBackFromMessenger;

    // Tagada Pathai page elements
    @FindBy(id = "com.progoti.tallykhata:id/layout")
    List<WebElement> objectTagadaPathaiLendenDetailsContainer;
    @FindBy(id = "com.progoti.tallykhata:id/tv_button_title")
    WebElement textTagadaPathateTapKorun;
    @FindBy(id = "com.progoti.tallykhata:id/tvSmsCount")
    WebElement textTagadaSMSCount;
    @FindBy(id = "com.progoti.tallykhata:id/layoutSendSms")
    WebElement btnTallyMessagePathai;
    @FindBy(id = "com.progoti.tallykhata:id/layoutShare")
    WebElement btnShareKori;
    @FindBy(id = "com.progoti.tallykhata:id/sms_kini")
    WebElement btnTallyMessageKini;
    @FindBy(id = "com.progoti.tallykhata:id/button")
    public WebElement btnThikAcheTallyMessage;
    @FindBy(id = "com.progoti.tallykhata:id/tv_cancel")
    public WebElement btnBatilTallyMessage;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView")
    public WebElement btnCopyLink;

    // Customer/Supplier Report page elements
    @FindBy(id = "com.progoti.tallykhata:id/ivReportDownload")
    WebElement btnDownloadReport;
    @FindBy(id = "com.progoti.tallykhata:id/tagadaLayer")
    WebElement btnTagadaMessagePathaiWithBell;
    @FindBy(id = "com.progoti.tallykhata:id/shareReportSwitch")
    WebElement btnRadioShareReport;
    @FindBy(id = "com.progoti.tallykhata:id/tv_title")
    List<WebElement> textReportDownloadOptions;
    @FindBy(id = "com.progoti.tallykhata:id/itemCustomerTxn")
    List<WebElement> objectTransactionItems;
    @FindBy(id = "com.progoti.tallykhata:id/iv_cancel")
    WebElement btnCancelInfo;
    @FindBy(id = "com.progoti.tallykhata:id/tv_edit_delete_hint")
    WebElement textInfo;
    @FindBy(id = "com.progoti.tallykhata:id/tv_total_credit")
    WebElement textMotDilamValue;
    @FindBy(id = "com.progoti.tallykhata:id/tv_total_received")
    WebElement textMotPelamValue;

    // Customer report page Modal(date select for report download) elements
    @FindBy(id = "com.progoti.tallykhata:id/iv_close")
    WebElement btnCloseDateSelectModal;
    @FindBy(id = "com.progoti.tallykhata:id/etStartDateInput")
    WebElement inputStartDateSelectForDownloadReport;
    @FindBy(id = "com.progoti.tallykhata:id/etEndDateInput")
    WebElement inputEndDateSelectForDownloadReport;
    @FindBy(id = "com.progoti.tallykhata:id/btnAction")
    WebElement btnDownloadReportInModal;

    // Lenden page elements
    @FindBy(id = "com.progoti.tallykhata:id/btnTxnDelete")
    WebElement btnDeleteLenden;
    @FindBy(id = "com.progoti.tallykhata:id/btnTxnEdit")
    WebElement btnEditLenden;
    @FindBy(id = "com.progoti.tallykhata:id/layoutEditJer")
    WebElement btnEditLendenJer;
    @FindBy(id = "com.progoti.tallykhata:id/btnThree")
    WebElement btnThree;
    @FindBy(id = "com.progoti.tallykhata:id/tv_toolbar_title")
    WebElement textToolbarTitleLendenDelete;

    // Customer/Supplier Delete Page elements
    @FindBy(id = "com.progoti.tallykhata:id/btnDeleteCustomer")
    WebElement btnDeleteCustomerSupplier;
    @FindBy(id = "com.progoti.tallykhata:id/btnCancel")
    WebElement btnCancelDeleteCustomerSupplier;

    // Customer/Supplier Edit Page elements
    @FindBy(id = "com.progoti.tallykhata:id/etCustomerName")
    WebElement inputCustomerOrSupplierNameInEditPage;
    //Mobile number is already in the customer creation section


    /*
     * --------------------------------------
     *  Customer add
     * -------------------------------------
     */
    @Step("Create customer with name {0}")
    public String addCustomerWithNameWithoutNumber(String name) {
        tabTally.click();
        btnCustomerJogKori.click();
        inputCustomerOrSupplierName.sendKeys(name);
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        return textConfirmMessageAfterSupplierOrCustomerCreation.getText();
    }

    @Step("Create customer with name {0} number {1}")
    public String addCustomerWithNameNumber(String name, String number) {
        tabTally.click();
        btnCustomerJogKori.click();
        inputCustomerOrSupplierName.sendKeys(name);
        inputCustomerOrSupplierMobileNumber.sendKeys(number);
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        return textConfirmMessageAfterSupplierOrCustomerCreation.getText();
    }

    public String addCustomerFromPhoneBook() {
        tabTally.click();
        btnCustomerJogKori.click();
        btnPhoneBookThekeJogKori.click();
        objectSixthContact.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        return textConfirmMessageAfterSupplierOrCustomerCreation.getText();
    }

    @Step("Create customer with name {0} number {1} jer {2}")
    public String addCustomerWithJer(String name, String number, String jer) {
        tabTally.click();
        btnCustomerJogKori.click();
        inputCustomerOrSupplierName.sendKeys(name);
        inputCustomerOrSupplierMobileNumber.sendKeys(number);
        inputPurberBaki.click();
        inputPurberBaki.sendKeys(jer);
        btnRadioSendSMSEnabled.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        return textConfirmMessageAfterSupplierOrCustomerCreation.getText();
    }

    @Step("Create customer from phonebook with name, number and jer {0}")
    public String addCustomerFromPhoneBookWithJer(String jer) {
        tabTally.click();
        btnCustomerJogKori.click();
        btnPhoneBookThekeJogKori.click();
        objectFifthContact.click();
        inputPurberBaki.sendKeys(jer);
        btnRadioSendSMSEnabled.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        return textConfirmMessageAfterSupplierOrCustomerCreation.getText();
    }

    @Step("Create customer with name {0}, number {1} and jer {2} along with photo and date")
    public String addCustomerWithJerPhotoDate(String name, String number, String jer) throws InterruptedException {
        tabTally.click();
        btnCustomerJogKori.click();
        inputCustomerOrSupplierName.sendKeys(name);
        inputCustomerOrSupplierMobileNumber.sendKeys(number);
        inputPurberBaki.click();
        inputPurberBaki.sendKeys(jer);
        btnRadioSendSMSEnabled.click();
        Thread.sleep(1000);
        btnOpenCamera.click();
        Thread.sleep(1000);
        btnClickPhoto.click();
        Thread.sleep(1000);
        btnAcceptClickedPhoto.click();
        btnDatePicker.click();
        btnOkAfterDatePicking.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        return textConfirmMessageAfterSupplierOrCustomerCreation.getText();
    }

    @Step("Create customer from phonebook with name, number and jer {0} along with photo and date")
    public String addCustomerFromPhoneBookWithJerPhotoDate(String jer) throws InterruptedException {
        tabTally.click();
        btnCustomerJogKori.click();
        btnPhoneBookThekeJogKori.click();
        objectFourthContact.click();
        inputPurberBaki.sendKeys(jer);
        btnRadioSendSMSEnabled.click();
        Thread.sleep(1000);
        btnOpenCamera.click();
        Thread.sleep(1000);
        btnClickPhoto.click();
        Thread.sleep(1000);
        btnAcceptClickedPhoto.click();
        btnDatePicker.click();
        btnOkAfterDatePicking.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        return textConfirmMessageAfterSupplierOrCustomerCreation.getText();
    }

    @Step("Create customer with invalid name {0}, valid number {1}")
    public boolean addCustomerWithInvalidNameValidPhone(String invalidName, String number) {
        tabTally.click();
        btnCustomerJogKori.click();
        inputCustomerOrSupplierName.sendKeys(invalidName);
        inputCustomerOrSupplierMobileNumber.sendKeys(number);
        boolean isBtnEnabled = btnNischit.isEnabled();      // should return false
        Utils.saveScreenshot("On invalid name input", driver);
        btnBack.click();
        return isBtnEnabled;
    }

    @Step("Create customer with valid name {0}, invalid number {1}")
    public String addCustomerWithValidNameInvalidPhone(String name, String invalidNumber) {
        tabTally.click();
        btnCustomerJogKori.click();
        inputCustomerOrSupplierName.sendKeys(name);
        inputCustomerOrSupplierMobileNumber.sendKeys(invalidNumber);
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        String errorAlert = alertSnackbarText.getText();     // should return মোবাইল নম্বর সঠিক নয়।
        Utils.saveScreenshot("After clicking confirm button", driver);
        btnBack.click();
        return errorAlert;
    }

    @Step("Create customer with valid name {0}, existing number {1}")
    public String addCustomerWithExistingPhone(String name, String existingPhone) {
        tabTally.click();
        btnCustomerJogKori.click();
        inputCustomerOrSupplierName.sendKeys(name);
        inputCustomerOrSupplierMobileNumber.sendKeys(existingPhone);
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        String errorAlert = alertSnackbarText.getText();     // should return এই মোবাইল নম্বরের কাস্টমার আগে থেকেই আছে
        Utils.saveScreenshot("After clicking confirm button", driver);
        btnBack.click();
        return errorAlert;
    }

    /*
     * --------------------------------------
     *  Supplier add
     * -------------------------------------
     */
    @Step("Create supplier with valid name {0}")
    public String addSupplierWithNameWithoutNumber(String name) {
        tabTally.click();
        btnCustomerJogKori.click();
        tabSupplier.click();
        inputCustomerOrSupplierName.sendKeys(name);
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        return textConfirmMessageAfterSupplierOrCustomerCreation.getText();
    }

    @Step("Create supplier with valid name {0}, valid number {1}")
    public String addSupplierWithNameNumber(String name, String number) {
        tabTally.click();
        btnCustomerJogKori.click();
        tabSupplier.click();
        inputCustomerOrSupplierName.sendKeys(name);
        inputCustomerOrSupplierMobileNumber.sendKeys(number);
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        return textConfirmMessageAfterSupplierOrCustomerCreation.getText();
    }


    public String addSupplierFromPhoneBook() {
        tabTally.click();
        btnCustomerJogKori.click();
        tabSupplier.click();
        btnPhoneBookThekeJogKori.click();
        objectThirdContact.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        return textConfirmMessageAfterSupplierOrCustomerCreation.getText();
    }

    @Step("Create supplier with valid name {0}, valid number {1} and jer {2}")
    public String addSupplierWithJer(String name, String number, String jer) {
        tabTally.click();
        btnCustomerJogKori.click();
        tabSupplier.click();
        inputCustomerOrSupplierName.sendKeys(name);
        inputCustomerOrSupplierMobileNumber.sendKeys(number);
        inputPurberBaki.click();
        inputPurberBaki.sendKeys(jer);
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        return textConfirmMessageAfterSupplierOrCustomerCreation.getText();
    }

    @Step("Create supplier from phonebook with valid name,valid number and jer {0}")
    public String addSupplierFromPhoneBookWithJer(String jer) {
        tabTally.click();
        btnCustomerJogKori.click();
        tabSupplier.click();
        btnPhoneBookThekeJogKori.click();
        objectSecondContact.click();
        inputPurberBaki.sendKeys(jer);
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        return textConfirmMessageAfterSupplierOrCustomerCreation.getText();
    }

    @Step("Create supplier with name {0}, number {1} and jer {2} along with photo and date")
    public String addSupplierWithJerPhotoAndDate(String name, String number, String jer) throws InterruptedException {
        tabTally.click();
        btnCustomerJogKori.click();
        tabSupplier.click();
        inputCustomerOrSupplierName.sendKeys(name);
        inputCustomerOrSupplierMobileNumber.sendKeys(number);
        inputPurberBaki.click();
        inputPurberBaki.sendKeys(jer);
        Thread.sleep(1000);
        btnOpenCamera.click();
        Thread.sleep(1000);
        btnClickPhoto.click();
        Thread.sleep(1000);
        btnAcceptClickedPhoto.click();
        btnDatePicker.click();
        btnOkAfterDatePicking.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        return textConfirmMessageAfterSupplierOrCustomerCreation.getText();
    }

    @Step("Create supplier from phonebook with jer {0} along with photo and date")
    public String addSupplierFromPhoneBookWithJerPhotoAndDate(String jer) throws InterruptedException {
        tabTally.click();
        btnCustomerJogKori.click();
        tabSupplier.click();
        btnPhoneBookThekeJogKori.click();
        objectFirstContact.click();
        inputPurberBaki.sendKeys(jer);
        Thread.sleep(1000);
        btnOpenCamera.click();
        Thread.sleep(1000);
        btnClickPhoto.click();
        Thread.sleep(1000);
        btnAcceptClickedPhoto.click();
        btnDatePicker.click();
        btnOkAfterDatePicking.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        return textConfirmMessageAfterSupplierOrCustomerCreation.getText();
    }

    @Step("Create supplier with invalid name {0}, valid number {1}")
    public boolean addSupplierWithInvalidNameValidPhone(String invalidName, String phone) {
        tabTally.click();
        btnCustomerJogKori.click();
        tabSupplier.click();
        inputCustomerOrSupplierName.sendKeys(invalidName);
        inputCustomerOrSupplierMobileNumber.sendKeys(phone);
        boolean isBtnEnabled = btnNischit.isEnabled();      //should return false
        Utils.saveScreenshot("On Invalid name input", driver);
        btnBack.click();
        return isBtnEnabled;
    }

    @Step("Create supplier with valid name {0}, invalid number {1}")
    public String addSupplierWithValidNameInvalidPhone(String name, String invalidPhone) {
        tabTally.click();
        btnCustomerJogKori.click();
        tabSupplier.click();
        inputCustomerOrSupplierName.sendKeys(name);
        inputCustomerOrSupplierMobileNumber.sendKeys(invalidPhone);
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        String errorAlert = alertSnackbarText.getText();     // should return মোবাইল নম্বর সঠিক নয়।
        Utils.saveScreenshot("After clicking confirm button", driver);
        btnBack.click();
        return errorAlert;
    }

    @Step("Create supplier with valid name {0}, existing valid number {1}")
    public String addSupplierWithExistingPhone(String name, String existingPhone) {
        tabTally.click();
        btnCustomerJogKori.click();
        tabSupplier.click();
        inputCustomerOrSupplierName.sendKeys(name);
        inputCustomerOrSupplierMobileNumber.sendKeys(existingPhone);
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        String errorAlert = alertSnackbarText.getText();     // should return এই মোবাইল নম্বরের কাস্টমার আগে থেকেই আছে
        Utils.saveScreenshot("After clicking confirm button", driver);
        btnBack.click();
        return errorAlert;
    }

    /*
     * --------------------------------------
     *  Update Dilam/pelam of customer
     * -------------------------------------
     */
    @Step("Update customer dilam beshi {0}, pelam kom {1}")
    public String customerDilamBeshiPelamKom(String dilam, String pelam, String biboron) throws InterruptedException {
        tabTally.click();
        btnFilter.click();
        inputCheckBoxCustomer.click();
        btnNischit.click();
        objectCustomerDetailsContainer.get(0).click();
        inputDilam.sendKeys(dilam);
        inputPelam.sendKeys(pelam);
        inputBiboron.sendKeys(biboron);
        btnRadioSendSMSDilamPelam.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnConfirmInDilamPelamAndLendenEdit.click();
        Utils.saveScreenshot("After clicking confirm button", driver);
        btnConfirmWindowClose.click();
        Thread.sleep(1000);
        return textMotPaboValue.getText();
    }

    @Step("Update customer dilam kom {0}, pelam beshi {1}")
    public String customerDilamKomPelamBeshi(String dilam, String pelam, String biboron) throws InterruptedException {
        tabTally.click();
        btnClearFilter.click();
        Thread.sleep(2000);
        objectCustomerDetailsContainer.get(0).click();
        inputDilam.sendKeys(dilam);
        inputPelam.sendKeys(pelam);
        inputBiboron.sendKeys(biboron);
        btnRadioSendSMSDilamPelam.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnConfirmInDilamPelamAndLendenEdit.click();
        Utils.saveScreenshot("After clicking confirm button", driver);
        btnConfirmWindowClose.click();
        Thread.sleep(1000);
        return textMotPaboValue.getText();
    }

    @Step("Update customer dilam {0}, pelam {1} soman")
    public String customerDilamPelamSoman(String dilam, String pelam, String biboron) throws InterruptedException {
        tabTally.click();
        objectCustomerDetailsContainer.get(0).click();
        inputDilam.sendKeys(dilam);
        inputPelam.sendKeys(pelam);
        inputBiboron.sendKeys(biboron);
        btnRadioSendSMSDilamPelam.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnConfirmInDilamPelamAndLendenEdit.click();
        Utils.saveScreenshot("After clicking confirm button", driver);
        btnConfirmWindowClose.click();
        Thread.sleep(1000);
        return textMotPaboValue.getText();
    }

    /*
     *--------------------------------------
     *  Update Dilam/pelam of supplier
     * -------------------------------------
     */
    @Step("Update supplier dilam beshi {0}, pelam kom {1}")
    public String supplierDilamBeshiPelamKom(String dilam, String pelam, String biboron) throws InterruptedException {
        tabTally.click();
        btnFilter.click();
        inputCheckBoxSupplier.click();
        btnNischit.click();
        objectCustomerDetailsContainer.get(0).click();
        inputDilam.sendKeys(dilam);
        inputPelam.sendKeys(pelam);
        inputBiboron.sendKeys(biboron);
        btnRadioSendSMSDilamPelam.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnConfirmInDilamPelamAndLendenEdit.click();
        Utils.saveScreenshot("After clicking confirm button", driver);
        btnConfirmWindowClose.click();
        Thread.sleep(1000);
        return textMotPaboValue.getText();
    }

    @Step("Update supplier dilam kom {0}, pelam beshi {1}")
    public String supplierDilamKomPelamBeshi(String dilam, String pelam, String cashBecha, String biboron) throws InterruptedException {
        tabTally.click();
        btnClearFilter.click();
        Thread.sleep(2000);
        objectCustomerDetailsContainer.get(0).click();
        inputDilam.sendKeys(dilam);
        inputPelam.sendKeys(pelam);
        inputBiboron.sendKeys(biboron);
        btnRadioSendSMSDilamPelam.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnConfirmInDilamPelamAndLendenEdit.click();
        Utils.saveScreenshot("After clicking confirm button", driver);
        inputCashBecha.sendKeys(cashBecha);
        btnNischitCashGhatti.click();
        Utils.saveScreenshot("After ghatti input", driver);
        btnConfirmWindowClose.click();
        Thread.sleep(1000);
        return textMotPaboValue.getText();
    }

    @Step("Update supplier dilam {0}, pelam {1} soman")
    public String supplierDilamPelamSoman(String dilam, String pelam, String biboron) throws InterruptedException {
        tabTally.click();
        objectCustomerDetailsContainer.get(0).click();
        inputDilam.sendKeys(dilam);
        inputPelam.sendKeys(pelam);
        inputBiboron.sendKeys(biboron);
        btnRadioSendSMSDilamPelam.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnConfirmInDilamPelamAndLendenEdit.click();
        Utils.saveScreenshot("After clicking confirm button", driver);
        btnConfirmWindowClose.click();
        Thread.sleep(1000);
        return textMotPaboValue.getText();
    }

    /*
     *--------------------------------------
     *  Eye button, Search and Report button
     * -------------------------------------
     */
    public String clickEyeButton() throws InterruptedException {
        tabTally.click();
        btnEye.click();
        Thread.sleep(2000);
        String motPaboValue = textMotPaboValue.getText();
        Utils.saveScreenshot("After clicking Eye button", driver);
        btnEye.click();
        return motPaboValue;
    }

    @Step("search with a name {0} that exist")
    public int searchWithNameThatExist(String name) {
        tabTally.click();
        inputSearchBox.sendKeys(name);
        int customerLength = objectCustomerDetailsContainer.size();
        Utils.saveScreenshot("existing name", driver);
        inputSearchBox.clear();
        return customerLength;
    }

    @Step("search with a name {0} that doesn't exist")
    public boolean searchWithNameThatDontExist(String name) {
        tabTally.click();
        inputSearchBox.sendKeys(name);
        boolean doesCustomerExist = objectCustomerDetailsContainer.isEmpty();
        Utils.saveScreenshot("Non-Existing name", driver);
        inputSearchBox.clear();
        return doesCustomerExist;
    }

    public boolean clickDownloadButton(AndroidDriver driver) throws InterruptedException {
        tabTally.click();
        btnDownload.click();
        Thread.sleep(3000);
        boolean isExternalLayoutVisible = objectExtraLayout.isDisplayed();      // should return ture
        System.out.println("jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj " + isExternalLayoutVisible);
        Utils.saveScreenshot("After clicking download button", driver);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
//        (new TouchAction(driver)).tap(PointOption.point(700, 170)).perform();
        return isExternalLayoutVisible;
    }

    public String clickAjkerBecha() throws InterruptedException {
        tabTally.click();
        textAjkerBecha.click();
        String doinikHisab = textToolbarTitleLendenOrLendenEditOrTagadaPathaiOrDoinikHisab.getText();
        Utils.saveScreenshot("After clicking ajker becha", driver);
        btnBack.click();
        return doinikHisab;
    }

    /*
     *--------------------------------------
     *  Filter
     * -------------------------------------
     */
    public void customerKomPuraton() throws InterruptedException {
        tabTally.click();
        btnFilter.click();
        inputCheckBoxCustomer.click();
        inputCheckBoxKomToBeshi.click();
        Thread.sleep(1000);
        inputCheckBoxPuratonToNotun.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        Thread.sleep(3000);
    }

    public void customerKomNotun() throws InterruptedException {
        tabTally.click();
        btnFilter.click();
        inputCheckBoxNotunToPuraton.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        Thread.sleep(3000);
    }

    public void customerBeshiNotun() throws InterruptedException {
        tabTally.click();
        btnFilter.click();
        inputCheckBoxBeshiToKom.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        Thread.sleep(3000);
    }

    public void customerBeshipuraton() throws InterruptedException {
        tabTally.click();
        btnFilter.click();
        inputCheckBoxPuratonToNotun.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        Thread.sleep(3000);
    }

    public void supplierKomPuraton() throws InterruptedException {
        tabTally.click();
        btnClearFilter.click();
        Thread.sleep(1000);
        btnFilter.click();
        inputCheckBoxSupplier.click();
        inputCheckBoxKomToBeshi.click();
        inputCheckBoxPuratonToNotun.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        Thread.sleep(3000);
    }

    public void supplierKomNotun() throws InterruptedException {
        tabTally.click();
        btnFilter.click();
        inputCheckBoxNotunToPuraton.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        Thread.sleep(3000);
    }

    public void supplierBeshiNotun() throws InterruptedException {
        tabTally.click();
        btnFilter.click();
        inputCheckBoxBeshiToKom.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        Thread.sleep(3000);
    }

    public void supplierBeshipuraton() throws InterruptedException {
        tabTally.click();
        btnFilter.click();
        inputCheckBoxPuratonToNotun.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        Thread.sleep(3000);
        btnClearFilter.click();
    }

    /*
     *--------------------------------------
     *  Tagada Pathai
     * -------------------------------------
     */
    public boolean shareKoriInTagadaPathai(AndroidDriver driver) throws InterruptedException {
        btnTagadaPathai.click();
        objectTagadaPathaiLendenDetailsContainer.get(0).click();
        btnShareKori.click();
        Thread.sleep(3000);
        boolean isExternalLayoutVisible = objectExtraLayout.isDisplayed();
        System.out.println("share kori in tagada pathai " + isExternalLayoutVisible);
        Utils.saveScreenshot("After clicking share kori", driver);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        return isExternalLayoutVisible;
    }

    public String tallyMessageKiniInTagadaPathai() throws InterruptedException {
        btnTallyMessageKini.click();
        String tallyMessageKiniText = textToolbarTitleCustomerSupplierDeleteOrTallyMessageKini.getText();
        Utils.saveScreenshot("After clicking Tally message kini", driver);
        btnBack.click();
        return tallyMessageKiniText;
    }

    public String copyLinkInTagadaPathai() throws InterruptedException {
        btnCopyLink.click();
        String confirmAlert = alertSnackbarText.getText();     // should return পেমেন্ট লিংক কপি করা হয়েছে।
        Utils.saveScreenshot("After clicking copy link button", driver);
        return confirmAlert;
    }

    public void tagadaPathaiBatil() throws InterruptedException {
        btnTallyMessagePathai.click();
        Utils.saveScreenshot("After clicking tally message pathai", driver);
        btnBatilTallyMessage.click();
    }

    public String tagadaPathaiConfirm() throws InterruptedException {
        btnTallyMessagePathai.click();
        Utils.saveScreenshot("After clicking tally message pathai", driver);
        btnThikAcheTallyMessage.click();
        String textSMSCount = textTagadaSMSCount.getText();
        Utils.saveScreenshot("After clicking tally message pathai SMS count", driver);
        btnBack.click();
        Thread.sleep(2000);
        btnBack.click();
        return textSMSCount;
    }

    /*
     *--------------------------------------
     *  Report Customer/Supplier
     * -------------------------------------
     */
    public String tagadaPathaiDisabledInCustomerReport() throws InterruptedException {
        btnFilter.click();
        inputCheckBoxCustomer.click();
        btnNischit.click();
        //TODO need to change the index number according to serial of the customer
        objectCustomerDetailsContainer.get(objectCustomerDetailsContainer.size() - 1).click();
        btnKebab.click();
        Thread.sleep(2000);
        btnKebabMenuOptions.get(0).click();
        String isClickable = btnTagadaMessagePathaiWithBell.getAttribute("clickable");  // should return false;
        Utils.saveScreenshot("Tagada Message Pathai disable", driver);
        btnBack.click();
        Thread.sleep(2000);
        btnBack.click();
        return isClickable;
    }

    public String tagadaPathaiExistInKebabMenu() throws InterruptedException {
        objectCustomerDetailsContainer.get(0).click();
        btnKebab.click();
        Thread.sleep(2000);
        Utils.saveScreenshot("Tagada Message Pathai Exist In Kebab Menu", driver);
        btnKebabMenuOptions.get(0).click();
        String textTagadaSend = textTagadaPathateTapKorun.getText();
        btnBack.click();
        return textTagadaSend;
    }

    public String tagadaPathaiEnabledInCustomerReport() throws InterruptedException {
        btnKebab.click();
        Thread.sleep(2000);
        btnKebabMenuOptions.get(1).click();
        String isClickable = btnTagadaMessagePathaiWithBell.getAttribute("clickable");  // should return true;
        Utils.saveScreenshot("Tagada Message Pathai Enabled", driver);
        return isClickable;
    }

    public boolean cancelInfoInCustomerReport() {
        Utils.saveScreenshot("Before cancelling info", driver);
        btnCancelInfo.click();
        Utils.saveScreenshot("After cancelling info", driver);
        return !driver.findElements(By.id("com.progoti.tallykhata:id/iv_cancel")).isEmpty();     //should return false;
    }

    public String reportShareInCustomerReport() {
        btnRadioShareReport.click();
        String isChecked = btnRadioShareReport.getAttribute("checked");  // should return false;
        Utils.saveScreenshot("Report share off", driver);
        return isChecked;
    }

    public String isLendenClickableInCustomerReport() {
        //TODO need to change the index number according to serial
        String isClickable = objectTransactionItems.get(0).getAttribute("clickable");
        return isClickable;
    }

    public boolean reportDownloadInCustomerReport(AndroidDriver driver) throws InterruptedException {
        btnDownloadReport.click();
        textReportDownloadOptions.get(0).click();
        Thread.sleep(3000);
        boolean isExternalLayoutVisible = objectExtraLayout.isDisplayed();      // should return ture
        Utils.saveScreenshot("Report download", driver);
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr " + isExternalLayoutVisible);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        return isExternalLayoutVisible;
    }

    public boolean reportDownloadWithDateInCustomerReport(AndroidDriver driver) throws InterruptedException {
        btnDownloadReport.click();
        textReportDownloadOptions.get(textReportDownloadOptions.size() - 1).click();
        Utils.saveScreenshot("Report download selecting date", driver);
        inputStartDateSelectForDownloadReport.click();
        btnOkAfterDatePicking.click();
        inputEndDateSelectForDownloadReport.click();
        btnOkAfterDatePicking.click();
        Utils.saveScreenshot("Report download after selecting date", driver);
        btnDownloadReportInModal.click();
        Thread.sleep(3000);
        boolean isExternalLayoutVisible = objectExtraLayout.isDisplayed();      // should return ture
        Utils.saveScreenshot("Report downloaded", driver);
        System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmmmmrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr " + isExternalLayoutVisible);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        return isExternalLayoutVisible;
    }

    public String editLendenInCustomerReport() throws InterruptedException {
        //TODO need to change the index number according to serial adn need to calculate the mot pabo or mot debo.
        objectTransactionItems.get(objectTransactionItems.size() - 1).click();
        btnEditLendenJer.click();
        inputPurberBaki.clear();
        btnThree.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        Thread.sleep(2000);
        btnNischit.click();
        return textMotPaboValue.getText();
    }

    public String deleteLendenInCustomerReport() throws InterruptedException {
        objectCustomerDetailsContainer.get(0).click();
        btnKebab.click();
        Thread.sleep(2000);
        btnKebabMenuOptions.get(1).click();
        objectTransactionItems.get(1).click();
        Utils.saveScreenshot("Before clicking delete button", driver);
        btnDeleteLenden.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        textDeleteAlertMessage.getText();
        btnNischit.click();
        return textConfirmMessage.getText();
    }


    /*
     *--------------------------------------
     *  Edit/Delete Customer/Supplier
     * -------------------------------------
     */
    @Step("Disabled submit button on customer edit page with invalid name {0}")
    public boolean buttonInactiveOnInvalidName(String invalidName) throws InterruptedException {
        objectCustomerDetailsContainer.get(0).click();
        btnKebab.click();
        Thread.sleep(2000);
        btnKebabMenuOptions.get(btnKebabMenuOptions.size() - 2).click();
        inputCustomerOrSupplierNameInEditPage.clear();
        inputCustomerOrSupplierNameInEditPage.sendKeys(invalidName);
        boolean isBtnEnabled = btnNischit.isEnabled();
        Utils.saveScreenshot("Button Inactive On Invalid Name", driver);
        btnBack.click();
        return isBtnEnabled;
    }

    @Step("Disabled submit button on customer edit page with invalid number {0}")
    public boolean buttonInactiveOnInvalidPhone(String invalidPhone) throws InterruptedException {
        btnKebab.click();
        Thread.sleep(2000);
        btnKebabMenuOptions.get(btnKebabMenuOptions.size() - 2).click();
        inputCustomerOrSupplierMobileNumber.clear();
        inputCustomerOrSupplierMobileNumber.sendKeys(invalidPhone);
        boolean isBtnEnabled = btnNischit.isEnabled();
        Utils.saveScreenshot("Button Inactive On Invalid Phone", driver);
        btnBack.click();
        return isBtnEnabled;
    }

    @Step("Enabled submit button on customer edit page with valid name {0} and valid phone {1}")
    public String buttonActiveOnValidNamePhone(String name, String phone) throws InterruptedException {
        btnKebab.click();
        Thread.sleep(2000);
        btnKebabMenuOptions.get(btnKebabMenuOptions.size() - 2).click();
        inputCustomerOrSupplierNameInEditPage.clear();
        inputCustomerOrSupplierNameInEditPage.sendKeys(name);
        inputCustomerOrSupplierMobileNumber.clear();
        inputCustomerOrSupplierMobileNumber.sendKeys(phone);
        Utils.saveScreenshot("Button active On valid input", driver);
        btnNischit.click();
        Thread.sleep(2000);
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        return textConfirmationMessage.getText();
    }

    public void cancelDelete() throws InterruptedException {
        objectCustomerDetailsContainer.get(objectCustomerDetailsContainer.size() - 1).click();
        btnKebab.click();
        Thread.sleep(2000);
        btnKebabMenuOptions.get(btnKebabMenuOptions.size() - 1).click();
        Utils.saveScreenshot("before clicking Cancel delete", driver);
        btnCancelDeleteCustomerSupplier.click();
    }

    public String confirmDelete() throws InterruptedException {
        btnKebab.click();
        Thread.sleep(2000);
        btnKebabMenuOptions.get(btnKebabMenuOptions.size() - 1).click();
        btnDeleteCustomerSupplier.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        return textConfirmationMessage.getText();
    }

    /*
     *--------------------------------------
     *  Record share Medium Customer/Supplier
     * -------------------------------------
     */
    @Step("Search with a existing customer name {0} and update dilam {1} to share in messenger")
    public String shareRecordInImo(String existingCustomerName, String dilam) {
        inputSearchBox.sendKeys(existingCustomerName);
        objectCustomerDetailsContainer.get(0).click();
        inputDilam.sendKeys(dilam);
        btnRadioSendSMSDilamPelam.click();
        btnConfirmInDilamPelamAndLendenEdit.click();
        btnShareOptions.get(0).click();
        String textAlertUnavailableApp = textAlertNoAppToShareRecord.getText();
        Utils.saveScreenshot("Unavailable app alert", driver);
        return textAlertUnavailableApp;
    }

    public String shareRecordInMessenger() throws InterruptedException {
        btnShareOptions.get(1).click();
        btnSendRecordInMessenger.click();
        Utils.saveScreenshot("After sending message in messenger", driver);
        Thread.sleep(2000);
        btnBackFromMessenger.click();
        btnConfirmWindowClose.click();
        objectCustomerDetailsContainer.get(0).click();
        String textrecordSharedMedium = textrecordShareMedium.getText();
        Utils.saveScreenshot("Record Shared Medium in dilam/pelam page", driver);
        btnBack.click();
        return textrecordSharedMedium;
    }
}
