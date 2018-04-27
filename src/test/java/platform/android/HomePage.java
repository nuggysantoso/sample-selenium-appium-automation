package platform.android;

import common.BaseWebTest;
import org.junit.Test;

public class HomePage extends BaseWebTest {
    @Test()
    public void HM_01(){
        homePage.checkTitlePage();
    }
}
