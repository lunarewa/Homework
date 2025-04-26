import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {
    String returnText = "This is expected to be sent back as part of response body.";

    @BeforeAll
    public static void url() {
        RestAssured.baseURI = "https://postman-echo.com/";
    }

    @DisplayName("GET запрос")
    @Test
    public void postmanGetTest(){
        given()
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .contentType(ContentType.JSON)
                .get("get")
                .then()
                .statusCode(200).and().body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .extract().response().prettyPeek();
    }

    @DisplayName("POST Raw Text запрос")
    @Test
    public void postmanPostRawTextTest(){
        String d="test:value";
        given()
                .when()
                .contentType(ContentType.JSON)
                .body(d)
                .post("post")
                .then().statusCode(200).and().body("data",equalTo(d)).extract().response().prettyPeek();
    }

    @DisplayName("POST Form Data запрос")
    @Test
    public void postmanPostFormDataTest(){
        given()
                .header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when()
                .post("post")
                .then()
                .statusCode(200).and().body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2")).extract().response().prettyPeek();
    }

    @DisplayName("PUT запрос")
    @Test
    public void postmanPutTest(){
        given()
                .contentType(ContentType.JSON)
                .body(returnText)
                .when()
                .put("put")
                .then()
                .statusCode(200).and().body("data", equalTo(returnText))
                .extract().response().prettyPeek();
    }

    @DisplayName("PATCH запрос")
    @Test
    public void postmanPatchTest(){
        given()
                .contentType(ContentType.JSON)
                .body(returnText)
                .when()
                .patch("patch")
                .then()
                .statusCode(200).and().body("data", equalTo(returnText))
                .extract().response().prettyPeek();
    }

    @DisplayName("DELETE запрос")
    @Test
    public void postmanDeleteTest(){
        given()
                .contentType(ContentType.JSON)
                .body(returnText)
                .when()
                .delete("delete")
                .then()
                .statusCode(200).and().body("data", equalTo(returnText));
    }
}