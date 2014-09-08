package steps

import cucumber.api.PendingException

/**
 * St.
 **/

this.metaClass.mixin( cucumber.api.groovy.Hooks )
this.metaClass.mixin( cucumber.api.groovy.EN )

Given( ~'^the input "([^"]*)"$' ) { String arg1 -> // Express the Regexp above with the code you wish you had
        throw new PendingException()
}
When( ~'^the calculator is run$' ) { -> // Express the Regexp above with the code you wish you had
        throw new PendingException()
}
Then( ~'^the output should be "([^"]*)"$' ) { String arg1 -> // Express the Regexp above with the code you wish you had
    throw new PendingException()
}