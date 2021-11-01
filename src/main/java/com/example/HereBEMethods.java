package com.example;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;


public class HereBEMethods {

    public void API_Query(String Address,String apiKey,int Statuscode){

        RestAssured.baseURI="https://geocode.search.hereapi.com/v1/geocode";
        String response = given().log().all().queryParam("q", Address).queryParam("apiKey", apiKey)
                .when().get().then().log().all().assertThat().statusCode(Statuscode).toString();
        System.out.println(response);

    }
}
