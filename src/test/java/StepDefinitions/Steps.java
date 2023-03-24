package StepDefinitions;
import PageObjects.*;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.junit.Cucumber;
import org.apache.logging.log4j.LogManager;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.annotation.en.And;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import PageObjects.DashBoardPage;
import PageObjects.HomePage;
import PageObjects.AddPage;
import PageObjects.ProjectInfoPage;
import PageObjects.LogoutPage;



public class Steps {
    WebDriver driver;
    HomePage hp;
    DashBoardPage dbpage;

    ProjectInfoPage page;
    AddPage add;
    LogoutPage logout;

    List<HashMap<String, String>> datamap; //Data driven

    Logger logger; //for logging
    ResourceBundle rb; // for reading properties file
    String br; //to store browser name
    @Before
    public void setup()    //Junit hook - executes once before starting
    {
        //for logging
        logger= (Logger) LogManager.getLogger(this.getClass());
        //Reading config.properties (for browser)
        rb=ResourceBundle.getBundle("config");
        br=rb.getString("browser");

    }
    @After
    public void tearDown(Scenario scenario) {
        System.out.println("Scenario status ======>"+scenario.getStatus());
        if(scenario.isFailed()) {

            TakesScreenshot ts=(TakesScreenshot) driver;
            byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
            String screenshotPath = "path/to/screenshot.png";
            File screenshotFile = null;
            screenshotFile.renameTo(new File(screenshotPath));


        }
        driver.quit();
    }
    @Given("^User Launch browser$")
    public void user_launch_browser() {
        if(br.equals("chrome"))
        {
            driver=new ChromeDriver();
        }
        else if (br.equals("firefox")) {
            driver = new FirefoxDriver();
        }
        else if (br.equals("edge")) {
            driver = new EdgeDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
    }

    @And("^opens URL \"([^\"]*)\"$")

    public void opens_url_something(String appURL) {
        driver.get(appURL);
        driver.manage().window().maximize();
        logger.info("Launching the broser url");

    }
    @And("^User enters username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
    public void user_enters_username_as_something_and_password_as_something(String user, String pwd) {
        hp=new HomePage(driver);
        hp.setUsername(user);
        hp.setPassword(pwd);
        hp.clickLogin();
        logger.info("PProvided username & password");

    }

    @When("^user clock on Time$")
    public void user_clock_on_time() {
        dbpage.clickTime();
        logger.info("time is selected");
    }

    @Then("^select Projects$")
    public void select_projects() {

        page.setProjectinfoclick();
        page.setProjectclick();

    }
    @And("^click on Add and type Name$")
    public void click_on_add_and_type_name() {
        add.enterName("Test");
    }
    @Then("^ click on logout$")
    public void click_on_logout() {
        logout.setLogout();
    }


}





