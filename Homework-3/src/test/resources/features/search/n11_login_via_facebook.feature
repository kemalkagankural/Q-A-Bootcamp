
Feature: Login n11 via Facebook
  @viaFacebook
  Scenario: Login n11 via Facebook
    Given user launch browser and open the main page
    When user logged in with Facebook
    Then user logged in successfully