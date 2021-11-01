package com.example.StepDefinitions;

import com.example.HereFEMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class HereWeGo_FE {

    HereFEMethods hereFEMethods= new HereFEMethods();
    @Given("^Launch Chrome and Navigate to Here WeGo Home Page")
    public void Navigate_To_HereWeGo_HomePage() throws InterruptedException {
        hereFEMethods.Navigate_To_Here_We_Go();
    }

    @Then("^Complete Fleet and Depot Section")
    public void Complete_Fleet_And_DepotSection() throws InterruptedException {
        hereFEMethods.Complete_Fleet_And_DepotSection();
    }

    @Then("^Add Orders Using personName (.*) and Address (.*) and Demand (.*)$")
    public void Add_All_Three_Orders(String PersonName,String Address,String demand) throws InterruptedException {
        hereFEMethods.AddOrder(PersonName,Address,demand);
    }

    @Then("^DownLoad the Tour Details plan Pdf")
    public void Download_Tour_Plan() throws InterruptedException {
       hereFEMethods.DownloadTourPlan();
       hereFEMethods.CloseBrowser();
    }

    @Then("^Add CSV File")
    public void Browse_CSV_Fles() throws InterruptedException {
        hereFEMethods.AddCsv_File();
    }
}
