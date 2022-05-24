package exersize2.methods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MethodFactory {



    public static JavascriptExecutor scrollTo(WebDriver driver){
       return ((JavascriptExecutor) driver);
    }

    public static Actions actions(WebDriver driver){
        return new Actions(driver);
    }

    public static void wait(WebDriver driver, ExpectedCondition<WebElement> expectedCondition){
        WebDriverWait webDriverWait= new WebDriverWait(driver, 45);
        webDriverWait.until(expectedCondition);
    }



}
