package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends HomePage{
    public DashBoardPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@title='Timesheets']//*[name()='svg']//*[name()='" +
            "g' and contains(@fill,'currentCol')]//*[name()='g']")
    WebElement Time;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement EmpName;

    @FindBy(xpath = "button[type='submit']")
    WebElement view;

    public void clickTime(){
        Time.click();
    }


}
