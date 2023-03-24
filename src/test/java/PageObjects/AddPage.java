package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddPage extends ProjectInfoPage {
    public AddPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement Name;

    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    WebElement cancel;

    public void enterName(String name1) {
        Name.sendKeys(name1);
    }

    public void clickcancel() {
        cancel.click();
    }
}
