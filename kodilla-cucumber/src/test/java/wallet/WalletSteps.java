package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

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
    @When("I request $300")
    public void i_request_$300() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 300);
    }
    @Then("$200 should be dispensed")
    public void $_should_be_dispensed() {
        Assertions.assertEquals(200, cashSlot.getContents());    }


    @Given("I have deposited $0 in my wallet")
    public void i_have_deposited_$0_in_my_wallet() {
        wallet.deposit(0);
        Assertions.assertEquals(0, wallet.getBalance(), "Incorrect wallet balance");
    }
    @When("I request $100")
    public void i_request_$100() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 100);}

    @Then("$0 should be dispensed")
    public void $0_should_be_dispensed() {
        Assertions.assertEquals(0, cashSlot.getContents());
    }
}

