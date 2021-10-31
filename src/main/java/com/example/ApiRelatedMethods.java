package com.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiRelatedMethods {
    public static Response response;
    public static RequestSpecification request;


    public void formRequestUrl(String baseUrl, String queryEndPoint) {
        RestAssured.baseURI = baseUrl;
        RestAssured.basePath = queryEndPoint;

    }


}
