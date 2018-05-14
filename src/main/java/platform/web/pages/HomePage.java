package platform.web.pages;

import org.openqa.selenium.WebDriver;
import platform.web.modules.AbstractPage;

/**
 * Created by nugroho_s on 1/26/18.
 */
public class HomePage extends AbstractPage {
    public String titlePage = "div.topbar-logo-wrapper";

    public HomePage(WebDriver webDriver) {
       super(webDriver);
    }

    @Override
    public void checkTitlePage() {
        assertTextElementIsEquals(getElementByCssSelector(titlePage), "Tokopedia");
    }
}
