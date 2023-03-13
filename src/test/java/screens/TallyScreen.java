package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
    @FindBy(id = "com.progoti.tallykhata:id/item_menu")
    WebElement tabMenu;
    @FindBy(id = "com.progoti.tallykhata:id/tv_title")
    List<WebElement> tabMenuOptions;
    @FindBy(id = "com.progoti.tallykhata:id/ivDataBackup")
    WebElement btnDataBackup;
    @FindBy(id = "com.progoti.tallykhata:id/tvDataBackupMessage")
    WebElement textDataBackupMessage;

    // Common elements throughout the tally tab
    @FindBy(id = "com.progoti.tallykhata:id/btnConfirm")
    WebElement btnNischit;
    @FindBy(id = "com.progoti.tallykhata:id/iv_settings")
    WebElement btnKebab;
    @FindBy(id = "com.progoti.tallykhata:id/title")
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
    public List<WebElement> objectCustomerOrSupplierDetailsContainer;
    @FindBy(id = "com.progoti.tallykhata:id/layoutCustomerInfo")
    List<WebElement> objectCustomerOrSupplierInfoContainer;
    @FindBy(id = "com.progoti.tallykhata:id/tvAmount")
    WebElement textCustomerAndSupplierAmountValue;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]")
    WebElement textSupplierName;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
    WebElement textCustomerName;

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
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" + "android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" + "androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.RelativeLayout")
    WebElement objectSeventhContact;
    @FindBy(xpath =
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" + "android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/" + "androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[8]/android.widget.RelativeLayout")
    WebElement objectEighthContact;
    @FindBy(id = "com.progoti.tallykhata:id/tvConfirmationMessageForCustomer")
    WebElement textConfirmMessageAfterSupplierOrCustomerCreation;

    // Dilam/Pelam update page elements
    @FindBy(id = "com.progoti.tallykhata:id/tvCreditType")
    WebElement textCreditType;
    @FindBy(id = "com.progoti.tallykhata:id/tvCreditAmount")
    WebElement textCreditAmountValue;
    @FindBy(id = "com.progoti.tallykhata:id/tv_last_share_medium_name")
    WebElement textRecordShareMedium;
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
    @FindBy(id = "com.whatsapp:id/contactpicker_text_container")
    List<WebElement> btnContactListToSendRecordInWhatsapp;
    @FindBy(id = "com.whatsapp:id/send")
    WebElement btnSendRecordInWhatsapp;
    @FindBy(id = "com.whatsapp:id/whatsapp_toolbar_home")
    WebElement btnBackFromWhatsapp;

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

    @Step("Create customer from phonebook and change name to {0}")
    public String addCustomerFromPhoneBook(String nameToChange) {
        tabTally.click();
        btnCustomerJogKori.click();
        btnPhoneBookThekeJogKori.click();
        objectEighthContact.click();
        inputCustomerOrSupplierName.clear();
        inputCustomerOrSupplierName.sendKeys(nameToChange);
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


    @Step("Create customer with name {0} number {1} jer {2}")
    public String addCustomerWithJerZero(String name, String number, String jerZero) {
        tabTally.click();
        btnCustomerJogKori.click();
        inputCustomerOrSupplierName.sendKeys(name);
        inputCustomerOrSupplierMobileNumber.sendKeys(number);
        inputPurberBaki.click();
        inputPurberBaki.sendKeys(jerZero);
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        return textConfirmMessageAfterSupplierOrCustomerCreation.getText();
    }

    @Step("Create customer from phonebook with name {1}, number and jer {0}")
    public String addCustomerFromPhoneBookWithJer(String jer, String nameToChange) {
        tabTally.click();
        btnCustomerJogKori.click();
        btnPhoneBookThekeJogKori.click();
        objectSeventhContact.click();
        inputCustomerOrSupplierName.clear();
        inputCustomerOrSupplierName.sendKeys(nameToChange);
        inputPurberBaki.sendKeys(jer);
        btnRadioSendSMSEnabled.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        return textConfirmMessageAfterSupplierOrCustomerCreation.getText();
    }

    @Step("Create customer with name {0}, number {1} and jer {2} along with photo and date")
    public String addCustomerWithJerPhotoDate(AndroidDriver driver, String name, String number, String jer) throws InterruptedException {
        tabTally.click();
        btnCustomerJogKori.click();
        inputCustomerOrSupplierName.sendKeys(name);
        inputCustomerOrSupplierMobileNumber.sendKeys(number);
        inputPurberBaki.click();
        inputPurberBaki.sendKeys(jer);
        btnRadioSendSMSEnabled.click();
        Thread.sleep(500);
        btnDatePicker.click();
        btnOkAfterDatePicking.click();
        Thread.sleep(1000);
        btnOpenCamera.click();
        Thread.sleep(1000);
        btnClickPhoto.click();
        Thread.sleep(1000);
        btnAcceptClickedPhoto.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        return textConfirmMessageAfterSupplierOrCustomerCreation.getText();
    }

    @Step("Create customer from phonebook with name {1}, number and jer {0} along with photo and date")
    public String addCustomerFromPhoneBookWithJerPhotoDate(String jer, String nameToChange) throws InterruptedException {
        tabTally.click();
        btnCustomerJogKori.click();
        btnPhoneBookThekeJogKori.click();
        objectSixthContact.click();
        inputCustomerOrSupplierName.clear();
        inputCustomerOrSupplierName.sendKeys(nameToChange);
        inputPurberBaki.sendKeys(jer);
        btnRadioSendSMSEnabled.click();
        Thread.sleep(500);
        btnDatePicker.click();
        btnOkAfterDatePicking.click();
        Thread.sleep(1000);
        btnOpenCamera.click();
        Thread.sleep(1000);
        btnClickPhoto.click();
        Thread.sleep(1000);
        btnAcceptClickedPhoto.click();
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

    public String addCustomerFromPhoneBookWithInvalidName() {
        tabTally.click();
        btnCustomerJogKori.click();
        btnPhoneBookThekeJogKori.click();
        objectFirstContact.click();
        String alertText = alertSnackbarText.getText();
        Utils.saveScreenshot("After selecting contact with invalid name", driver);
        btnBack.click();
        return alertText;
    }

    public String addCustomerFromPhoneBookWithInvalidNumber() {
        tabTally.click();
        btnCustomerJogKori.click();
        btnPhoneBookThekeJogKori.click();
        objectSecondContact.click();
        String alertText = alertSnackbarText.getText();
        Utils.saveScreenshot("After selecting contact with invalid number", driver);
        btnBack.click();
        return alertText;
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


    @Step("Create supplier from phonebook and change name to {0}")
    public String addSupplierFromPhoneBook(String nameToChange) {
        tabTally.click();
        btnCustomerJogKori.click();
        tabSupplier.click();
        btnPhoneBookThekeJogKori.click();
        objectFifthContact.click();
        inputCustomerOrSupplierName.clear();
        inputCustomerOrSupplierName.sendKeys(nameToChange);
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


    @Step("Create supplier with valid name {0}, valid number {1} and jer {2}")
    public String addSupplierWithJerZero(String name, String number, String jerZero) {
        tabTally.click();
        btnCustomerJogKori.click();
        tabSupplier.click();
        inputCustomerOrSupplierName.sendKeys(name);
        inputCustomerOrSupplierMobileNumber.sendKeys(number);
        inputPurberBaki.click();
        inputPurberBaki.sendKeys(jerZero);
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        return textConfirmMessageAfterSupplierOrCustomerCreation.getText();
    }

    @Step("Create supplier from phonebook with valid name {1},valid number and jer {0}")
    public String addSupplierFromPhoneBookWithJer(String jer, String nameToChange) {
        tabTally.click();
        btnCustomerJogKori.click();
        tabSupplier.click();
        btnPhoneBookThekeJogKori.click();
        objectFourthContact.click();
        inputCustomerOrSupplierName.clear();
        inputCustomerOrSupplierName.sendKeys(nameToChange);
        inputPurberBaki.sendKeys(jer);
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        return textConfirmMessageAfterSupplierOrCustomerCreation.getText();
    }

    @Step("Create supplier with name {0}, number {1} and jer {2} along with photo and date")
    public String addSupplierWithJerPhotoAndDate(AndroidDriver driver, String name, String number, String jer) throws InterruptedException {
        tabTally.click();
        btnCustomerJogKori.click();
        tabSupplier.click();
        inputCustomerOrSupplierName.sendKeys(name);
        inputCustomerOrSupplierMobileNumber.sendKeys(number);
        inputPurberBaki.click();
        inputPurberBaki.sendKeys(jer);
        btnDatePicker.click();
        btnOkAfterDatePicking.click();
        Thread.sleep(1000);
        btnOpenCamera.click();
        Thread.sleep(1000);
        btnClickPhoto.click();
        Thread.sleep(1000);
        btnAcceptClickedPhoto.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        return textConfirmMessageAfterSupplierOrCustomerCreation.getText();
    }

    @Step("Create supplier from phonebook with name {1}, number, jer {0} along with photo and date")
    public String addSupplierFromPhoneBookWithJerPhotoAndDate(String jer, String nameToChange) throws InterruptedException {
        tabTally.click();
        btnCustomerJogKori.click();
        tabSupplier.click();
        btnPhoneBookThekeJogKori.click();
        objectThirdContact.click();
        inputCustomerOrSupplierName.clear();
        inputCustomerOrSupplierName.sendKeys(nameToChange);
        inputPurberBaki.click();
        inputPurberBaki.sendKeys(jer);
        btnDatePicker.click();
        btnOkAfterDatePicking.click();
        Thread.sleep(1000);
        btnOpenCamera.click();
        Thread.sleep(1000);
        btnClickPhoto.click();
        Thread.sleep(1000);
        btnAcceptClickedPhoto.click();
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

    public String addSupplierFromPhoneBookWithInvalidName() {
        tabTally.click();
        btnCustomerJogKori.click();
        tabSupplier.click();
        btnPhoneBookThekeJogKori.click();
        objectFirstContact.click();
        String alertText = alertSnackbarText.getText();
        Utils.saveScreenshot("After selecting contact with invalid name", driver);
        btnBack.click();
        return alertText;
    }

    public String addSupplierFromPhoneBookWithInvalidNumber() {
        tabTally.click();
        btnCustomerJogKori.click();
        tabSupplier.click();
        btnPhoneBookThekeJogKori.click();
        objectSecondContact.click();
        String alertText = alertSnackbarText.getText();
        Utils.saveScreenshot("After selecting contact with invalid number", driver);
        btnBack.click();
        return alertText;
    }


    /*
     * --------------------------------------
     *  Update Dilam/pelam of customer
     * -------------------------------------
     */
    @Step("Update customer dilam beshi {0}, pelam kom {1}, biboron {2}")
    public String customerDilamBeshiPelamKom(String dilam, String pelam, String biboron) throws InterruptedException {
        tabTally.click();
        btnFilter.click();
        inputCheckBoxCustomer.click();
        btnNischit.click();
        objectCustomerOrSupplierDetailsContainer.get(0).click();
        inputDilam.sendKeys(dilam);
        inputPelam.sendKeys(pelam);
        inputBiboron.sendKeys(biboron);
        btnRadioSendSMSDilamPelam.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnConfirmInDilamPelamAndLendenEdit.click();
        Utils.saveScreenshot("After clicking confirm button", driver);
        btnConfirmWindowClose.click();
        Thread.sleep(2000);
        return textMotPaboValue.getText();
    }

    @Step("Update customer dilam kom {0}, pelam beshi {1}, biboron {2}")
    public String customerDilamKomPelamBeshi(String dilam, String pelam, String biboron) throws InterruptedException {
        tabTally.click();
        btnClearFilter.click();
        Thread.sleep(2000);
        objectCustomerOrSupplierDetailsContainer.get(0).click();
        inputDilam.sendKeys(dilam);
        inputPelam.sendKeys(pelam);
        inputBiboron.sendKeys(biboron);
        btnRadioSendSMSDilamPelam.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnConfirmInDilamPelamAndLendenEdit.click();
        Utils.saveScreenshot("After clicking confirm button", driver);
        btnConfirmWindowClose.click();
        Thread.sleep(2000);
        return textMotPaboValue.getText();
    }

    @Step("Update customer dilam {0}, pelam {1} soman, biboron {2}")
    public String customerDilamPelamSoman(String dilam, String pelam, String biboron) throws InterruptedException {
        tabTally.click();
        objectCustomerOrSupplierDetailsContainer.get(0).click();
        inputDilam.sendKeys(dilam);
        inputPelam.sendKeys(pelam);
        inputBiboron.sendKeys(biboron);
        btnRadioSendSMSDilamPelam.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnConfirmInDilamPelamAndLendenEdit.click();
        Utils.saveScreenshot("After clicking confirm button", driver);
        btnConfirmWindowClose.click();
        Thread.sleep(2000);
        return textMotPaboValue.getText();
    }

    /*
     *--------------------------------------
     *  Update Dilam/pelam of supplier
     * -------------------------------------
     */
    @Step("Update supplier dilam beshi {0}, pelam kom {1}, biboron {2}")
    public String supplierDilamBeshiPelamKom(String dilam, String pelam, String biboron) throws InterruptedException {
        tabTally.click();
        btnFilter.click();
        inputCheckBoxSupplier.click();
        btnNischit.click();
        objectCustomerOrSupplierDetailsContainer.get(0).click();
        inputDilam.sendKeys(dilam);
        inputPelam.sendKeys(pelam);
        inputBiboron.sendKeys(biboron);
        btnRadioSendSMSDilamPelam.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnConfirmInDilamPelamAndLendenEdit.click();
        Utils.saveScreenshot("After clicking confirm button", driver);
        btnConfirmWindowClose.click();
        Thread.sleep(2000);
        return textMotPaboValue.getText();
    }

    @Step("Update supplier dilam kom {0}, pelam beshi {1}, biboron {2}")
    public String supplierDilamKomPelamBeshi(String dilam, String pelam, String cashBecha, String biboron) throws InterruptedException {
        tabTally.click();
        btnClearFilter.click();
        Thread.sleep(2000);
        objectCustomerOrSupplierDetailsContainer.get(0).click();
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
        Thread.sleep(2000);
        return textMotPaboValue.getText();
    }

    @Step("Update supplier dilam {0}, pelam {1} soman, biboron {2}")
    public String supplierDilamPelamSoman(String dilam, String pelam, String biboron) throws InterruptedException {
        tabTally.click();
        objectCustomerOrSupplierDetailsContainer.get(0).click();
        inputDilam.sendKeys(dilam);
        inputPelam.sendKeys(pelam);
        inputBiboron.sendKeys(biboron);
        btnRadioSendSMSDilamPelam.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnConfirmInDilamPelamAndLendenEdit.click();
        Utils.saveScreenshot("After clicking confirm button", driver);
        btnConfirmWindowClose.click();
        Thread.sleep(2000);
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
        int customerLength = objectCustomerOrSupplierDetailsContainer.size();
        Utils.saveScreenshot("existing name", driver);
        inputSearchBox.clear();
        return customerLength;
    }

    @Step("search with a name {0} that doesn't exist")
    public boolean searchWithNameThatDontExist(String name) {
        tabTally.click();
        inputSearchBox.sendKeys(name);
        boolean doesCustomerExist = objectCustomerOrSupplierDetailsContainer.isEmpty();
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
    public String customerKomToBeshi() throws InterruptedException {
        tabTally.click();
        btnFilter.click();
        inputCheckBoxCustomer.click();
        Thread.sleep(1000);
        inputCheckBoxKomToBeshi.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        Thread.sleep(2000);
        Utils.saveScreenshot("After clicking confirm button", driver);
        return textCustomerName.getText();
    }

    public String customerBeshiToKom() throws InterruptedException {
        tabTally.click();
        btnFilter.click();
        inputCheckBoxBeshiToKom.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        Thread.sleep(2000);
        Utils.saveScreenshot("After clicking confirm button", driver);
        return textCustomerName.getText();
    }

    public String customerNotunToPuraton() throws InterruptedException {
        tabTally.click();
        btnFilter.click();
        inputCheckBoxNotunToPuraton.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        Thread.sleep(2000);
        Utils.saveScreenshot("After clicking confirm button", driver);
        return textCustomerName.getText();
    }

    public String customerPuratonToNotun() throws InterruptedException {
        tabTally.click();
        btnFilter.click();
        inputCheckBoxPuratonToNotun.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        Thread.sleep(2000);
        Utils.saveScreenshot("After clicking confirm button", driver);
        return textCustomerName.getText();
    }

    public String supplierKomToBeshi() throws InterruptedException {
        tabTally.click();
        btnClearFilter.click();
        Thread.sleep(1000);
        btnFilter.click();
        inputCheckBoxSupplier.click();
        Thread.sleep(1000);
        inputCheckBoxKomToBeshi.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        Thread.sleep(2000);
        Utils.saveScreenshot("After clicking confirm button", driver);
        return textSupplierName.getText();
    }

    public String supplierBeshiToKom() throws InterruptedException {
        tabTally.click();
        btnFilter.click();
        inputCheckBoxBeshiToKom.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        Thread.sleep(2000);
        Utils.saveScreenshot("After clicking confirm button", driver);
        return textSupplierName.getText();
    }

    public String supplierNotunToPuraton() throws InterruptedException {
        tabTally.click();
        btnFilter.click();
        inputCheckBoxNotunToPuraton.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        Thread.sleep(2000);
        Utils.saveScreenshot("After clicking confirm button", driver);
        return textSupplierName.getText();
    }

    public String supplierPuratonToNotun() throws InterruptedException {
        tabTally.click();
        btnFilter.click();
        inputCheckBoxPuratonToNotun.click();
        Utils.saveScreenshot("Before clicking confirm button", driver);
        btnNischit.click();
        Thread.sleep(2000);
        Utils.saveScreenshot("After clicking confirm button", driver);
        return textSupplierName.getText();
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

    public boolean unavailableLinkInTagadaPathai() throws InterruptedException {
        boolean isUnavailable = driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget" +
                ".LinearLayout/android" +
                ".widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android" +
                ".widget.LinearLayout[2]/android.view.ViewGroup/android.widget.LinearLayout/android.widget" +
                ".LinearLayout/android.widget.ImageView")).isEmpty();
        Utils.saveScreenshot("Tagada pathai link unavailable", driver);
        return isUnavailable;
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
     *  Report Customer
     * -------------------------------------
     */
    public String tagadaPathaiDisabledInCustomerReport() throws InterruptedException {
        btnFilter.click();
        inputCheckBoxCustomer.click();
        btnNischit.click();
        objectCustomerOrSupplierDetailsContainer.get(objectCustomerOrSupplierDetailsContainer.size() - 1).click();
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
        objectCustomerOrSupplierDetailsContainer.get(0).click();
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
        objectCustomerOrSupplierDetailsContainer.get(0).click();
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
    public boolean isTagadaPathaiAvailableInCustomerReportKebabMenu() throws InterruptedException {
        objectCustomerOrSupplierDetailsContainer.get(objectCustomerOrSupplierDetailsContainer.size() - 1).click();
        btnKebab.click();
        Thread.sleep(2000);
        boolean isTagadaPathaiAvailable = btnKebabMenuOptions.contains("তাগাদা পাঠাই");     // should return false
        Utils.saveScreenshot("After clicking kebab menu", driver);
        return isTagadaPathaiAvailable;
    }

    @Step("Disabled submit button on customer edit page with invalid name {0}")
    public boolean buttonInactiveOnInvalidName(String invalidName) throws InterruptedException {
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
        objectCustomerOrSupplierDetailsContainer.get(objectCustomerOrSupplierDetailsContainer.size() - 1).click();
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
     *  Report Supplier
     * -------------------------------------
     */
    public boolean isTagadaPathaiAvailableInSupplierReportKebabMenu() throws InterruptedException {
        btnClearFilter.click();
        Thread.sleep(1000);
        btnFilter.click();
        inputCheckBoxSupplier.click();
        btnNischit.click();
        objectCustomerOrSupplierDetailsContainer.get(0).click();
        btnKebab.click();
        Thread.sleep(2000);
        boolean isTagadaPathaiAvailable = btnKebabMenuOptions.contains("তাগাদা পাঠাই");     // should return false
        return isTagadaPathaiAvailable;
    }

    public boolean isTagadaPathaiAvailableInSupplierReport() throws InterruptedException {
        btnKebabMenuOptions.get(0).click();
        Thread.sleep(2000);
        boolean isTagadaPathaiAvailable =
                !driver.findElements(By.id("com.progoti.tallykhata:id/tagadaLayer")).isEmpty();   //should return false
        btnBack.click();
        Thread.sleep(2000);
        btnBack.click();
        btnClearFilter.click();
        return isTagadaPathaiAvailable;
    }

    /*
     *--------------------------------------
     *  Record share Medium Customer
     * -------------------------------------
     */
    @Step("Search with a existing customer name {0} and update dilam {1} to share in Whatsapp but not available")
    public String shareRecordInMessenger(String existingCustomerName, String dilam) {
        inputSearchBox.sendKeys(existingCustomerName);
        objectCustomerOrSupplierDetailsContainer.get(0).click();
        inputDilam.sendKeys(dilam);
        btnRadioSendSMSDilamPelam.click();
        btnConfirmInDilamPelamAndLendenEdit.click();
        btnShareOptions.get(3).click();
        String textAlertUnavailableApp = textAlertNoAppToShareRecord.getText();
        Utils.saveScreenshot("Unavailable app alert", driver);
        return textAlertUnavailableApp;
    }

    public String shareRecordInWhatsapp(AndroidDriver driver) throws InterruptedException {
        btnShareOptions.get(2).click();
        btnContactListToSendRecordInWhatsapp.get(1).click();
        btnSendRecordInWhatsapp.click();
        Thread.sleep(3000);
        btnSendRecordInWhatsapp.click();
        Thread.sleep(2000);
        Utils.saveScreenshot("After sending message in whatsapp", driver);
        btnBackFromWhatsapp.click();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        objectCustomerOrSupplierDetailsContainer.get(0).click();
        String textRecordSharedMedium = textRecordShareMedium.getText();
        Utils.saveScreenshot("Record Shared Medium in dilam/pelam page", driver);
        btnBack.click();
        return textRecordSharedMedium;
    }

    /*
     *--------------------------------------
     *  Copy Tagada Message Link After D2S
     * -------------------------------------
     */
    public String D2S(AndroidDriver driver) throws InterruptedException {
        tabMenu.click();
        Thread.sleep(2000);
        tabMenuOptions.get(7).click();
        btnDataBackup.click();
        Thread.sleep(5000);
        String dataBackupMessage = textDataBackupMessage.getText();
        btnBack.click();
        Utils.tapByCoordinate(driver, 100, 500);
        return dataBackupMessage;
    }
    public String CopyLink() throws InterruptedException {
        btnTagadaPathai.click();
        objectTagadaPathaiLendenDetailsContainer.get(0).click();
        btnCopyLink.click();
        String confirmAlert = alertSnackbarText.getText();     // should return পেমেন্ট লিংক কপি করা হয়েছে।
        Utils.saveScreenshot("After clicking copy tagada pathai link", driver);
        return confirmAlert;
    }
}