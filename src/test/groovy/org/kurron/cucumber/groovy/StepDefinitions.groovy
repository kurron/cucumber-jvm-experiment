package org.kurron.cucumber.groovy

import cucumber.api.PendingException


this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

/**
 * A groovy version of the test implementations.
 */

Given(~'^I have \\$(\\d+) in my account$') { int arg1 ->
    // Express the Regexp above with the code you wish you had
    throw new PendingException()
}

When(~'^I wave my magic ring at the machine$') { ->
    // Express the Regexp above with the code you wish you had
    throw new PendingException()
}

Then(~'^I should get a soda$') { ->
    // Express the Regexp above with the code you wish you had
    throw new PendingException()
}
