package Wallet_Screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

import java.util.List;

public class MoneyOut {
    AndroidDriver driver;

    public MoneyOut(AndroidDriver driver){
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


    @FindBy(id = "com.progoti.tallykhata:id/cl_transfer_kori")
    WebElement money_out_btn;


    //money out from bank account

    //select bank account from list

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout")
    WebElement selected_bank_account;

    @FindBy(id = "com.progoti.tallykhata:id/etAmountInput")
    WebElement takar_amount_money_out;

    @FindBy(id = "com.progoti.tallykhata:id/etDescInput")
    WebElement biboron_money_out;

    @FindBy(id = "com.progoti.tallykhata:id/btnConfirm")
    WebElement confirm_btn_money_out;

    @FindBy(id = "com.progoti.tallykhata:id/etPinInput")

    WebElement pin_input_money_out;

    @FindBy(id = "com.progoti.tallykhata:id/btn_confirm")
    WebElement pin_nirchit_money_out;


    //successful money out

    @FindBy(id = "com.progoti.tallykhata:id/btnReturnHome")
    WebElement ok_btn_money_out;





    //money out to nagad
    //select nagad

    @FindBy(id = "com.progoti.tallykhata:id/txt_account_name")
    List<WebElement> mfs_nagad;


    @FindBy(id = "com.progoti.tallykhata:id/etNumberInput")
    WebElement input_nagad_account_number;

    @FindBy(id = "com.progoti.tallykhata:id/etAmountInput")
    WebElement input_amount_nagad;

    @FindBy(id = "com.progoti.tallykhata:id/etDescInput")
    WebElement  biboron_nagad;



    @FindBy(id = "com.progoti.tallykhata:id/btnNextTW")
    WebElement next_btn_after_giving_nagad_number;


    public String money_out_from_bank(AndroidDriver driver) throws InterruptedException {
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

       // dismiss_dialog.click();
        wallet_btn.click();

        money_out_btn.click();
        selected_bank_account.click();
        takar_amount_money_out.sendKeys("20.12");
        biboron_money_out.sendKeys("Money Out Bank");

        confirm_btn_money_out.click();
        pin_input_money_out.sendKeys("5000");
        Utils.saveScreenshot("After providing pin", driver);
        pin_nirchit_money_out.click();

        ok_btn_money_out.click();
        Thread.sleep(2000);

        //dismiss_dialog.click();

        return "Money Out Bank";



    }


    public String  money_out_to_nagad(AndroidDriver driver) throws InterruptedException {
//        ---------------Modified by Hebron--------------------
        money_out_btn.click();
        Thread.sleep(1000);
        Utils.swipeUp(driver, 300);
        Thread.sleep(1000);
        mfs_nagad.get(1).click();
        //-------------------------------------------
        input_nagad_account_number.sendKeys("01300001700");

        next_btn_after_giving_nagad_number.click();




        input_amount_nagad.sendKeys("23.65");

        biboron_nagad.sendKeys("Money Out Nagad");


        confirm_btn_money_out.click();
        pin_input_money_out.sendKeys("5000");
        Utils.saveScreenshot("After providing pin", driver);
        pin_nirchit_money_out.click();


        ok_btn_money_out.click();
        Thread.sleep(2000);

       // dismiss_dialog.click();



       // money_out_btn.click();






        return "Money Out Nagad";
    }

}