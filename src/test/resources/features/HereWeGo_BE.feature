@HereWeGo_BE
Feature: Here WeGo Api Testing BE

  Scenario Outline: Here WeGO Api Testing BE
    Given Geocode request by send the Address <Address> and apiKey <apiKkey> and status code <statuscode>

    Examples:
      | Address                 | apiKkey                                     | statuscode |
      | Invalidenstr+117+Berlin | OqfUgnzXYhmKRVEQglI9TqFRBUwTMN_39oQu05QCL4o | 200        |
      | Bergerstr+190+Frankfurtammain | OqfUgnzXYhmKRVEQglI9TqFRBUwTMN_39oQu05QCL4o | 200        |
