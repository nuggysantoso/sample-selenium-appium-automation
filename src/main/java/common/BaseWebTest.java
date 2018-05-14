package common;

import org.junit.After;
import org.junit.Before;
import platform.web.pages.HomePage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by nugroho_s on 1/26/18.
 */
public class BaseWebTest extends DriverBuilder {
    protected HomePage homePage;
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();

    @After()
    public void tearDown(){
        getWebDriver().quit();
    }

    @Before()
    public void setUp() throws Exception {
        super.setPlatform("Web");
        super.setDriver();
        homePage = new HomePage(getWebDriver());
        System.out.println("=========================================================");
        System.out.println("Project      : Helpster Web Automation");
        System.out.println("Date         : "+ dateFormat.format(date));
        System.out.println("URL          : "+ Constants.DEFAULT_WEB_URL);
        System.out.println("Driver Name  : "+ Constants.DEFAULT_WEBDRIVER_NAME);
        System.out.println("=========================================================");
    }
}
