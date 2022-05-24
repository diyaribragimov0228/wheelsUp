package initializers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class DriverInitializer {
    private static WebDriver driver;
    private static final DriverInitializer driverInitializer= new DriverInitializer();

    private DriverInitializer(){}

    public static WebDriver getDriver(){
        if (driver==null){
            return driverInitializer.invokeDriver();
        }else {
            return driver;
        }
    }



    public WebDriver invokeDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOption= new ChromeOptions();
        chromeOption.setHeadless(true);
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        return driver;
    }
}
