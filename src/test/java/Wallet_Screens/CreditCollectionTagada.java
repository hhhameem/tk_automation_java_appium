package Wallet_Screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

import java.util.List;

public class CreditCollectionTagada {

    AndroidDriver driver;

    public CreditCollectionTagada(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }
    @FindBy(id = "com.progoti.tallykhata:id/et_mobile_number")
    WebElement mobile_number;

    @FindBy(id = "com.progoti.tallykhata:id/btn_next")
    WebElement nexr_btn;

    @FindBy(id = "com.progoti.tallykhata:id/toolbar_title")
    //WebElement one = driver.findElement(By.id("com.google.android.calculator:id/digit_1"));
    WebElement business_name;


//    @FindBy(className = "android.view.ViewGroup")
//    List<WebElement>  otp_input;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[1]")
    WebElement otp1;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[2]")
    WebElement otp2;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[3]")
    WebElement otp3;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[4]")
    WebElement otp4;


    @FindBy(id = "com.progoti.tallykhata:id/btnNext")
    WebElement confirm_btn;

    @FindBy(id = "com.progoti.tallykhata:id/select_current_mobile")
    WebElement current_mobile;

    @FindBy(id = "com.progoti.tallykhata:id/btn_confirm")
    WebElement mobile_confirm;



    //pin confirm

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[1]")
    WebElement pin1;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[2]")
    WebElement pin2;

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[3]")
    WebElement pin3;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[4]")
    WebElement pin4;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Dismiss update dialogue\"]")
    WebElement dismiss_dialog;


    @FindBy(id = "com.progoti.tallykhata:id/item_wallet")
    WebElement wallet_btn;

    @FindBy(id = "com.progoti.tallykhata:id/cl_baki_adai")
    WebElement credit_collection_btn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    WebElement selected_customer;

    @FindBy(id = "com.progoti.tallykhata:id/layoutSendSms")
    WebElement send_tallymsg_btn;

    @FindBy(id = "com.progoti.tallykhata:id/button")
    WebElement thik_ace_btn;

    //share message

    @FindBy(id = "com.progoti.tallykhata:id/layoutShare")
    WebElement share_kori_btn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[1]")
    List<WebElement> message_option;

    @FindBy(id = "com.samsung.android.messaging:id/send_button1")
    WebElement send_message_btn;

    @FindBy(id = "android:id/chooser_header")
    WebElement externalLayout;
    @FindBy(id = "com.progoti.tallykhata:id/back_button")
    WebElement backButton;






    public String credit_collection_through_msg(AndroidDriver driver) throws InterruptedException {
        mobile_number.sendKeys("01715321505");
        nexr_btn.click();
        otp1.click();
        Actions a = new Actions(driver);
        a.sendKeys("1");
        a.perform();

        otp2.click();
        Actions b = new Actions(driver);
        b.sendKeys("2");
        b.perform();

        otp3.click();
        Actions c = new Actions(driver);
        c.sendKeys("3");
        c.perform();

        otp4.click();
        Actions d = new Actions(driver);
        d.sendKeys("4");
        d.perform();


        confirm_btn.click();

        current_mobile.click();
        mobile_confirm.click();

        pin1.click();
        Actions p1 = new Actions(driver);
        p1.sendKeys("5");
        p1.perform();

        pin2.click();
        Actions p2 = new Actions(driver);
        p2.sendKeys("0");
        p2.perform();

        pin3.click();
        Actions p3 = new Actions(driver);
        p3.sendKeys("0");
        p3.perform();

        pin4.click();
        Actions p4 = new Actions(driver);
        p4.sendKeys("0");
        p4.perform();

      //  dismiss_dialog.click();
        wallet_btn.click();


        //credit collection

        credit_collection_btn.click();
        selected_customer.click();
        send_tallymsg_btn.click();
        Thread.sleep(1000);
        Utils.saveScreenshot("Before clicking Thik ache button", driver);
        thik_ace_btn.click();
        Thread.sleep(2000);


        return "credit Collection Tagada";



    }

    public String share_credit_collection_message(AndroidDriver driver) throws InterruptedException {
        credit_collection_btn.click();
        selected_customer.click();
        share_kori_btn.click();

        //------------------------- Modified by Hebron-----------------------
//        message_option.get(0).click();
//        send_message_btn.click();
        Thread.sleep(1000);
        Utils.saveScreenshot("After clicking share kori button", driver);
        externalLayout.isDisplayed();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        backButton.click();
        Thread.sleep(1000);
        backButton.click();
//        ----------------------------------------
        return "credit Collection Tagada Share";
    }
}