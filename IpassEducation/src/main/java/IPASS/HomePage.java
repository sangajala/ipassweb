package IPASS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtil;

/**
 * Created by sriramangajala on 04/02/17.
 */
public class HomePage extends BasePage{

    @FindBy(linkText= "Login ")
    private WebElement login;

    @FindBy(css = "#menu-item-1825 a i")
    private WebElement loginMenu;

//    public HomePage()
//    {
//        PageFactory.initElements(driver, this);
//    }

    public void login() {

        loginMenu.click();
        WebDriverUtil.sleep(3);
        login.click();
        WebDriverUtil.sleep(3);
        WebDriverUtil.isTextPresent("Sign in");
      //menu-item-1825
    }
}
