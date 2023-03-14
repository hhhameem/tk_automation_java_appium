package Wallet_Screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

public class SupplierPayment {

    AndroidDriver driver;

    public SupplierPayment(AndroidDriver driver){
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


    // supplier payment

    @FindBy(id = "com.progoti.tallykhata:id/cl_pay_kori")
    WebElement supplier_payment_btn;

    @FindBy(id = "com.progoti.tallykhata:id/btnChooseSupplier")
    WebElement choose_supplier_from_list;

    //select supplier from list

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    WebElement selected_supplier;

    @FindBy(id = "com.progoti.tallykhata:id/etAmountInput")
    WebElement takar_amount_supp_payment;

    @FindBy(id = "com.progoti.tallykhata:id/etDescInput")
    WebElement biboron_supplier_payment;

    @FindBy(id = "com.progoti.tallykhata:id/btnConfirm")
    WebElement poroborti_btn_supp_payment;


    @FindBy(id = "com.progoti.tallykhata:id/etPinInput")
    WebElement input_pin_supp_payment;

    @FindBy(id = "com.progoti.tallykhata:id/btnConfirm")
    WebElement confirm_btn_supp_payment;


    //unsuccessful

    @FindBy(id = "com.progoti.tallykhata:id/button")
    WebElement ok_btn_supp_payment;



    @FindBy(id = "com.progoti.tallykhata:id/etNumberInput")
    WebElement input_mobile_number_sp;

    @FindBy(id = "com.progoti.tallykhata:id/btnNextTW")
    WebElement next_btn_sp;

    @FindBy(id = "com.progoti.tallykhata:id/etAmountInput")
    WebElement input_amout_sp;

    @FindBy(id = "com.progoti.tallykhata:id/etDescInput")
    WebElement add_description_sp;

    @FindBy(id = "com.progoti.tallykhata:id/btnConfirm")
    WebElement poroborti_btn_sp;

    @FindBy(id = "com.progoti.tallykhata:id/etPinInput")
    WebElement pin_input_sp;

    @FindBy(id = "com.progoti.tallykhata:id/btnConfirm")
    WebElement confirm_btn_sp;

    @FindBy(id = "com.progoti.tallykhata:id/btnReturnHome")
    WebElement thik_ace_btn_sp;




    public String supplier_payment_by_selecting_supplier(AndroidDriver driver) throws InterruptedException {
        mobile_number.sendKeys("01715321505");
        nexr_btn.click();
        Thread.sleep(2000);
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

       // Thread.sleep(000);

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

        Thread.sleep(2000);

       // dismiss_dialog.click();
        wallet_btn.click();


        //supplier payment

        supplier_payment_btn.click();
        Thread.sleep(2000);

        input_mobile_number_sp.sendKeys("01955555555");
        Thread.sleep(2000);

        next_btn_sp.click();
        Thread.sleep(2000);
        input_amout_sp.sendKeys("20.52");
        Thread.sleep(2000);
        add_description_sp.sendKeys("Supplier Payment");
        Thread.sleep(2000);

        poroborti_btn_sp.click();
        Thread.sleep(2000);

        pin_input_sp.sendKeys("5000");
        Thread.sleep(2000);
        confirm_btn_sp.click();
        Thread.sleep(2000);
        Utils.saveScreenshot("Before Clicking thik ache button", driver);
        thik_ace_btn_sp.click();
        Thread.sleep(2000);

//        choose_supplier_from_list.click();
//        Thread.sleep(2000);
//        selected_supplier.click();
//        Thread.sleep(2000);
//        takar_amount_supp_payment.sendKeys("21.65");
//        Thread.sleep(2000);
//        biboron_supplier_payment.sendKeys("Supplier Payment");
//        Thread.sleep(2000);
//        poroborti_btn_supp_payment.click();
//        Thread.sleep(2000);
//        input_pin_supp_payment.sendKeys("3000");
//        Thread.sleep(2000);
//        confirm_btn_supp_payment.click();
//        Thread.sleep(2000);
//        ok_btn_supp_payment.click();
//        Thread.sleep(2000);
//
//        dismiss_dialog.click();
//        wallet_btn.click();
//
//        supplier_payment_btn.click();



        return "Supplier Payment";
    }
}