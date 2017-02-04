package utils;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by sriramangajala on 08/11/16.
 */
public class WebDriverUtil {


    public static boolean isTextPresent(String text) {
        try {
            return BrowserFactory.getDriver().findElement(By.tagName("body")).getText().contains(text);
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public static boolean waitForText(String text) {
        int timeCounter=0;
        while(!isTextPresent(text)&&AutomationConstants.MAX_TIMEOUTS>timeCounter)
        {
            try {
                System.out.print("Waiting for 1 sec");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            timeCounter++;
        }
        return isTextPresent(text);
    }

    public static void waitForElementToBeClickable(By by) {
        System.out.println("Waiting for element to be clickable " + by);
        WebDriverWait webDriverWait = new WebDriverWait(BrowserFactory.getDriver(), AutomationConstants.MAX_TIMEOUTS);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(by));

    }

    public static void waitForElementToBeClickableAndClick(By by) {
        waitForElementToBeClickable(by);
        BrowserFactory.getDriver().findElement(by).click();
    }

    public static void sleep(int i) {
        try {
            Thread.sleep(i*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
