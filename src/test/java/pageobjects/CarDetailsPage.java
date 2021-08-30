package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WebDriverUtil;

public class CarDetailsPage extends WebDriverUtil {

    @FindBy(xpath = "//*[contains(text(),'Registration')]/parent::*/dd")
    private WebElement registrationNumber;

    @FindBy(xpath = "//*[contains(text(),'Make')]/parent::*/dd")
    private WebElement make;

    @FindBy(xpath = "//*[contains(text(),'Model')]/parent::*/dd")
    private WebElement model;

    @FindBy(xpath = "//*[contains(text(),'Colour')]/parent::*/dd")
    private WebElement colour;

    @FindBy(xpath = "//*[contains(text(),'Year')]/parent::*/dd")
    private WebElement year;

    @FindBy(xpath = "//*[contains(text(),'Registered')]/parent::*/dd")
    private WebElement registeredDate;

    @FindBy(xpath = "//*[contains(text(),'V5C Issue Date')]/parent::*/dd")
    private WebElement v5cIssuedDate;

    public CarDetailsPage() {
        PageFactory.initElements(driver, this);
    }

    public String getVehicleRegistrationNumber() {
        return getTextFromElement(registrationNumber);
    }

    public String getVehicleModel() {
        return getTextFromElement(model);
    }

    public String getVehicleColour() {
        return getTextFromElement(colour);
    }

    public String getVehicleYear() {
        return getTextFromElement(year);
    }

    public String getCarMake() {
        return getTextFromElement(make);
    }



    public void closeBrowser()
    {
        driver.quit();
    }

}
