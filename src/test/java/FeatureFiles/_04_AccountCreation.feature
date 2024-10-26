Feature: User Functionality

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
    Then the user changes the session by clicking the button
      | logout |

  Scenario: Successful user login and logout
    When the user enters a valid username and password
    And the user clicks the button
      | Login |

  Scenario Outline: Opening a New Account
    When The user clicks on the Element in Content
      | opennewaccount |

    Then The user is directed to the bank account creating page
    And The user selects the "<accountType>" type from the drop-down menu
    And The user receives a warning that the new bank account should have a minimum balance
    And The user selects from Dropdown menu
      | accountselect |
    And The user clicks on the Element in Dialog
      | opennewaccountbutton |

    Then The user confirms the successful creation of the new bank account
    And The user clicks on the generated account number.
    Then The user verifies their information in the account details "<accountType>"

    Examples:
      | accountType |
      | CHECKING    |
      | SAVINGS     |
