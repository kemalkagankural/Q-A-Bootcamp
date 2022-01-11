Feature: I want to check favourited films

  @favoritos
  Scenario: Check no favourite message
    Given User without favoritos opens favoritos tab
    When Favoritos screen is opened
    Then Default message appeared
