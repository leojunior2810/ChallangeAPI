package hooks;

import io.restassured.http.ContentType;

public interface Core {

    String APP_BASE_URL = "http://api.openweathermap.org";
    ContentType APP_CONTENT_TYPE = ContentType.JSON;
    String APP_BASE_PATH = "/data/2.5/";
    Long MAX_TIMEOUT = 10000L;
}
