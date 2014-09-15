package support

import static cucumber.api.groovy.Hooks.*

// Define a world that represents the test environment.
// Hooks can set up and tear down the environment and steps
// can change its state, e.g. store values used by later steps.
@SuppressWarnings( "GrMethodMayBeStatic" )
class CustomWorld {
    def bob

    String customMethod() {
        "foo"
    }
}

World {
    println 'World called!'
    new CustomWorld()
}

Before() {
    println 'Before called!'
    customMethod()
}

After() {
    println 'After called!'
}
