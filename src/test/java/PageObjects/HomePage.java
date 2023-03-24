package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath="//input[@placeholder='Username']")
    WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement login;

    public void setUsername(String uname) {
        username.sendKeys(uname);

    }
    public void setPassword(String pwd){
        password.sendKeys(pwd);
    }

    public void clickLogin(){
        login.click();


    }
}
