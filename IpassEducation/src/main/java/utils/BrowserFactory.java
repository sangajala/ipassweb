package utils;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class BrowserFactory {
    public static WebDriver driver;

    public static WebDriver OpenBrowser(String browser, String url) {
        if (driver == null) {

            driver = startWebBrowser(browser, url);
        }
        driver.manage().window().maximize();
        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void closeBrowser() {
        driver.quit();
        driver = null;
    }

    protected static WebDriver startWebBrowser(String browser, String URL) {
        try {
            if (browser.equalsIgnoreCase("Firefox")) {
                System.out.println("local firefox started...");
                System.setProperty("webdriver.firefox.driver", "geckodriver.exe");
                //System.setProperty("webdriver.firefox.driver", "geckodriver");
                driver = new FirefoxDriver();

            } else if (browser.equalsIgnoreCase("chrome")) {
                System.out.println("local chrome started...");
                System.setProperty("webdriver.chrome.driver", "chromedriver");
//                System.setProperty("webdriver.chrome.driver", "chromedriver");
                driver = new ChromeDriver();
            } else
                throw new RuntimeException("Browser give " + browser + " did not load..");
        } catch (Exception e) {
            throw new RuntimeException("Browser give " + browser + " did not load..");
        }

        driver.get(URL);
        return driver;
    }

}