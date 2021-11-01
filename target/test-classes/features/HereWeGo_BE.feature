@HereWeGo_BE
Feature: Here WeGo FE Delivery Route Plan

  Scenario Outline: Here WeGO BE Happy Path One
    Given Geocode request by send the Address <Address> and apiKey <apiKkey> and status code <statuscode>

    Examples:
      | Address                       | apiKkey                                     | statuscode |
      | Invalidenstr+117+Berlin       | OqfUgnzXYhmKRVEQglI9TqFRBUwTMN_39oQu05QCL4o | 200        |
      | Bergerstr+117+Frankfurtammain | OqfUgnzXYhmKRVEQglI9TqFRBUwTMN_39oQu05QCL4o | 200        |
