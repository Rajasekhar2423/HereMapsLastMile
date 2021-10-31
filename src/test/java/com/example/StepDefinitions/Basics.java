package com.example.StepDefinitions;


import io.restassured.RestAssured;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import static io.restassured.RestAssured.*;

public class Basics {
    public static void main(String[] args ) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        RestAssured.baseURI="https://geocode.search.hereapi.com";



    }
}
