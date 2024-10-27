Feature: Update contact Functionally

  Background:
    Given Navigate to the ParaBank website


  Scenario: Update Contact Info
    And Click on the Element in the LeftNav
      | updateContact |
    And Updating user information

      | firstName   | Ummet123       |
      | lastName    | Ozsari123      |
      | address     | mimar sinan123 |
      | city        | aydin123       |
      | state       | Turkiye123     |
      | zipCode     | 09100          |
      | phoneNumber | 5553332211     |
      | ssn         | 222222222      |

    And Click on the Element in DialogContent
      | updateProfile |

    And Click On The Element in LeftNav
      | logout |

    Then User confirms update succsess

  Scenario: Update Contact Info (negative)
    And Click on the element in the LeftNav

    And updating user informationn

      | firstName   | Ummet123       |
      | lastName    | Ozsari123      |
      | address     | mimar sinan123 |
      | city        |                |
      | state       |                |
      | zipCode     |                |
      | phoneNumber | 5553332211     |
      | ssn         | 222222222      |

    And Click on the element in DialogContent

    Then User see rhe warning message












