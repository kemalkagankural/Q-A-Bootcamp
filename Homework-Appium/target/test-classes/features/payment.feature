#make a payment to three different client
# client countries CN, USA, JPN
# client amounts 10, 20, 30
# for each payment user's balance should be checked.

# scenario
# make payment for each country in countries list
#logout test
Feature: make a payment to three different client
@step1
Scenario:make a payment to three different client
When User login with user valid credentails
And I click make payment button for deposit
And  User make a deposit entering payment details
Then  User should check to balance
