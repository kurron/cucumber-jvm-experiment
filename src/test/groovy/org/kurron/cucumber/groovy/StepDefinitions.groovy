package org.kurron.cucumber.groovy

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

/**
 * A groovy version of the test implementations.
 */
@SuppressWarnings( "GrMethodMayBeStatic" )
class StepDefinitions
{
    @Given( '^I have \\$(\\d+) in my account$' )
    public void I_have_$_in_my_account( final int dollars )
    {
        System.err.println( "dollars = " + dollars );
    }

    @When( '^I wave my magic ring at the machine$' )
    public void I_wave_my_magic_ring_at_the_machine()
    {
        System.err.println( "Magic ring is used." );
    }

    @Then( '^I should get a soda$' )
    public void I_should_get_a_soda()
    {
        System.err.println( "A soda has been returned." );
    }
}
