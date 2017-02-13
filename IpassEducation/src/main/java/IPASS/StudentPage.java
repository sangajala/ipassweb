package IPASS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shiyasshahul on 13/02/2017.
 */
public class StudentPage extends BasePage {
    @FindBy(css = "[data-toggle=\"tab\"][href=\"#courses\" ]")
    WebElement menu_University;


    public void select_UniversityMenu() {
        menu_University.click();

    }
}
