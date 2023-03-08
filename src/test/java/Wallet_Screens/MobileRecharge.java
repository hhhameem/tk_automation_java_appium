package Wallet_Screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileRecharge {

    AndroidDriver driver;

    public MobileRecharge(AndroidDriver driver){
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

    @FindBy(id = "com.progoti.tallykhata:id/cl_mobile_recharge")
    WebElement mobile_recharge_btn;



    //mobile rechage by giving mobile number

    @FindBy(id = "com.progoti.tallykhata:id/etNumberInput")
    WebElement mobile_number_input;

    @FindBy(id = "com.progoti.tallykhata:id/btnNextTW")
    WebElement next_btn;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]")
    WebElement selected_operator;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RadioGroup/android.widget.RadioButton[1]")
    WebElement select_number_type;

    @FindBy(id = "com.progoti.tallykhata:id/btnOk")
    WebElement ok_btn_for_recharge;

    @FindBy(id = "com.progoti.tallykhata:id/etTkInput")
    WebElement input_amount;

    @FindBy(id = "com.progoti.tallykhata:id/btnNext")
    WebElement poroborti_btn_for_recharge;

    //input pin

    @FindBy(id = "com.progoti.tallykhata:id/etPinInput")
    WebElement input_pin_for_mr;

    @FindBy(id = "com.progoti.tallykhata:id/btnNext")
    WebElement next_btn_after_pin;

    @FindBy(id = "com.progoti.tallykhata:id/btnReturnHome")
    WebElement return_home_after_successful_recharge;



    public String mobile_recharge_by_giving_mobile_number(AndroidDriver driver) throws InterruptedException {
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
        p1.sendKeys("3");
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

        //mobile recharge

        mobile_recharge_btn.click();
        mobile_number_input.sendKeys("01643106718");
        next_btn.click();
        selected_operator.click();
        select_number_type.click();

        ok_btn_for_recharge.click();
        input_amount.sendKeys("20.51");
        poroborti_btn_for_recharge.click();
        input_pin_for_mr.sendKeys("3000");
        next_btn_after_pin.click();

        return_home_after_successful_recharge.click();
        Thread.sleep(2000);



        return "Mobile Recharge";



    }
}
