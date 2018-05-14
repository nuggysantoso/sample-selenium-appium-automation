package platform.web;

import org.junit.Test;
import common.BaseWebTest;

/**
 * Created by nugroho_s on 1/26/18.
 */
public class HomePageTest extends BaseWebTest {
//    @Categories("Home")
//    @Descriptions("HM_01 : Verify user should be able to see homescreen after launch app")
    @Test()
    public void HM_01() {
//        steps("Verify step to change section bar");
        homePage.checkTitlePage();
        homePage.checkKamu();
    }
}
