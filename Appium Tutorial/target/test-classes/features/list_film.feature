Feature: : Movie List
  I am as a user
  I want to perform a movie search by title.
  to be able to add to my favorites list


  @appium
  Scenario: Perform a movie title search
  Given I'm on the movie list
  When  to perform a title search "keyword"
  Then I see the search result
