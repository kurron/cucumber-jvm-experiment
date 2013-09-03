package org.kurron.cucumber

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.web.client.RestTemplate

/**
 * A Cucumber JVM test to illustrate how to integration the test with a Spring context.
 **/
@ContextConfiguration( locations = ['classpath:cucumber.xml'] )
class StepDefinitions {
    @Autowired
    RestTemplate template

    /**
     * Context passed between steps.
     **/
    def response

    @Given( '^A valid REST template$' )
    void '^A valid REST template$'() {
        assert template
    }

    @When( '^I invoke GET on wwww.google.com$' )
    void '^I invoke GET on wwww.google.com$'() {
        response = template.getForEntity( 'http://www.google.com/', String )
    }

    @Then( '^I should get a (\\d+) status code$' )
    void '^I should get a (\\d+) status code$'( int arg1 ) {
        assert response
        assert response.statusCode.value() == arg1
    }
}
