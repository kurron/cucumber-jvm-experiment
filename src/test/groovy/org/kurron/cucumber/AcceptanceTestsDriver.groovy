package org.kurron.cucumber

import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

/**
 * Runs the Cucumber tests.
 */
@RunWith( Cucumber )
@Cucumber.Options (
    format = [ 'pretty', 'html:build/reports/cucumber'],
    strict = true,
    features = ['src/test/cucumber'],
    glue = ['src/test/cucumber/steps', 'src/test/cucumber/support'],
    tags = ['~@manual', '~@review']
)
class AcceptanceTestsDriver {
    // empty on purpose
}
