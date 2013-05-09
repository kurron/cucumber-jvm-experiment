package org.kurron.cucumber.groovy

import cucumber.api.PendingException
import org.slf4j.Logger
import org.slf4j.LoggerFactory


this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

/**
 * A groovy version of the test implementations.
 */

final Logger logger = LoggerFactory.getLogger( "StepDefinitions" )

Given(~'^I have \\$(\\d+) in my account$') { int arg1 ->
    logger.debug( 'I have {} dollars in my account', arg1 )
}

When(~'^I wave my magic ring at the machine$') { ->
    logger.debug( 'Magic ring waved.' )
}

Then(~'^I should get a soda$') { ->
    logger.debug( 'New soda returned.' )
}
