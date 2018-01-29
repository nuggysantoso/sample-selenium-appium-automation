package common;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by nugroho_s on 1/26/18.
 */
public class DriverBuilder {
    private static AppiumDriver appiumDriver = null;
    private static WebDriver webDriver = null;
    private static String platform;
    private static String nativePlatform;
    private File appDir;
    private File app;
    private static DesiredCapabilities capabilities;

    public void setPlatform(String platform){
        this.platform = platform;
    }

    public void setNativePlatform(String nativePlatform){
        this.nativePlatform = nativePlatform;
    }

    public static String getPlatform(){
        return platform;
    }

    public static String getNativePlatform(){
        return nativePlatform;
    }

    public static void setDriver() throws Exception {
        if (getPlatform().equalsIgnoreCase("Web")){
            setWebDriver();
        }
        else {
            setNativeDriver();
        }
    }

    public static AppiumDriver getAppiumDriver(){
        return appiumDriver;
    }

    public static WebDriver getWebDriver(){
        return webDriver;
    }

    public static void setNativeDriver() throws Exception {
        appiumDriver = getNativePlatform().equalsIgnoreCase("Android") ? getAndroidDriver() : getIOSDriver();
    }

    public static AppiumDriver getAndroidDriver() throws Exception{
        File appDir = new File(Constants.DEFAULT_APP_PATH);
        File app = new File(appDir, Constants.DEFAULT_ANDROID_APP_NAME);
        capabilities = new DesiredCapabilities();
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, Constants.DEFAULT_ANDROID_PLATFORM_VERSION);
//        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, Constants.DEFAULT_ANDROID_DEVICE_NAME);
//        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
//        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 520000);
//        capabilities.setCapability("unicodeKeyboard", "true");
//        capabilities.setCapability("appPackage", "com.photon.mobile.sampleapps");
//        capabilities.setCapability("appActivity", "com.photon.mobile.sampleapps.activity.SplashScreenActivity");
        return new AndroidDriver(new URL(Constants.DEFAULT_WD_URL), capabilities);
    }

    public static AppiumDriver getIOSDriver() throws Exception{
        File appDir = new File(Constants.DEFAULT_APP_PATH);
        File app = new File(appDir, Constants.DEFAULT_IOS_APP_NAME);
        capabilities = new DesiredCapabilities();
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, Constants.DEFAULT_IOS_PLATFORM_VERSION);
//        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, Constants.DEFAULT_IOS_DEVICE_NAME);
//        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
//        capabilities.setCapability("bundleId", "**TBD**"); //todo set from script
//        capabilities.setCapability("newCommandTimeout", 720000);
//        capabilities.setCapability("launchTimeout", 720000);
//        capabilities.setCapability("locationServicesAuthorized", true);
//        capabilities.setCapability("locationServicesEnabled", true);
//        capabilities.setCapability("autoAcceptAlerts", true);
//        capabilities.setCapability("fullReset", false);
//        capabilities.setCapability("noReset", true);
        return new IOSDriver(new URL(Constants.DEFAULT_WD_URL), capabilities);
    }

    public static void setWebDriver(){
        switch (System.getProperty("os.name").toLowerCase()) {
            case "mac" : System.setProperty(Constants.DEFAULT_CHROME_PROPERTY, Constants.DEFAULT_PATH_CHROME_DRIVER_MAC);
            break;
            case "windows" : System.setProperty(Constants.DEFAULT_CHROME_PROPERTY, Constants.DEFAULT_PATH_CHROME_DRIVER_WINDOWS);
            break;
        }
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Constants.DEFAULT_TIMEOUT, TimeUnit.SECONDS);
        webDriver.get(Constants.DEFAULT_WEB_URL);
    }
}
