package wallet;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    private final Cashier cashier = new Cashier(cashSlot);

    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        wallet.deposit(200);
        Assertions.assertEquals(200, wallet.getBalance(), "Incorrect wallet balance");
    }

    @When("I request $30")
    public void i_request_$30() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 30);
    }

    @Then("$30 should be dispensed")
    public void $30_should_be_dispensed() {
        Assertions.assertEquals(30, cashSlot.getContents());
    }

    @Then("the balance of my wallet should be $170")
    public void the_balance_of_my_wallet_should_be_$170() {
        Assertions.assertEquals(170, wallet.getBalance(), "Incorrect wallet balance");
    }


    @When("I request $300")
    public void i_request_$300() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 300);
    }


    @Given("I have deposited $0 in my wallet")
    public void i_have_deposited_$0_in_my_wallet() {
        wallet.deposit(0);
        Assertions.assertEquals(0, wallet.getBalance(), "Incorrect wallet balance");
    }

    @When("I request $100")
    public void i_request_$100() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 100);
    }

    @Then("$0 should be dispensed")
    public void $0_should_be_dispensed() {
        Assertions.assertEquals(0, cashSlot.getContents());
    }





    @Given("there is $100 in my wallet")
    public void there_is_$100_in_my_wallet() {
        wallet.deposit(100);
        Assertions.assertEquals(100, wallet.getBalance(), "Incorrect wallet balance");
    }

    @When("I withdraw $200")
    public void i_withdraw_$200() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 200);
    }

    @Then("nothing should be dispensed")
    public void nothing_Should_Be_Dispensed() {
        Assertions.assertEquals(0, cashSlot.getContents());
    }

    @And("I should be told that I don't have enough money in my wallet")
    public void i_Should_BeTold_That_I_DonT_Have_Enough_Money_In_My_Wallet() {
        Assertions.assertEquals("I don't have enough money in my wallet", cashSlot.getMessage());
    }

    @When("I check the balance of my wallet")
    public void i_Check_The_Balance_Of_My_Wallet() {
        Assertions.assertEquals(100, wallet.getBalance());
    }

    @Then("I should see that the balance is $100")
    public void iShouldSeeThatTheBalanceIs$() {
        Assertions.assertEquals("The balance is $100", wallet.displayBalance());
    }
}


