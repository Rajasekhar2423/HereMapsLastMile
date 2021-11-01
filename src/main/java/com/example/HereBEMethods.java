package com.example;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

import static io.restassured.RestAssured.given;


public class HereBEMethods {

    public void API_Query(String Address,String apiKey,int Statuscode) throws IOException {

        RestAssured.baseURI="https://geocode.search.hereapi.com/v1/geocode";
        String response = given().log().all().queryParam("q", Address).queryParam("apiKey", apiKey)
                .when().get().then().log().all().assertThat().statusCode(Statuscode).extract().response().asString();
        //.log().all()
        JsonPath js1 = new JsonPath(response);
        String coordinates=js1.getString("items.position");
        System.out.println("Address : "+Address+" Coordinates are : "+coordinates);


     }

}
