package org.kurron.cucumber;

/**
 * Step definitions of our little cucumber test.
 */

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
    @Given("^I have \\$(\\d+) in my account$") //
    public void I_have_$_in_my_account(int dollars) {
        // Express the Regexp above with the code you wish you had
    }

    @When("^I wave my magic ring at the machine$")
    public void I_wave_my_magic_ring_at_the_machine() {
        // Express the Regexp above with the code you wish you had
    }
    @Then("^I should get a soda$")
    public void I_should_get_a_soda() {
        // Express the Regexp above with the code you wish you had
    }
}
