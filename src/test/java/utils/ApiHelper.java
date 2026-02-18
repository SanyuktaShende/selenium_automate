package utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiHelper {

    public static String createUser() {

        String email = "user" + System.currentTimeMillis() + "@test.com";

        String body = "{\n" +
                "\"firstName\": \"Test\",\n" +
                "\"lastName\": \"User\",\n" +
                "\"email\": \"" + email + "\",\n" +
                "\"password\": \"Test@1234\"\n" +
                "}";

        Response response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(body)
                .post("https://thinking-tester-contact-list.herokuapp.com/users");

        return email;
    }
}

