package com.example.testunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.testng.annotations.BeforeTest;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        tags = "@HereWeGoFEPath2",
        glue = {"com.example.StepDefinitions"},
        plugin = {"pretty",
        "html:target/cucumber-reports/cucumber.html",
        "json:target/cucumber-reports/cucumber.json"
        },monochrome = true
        )
public class TestRunner  {

        @BeforeClass
        public static void beforeclass(){
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        }
        //update line 13 for FE with @HereWeGo_2_HappyPaths  @HereWeGo_BE
        //@AfterClass


}
