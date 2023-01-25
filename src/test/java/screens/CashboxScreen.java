package screens;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CashboxScreen {
    public CashboxScreen(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //    Main Menus(Tabs)
    @FindBy(id = "com.progoti.tallykhata:id/item_cash")
    WebElement tabCashbox;

    //common input keyboard buttons
    @FindBy(id = "com.progoti.tallykhata:id/btnZero")
    WebElement btnZero;
    @FindBy(id = "com.progoti.tallykhata:id/btnOne")
    WebElement btnOne;
    @FindBy(id = "com.progoti.tallykhata:id/btnTwo")
    WebElement btnTwo;
    @FindBy(id = "com.progoti.tallykhata:id/btnThree")
    WebElement btnThree;
    @FindBy(id = "com.progoti.tallykhata:id/btnFour")
    WebElement btnFour;
    @FindBy(id = "com.progoti.tallykhata:id/btnFive")
    WebElement btnFive;
    @FindBy(id = "com.progoti.tallykhata:id/btnSix")
    WebElement btnSix;
    @FindBy(id = "com.progoti.tallykhata:id/btnSeven")
    WebElement btnSeven;
    @FindBy(id = "com.progoti.tallykhata:id/btnEight")
    WebElement btnEight;
    @FindBy(id = "com.progoti.tallykhata:id/btnNine")
    WebElement btnNine;
    @FindBy(id = "com.progoti.tallykhata:id/btnAdd")
    WebElement btnAdd;
    @FindBy(id = "com.progoti.tallykhata:id/btnSubtract")
    WebElement btnSubtract;
    @FindBy(id = "com.progoti.tallykhata:id/btnMultiply")
    WebElement btnMultiply;
    @FindBy(id = "com.progoti.tallykhata:id/btnDivide")
    WebElement btnDivide;
    @FindBy(id = "com.progoti.tallykhata:id/btnPercentage")
    WebElement btnPercentage;
    @FindBy(id = "com.progoti.tallykhata:id/btnEquals")
    WebElement btnEqual;
    @FindBy(id = "com.progoti.tallykhata:id/btnDot")
    WebElement btnDot;
    @FindBy(id = "com.progoti.tallykhata:id/btnAC")
    WebElement btnAC;
    @FindBy(id = "com.progoti.tallykhata:id/btnClear")
    WebElement btnClear;

    //  Common
    @FindBy(id = "com.progoti.tallykhata:id/back_button")
    WebElement btnBack;
    @FindBy(id = "com.progoti.tallykhata:id/btnConfirmCashSale")
    WebElement btnPorobortiOrThikAcheOrNischit;
    @FindBy(id = "com.progoti.tallykhata:id/etSaleInput")
    WebElement inputDilamOrPelam;
    @FindBy(id = "com.progoti.tallykhata:id/etDescription")
    WebElement inputBiboron;
    @FindBy(id = "com.progoti.tallykhata:id/ivLayCamera")
    WebElement btnChobi;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.RelativeLayout/android.widget.ImageView[2]")
    WebElement btnClickChobi;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat[2]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ImageView[2]")
    WebElement btnConfirmChobi;
    @FindBy(id = "com.progoti.tallykhata:id/layoutCalender")
    WebElement btnCalender;
    @FindBy(xpath = "//android.view.View[@content-desc=\"25 January 2023\"]")
    WebElement btnCalenderDate;
    @FindBy(id = "android:id/button1")
    WebElement btnCalenderDateOk;
    @FindBy(id = "com.progoti.tallykhata:id/tvConfirmMessage")
    WebElement textConfirmMessage;
    @FindBy(id = "com.progoti.tallykhata:id/iv_details_report")
    WebElement btnReport;
    @FindBy(id = "com.progoti.tallykhata:id/tvTxnAmount")
    List<WebElement> textTransactionAmountInCommonReport;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout")
    WebElement textTotalTransactionAmountInCommonReport;

    //    Cashbox Main page elements
    @FindBy(id = "com.progoti.tallykhata:id/tvTotalSale")
    public WebElement textAjkerBecha;
    @FindBy(id = "com.progoti.tallykhata:id/tvCurrentCashAmount")
    public WebElement textBortomanCash;
    @FindBy(id = "com.progoti.tallykhata:id/tvTotalPabo")
    public WebElement textAjPelam;
    @FindBy(id = "com.progoti.tallykhata:id/tvTotalDebo")
    public WebElement textAjDilam;
    @FindBy(id = "com.progoti.tallykhata:id/tvBakiAdaiAmount")
    WebElement textBakiAday;
    @FindBy(id = "com.progoti.tallykhata:id/tvSupplierPaymentAmount")
    WebElement textPaymentDeya;
    @FindBy(id = "com.progoti.tallykhata:id/iv_view")
    WebElement btnEye;
    @FindBy(id = "com.progoti.tallykhata:id/lay_tagada_message")
    WebElement btnCashboxMilai;
    @FindBy(id = "com.progoti.tallykhata:id/llCashBecha")
    WebElement objectCashBechaDetailsContainer;
    @FindBy(id = "com.progoti.tallykhata:id/tvCashBechaAmount")
    WebElement textCashBecha;
    @FindBy(id = "com.progoti.tallykhata:id/llCashKena")
    WebElement objectCashKenaDetailsContainer;
    @FindBy(id = "com.progoti.tallykhata:id/tvCashKenaAmount")
    WebElement textCashKena;
    @FindBy(id = "com.progoti.tallykhata:id/llKhoroch")
    WebElement objectKhorochDetailsContainer;
    @FindBy(id = "com.progoti.tallykhata:id/tvKhorochAmount")
    WebElement textKhoroch;
    @FindBy(id = "com.progoti.tallykhata:id/llMalikDilo")
    WebElement objectMalikDiloDetailsContainer;
    @FindBy(id = "com.progoti.tallykhata:id/tvMalikDiloAmount")
    WebElement textMalikDilo;
    @FindBy(id = "com.progoti.tallykhata:id/llMalikNilo")
    WebElement objectMalikNiloDetailsContainer;
    @FindBy(id = "com.progoti.tallykhata:id/tvMalikNiloAmount")
    WebElement textMalikNilo;

    // Cashbox Cash Hisab Page elements
    @FindBy(id = "com.progoti.tallykhata:id/tv_btn_cash_box")
    WebElement tabCashboxReportInCashHisab;
    @FindBy(id = "com.progoti.tallykhata:id/tv_btn_cash_report")
    public WebElement tabCashReportInCashHisab;
    @FindBy(id = "com.progoti.tallykhata:id/check_box_report_details")
    WebElement inputCheckboxBistaritoInCashHisab;
    @FindBy(id = "com.progoti.tallykhata:id/tv_starting_cash_amount")
    WebElement textDinerShuruteCashInCashHisab;
    @FindBy(id = "com.progoti.tallykhata:id/tv_cash_becha_amount")
    WebElement textCashBechaInCashHisab;
    @FindBy(id = "com.progoti.tallykhata:id/tv_baki_aday_amount")
    WebElement textBakiAdayInCashHisab;
    @FindBy(id = "com.progoti.tallykhata:id/tv_malik_dilo_amount")
    WebElement textMalikDiloInCashHisab;
    @FindBy(id = "com.progoti.tallykhata:id/tv_cash_kena_amount")
    WebElement textCashKenaInCashHisab;
    @FindBy(id = "com.progoti.tallykhata:id/tv_supplier_payment_amount")
    WebElement textPaymentDeyaInCashHisab;
    @FindBy(id = "com.progoti.tallykhata:id/tv_khoroch_amount")
    WebElement textKhorochInCashHisab;
    @FindBy(id = "com.progoti.tallykhata:id/tv_malik_nilo_amount")
    WebElement textMalikNiloInCashHisab;
    @FindBy(id = "com.progoti.tallykhata:id/tv_total_pelam_amount")
    public WebElement textMotPelamInCashHisab;
    @FindBy(id = "com.progoti.tallykhata:id/tv_total_dilam_amount")
    public WebElement textMotDilamInCashHisab;
    @FindBy(id = "com.progoti.tallykhata:id/tv_balance_amount")
    public WebElement textBalanceInCashHisab;
    @FindBy(id = "com.progoti.tallykhata:id/tv_cash_balance_pelam_amount")
    public WebElement textCashBalancePelamInCashHisab;
    @FindBy(id = "com.progoti.tallykhata:id/tv_cash_balance_dilam_amount")
    WebElement textCashBalanceDilamInCashHisab;
    @FindBy(id = "com.progoti.tallykhata:id/btn_cb_milai")
    WebElement btnCashboxMilaiInCashHisab;
    @FindBy(id = "com.progoti.tallykhata:id/tv_maliker_balance_amount")
    public WebElement textMalikerBalanceInCashHisab;

    // Cashbox Cashbox milai Page elements
    @FindBy(id = "com.progoti.tallykhata:id/etCashboxInput")
    WebElement inputCashboxeAche;
    @FindBy(id = "com.progoti.tallykhata:id/tv_current_cash_amount")
    WebElement textBortomanCashInCashboxMilai;
    @FindBy(id = "com.progoti.tallykhata:id/tv_cashbox_amount")
    WebElement textCashboxeAcheInCashboxMilai;
    @FindBy(id = "com.progoti.tallykhata:id/tv_adjusted_amount")
    WebElement textTakaGhattiOrBartiInCashboxMilai;
    @FindBy(id = "com.progoti.tallykhata:id/btn_different_cash_entry")
    WebElement btnOnnoCashEntryInCashboxMilai;

    public String cashBecha(AndroidDriver driver, String biboron) throws InterruptedException {
        tabCashbox.click();
        Thread.sleep(2000);
        (new TouchAction(driver)).tap(PointOption.point(675, 165)).perform();
        Thread.sleep(1000);
        objectCashBechaDetailsContainer.click();
        btnThree.click();
        btnThree.click();
        inputBiboron.sendKeys(biboron);
        btnChobi.click();
        btnClickChobi.click();
        btnConfirmChobi.click();
        btnCalender.click();
        btnCalenderDateOk.click();
        btnPorobortiOrThikAcheOrNischit.click();
        return textConfirmMessage.getText();
    }

    public String cashKena(String biboron) {
        tabCashbox.click();
        objectCashKenaDetailsContainer.click();
        btnNine.click();
        inputBiboron.sendKeys(biboron);
        btnChobi.click();
        btnClickChobi.click();
        btnConfirmChobi.click();
        btnPorobortiOrThikAcheOrNischit.click();
        return textConfirmMessage.getText();
    }

    public String khoroch(String biboron) {
        tabCashbox.click();
        objectKhorochDetailsContainer.click();
        btnSeven.click();
        inputBiboron.sendKeys(biboron);
        btnCalender.click();
        btnCalenderDateOk.click();
        btnPorobortiOrThikAcheOrNischit.click();
        return textConfirmMessage.getText();
    }

    public String malikDilo(String biboron) {
        tabCashbox.click();
        objectMalikDiloDetailsContainer.click();
        btnNine.click();
        inputBiboron.sendKeys(biboron);
        btnPorobortiOrThikAcheOrNischit.click();
        return textConfirmMessage.getText();
    }

    public String malikNilo() {
        tabCashbox.click();
        objectMalikNiloDetailsContainer.click();
        btnOne.click();
        btnNine.click();
        btnPorobortiOrThikAcheOrNischit.click();
        return textConfirmMessage.getText();
    }

    public String closeEyeButton() {
        btnEye.click();
        return textAjkerBecha.getText();
    }

    public String cashboxMilai() throws InterruptedException {
        btnCashboxMilai.click();
        btnFour.click();
        btnPorobortiOrThikAcheOrNischit.click();
        String textGhatti = textTakaGhattiOrBartiInCashboxMilai.getText();
        btnPorobortiOrThikAcheOrNischit.click();
        btnEye.click();
        return textGhatti;
    }

    public void cashboxReport() throws InterruptedException {
        btnReport.click();
        Thread.sleep(1000);
        System.out.println("textMotDilamInCashHisab " + textMotDilamInCashHisab.getText());
        System.out.println("textMotPelamInCashHisab " + textMotPelamInCashHisab.getText());
        System.out.println("textBalanceInCashHisab " + textBalanceInCashHisab.getText());
    }

    public void cashReport() throws InterruptedException {
        tabCashReportInCashHisab.click();
        Thread.sleep(1000);
        System.out.println("textMotDilamInCashHisabCashReport " + textMotDilamInCashHisab.getText());
        System.out.println("textMotPelamInCashHisabCashReport " + textMotPelamInCashHisab.getText());
        System.out.println("textCashBalancePelamInCashHisabCashReport " + textCashBalancePelamInCashHisab.getText());
        System.out.println("textMalikerBalanceInCashHisabCashReport " + textMalikerBalanceInCashHisab.getText());
    }
}
