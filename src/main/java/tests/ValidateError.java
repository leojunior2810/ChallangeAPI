package tests;

import hooks.BaseTest;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class ValidateError extends BaseTest {

    @Test
    public void requestIncorrect(){
        given()
                .when()
                    .get("base?q=London,uk&APPID=eb18620d8a0460b4583ff897c0c8b939")
                .then()
                    .statusCode(404)
                    .body("message", containsString("Internal error"));
    }
}
