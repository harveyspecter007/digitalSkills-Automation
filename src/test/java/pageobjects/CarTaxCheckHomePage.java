package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WebDriverUtil;

public class CarTaxCheckHomePage extends WebDriverUtil {

    public CarTaxCheckHomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "vrm-input")
    private WebElement vrmInputTextbox;

    @FindBy(xpath = "//button[text()='Free Car Check']")
    private WebElement freeCarcheckButton;

    public void goToCarCheckWebsite() {
        goToURL("https://cartaxcheck.co.uk/");
    }


    public void clearAndEnterCarRegNumber(String registrationNumber) {
        clearAndEnterText(vrmInputTextbox,registrationNumber);
    }

    public void clickOnFreeCarCheck() {
        clickOnWebElement(freeCarcheckButton);
    }


}
