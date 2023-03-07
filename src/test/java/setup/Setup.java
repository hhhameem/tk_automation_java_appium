package setup;

import io.appium.java_client.android.AndroidDriver;
import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import utils.Utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Setup {
    Dotenv dotenv = Dotenv.load();
    public AndroidDriver driver;

    @BeforeTest
    public AndroidDriver setup() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "Samsung Galaxy M62");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("os", 11);
//        desiredCapabilities.setCapability("os", 13);
        desiredCapabilities.setCapability("uuid", dotenv.get("UUID_EMULATOR"));
//        desiredCapabilities.setCapability("uuid", dotenv.get("UUID_REAL_DEVICE"));
        desiredCapabilities.setCapability("uiautomator2ServerInstallTimeout", 90000);
        desiredCapabilities.setCapability("autoGrantPermissions", true);
        desiredCapabilities.setCapability("fullReset", true);
        desiredCapabilities.setCapability("app", dotenv.get("APP_LOCATION"));
        desiredCapabilities.setCapability("appPackage", dotenv.get("APP_PACKAGE"));
        desiredCapabilities.setCapability("appActivity", dotenv.get("APP_ACTIVITY"));
        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver(url, desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return driver;
    }

    @BeforeMethod
    public void waitOneSecond() throws InterruptedException {
        Thread.sleep(1000);
    }

    @AfterMethod
    public void afterEveryTest(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            try {
                Utils.saveScreenshot("After test failed Screenshot", driver);
            } catch (Exception exception) {
                System.out.println(exception.toString());
            }

        } else {
            try {
                Utils.saveScreenshot("After test Screenshot", driver);
            } catch (Exception exception) {
                System.out.println(exception.toString());
            }
        }

    }

    @AfterTest
    public void closeDriver() {
        driver.quit();
    }
}