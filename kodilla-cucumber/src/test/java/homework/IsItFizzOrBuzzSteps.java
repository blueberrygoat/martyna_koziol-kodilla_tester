package homework;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static homework.FizzBuzzChecker.checkIfDivisible;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsItFizzOrBuzzSteps {
    private int number;
    private String answer;

    @Given("The number is 0")
    public void the_number_is_0 () {
        this.number = 0;
    }
    @Given("The number is 1")
    public void the_number_is_1 () {
        this.number = 1;
    }
    @Given("The number is 3")
    public void the_number_is_3 () {
        this.number = 3;
    }
    @Given("The number is 5")
    public void the_number_is_5 () {
        this.number = 5;
    }
    @Given("The number is 15")
    public void the_number_is_15 () {
        this.number = 15;
    }

    @When("I check the number")
    public void i_check_the_number() {
        this.answer = checkIfDivisible(this.number);
    }
    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        assertEquals(string, this.answer);
    }
}
