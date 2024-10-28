Feature: InterAccount Functionality

  Background:
    Given Navigate to ParaBank Website
    And Click on the Element in LeftNav
      | register |
    And User send random keys in Dialog
    And Click on the Element in Dialog
      | registerButton2 |
    Then Message Should be Displayed
      | success |

  Scenario Outline: Create Inter Account

    And Click on the Element in LeftNav
      | openNewAccount |
    When User select the element from Dialog
      | accountTypeDropdown | <accountType> |
    Then Minimum Account Message Should be Displayed
      | minimum |
    When Click on the Element New Account
    Then New Account Message Should be Displayed
      | Opened |

    And Click on the Element in LeftNav
      | InterAccount |

    Then Transfer Page Should be Displayed

    And User send keys in Dialog
      | amount | <amount1> |

    And Click on the Element in Dialog
      | fromAccountSelect  |
      | fromAccountSelect1 |
      | toAccountSelect    |
      | toAccountSelect1   |
      | transferButton     |

    Then Transfer Confirmation Message

    And Click on the Element in LeftNav
      | accountsOverview |

    And Click on the Element in Dialog
      | fromAccountId |


    And Funds Transfer Transaction Received
      | lastFundsTransferReceived |

    And Amount Transaction Control
      | <amount1> |

    Examples:
      | amount1 | accountType |
      | 10      | 1           |


  Scenario Outline: Create Transfer Funds and verify with Id

    And Click on the Element in LeftNav
      | openNewAccount |
    When User select the element from Dialog
      | accountTypeDropdown | <accountType> |
    Then Minimum Account Message Should be Displayed
      | minimum |
    When Click on the Element New Account
    Then New Account Message Should be Displayed
      | Opened |

    And Click on the Element in LeftNav
      | InterAccount |

    Then Transfer Page Should be Displayed

    And User send keys in Dialog
      | amount | <amount1> |

    And Click on the Element in Dialog
      | fromAccountSelect  |
      | fromAccountSelect1 |
      | toAccountSelect    |
      | toAccountSelect1   |
      | transferButton     |

    Then Transfer Confirmation Message

    And Click on the Element in LeftNav
      | accountsOverview |

    And User send keys and click in Dialog for Find Transaction Id

    Examples:
      | amount1 | accountType |
      | 500     | 1           |