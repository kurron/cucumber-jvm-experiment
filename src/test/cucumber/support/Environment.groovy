package support

import static cucumber.api.groovy.Hooks.*

Before() {
    println 'Before called!'
}

After() {
    println 'After called!'
}