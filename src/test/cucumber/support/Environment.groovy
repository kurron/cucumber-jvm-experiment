package support

import static cucumber.api.groovy.Hooks.*

World {
    println 'World called!'
    // we could return a new custom world instance here
}

Before() {
    println 'Before called!'
}

After() {
    println 'After called!'
}