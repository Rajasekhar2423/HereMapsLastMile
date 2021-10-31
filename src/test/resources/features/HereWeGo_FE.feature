@HereWeGo_2_HappyPaths
Feature: Here WeGo FE Delivery Route Plan

  @HereWeGoFEPath1
  Scenario Outline: Here WeGO FE Happy Path ONe
    Given Launch Chrome and Navigate to Here WeGo Home Page
    Then Complete Fleet and Depot Section
    Then Add Orders Using personName <name> and Address <Address> and Demand <Demand>
    Then Add Orders Using personName <name2> and Address <Address2> and Demand <Demand2>
    Then Add Orders Using personName <name3> and Address <Address3> and Demand <Demand3>
    Then DownLoad the Tour Details plan Pdf
    Examples:
      | name        | Address                                         | Demand | name2      | Address2                                    | Demand2 | name3       | Address3                                    | Demand3 |
      | Rajasekhar1 | Hanauer Landstraße 292,60314 Frankfurt, Germany | 1      | Rajasekar2 | Berger Straße 160, 60385 Frankfurt, Germany | 2       | Rajasekhar3 | Berger Straße 180, 60385 Frankfurt, Germany | 3       |

  @HereWeGoFEPath2
  Scenario: Here WeGO FE Happy Path two
    Given Launch Chrome and Navigate to Here WeGo Home Page
    Then Complete Fleet and Depot Section
    Then Add CSV File
    Then DownLoad the Tour Details plan Pdf