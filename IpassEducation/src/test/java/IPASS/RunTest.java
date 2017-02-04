package IPASS;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.AutomationConstants;
import utils.BrowserFactory;
import utils.WebDriverUtil;

import java.util.concurrent.TimeUnit;

/**
 * Created by pc on 04-Feb-17.
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        tags = {"@end2end"},
        features = "src/test/resources"
)
public class RunTest {
    static WebDriver driver;

    @BeforeClass
    public static void start() {
        try {
            BrowserFactory.OpenBrowser(AutomationConstants.BROWSER_TYPE, AutomationConstants.URL);
            driver = BrowserFactory.driver;
            driver.manage().timeouts().implicitlyWait(AutomationConstants.MAX_TIMEOUTS, TimeUnit.SECONDS);
            WebDriverUtil.waitForElementToBeClickableAndClick(By.linkText("Skip to main site"));
            WebDriverUtil.isTextPresent("Every year students come to the United Kingdom to learn, improve and gain invaluable experience while studying English.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public static void stop() {
        BrowserFactory.closeBrowser();
    }
}
