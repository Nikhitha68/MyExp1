package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectInfoPage extends DashBoardPage{
    public ProjectInfoPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//span[normalize-space()='Project Info']")
    WebElement projectinfoclick;

    @FindBy(xpath = "//a[normalize-space()='Projects']")
    WebElement projectclick;

    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement AddClick;

    public void setProjectinfoclick(){
        projectinfoclick.click();
    }
    public void setProjectclick(){
        projectclick.click();
    }

    public void setAddClick(){
        AddClick.click();
    }
}


