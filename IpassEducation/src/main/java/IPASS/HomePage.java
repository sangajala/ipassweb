package IPASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtil;

/**
 * Created by sriramangajala on 04/02/17.
 */
public class HomePage extends BasePage{

    @FindBy(xpath = "//li[@id='menu-item-1825']/ul/li[1]/a")
    private WebElement login;

    @FindBy(css = "#menu-item-1825 a i")
    private WebElement loginMenu;

//    public HomePage()
//    {
//        PageFactory.initElements(driver, this);
//    }

    public void login() {

       // WebDriverUtil.mouseHover(loginMenu);
       // WebDriverUtil.sleep(1);
        WebDriverUtil.mouseHover(login);
        WebDriverUtil.sleep(4);
        //loginMenu.click();
       // WebDriverUtil.sleep(3);
        //login.click();
        //WebDriverUtil.waitForElementToBeClickableAndClick(By.xpath("//li[@id='menu-item-1825']/ul/li[1]/a"));
        //WebDriverUtil.sleep(3);
        //WebDriverUtil.isTextPresent("Sign in");
    }

    public void search() {
    }
}
