package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WalletScreen {
    AndroidDriver driver;

    public WalletScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    //    Main Menus(Tabs)
    @FindBy(id = "com.progoti.tallykhata:id/item_wallet")
    WebElement tabWallet;
    @FindBy(id = "com.progoti.tallykhata:id/item_menu")
    WebElement tabMenu;
    @FindBy(id = "com.progoti.tallykhata:id/tv_title")
    List<WebElement> tabMenuOptions;

    //    Wallet Main page elements
    @FindBy(id = "com.progoti.tallykhata:id/img_service")
    List<WebElement> btnWalletOptions;      //index 1 for mobile recharge


    //    Common elements
    @FindBy(id = "com.progoti.tallykhata:id/back_button")
    WebElement btnBack;


    //    Mobile recharge elements
    @FindBy(id = "com.progoti.tallykhata:id/etNumberInput")
    WebElement inputMobileNumber;
    @FindBy(id = "com.progoti.tallykhata:id/textinput_error")
    public WebElement textInputErrorMessage;
    @FindBy(id = "com.progoti.tallykhata:id/btnNextTW")
    WebElement btnNextArrow;
    @FindBy(id = "com.progoti.tallykhata:id/tv_account_no")
    WebElement textAccountNumberInMobileNumberPage;       // use this id for accessing element in amar number section
    @FindBy(id = "com.progoti.tallykhata:id/tv_txn_name")
    List<WebElement> textAccountNameInMobileNumberPage;       // use this id for accessing element in recent recharge section
    @FindBy(id = "com.progoti.tallykhata:id/tv_recharge_message")
    WebElement textInfoMessageInScreen;
    @FindBy(id = "com.progoti.tallykhata:id/tv_contact_name")
    WebElement textContactName;
    @FindBy(id = "com.progoti.tallykhata:id/tv_contact_no")
    WebElement textContactNumber;
    @FindBy(id = "com.progoti.tallykhata:id/iv_operator_thumb")
    List<WebElement> operators;
    @FindBy(id = "com.progoti.tallykhata:id/radio_prepaid")
    WebElement btnRadioPrepaid;
    @FindBy(id = "com.progoti.tallykhata:id/radio_post_paid")
    WebElement btnRadioPostpaid;
    @FindBy(id = "com.progoti.tallykhata:id/radio_skitto")
    WebElement btnRadioSkitto;
    @FindBy(id = "com.progoti.tallykhata:id/btnOk")
    WebElement btnThikAche;
    @FindBy(id = "com.progoti.tallykhata:id/ic_down_arrow")
    WebElement btnToChangeOperator;
    @FindBy(id = "com.progoti.tallykhata:id/etTkInput")
    WebElement inputRechargeAmount;
    @FindBy(id = "com.progoti.tallykhata:id/btn_taka")
    List<WebElement> btnFrequentRechargeAmount;
//    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"টাকা\"]")
    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"\u099F\u09BE\u0995\u09BE\"]")
    WebElement tabTaka;
    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"বান্ডেল\"]")
    WebElement tabBundle;
    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"ইন্টারনেট\"]")
    WebElement tabInternet;
//    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"মিনিট\"]")
    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"\u09AE\u09BF\u09A8\u09BF\u099F\"]")
    WebElement tabMinute;
