import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;

import java.io.IOException;

import static task3.test.BaseTest.driver;

public class MainPage extends BaseForm{

    public MainPage(String name) throws IOException, ParseException {
        super(new Button(By.xpath("//h5[contains(text(), 'Alerts')]"), "Уникальная кнопка"), "MainPage");
    }

    Logger log = (Logger) LogManager.getLogger(MainPage.class);


    private Button btnAlertsFrameWindows = new Button(By.xpath("//h5[contains(text(), 'Alerts')]"), "Кнопка AlertsFrameWindows");
    private Button btnElements = new Button(By.xpath("//h5[contains(text(), 'Elements')]"), "Кнопка Elements");



public void clickBtnAFW(){
    btnAlertsFrameWindows.click();
}

    public void clickBtnElements(){
        btnElements.click();
    }


    String mainPage_URL = ReadDataFromJsonFile.ReadDataFromJsonFile("mainPage_URL");

    //open mainPage by URL

    public MainPage goTo() {
        log.info("Open MainPage");
        driver.get(mainPage_URL);
        return this;
    }






























/*    //go to aboutPage
    public MainPage clickButtonAbout() {
        click(aboutButton);
        return this;
    }




 /*   public MainPage clickButtonSalesLeaders() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement newMenu = driver.findElement(newNoteworthyButton);
        Actions actions = new Actions(driver);
        actions.moveToElement(newMenu).build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(salesLeadersButton));
        click(salesLeadersButton);
        return this;
    }

    public boolean checkPageIsOpen() {
        return isElementOnPage(toShopButton);

    }

    //go to mainPage
    public void goToMainByButton() {
        click(toShopButton);
    }

  */

}
