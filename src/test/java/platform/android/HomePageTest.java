package platform.android;

import common.BaseAndroidTest;
import org.junit.Test;

public class HomePageTest extends BaseAndroidTest {

    @Test()
    public void HM_01(){
        homePage.checkHomePageIsDisplayed("Select Country");
        homePage.clickLayoutCountry();
        homePage.checkSelectedLanguageIsCorrect("Indonesia");
        homePage.clickLoginAsWorker();
    }
}
