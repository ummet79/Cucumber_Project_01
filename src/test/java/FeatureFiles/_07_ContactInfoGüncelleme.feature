
Feature: Update Contact Functionality

  Background:
    Given Navigate to the ParaBank website

  Scenario Outline: Update Contact Info
    And Click on the element in the LeftNav
    And updating user information
      | firstName   | <firstName>      |
      | lastName    | <lastName>       |
      | address     | <address>        |
      | city        | <city>           |
      | state       | <state>          |
      | zipCode     | <zipCode>        |
      | phoneNumber | <phoneNumber>    |
      | ssn         | <ssn>            |
    And Click on the element in DialogContent
      | updateprofile |
    #Then User sees the warning message <warningMessage>

    Examples:
      | firstName   | lastName    | address         | city         | state       | zipCode | phoneNumber | ssn         | warningMessage |
      | Ummet123    | Ozsari123   | mimar sinan123  | aydin123     | Turkiye123  | 09100    | 5553332211  | 222222222   | successfully    |
      | Ummet123    | Ozsari123   | mimar sinan123  |              |             |          | 5553332211  | 222222222   | required        |












