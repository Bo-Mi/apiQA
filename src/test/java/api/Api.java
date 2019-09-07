package api;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class Api {

    @Test
    public void Test1(){

        RestAssured.
                given().
                header("X-Requested-With", "XMLHttpRequest").
                formParam("district_form-district_id", 1).
                when().
                post("https://gorzdrav.spb.ru/api/clinic_list/").
                then().
                statusCode(200).
                body("response.LPUShortName", Matchers.hasItem("Гериатр.центр Сурдо"));

    }

}
