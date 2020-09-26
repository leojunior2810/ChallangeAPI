package tests;

import hooks.BaseTest;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class MountainView extends BaseTest {

    @Test
    public void checkMountainView(){
        given()
                .log().all()
                .when()
                    .get("weather?zip=94040,us&appid=eb18620d8a0460b4583ff897c0c8b939")
                .then()
                    .statusCode(200)
                    .body("name", containsString("Mountain View"))
                    .body("sys.country", is("US"));
    }

}
