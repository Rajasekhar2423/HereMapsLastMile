package com.example.StepDefinitions;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;


import static io.restassured.RestAssured.*;

public class Basics {

    public static void main(String[] args ) throws InterruptedException {

       // System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        RestAssured.baseURI="https://geocode.search.hereapi.com/v1/geocode";

        given().log().all().queryParam("q","Invalidenstr+117+Berlin").queryParam("apiKey","OqfUgnzXYhmKRVEQglI9TqFRBUwTMN_39oQu05QCL4o")
        .when().get().then().assertThat().statusCode(200);
    //.log().all()
        System.out.println("*****************");

        String response = given().log().all().queryParam("q", "Invalidenstr+117+Berlin").queryParam("apiKey", "OqfUgnzXYhmKRVEQglI9TqFRBUwTMN_39oQu05QCL4o")
                .when().get().then().log().all().assertThat().statusCode(200).toString();
        System.out.println("*****************");
        System.out.println();
    }
}
