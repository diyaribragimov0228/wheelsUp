package exersize2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrivateAviationCompanyPage {

    private WebDriver driver;

    public PrivateAviationCompanyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h1[@data-sr-id='4']")
    private WebElement flyingPersonalized;


    @FindBy(xpath = "//app-ways-to-fly[@class='ng-star-inserted']//h1")
    private WebElement discoverThePossibilities;

    @FindBy(xpath = "//span[@class='base-label']")
    private WebElement findUsText;

    @FindBy(xpath = "//ul[@id='option_3']//li[1]//a")
    private WebElement phoneNumber;

    @FindBy(xpath = "//ul[@id='option_3']//li[2]//a")
    private WebElement emailID;


    @FindBy(xpath = "//nav[@class='items no-mobile ng-star-inserted']//a[contains(text(),'Fly')]")
    private WebElement flyButton;


    @FindBy(xpath = "//nav[@class='items no-mobile ng-star-inserted']//ul[@class='list']//li[1]//ul//li[3]")
    private WebElement coreMembershipButton;

    public WebElement getFlyingPersonalized() {
        return flyingPersonalized;
    }

    public WebElement getDiscoverThePossibilities() {
        return discoverThePossibilities;
    }

    public WebElement getFindUsText() {
        return findUsText;
    }

    public WebElement getPhoneNumber() {
        return phoneNumber;
    }

    public WebElement getEmailID() {
        return emailID;
    }

    public WebElement getFlyButton() {
        return flyButton;
    }

    public WebElement getCoreMembershipButton() {
        return coreMembershipButton;
    }
}
