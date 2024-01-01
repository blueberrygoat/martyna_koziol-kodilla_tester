Feature: Cash Withdrawal

  Scenario: Unsuccessful withdrawals from a wallet
    Given I have deposited $0 in my wallet
    When I request $100
    Then $0 should be dispensed
