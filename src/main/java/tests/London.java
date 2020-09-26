package tests;

import hooks.BaseTest;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class London extends BaseTest {

    @Test
    public void checkLondon() {
        given()
                .log().all()
                .when()
                    .get("weather?q=London,uk&APPID=eb18620d8a0460b4583ff897c0c8b939")
                .then()
                    .statusCode(200)
                    .body("name", containsString("London"))
                    .body("weather[0].id", is(800));

    }
}
