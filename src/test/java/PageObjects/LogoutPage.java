package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends AddPage{
    public LogoutPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath="//span[@class='oxd-userdropdown-tab']")
    WebElement profileClick;

    @FindBy(xpath="//a[normalize-space()='Logout']")
    WebElement logout;

    @FindBy(xpath ="//img[@alt='client brand banner']")
    WebElement verify;

    public void setProfileClick(){
        profileClick.click();
    }
    public void setVerify(){
        boolean targetpage =verify.isDisplayed();
    }
    public void setLogout(){
        logout.click();
    }


}
