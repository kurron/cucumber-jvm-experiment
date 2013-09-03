package org.kurron.cucumber

import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

/**
 * A Cucumber JVM test to illustrate how to integration the test with a Spring context.
 **/
@RunWith( Cucumber )
@Cucumber.Options( tags = ['@google'],
                   format = ['json:build/google/json'])
class SpringIntegrationTest {
}
