package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationScreen {
    public RegistrationScreen(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    Dotenv dotenv = Dotenv.load();

    @FindBy(id = "com.progoti.tallykhata:id/et_mobile_number")
    WebElement inputMobileNumber;
    @FindBy(id = "com.progoti.tallykhata:id/btn_next")
    WebElement btnPoroborti;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[1]")
    WebElement inputOtpCode1;
    @FindBy(id = "com.progoti.tallykhata:id/btnNext")
    WebElement btnNext;
    @FindBy(id = "com.progoti.tallykhata:id/et_shop_name")
    WebElement inputShopName;
    @FindBy(id = "com.progoti.tallykhata:id/toolbar_title")
    public WebElement textShopTitle;

    public boolean insertPhoneAndClickButton(String mobileNumberToInsert) {
        inputMobileNumber.sendKeys(mobileNumberToInsert);
        boolean isButtonEnabled = btnPoroborti.isEnabled();
        if (isButtonEnabled) {
            btnPoroborti.click();
        }
        return isButtonEnabled;
    }
    public boolean insertOtpAndClickButton(AndroidDriver driver) {
        inputOtpCode1.click();
        Actions action = new Actions(driver);
        action.sendKeys(dotenv.get("OTP")).perform();
        boolean isButtonEnabled = btnNext.isEnabled();
        if (isButtonEnabled) {
            btnNext.click();
        }
        return isButtonEnabled;
    }
    public boolean insertShopNameAndClickButton(String shop_name) {
        inputShopName.sendKeys(shop_name);
        boolean isButtonEnabled = btnNext.isEnabled();
        if (isButtonEnabled) {
            btnNext.click();
        }
        return isButtonEnabled;
    }
}
