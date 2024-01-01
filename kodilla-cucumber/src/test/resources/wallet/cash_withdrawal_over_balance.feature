Feature: Cash Withdrawal

  Scenario: Almost Successful withdrawals from a wallet
    Given I have deposited $200 in my wallet
    When I request $300
    Then $200 should be dispensed
