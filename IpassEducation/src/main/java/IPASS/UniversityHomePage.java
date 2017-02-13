package IPASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utils.BrowserFactory;
import utils.WebDriverUtil;

import java.util.List;

/**
 * Created by shiyasshahul on 07/02/2017.
 */
public class UniversityHomePage extends BasePage {
    @FindBy(id="Name")
    WebElement searchbox;
    @FindBy(xpath = "//div[@id='adv-search']/div/div/a")
    WebElement button_search;
    @FindBy(css = "#view_website.btn.btn-primary.active" )
    WebElement button_ViewWebsiteCoursePage;
    @FindBy(css = "#contact_adv.btn.btn-warning.active")
    WebElement button_ViewWebsiteUniversityPage;
    @FindBy(css = ".btn.ed_btn.ed_orange")
    WebElement button_viewAllCourse;

    //@FindBy(xpath = "//div[@class='skill_section']/p/a"[0]) WebElement viewcourse_SocialMedia;
   //@FindBy (xpath = "//*[@id='educo_wrapper']/div[3]/div/div/div[3]/div/div[1]/div[1]/div/p[2]/a")
    @FindBy(xpath = "//div[@id='educo_wrapper']/div[3]/div/div/div[3]/div/div[1]/div[1]/div/p[2]/a")
    WebElement viewCourse_SocialMedia;

   @FindBy(css = ".google-maps-link>a")
   WebElement link_ViewMap;

    @FindBy(css = "input#Login.btn.btn-large")
    WebElement button_applyNow;

    @FindBy (xpath = "//div[@id='educo_wrapper']/div[3]/div/div/div/div/div[2]/div/div/div[6]/div/div/h4/a")
    WebElement link_AcousticCourse;

    public void searchUniversity(String university)
    {
    searchbox.sendKeys(university);
    List<WebElement> searchItem = driver.findElements(By.cssSelector(".ui-menu-item"));
    System.out.println(searchItem.size());
    for (WebElement i:searchItem   )
    {
        if(i.getText().contains(university))
            i.click();
    }
    button_search.click();
    }

    public void selectViewWebsite()
    {
    button_ViewWebsiteCoursePage.click();

    }

public void selectViewAllCourse()
{
    button_viewAllCourse.click();
}

public void selectViewCourse_SocialMedia()
{
    //viewCourse_SocialMedia.click();
    WebDriverUtil.mouseHover(viewCourse_SocialMedia);
    //viewCourse_SocialMedia.click();
    //driver.findElement(By.xpath("//div[@id='educo_wrapper']/div[3]/div/div/div[3]/div/div[1]/div[1]/div/p[2]/a")).click();
}

public void selectMap()
{
    BrowserFactory.getDriver().switchTo().frame(0);
    WebDriverUtil.sleep(6);
    //BrowserFactory.getDriver().findElement(By.linkText("View larger map")).click();
   //link_ViewMap.click();
    WebDriverUtil.mouseHover(link_ViewMap);
    System.out.println("Clicked on view larger map link");
}

public void selectApplyNow(){
    button_applyNow.click();
}

public void selectCourse(String course)
{
    System.out.println("before clicking on course");
//    WebDriverUtil.mouseHover(BrowserFactory.getDriver().findElement(By.linkText(course)));
//    WebDriverUtil.selectByLinkText(By.linkText(course));
    WebDriverUtil.mouseHover(link_AcousticCourse);
    System.out.println("after clicking on course");
}

public void selectVisitWebsite(){
    button_ViewWebsiteUniversityPage.click();
}
}
