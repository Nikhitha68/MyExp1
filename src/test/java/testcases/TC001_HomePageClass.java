package testcases;

import PageObjects.*;
import org.apache.logging.log4j.LogManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001_HomePageClass extends BaseClass {
    @Test
    public void test_account_Registration() throws InterruptedException {


        logger = LogManager.getLogger(this.getClass());  //logging
        logger.debug("application logs......");
        logger.info("***  Starting TC_001_Homepage  ***");

        try {


            HomePage hp = new HomePage(driver);
            driver.get(rb.getString("appURL")); // get url from config.properties file
            hp.setUsername(rb.getString("user"));
            hp.setPassword(rb.getString("pwd"));
            hp.clickLogin();

            DashBoardPage dbpage = new DashBoardPage(driver);
//        driver.switchTo().alert().accept();

            dbpage.clickTime();

            ProjectInfoPage page = new ProjectInfoPage(driver);

            page.setProjectinfoclick();
            page.setProjectclick();
            page.setAddClick();

            AddPage add = new AddPage(driver);
            add.enterName(rb.getString("name"));
            add.clickcancel();

            LogoutPage logout = new LogoutPage(driver);
            logout.setProfileClick();
            logout.setLogout();


        } catch (Exception e) {

            Assert.fail();
            logger.info("Failed execptiom");

        }
    }
}
