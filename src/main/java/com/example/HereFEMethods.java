package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HereFEMethods {


    //public WebDriver webDriver= new ChromeDriver();

    public RemoteWebDriver webDriver = new ChromeDriver();

    String companyName = "CompanyMaster";
    String whereIsYourDepot = "Adam-Opel-Straße 24,60386 Frankfurt, Germany";
    //page objects
    String skipButton = "//*[@id='root']//*[contains(text(),'Skip')]";
    String acceptCookiesxpath = "//*[contains(text(),'Accept cookies')]";
    String companyNamexpath = "//*[@class='css-1gcz17a']/button";
    String whereIsYourDepotXpath = "//*[@id='input-depot-loca']";
    String fd_NextXpath = "//*[@id='button-fleet-next']";
    String AddOrdersTabXpath = "//*[@id='button-step-2']";
    String AddManualOrders = "//*[@id='button-orders-mode-Manual']";
    String AddOrdersNameXpath = "//*[@id='input-edit-order-name']";
    String AddOrdersDemandXpath = "//*[@id='input-edit-order-demand']";
    String AddOrdersAddressXpath = "//*[@id='input-edit-order-add']";
    String AddManualOrder = "//*[@id='button-add-order-manual']";
    String DownloadTourPlanxpath="//*[@id='button-tour-details-pdf']";
    String planTourxpath="//*[@id='button-orders-next']";

    String importxpath="//*[@id='button-orders-mode-Import']";
    String browseFileXpath="//*[@id='input-file-upload']";
    String savexpath="//*[@id='root']//*[contains(text(),'Save')]";
    String confirmxpath="//*[@id='root']//*[contains(text(),'Confirm')]";

    public void Navigate_To_Here_We_Go() throws InterruptedException {
        webDriver.get("https://wegodeliver.here.com/");
        webDriver.manage().window().maximize();
        WebElement webElement = webDriver.findElement(By.xpath(skipButton));
        webElement.click();
        WebElement acceptCookies = webDriver.findElement(By.xpath(acceptCookiesxpath));
        acceptCookies.click();
    }

    public void Complete_Fleet_And_DepotSection() throws InterruptedException {

      /* Thread.sleep(2000);
       WebElement webElementCompanyName= webDriver.findElement(By.xpath(companyNamexpath));
       webElementCompanyName.sendKeys(companyName);
        Thread.sleep(5000);
        */
        WebElement depot_element = webDriver.findElement(By.xpath(whereIsYourDepotXpath));
        depot_element.click();
        depot_element.sendKeys(whereIsYourDepot);

        Thread.sleep(2000);
        WebElement next_element = webDriver.findElement(By.xpath(fd_NextXpath));
        next_element.click();


    }

    public void AddOrder(String PersonName, String Address, String demand) throws InterruptedException {
       /* WebElement AddOrders_element = webDriver.findElement(By.xpath(AddOrdersTabXpath));
        AddOrders_element.click();
        */
        WebElement AddmanualOrders_element = webDriver.findElement(By.xpath(AddManualOrders));
        AddmanualOrders_element.click();
        WebElement AddName = webDriver.findElement(By.xpath(AddOrdersNameXpath));
        AddName.click();
        AddName.sendKeys(PersonName);
        WebElement AddAddress = webDriver.findElement(By.xpath(AddOrdersAddressXpath));
        AddAddress.click();
        AddAddress.sendKeys(Address);
        // AddAddress.sendKeys(Keys.ARROW_DOWN);
        AddAddress.sendKeys(Keys.TAB);
        AddAddress.click();
        Thread.sleep(2000);
        AddAddress.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        WebElement Addmanualorder = webDriver.findElement(By.xpath(AddManualOrder));
        Addmanualorder.click();


    }

    public void DownloadTourPlan() throws InterruptedException {
        Thread.sleep(2000);
        WebElement planTourElementNext = webDriver.findElement(By.xpath(planTourxpath));
        planTourElementNext.click();
        Thread.sleep(2000);
        WebElement Download = webDriver.findElement(By.xpath(DownloadTourPlanxpath));
        Download.click();
        Thread.sleep(10000);
    }
    public void AddCsv_File() throws InterruptedException {
        WebElement import_element_tab = webDriver.findElement(By.xpath(importxpath));
        import_element_tab.click();
        WebElement browserfile_element_tab = webDriver.findElement(By.xpath(browseFileXpath));
        Thread.sleep(2000);
       // browserfile_element_tab.click();
        browserfile_element_tab.sendKeys("C:\\Users\\rajasekhar.madireddy\\IdeaProjects\\HereMapsLastMile\\src\\test\\resources\\CSVFILES\\here-wego-deliver-three-paths.csv");
       //its accepting the csv file from the absolute only .. please edit it when you download this project
        // browserfile_element_tab.sendKeys("src/test/resources/CSVFILES/here-wego-deliver-three-paths.csv");

        Thread.sleep(2000);
        webDriver.findElement(By.xpath(savexpath)).click();
        Thread.sleep(2000);
        webDriver.findElement(By.xpath(confirmxpath)).click();
    }
    public void CloseBrowser() {

        webDriver.close();
    }


}