//    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"কলরেট\"]")
    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"\u0995\u09B2\u09B0\u09C7\u099F\"]")
    WebElement tabCallRate;
    @FindBy(id = "com.progoti.tallykhata:id/tv_title_offer_info")
    WebElement btnOfferInfo;
    @FindBy(id = "com.progoti.tallykhata:id/tv_offer_info")
    WebElement textOfferInfoInBottomSheet;
    @FindBy(id = "com.progoti.tallykhata:id/tv_empty_item")
    WebElement textNoPackagesAvailable;
    @FindBy(id = "com.progoti.tallykhata:id/cl_root")
    List<WebElement> rechargePackagesList;
    @FindBy(id = "com.progoti.tallykhata:id/tv_discount")
    WebElement textPackageOfferTag;
    @FindBy(id = "com.progoti.tallykhata:id/tv_minute")
    WebElement textPackageDetails;
    @FindBy(id = "com.progoti.tallykhata:id/tv_mb")
    WebElement textPackageDetailsInPinPage;
    @FindBy(id = "com.progoti.tallykhata:id/tv_day")
    WebElement textPackageValidity;
    @FindBy(id = "com.progoti.tallykhata:id/tv_bonus_cash_back")
    WebElement textPackageBonusCashback;
    @FindBy(id = "com.progoti.tallykhata:id/tv_amount")
    WebElement textPackageFee;
    @FindBy(id = "com.progoti.tallykhata:id/tv_alert_message")
    WebElement textErrorInsufficientBalance;
    @FindBy(id = "com.progoti.tallykhata:id/tv_server_error_mssg")
    WebElement textErrorWrongPin;
    @FindBy(id = "com.progoti.tallykhata:id/button")
    WebElement btnCloseErrorInsufficientBalanceOrWrongPin;
    @FindBy(id = "com.progoti.tallykhata:id/etPinInput")
    WebElement inputPin;
    @FindBy(id = "com.progoti.tallykhata:id/btnNext")
    WebElement btnNextAfterAmountAndPin;
    @FindBy(id = "com.progoti.tallykhata:id/successTitle")
    WebElement textSuccessMessage;
    @FindBy(id = "com.progoti.tallykhata:id/btnReturnHome")
    WebElement btnThikAcheInSuccessPage;



    public boolean arrowButtonDisabledForInvalidPhoneNumber(String invalidPhoneNumber) {
        tabWallet.click();
        btnWalletOptions.get(1).click();
        inputMobileNumber.sendKeys(invalidPhoneNumber);
        return btnNextArrow.isEnabled();
    }

    public String errorInputMessageForInvalidPhoneNumber() {
        String errorMessage = textInputErrorMessage.getText();
        inputMobileNumber.clear();
        return errorMessage;
    }

    public String infoMessageInScreenForNewValidNumber(String validPhoneNumber) {
        inputMobileNumber.sendKeys(validPhoneNumber);
        return textInfoMessageInScreen.getText();
    }

    public boolean arrowButtonEnabledForValidPhoneNumber() {
        boolean isArrowEnabled = btnNextArrow.isEnabled();
        btnNextArrow.click();
        return isArrowEnabled;
    }

    public String selectOperatorAndConnectionType() {
        String numberToRecharge = textContactNumber.getText();
        btnRadioPrepaid.click();
        btnThikAche.click();
        return numberToRecharge;
    }

    public String insufficientBalanceErrorMessage(String insufficientAmountToRecharge) {
        inputRechargeAmount.sendKeys(insufficientAmountToRecharge);
        return textInputErrorMessage.getText();
    }

    public boolean porobortiButtonDisabledForInsufficientBalance() {
        boolean isButtonDisabled =  btnNextAfterAmountAndPin.isEnabled();
        inputRechargeAmount.clear();
        return isButtonDisabled;
    }

    public String rechargeAmountSameInPinPage(String rechargeAmount) {
        inputRechargeAmount.sendKeys(rechargeAmount);
        btnNextAfterAmountAndPin.click();
        return textPackageFee.getText();
    }

    public boolean buttonDisabledForPinLessThanFour(String pinLessThanFour) {
        inputPin.sendKeys(pinLessThanFour);
        boolean isButtonDisabled = btnNextAfterAmountAndPin.isEnabled();
        inputPin.clear();
        return isButtonDisabled;
    }

    public String errorMessageForWrongPin(String wrongPin) {
        inputPin.sendKeys(wrongPin);
        String errorMessage = textErrorWrongPin.getText();
        btnCloseErrorInsufficientBalanceOrWrongPin.click();
        inputPin.clear();
        return errorMessage;
    }

    public String rechargeSuccessful(String correctPin) {
        inputPin.sendKeys(correctPin);
        btnNextAfterAmountAndPin.click();
        String successMessage = textSuccessMessage.getText();
        btnThikAcheInSuccessPage.click();
        return successMessage;
    }

    public boolean frequentRechargeAmountVisible() {
        btnWalletOptions.get(1).click();
        textAccountNumberInMobileNumberPage.click();
        btnThikAche.click();
        return btnFrequentRechargeAmount.size() >= 1;
    }

    public String rechargeFromFrequentRechargeAmount(String pin) {
        btnFrequentRechargeAmount.get(0).click();
        inputPin.sendKeys(pin);
        btnNextAfterAmountAndPin.click();
        String successMessage = textSuccessMessage.getText();
        btnThikAcheInSuccessPage.click();
        return successMessage;
    }

    public String noPackageAvailable(String gpPhoneNumber) {
        btnWalletOptions.get(1).click();
        inputMobileNumber.sendKeys(gpPhoneNumber);
        btnRadioSkitto.click();
        btnThikAche.click();
        tabCallRate.click();
        return textNoPackagesAvailable.getText();
    }

    public String rechargeBundlePackage(String pin) {
        btnToChangeOperator.click();
        btnRadioPrepaid.click();
        btnThikAche.click();
        tabBundle.click();
        rechargePackagesList.get(0).click();
        inputPin.sendKeys(pin);
        btnNextAfterAmountAndPin.click();
        String successMessage = textSuccessMessage.getText();
        btnThikAcheInSuccessPage.click();
        return successMessage;
    }

}
