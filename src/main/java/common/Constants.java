package common;

/**
 * Created by nugroho_s on 1/26/18.
 */
public class Constants {
    /**
     * Default Constant value for ios and android
     */
    public static final String DEFAULT_WD_URL = "http://127.0.0.1:4723/wd/hub";
    public static final String DEFAULT_APP_PATH = System.getProperty("user.home") + "/Documents/";

    /**
     * Default Constant value for Android
     */
    public static final String DEFAULT_ANDROID_APP_NAME = "Helpster.apk";
    public static final String DEFAULT_ANDROID_PLATFORM_VERSION = "5.1.1";
    public static final String DEFAULT_ANDROID_DEVICE_NAME = "AndroidL";
    public static final int DEFAULT_ANDROID_APP_WAIT = 30000;
    public static final String DEFAULT_ANDROID_APP_PACKAGE = "com.helpster.partner.develop";
    public static final String DEFAULT_ANDROID_WAIT_ACTIVITY = "com.helpster.main.MainHelpsterActivity";
    /**
     * Default Constant value for iOS
     */
    public static final String DEFAULT_IOS_APP_NAME = null;

    /**
     * Default Constant value for web
     */
    public static final String DEFAULT_WEB_TO_TEST = "Google";
    public static final String DEFAULT_WEBDRIVER_NAME = "Chrome";
    public static final String DEFAULT_CHROME_PROPERTY = "webdriver.chrome.driver";
    public static final String DEFAULT_PATH_CHROME_DRIVER_MAC = System.getProperty("user.dir") + "/src/test/resources/mac/chromedriver";
    public static final String DEFAULT_PATH_CHROME_DRIVER_WINDOWS = System.getProperty("user.dir") + "/src/test/resources/windows/chromedriver";
    public static final String DEFAULT_WEB_URL = "https://www.tokopedia.com";
    public static final int DEFAULT_TIMEOUT = 10;
}
