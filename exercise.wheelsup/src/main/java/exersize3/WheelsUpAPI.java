package exersize3;

import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class WheelsUpAPI {


    @DataProvider (name = "data-provider")
    public Object[][] dpMethod(){
        return new Object[][] {{"https://twitter.com/WheelsUp"}, {"https://instagram.com/wheelsup8760"}};
    }



    @Test
    public void verifySocialAccounts(){
        RestAssured.baseURI= "https://wheelsup.com/_mock_/initial-data.json";


       String response = RestAssured.given().when().get()
               .then()
               .extract()
               .response()
               .asString();
       System.out.println(response);



    }
}
