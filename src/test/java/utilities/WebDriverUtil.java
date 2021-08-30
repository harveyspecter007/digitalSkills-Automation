package utilities;

import lombok.extern.java.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Log
public class WebDriverUtil {

    public static WebDriver driver;

    public WebDriverUtil() {
        if (null == driver) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
                    + "/src/test/resources/drivers/chromedriver");
            driver = new ChromeDriver();
        }

    }

    protected void waitForElementToBeClickable(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    protected void waitUntilElementIsVisible(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    protected void goToURL(String url) {
        driver.navigate().to(url);
    }

    protected String getTextFromElement(WebElement webElement) {
        waitUntilElementIsVisible(webElement);
        return webElement.getText();
    }

    protected void clickOnWebElement(WebElement webElement) {
        waitForElementToBeClickable(webElement);
        webElement.click();
    }

    protected void clearAndEnterText(WebElement webElement, String text) {
        log.info("Clearing the TextBox WebElement....");
        webElement.clear();
        log.info(String.format("Entering the Text %s in to Text box ...", text));
        webElement.sendKeys(text);
    }


}
