package exersize2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestInfoPage {

    private WebDriver driver;

    public RequestInfoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='dropdown']")
    private WebElement travelTypeDropdown;

    @FindBy(xpath = "//p[contains(text(),'Personal Travel')]")
    private WebElement personalTravelDropdownValue;

    @FindBy(xpath = "//input[@id='FirstName-clone']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//input[@id='LastName-clone']")
    private WebElement lastNameInput;

    @FindBy(xpath = "//input[@id='Email-clone']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@id='Phone-clone']")
    private WebElement phoneInput;

    @FindBy(xpath = "//input[@id='Company__c-clone']")
    private WebElement companyNameInput;

    @FindBy(xpath = "//input[@id='Address-clone']")
    private WebElement addressInput;
    @FindBy(xpath = "//input[@id='City-clone']")
    private WebElement cityInput;

    @FindBy(xpath = "//input[@id='PostalCode-clone']")
    private WebElement postalCodeInput;

    @FindBy(xpath = "//input[@id='State-clone']")
    private WebElement stateInput;


    @FindBy(xpath = "//input[@id='Country-clone']")
    private WebElement countryInput;

    @FindBy(xpath = "//div[@id='How_Many_Private_Flights_Per_Year__c-clone0']//parent::div[@class='dropdown']")
    private WebElement flyingFrequencyDropdown;



@FindBy(xpath = "//div[@id='How_Many_Private_Flights_Per_Year__c-clone0']//p[contains(text(),'1-5')]//parent::li")
private WebElement freqValue;


@FindBy(xpath = "//div[@id='Do_you_own_or_travel_to_a_second_home__c-cloneYes']//child::div[@class='boxicon']")
private WebElement doYouOwnOrTravelToSecondHome;

@FindBy(xpath = "//div[@id='Do_you_own_or_travel_to_a_second_home__c-cloneYes']//p[contains(text(),'No')]//parent::li")
private WebElement doYouOwnOrTravelToSecondHomeNo;

@FindBy(xpath = "//div[@id='Do_you_have_a_need_to_travel_with_pets__c-cloneYes']//child::div[@class='boxicon']")
private WebElement doYouHaveNeedToTravelWithPets;

@FindBy(xpath = "//div[@id='Do_you_have_a_need_to_travel_with_pets__c-cloneYes']//child::p[contains(text(),'No')]//parent::li")
private WebElement doYouHaveNeedToTravelWithPetsNo;

@FindBy(xpath = "//div[@id='How_does_the_Lead_currently_Travel__c-clone']")
private WebElement howDoYouFlyCurrently;

@FindBy(xpath = "//*[@id='How_does_the_Lead_currently_Travel__c-clone']/div[1]/div[1]/app-input-select-box/div")
private WebElement charterCheckbox;


@FindBy(xpath = "//div[@id='leadSourceWebList-cloneFinancial']//div[@class='boxicon']")
private WebElement howHearAboutUs;

@FindBy(xpath = "//div[@id='leadSourceWebList-cloneFinancial']//p[contains(text(),'Financial Advisor')]//parent::li")
private WebElement howHearAboutUsFinancialAdvisor;

@FindBy(xpath = "//div[@id='WebFormComment__c-clone']//textarea")
private WebElement textBox;

@FindBy(xpath = "//*[@id='How_does_the_Lead_currently_Travel__c-clone']/div[1]/div[6]/app-input-select-box/div/div/div[1]/label")
private WebElement ownAircraftCheckbox;

@FindBy(xpath = "//div[@class='close']//i[@class='icon-close']")
private WebElement closeButton;

    public WebElement getTravelTypeDropdown() {
        return travelTypeDropdown;
    }

    public WebElement getPersonalTravelDropdownValue() {
        return personalTravelDropdownValue;
    }

    public WebElement getFirstNameInput() {
        return firstNameInput;
    }

    public WebElement getLastNameInput() {
        return lastNameInput;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getPhoneInput() {
        return phoneInput;
    }

    public WebElement getCompanyNameInput() {
        return companyNameInput;
    }

    public WebElement getAddressInput() {
        return addressInput;
    }

    public WebElement getCityInput() {
        return cityInput;
    }

    public WebElement getPostalCodeInput() {
        return postalCodeInput;
    }

    public WebElement getStateInput() {
        return stateInput;
    }

    public WebElement getCountryInput() {
        return countryInput;
    }

    public WebElement getFlyingFrequencyDropdown() {
        return flyingFrequencyDropdown;
    }

    public WebElement getFreqValue() {
        return freqValue;
    }

    public WebElement getDoYouOwnOrTravelToSecondHome() {
        return doYouOwnOrTravelToSecondHome;
    }

    public WebElement getDoYouOwnOrTravelToSecondHomeNo() {
        return doYouOwnOrTravelToSecondHomeNo;
    }

    public WebElement getDoYouHaveNeedToTravelWithPets() {
        return doYouHaveNeedToTravelWithPets;
    }

    public WebElement getDoYouHaveNeedToTravelWithPetsNo() {
        return doYouHaveNeedToTravelWithPetsNo;
    }

    public WebElement getHowDoYouFlyCurrently() {
        return howDoYouFlyCurrently;
    }

    public WebElement getCharterCheckbox() {
        return charterCheckbox;
    }

    public WebElement getHowHearAboutUs() {
        return howHearAboutUs;
    }

    public WebElement getHowHearAboutUsFinancialAdvisor() {
        return howHearAboutUsFinancialAdvisor;
    }

    public WebElement getTextBox() {
        return textBox;
    }

    public WebElement getOwnAircraftCheckbox() {
        return ownAircraftCheckbox;
    }

    public WebElement getCloseButton() {
        return closeButton;
    }
}
