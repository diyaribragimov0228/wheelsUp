package exersize2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CoreMembershipPage {

    private WebDriver driver;

    public CoreMembershipPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h1[ contains(text(),'Private aviation meets Social Aviation™')]")
    private WebElement privateAviationMeetsSocialAviationHeader;


    @FindBy(xpath = "//div[@id='ways_to_fly-component-3']//div[@class='list']//h3")
    private List<WebElement> privateAviationMeetsSocialAviationHeaderHeaders;

    @FindBy(xpath = "//h1[contains(text(),'Learn more today')]")
    private WebElement learnMoreTodayHeading;

    @FindBy(xpath = "//a[contains(text(),'CONTINUE')]")
    private WebElement continueButton;

    public WebElement getPrivateAviationMeetsSocialAviationHeader() {
        return privateAviationMeetsSocialAviationHeader;
    }

    public List<WebElement> getPrivateAviationMeetsSocialAviationHeaderHeaders() {
        return privateAviationMeetsSocialAviationHeaderHeaders;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getLearnMoreTodayHeading() {
        return learnMoreTodayHeading;
    }
}
