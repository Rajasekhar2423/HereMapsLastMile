package com.example.StepDefinitions;

import com.example.HereBEMethods;
import io.cucumber.java.en.Given;

public class HereWeGo_BE {

   HereBEMethods hereBEMethods= new HereBEMethods();


    @Given("^Geocode request by send the Address (.*) and apiKey (.*) and status code (.*)$")
    public void GetApi(String Address,String apiKey,int Statuscode){
        hereBEMethods.API_Query(Address,apiKey,Statuscode);

    }

}