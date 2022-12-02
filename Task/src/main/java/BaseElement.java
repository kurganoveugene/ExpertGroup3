import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static task3.test.BaseTest.driver;

public abstract class BaseElement {
    private By locator;
    private String name;

    BaseElement(By locator, String name) {
        this.locator = locator;
        this.name = name;
    }

    Logger log = (Logger) LogManager.getLogger(BaseElement.class);

    WebDriverWait wait = new WebDriverWait(driver, 10);


    public WebElement findElement(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return driver.findElement(locator);
    }
    public List<WebElement> findElements(){
       return driver.findElements(locator);
    }


    public void click() {
        log.info("Кликаю на {name}");
        findElement().click();
    }

    public String getText() {
        log.info("Кликаю на {name}");
        return findElement().getText();
    }

    public boolean isDisplayed() {
        log.info("Проверяем, что элемент {name} отображается на странице");
        return findElement().isDisplayed();
    }

    public void sendkeys(String text){
        log.info("Вставляем текс в {name}");
        findElement().sendKeys(text);
    }

    public boolean isPresent(){
        return findElements().size()>0;

    }

}
