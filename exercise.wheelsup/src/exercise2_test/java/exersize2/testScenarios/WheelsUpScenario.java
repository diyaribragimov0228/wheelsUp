package exersize2.testScenarios;

import initializers.DriverInitializer;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import exersize2.pages.CoreMembershipPage;
import exersize2.pages.PrivateAviationCompanyPage;
import exersize2.pages.RequestInfoPage;
import exersize2.methods.MethodFactory;

public class WheelsUpScenario {
    public WebDriver driver = DriverInitializer.getDriver();

    PrivateAviationCompanyPage privateAviationCompanyPage = new PrivateAviationCompanyPage(driver);
    CoreMembershipPage coreMembershipPage = new CoreMembershipPage(driver);
    RequestInfoPage requestInfoPage = new RequestInfoPage(driver);
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void exercise1() throws InterruptedException {
        //Navigate to https://wheelsup.com
        driver.manage().window().maximize();
        driver.get("https://wheelsup.com");

       // Find and print out in the console the following title “Flying, Personalized”
        System.out.println(privateAviationCompanyPage.getFlyingPersonalized().getText());
        MethodFactory.scrollTo(driver).executeScript("arguments[0].scrollIntoView(true);", privateAviationCompanyPage.getDiscoverThePossibilities());

        //Scroll down and print out in the console “Discover The Possibilities”
        System.out.println(privateAviationCompanyPage.getDiscoverThePossibilities().getText());
        MethodFactory.scrollTo(driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        System.out.println(privateAviationCompanyPage.getPhoneNumber().getText());
        System.out.println(privateAviationCompanyPage.getEmailID().getText());
        System.out.println(privateAviationCompanyPage.getFindUsText().getText());


        //Scroll to top
        MethodFactory.actions(driver).sendKeys(Keys.HOME).build().perform();
        MethodFactory.wait(driver, ExpectedConditions.elementToBeClickable(privateAviationCompanyPage.getFlyButton()));
        privateAviationCompanyPage.getFlyButton().click();
        privateAviationCompanyPage.getCoreMembershipButton().click();
        MethodFactory.scrollTo(driver).executeScript("arguments[0].scrollIntoView(true);", coreMembershipPage.getPrivateAviationMeetsSocialAviationHeader());
        int size = coreMembershipPage.getPrivateAviationMeetsSocialAviationHeaderHeaders().size();


        // Scroll to the bottom, print out phone number, email(Contact Us), and address(Find Us)
        for (int i = 0; i <= size - 1; i++) {
            System.out.println(coreMembershipPage.getPrivateAviationMeetsSocialAviationHeaderHeaders().get(i).getText());
        }

        // Scroll to bottom -> “Learn more today” section (Enter first and last name)
        MethodFactory.scrollTo(driver).executeScript("arguments[0].scrollIntoView(true);", coreMembershipPage.getLearnMoreTodayHeading());
        MethodFactory.wait(driver, ExpectedConditions.elementToBeClickable(coreMembershipPage.getContinueButton()));

        //click on continue
        coreMembershipPage.getContinueButton().click();

        // Validate url contains (request-info)
        softAssert.assertTrue(driver.getCurrentUrl().contains("request-info"));

        // Enter the respective data to all fields (request-info)
        MethodFactory.scrollTo(driver).executeScript("arguments[0].scrollIntoView(true);", requestInfoPage.getTravelTypeDropdown());
        requestInfoPage.getTravelTypeDropdown().click();
        MethodFactory.wait(driver, ExpectedConditions.elementToBeClickable(requestInfoPage.getPersonalTravelDropdownValue()));
        requestInfoPage.getPersonalTravelDropdownValue().click();
        requestInfoPage.getFirstNameInput().sendKeys("John ");
        requestInfoPage.getLastNameInput().sendKeys("Doe ");
        requestInfoPage.getEmailInput().sendKeys("johndoe@gmail.com");
        MethodFactory.scrollTo(driver).executeScript("arguments[0].scrollIntoView(true);", requestInfoPage.getCompanyNameInput());
        requestInfoPage.getPhoneInput().sendKeys("3479877777");
        requestInfoPage.getCompanyNameInput().sendKeys("Apple ");
        requestInfoPage.getAddressInput().sendKeys("300 Madison Ave ");
        requestInfoPage.getCityInput().sendKeys("New York");
        requestInfoPage.getPostalCodeInput().sendKeys("10017");
        requestInfoPage.getStateInput().sendKeys("New York");
        MethodFactory.scrollTo(driver).executeScript("arguments[0].scrollIntoView(true);", requestInfoPage.getCountryInput());
        requestInfoPage.getCountryInput().sendKeys("United States");
        MethodFactory.scrollTo(driver).executeScript("arguments[0].scrollIntoView(true);", requestInfoPage.getCountryInput());
        MethodFactory.wait(driver, ExpectedConditions.elementToBeClickable(requestInfoPage.getFlyingFrequencyDropdown()));
        Thread.sleep(5000);
        requestInfoPage.getFlyingFrequencyDropdown().click();
        MethodFactory.wait(driver, ExpectedConditions.elementToBeClickable(requestInfoPage.getFreqValue()));
        requestInfoPage.getFreqValue().click();
        requestInfoPage.getDoYouOwnOrTravelToSecondHome().click();
        MethodFactory.scrollTo(driver).executeScript("arguments[0].scrollIntoView(true);", requestInfoPage.getDoYouOwnOrTravelToSecondHomeNo());
        MethodFactory.wait(driver, ExpectedConditions.elementToBeClickable(requestInfoPage.getDoYouOwnOrTravelToSecondHomeNo()));
        requestInfoPage.getDoYouOwnOrTravelToSecondHomeNo().click();
        requestInfoPage.getDoYouHaveNeedToTravelWithPets().click();
        MethodFactory.wait(driver, ExpectedConditions.elementToBeClickable(requestInfoPage.getDoYouHaveNeedToTravelWithPetsNo()));
        Thread.sleep(500);
        requestInfoPage.getDoYouHaveNeedToTravelWithPetsNo().click();
        MethodFactory.wait(driver, ExpectedConditions.elementToBeClickable(requestInfoPage.getCharterCheckbox()));
        requestInfoPage.getCharterCheckbox().click();
        MethodFactory.scrollTo(driver).executeScript("arguments[0].scrollIntoView(true);", requestInfoPage.getOwnAircraftCheckbox());
        requestInfoPage.getHowHearAboutUs().click();
        MethodFactory.wait(driver, ExpectedConditions.elementToBeClickable(requestInfoPage.getHowHearAboutUsFinancialAdvisor()));
        requestInfoPage.getHowHearAboutUsFinancialAdvisor().click();
        MethodFactory.scrollTo(driver).executeScript("arguments[0].scrollIntoView(true);", requestInfoPage.getTextBox());
        requestInfoPage.getTextBox().sendKeys("text entry");

        // Click “X” at the top right corner
        requestInfoPage.getCloseButton().click();
        softAssert.assertAll();


    }
}
