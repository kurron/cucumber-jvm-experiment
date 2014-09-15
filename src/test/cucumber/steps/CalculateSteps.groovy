package steps

import cucumber.api.groovy.EN
import cucumber.api.groovy.Hooks
import org.example.Calculator

/**
 * Steps needed to run the Calculate feature.
 **/

this.metaClass.mixin( Hooks )
this.metaClass.mixin( EN )

Given( ~'^the input "([^"]*)"$' ) { String input ->
    calculator = new Calculator( input: input )
}

When( ~'^the calculator is run$' ) { ->
    bob = calculator.run()
}

Then( ~'^the output should be "([^"]*)"$' ) { String output ->
    assert bob == output
}
