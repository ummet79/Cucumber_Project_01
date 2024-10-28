Feature: User Register

  Background:
    Given the user navigates to the ParaBank website

  Scenario: Successful registration and login
    When Click on the Element in LeftNav
      | Register |
    And the user fills in the registration form with valid customer data
      | firstName   | Fatma Nur   |
      | lastName    | Akcebe      |
      | address     | 123 Elm St  |
      | city        | Merkez      |
      | state       | Malatya     |
      | zipCode     | 62701       |
      | phoneNumber | 555-1234    |
      | ssn         | 123-45-6789 |
    And Click on the Element in Dialog
      | RegisterButton |
    And the user confirms the message that he has successfully registered
    Then the user changes the session by clicking the button
      | logout |