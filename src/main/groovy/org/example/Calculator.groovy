package org.example

/**
 * Example subject under test.
 **/
class Calculator {
    String input
    def shell = new GroovyShell()

    String run() {
        shell.evaluate( input )
    }
}
