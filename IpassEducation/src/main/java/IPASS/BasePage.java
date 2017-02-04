package IPASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserFactory;

/**
 * Created by sriramangajala on 04/02/17.
 */
public class BasePage {
    WebDriver driver = BrowserFactory.getDriver();

    public BasePage()
    {
        PageFactory.initElements(driver, this);
    }
}
