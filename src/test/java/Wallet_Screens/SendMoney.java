package Wallet_Screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class SendMoney {

    AndroidDriver driver;

    public SendMoney(AndroidDriver driver){
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

    @FindBy(id = "com.progoti.tallykhata:id/cl_taka_pathay")
    WebElement send_money_btn;

    @FindBy(id = "com.progoti.tallykhata:id/etNumberInput")
    WebElement input_number_field;

    @FindBy(id = "com.progoti.tallykhata:id/btnNextTW")
    WebElement send_money_next_btn;

    @FindBy(id = "com.progoti.tallykhata:id/etAmountInput")
    WebElement input_amount;

    @FindBy(id = "com.progoti.tallykhata:id/etDescInput")
    WebElement input_description;



    @FindBy(id = "com.progoti.tallykhata:id/back_button")
    WebElement send_money_back_btn;


    //send money by selectiong number from recent lenden.

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup")
    WebElement select_number_from_recent_tran;



    //sned money bt slecting number from phone book

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[7]/android.view.ViewGroup")
    WebElement slect_number_from_pb;

    @FindBy(id = "com.progoti.tallykhata:id/btnConfirm")
    WebElement poroborti_btn_sm;

    @FindBy(id = "com.progoti.tallykhata:id/etPinInput")
    WebElement pin_input_sm;

    @FindBy(id = "com.progoti.tallykhata:id/btnConfirm")
    WebElement confirm_btn_sm;

    @FindBy(id = "com.progoti.tallykhata:id/btnReturnHome")
    WebElement thik_ace_btn_sm;






    public String send_money_to_tp(AndroidDriver driver) throws InterruptedException {
        mobile_number.sendKeys("01715321505");
        nexr_btn.click();
        otp1.click();
        Actions a = new Actions(driver);
        a.sendKeys("1234");
        a.perform();
//
//        otp2.click();
//        Actions b = new Actions(driver);
//        b.sendKeys("2");
//        b.perform();
//
//        otp3.click();
//        Actions c = new Actions(driver);
//        c.sendKeys("3");
//        c.perform();
//
//        otp4.click();
//        Actions d = new Actions(driver);
//        d.sendKeys("4");
//        d.perform();


        confirm_btn.click();

        current_mobile.click();
        mobile_confirm.click();

        pin1.click();
        Actions p1 = new Actions(driver);
        p1.sendKeys("5000");
        p1.perform();
//
//        pin2.click();
//        Actions p2 = new Actions(driver);
//        p2.sendKeys("0");
//        p2.perform();
//
//        pin3.click();
//        Actions p3 = new Actions(driver);
//        p3.sendKeys("0");
//        p3.perform();
//
//        pin4.click();
//        Actions p4 = new Actions(driver);
//        p4.sendKeys("0");
//        p4.perform();

//        dismiss_dialog.click();
        wallet_btn.click();
        send_money_btn.click();
        input_number_field.sendKeys("01715321521");
        send_money_next_btn.click();
        input_amount.sendKeys("22");
        input_description.sendKeys("Send Money");
        poroborti_btn_sm.click();
        Thread.sleep(2000);

        pin_input_sm.sendKeys("5000");
        Thread.sleep(2000);
        confirm_btn_sm.click();
        Thread.sleep(2000);
        Utils.saveScreenshot("Before Clicking thik ache button", driver);
        thik_ace_btn_sm.click();
        Thread.sleep(2000);


        return "Send Money";


    }


    //send money by selecting from recent transaction
    public String send_money_from_recent_trans(AndroidDriver driver) throws InterruptedException {
        select_number_from_recent_tran.click();
        input_amount.sendKeys("21.25");
        input_description.sendKeys("Send Money Recent");
        poroborti_btn_sm.click();
        Thread.sleep(2000);

        pin_input_sm.sendKeys("5000");
        Thread.sleep(2000);
        confirm_btn_sm.click();
        Thread.sleep(2000);
        thik_ace_btn_sm.click();
        Thread.sleep(2000);

        return "Send Money Recent";



    }

    public String send_money_from_selected_number_from_pb(AndroidDriver driver){

        slect_number_from_pb.click();
        send_money_btn.click();
        input_amount.sendKeys("22.85");
        input_description.sendKeys("Send Money PB");
        send_money_back_btn.click();
        return "Send Money PB";
    }




}