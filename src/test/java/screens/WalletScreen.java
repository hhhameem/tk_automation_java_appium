package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WalletScreen {
    public WalletScreen(AndroidDriver driver) {
         PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //    Main Menus(Tabs)
    @FindBy(id = "com.progoti.tallykhata:id/item_wallet")
    WebElement tabWallet;

    //    Wallet Main page elements
    @FindBy(id = "com.progoti.tallykhata:id/btnAction")
    WebElement btnAccountKhulun;

    //    Wallet Select option page elements
    @FindBy(id = "com.progoti.tallykhata:id/nid_layout")
    WebElement btnNIDErTottho;
    @FindBy(id = "com.progoti.tallykhata:id/selfie_layout")
    WebElement btnSelfie;
    @FindBy(id = "com.progoti.tallykhata:id/txt_skip")
    WebElement txtPoreTulbo;
    @FindBy(id = "com.progoti.tallykhata:id/toolbar_button")
    WebElement btnBackInOptionPage;

    //    Wallet NID Front page Modal elements
    @FindBy(id = "com.progoti.tallykhata:id/start_capureNid")
    WebElement btnThikAcheToCaptureNid;

    //    Wallet NID Front and Back page camera elements
    @FindBy(id = "com.progoti.tallykhata:id/tv_title")
    WebElement textNidErSamnerDikOrPichonerDik;
    @FindBy(id = "com.progoti.tallykhata:id/fabCapturePhoto")
    WebElement btnCapturePhoto;
    @FindBy(id = "com.progoti.tallykhata:id/snackbar_text")
    WebElement textWarningSnackbar;
    @FindBy(id = "com.progoti.tallykhata:id/btn_back")
    WebElement btnBackInCameraPage;
    @FindBy(id = "com.progoti.tallykhata:id/image_preview_confirmation_msg")
    WebElement textImagePreviewConfirm;
    @FindBy(id = "com.progoti.tallykhata:id/btn_tick_right")
    WebElement btnImagePreviewConfirm;

    //    Wallet NID Front page image processing elements
    @FindBy(id = "com.progoti.tallykhata:id/loaderAnimationView")
    WebElement loaderProcessKoraHocche;
    @FindBy(id = "com.progoti.tallykhata:id/tvStatus")
    WebElement textProcessKoraHocche;

    //    Wallet NID Front page Modal after image processing elements
    @FindBy(id = "com.progoti.tallykhata:id/okBtn")
    WebElement btnThikAcheAfterImageProcessingError;
    @FindBy(id = "com.progoti.tallykhata:id/tv_err_msg")
    WebElement textKonoEktaSomossaHoyeche;

    //    Wallet NID  info page
    @FindBy(id = "com.progoti.tallykhata:id/nidNo")
    WebElement textNidNo;
    @FindBy(id = "com.progoti.tallykhata:id/nid_correct_button")
    WebElement btnNischitInNidInfoPage;

    //    Wallet Selfie Modal elements
    @FindBy(id = "com.progoti.tallykhata:id/start_selfie")
    WebElement btnThikAcheToCaptureSelfie;

    //    Wallet PIN page
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.TextView[1]")
    WebElement inputFirstPin;
    @FindBy(id = "com.progoti.tallykhata:id/btnNext")
    WebElement btnNischitPinPage;
}
