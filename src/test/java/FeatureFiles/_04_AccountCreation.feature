Feature: User Functionality

  Background:
    Given the user navigates to the ParaBank website

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
