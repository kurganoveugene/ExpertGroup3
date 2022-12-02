import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static task3.test.BaseTest.driver;


public class BrowserFactory {

    public static  WebDriver getBrowser(String browserName){

        if(browserName.equalsIgnoreCase("Chrom")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(DriverOptions.configChrome());
        }

        else  if(browserName.equalsIgnoreCase("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        else  {
            System.out.println("This driver not supported");
        }

        return driver;
    }
}

