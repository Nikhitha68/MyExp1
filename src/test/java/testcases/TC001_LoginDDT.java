package testcases;

import PageObjects.*;
import Utilities.DataProviders;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001_LoginDDT extends BaseClass {
    @Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
    public void Test_LoginDDT(String user,String pwd) {
        logger.info(" Starting TC_001_LoginDataDrivenTest ");


        try {
            logger.info(" Starting TC_001_LoginDataDrivenTest ");
            HomePage hp = new HomePage(driver);
            driver.get(rb.getString("appURL")); // get url from config.properties file
            hp.setUsername(user);
            hp.setPassword(pwd);
            hp.clickLogin();

            logger.info("Login into DashboardPage");
            DashBoardPage dbpage = new DashBoardPage(driver);
            dbpage.clickTime();

            logger.info("Click on project Info");
            ProjectInfoPage page = new ProjectInfoPage(driver);
            page.setProjectinfoclick();
            page.setProjectclick();
            page.setAddClick();

            logger.info("Click on Add");
            AddPage add = new AddPage(driver);
            add.enterName(rb.getString("name"));
            add.clickcancel();

            logger.info("Click on Logout");
            LogoutPage logout = new LogoutPage(driver);
            logout.setProfileClick();
            logout.setVerify();
            logout.setLogout();
        }
        catch (Exception e){
            Assert.fail();
        }
        logger.info(" Finished TC_003_LoginDataDrivenTest");



    }
}
