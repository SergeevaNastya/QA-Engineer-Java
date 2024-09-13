package lesson17;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ApiTest {

    @BeforeAll
    static void setUp() {
        requestSpecification = RestAssured.given()
                .baseUri("https://postman-echo.com");
    }

    @Test
    public void testGetRequest() {
        given().
                queryParam("foo1", "bar1").
                queryParam("foo2", "bar2").
                when().
                get("/get").
                then().
                statusCode(200).
                body("args.foo1", equalTo("bar1")).
                body("args.foo2", equalTo("bar2"));
    }

    @Test
    public void testPostRawText() {
        given().
                header("Content-Type", "application/json").
                body("{\"test\":\"value\"}").
                when().
                post("/post").
                then().
                statusCode(200).
                body("json.test", equalTo("value"));
    }

    @Test
    public void testPostFormData() {
        given().
                contentType("application/x-www-form-urlencoded; charset=UTF-8").
                formParam("foo1", "bar1").
                formParam("foo2", "bar2").
                when().
                post("/post").
                then().
                statusCode(200).
                body("form.foo1", equalTo("bar1")).
                body("form.foo2", equalTo("bar2"));
    }

    @Test
    public void testPutRequest() {
        given().
                header("Content-Type", "text/plain").
                body("This is expected to be sent back as part of response body.").
                when().
                put("/put").
                then().
                statusCode(200).
                body("data", equalTo("This is expected to be sent back as part of response body."));
    }

    @Test
    public void testPatchRequest() {
        given().
                header("Content-Type", "text/plain").
                body("This is expected to be sent back as part of response body.").
                when().
                patch("/patch").
                then().
                statusCode(200).
                body("data", equalTo("This is expected to be sent back as part of response body."));
    }

    @Test
    public void testDeleteRequest() {
        given().
                header("Content-Type", "text/plain").
                body("This is expected to be sent back as part of response body.").
                when().
                delete("/delete").
                then().
                statusCode(200).
                body("data", equalTo("This is expected to be sent back as part of response body."));
    }
}