import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static task3.test.BaseTest.driver;

public class Alerts {



    public void switchToAlert() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert();
    }

    public String getText(){
      return driver.switchTo().alert().getText();
    }

    public void accept() {
        driver.switchTo().alert().accept();
    }

    public void sendKeys(String text) {
        driver.switchTo().alert().sendKeys(text);
    }



    public boolean isAlertPresent() {
        Alert alert = ExpectedConditions.alertIsPresent().apply(driver);
        return (alert == null);
    }
}
