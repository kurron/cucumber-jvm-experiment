package org.kurron.cucumber

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.test.context.ContextConfiguration
import org.springframework.web.client.RestTemplate

/**
 * A Cucumber JVM test to illustrate how to integration the test with a Spring context.
 **/
@ContextConfiguration( locations = ['classpath:cucumber.xml'] )
class StepDefinitions
{
    @Autowired
    RestTemplate template

    /**
     * Context passed between steps.
     **/
    ResponseEntity<java.lang.String> response

    @Given('^A valid REST template$')
    public void A_valid_REST_template() throws Throwable {
        assert template
    }

    @When('^I invoke GET on wwww.google.com$')
    public void I_invoke_GET_on_wwww_google_com() throws Throwable {
        response = template.getForEntity( 'http://www.google.com/', String )
    }

    @Then('^I should get a (\\d+) status code$')
    public void I_should_get_a_status_code(int arg1) throws Throwable {
        assert response
        assert response.statusCode == HttpStatus.OK
    }
}
