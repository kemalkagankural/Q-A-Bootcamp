# Initially I have 2 votes
# I will create one more vote
# SO I have 3 votes
# Check whether I have 3 votes.


Feature: List votes
  Background:
    Given x-api-key and baseURI are already acquired.

  @votes
  Scenario Outline: Creating votes and Listing for all votes
    When I check number of votes for this "<sub_id>"
    Then I see numbers
    When I will create one more vote for this "<sub_id>" with "<image_id>"
    Then I have numbers plus one votes for this "<sub_id>" and image should "<image_id>"
    Examples:
    |sub_id      |image_id  |
    |my-user-1234|k4vWnFdL2|
    |User-1234|0SxW2SQ_S|


    #image id senaryo taslağından alınacak
    #sub_id ler senaryo taslağından alınacak
    # assertion en son vote ettiğim image id benim
    # get edip boyutunu karşılaştırdığım adımda
    # o image id mi var diye bakılacak

