import org.openqa.selenium.WebDriver;

import static task3.test.BaseTest.driver;

public class WebDriverSingleton {

    private static void setDriver(String browser) {

        driver = BrowserFactory.getBrowser(browser);
    }

    public static WebDriver getInstance(String browser) {

        if (driver == null) {
            setDriver(browser);
        }
        return driver;
    }
}

