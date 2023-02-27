package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

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
    @FindBy(id = "com.progoti.tallykhata:id/tvResendOtp")
    WebElement btnResentOtp;
    @FindBy(id = "com.progoti.tallykhata:id/et_shop_name")
    WebElement inputShopName;
    @FindBy(id = "com.progoti.tallykhata:id/toolbar_title")
    public WebElement textShopTitle;
    @FindBy(id = "com.progoti.tallykhata:id/iv_alert")
    WebElement iconAlert;
    @FindBy(id = "com.progoti.tallykhata:id/btn_verify_number")
    WebElement btnVerifyKori;
    @FindBy(id = "com.progoti.tallykhata:id/item_menu")
    WebElement tabMenu;
    @FindBy(id = "com.progoti.tallykhata:id/tv_title")
    List<WebElement> tabMenuOptions;
    @FindBy(id = "com.progoti.tallykhata:id/back_button")
    WebElement btnBack;
    @FindBy(id = "com.progoti.tallykhata:id/ivDataBackup")
    WebElement btnDataBackup;
    @FindBy(id = "com.progoti.tallykhata:id/tvDataBackupMessage")
    WebElement textDataBackupMessage;


    public boolean insertPhoneAndClickButton(String mobileNumberToInsert) throws InterruptedException {
        inputMobileNumber.sendKeys(mobileNumberToInsert);
        boolean isButtonEnabled = btnPoroborti.isEnabled();
        Thread.sleep(1000);
        if (isButtonEnabled) {
            btnPoroborti.click();
        }
        return isButtonEnabled;
    }

    public boolean insertOtpAndClickButton(AndroidDriver driver) throws InterruptedException {
        inputOtpCode1.click();
        Actions action = new Actions(driver);
        action.sendKeys(dotenv.get("OTP")).perform();
        Thread.sleep(1000);
        boolean isButtonEnabled = btnNext.isEnabled();
        if (isButtonEnabled) {
            btnNext.click();
        }
        return isButtonEnabled;
    }

    public boolean insertShopNameAndClickButton(String shop_name) throws InterruptedException {
        inputShopName.sendKeys(shop_name);
        boolean isButtonEnabled = btnNext.isEnabled();
        Thread.sleep(1000);
        if (isButtonEnabled) {
            btnNext.click();
        }
        return isButtonEnabled;
    }

    public String createUnverifiedAccount(String phone, String name, AndroidDriver driver) throws InterruptedException {
        insertPhoneAndClickButton(phone);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.progoti.tallykhata:id/et_shop_name")));
        insertShopNameAndClickButton(name);
        return textShopTitle.getText();
    }

    public boolean verifyMobile(AndroidDriver driver) throws InterruptedException {
        iconAlert.click();
        btnVerifyKori.click();
        btnNext.click();
        if (driver.findElements(By.id("com.progoti.tallykhata:id/tvResendOtp")).isEmpty()) {
            System.out.println("Inside if");
            insertOtpAndClickButton(driver);
        } else {
            btnResentOtp.click();
            Thread.sleep(2000);
            btnResentOtp.click();
            insertOtpAndClickButton(driver);
        }
        return driver.findElements(By.id("com.progoti.tallykhata:id/iv_alert")).isEmpty();
    }

    public String verifyDataBackup() throws InterruptedException {
        tabMenu.click();
        Thread.sleep(2000);
        tabMenuOptions.get(7).click();
        btnDataBackup.click();
        Thread.sleep(5000);
        String dataBackupMessage = textDataBackupMessage.getText();
        btnBack.click();
        return dataBackupMessage;
    }
}