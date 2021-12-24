Feature: e2e test for search functionality.


  @KaanDoumgunucocugu
  Scenario: ui and api testing scenario for Search with known keyword
    Given I open browser and go to the main page
    When I search with "keyword" in the home page
    Then api endpoint should be called with "keyword"
    When api returned related results
    Then I should see related results on the main page


